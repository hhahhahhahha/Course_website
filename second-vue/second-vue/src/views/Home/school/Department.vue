<template>
  <div>
    <div style="margin-top:50px;">
      <el-input v-model="departmentName" placeholder="请输入系姓名" style="width:80%" clearable></el-input>
      <el-button type="primary" style="margin-left: 10px;" @click="searchDepartmentByName">搜索</el-button>
      <el-button type="primary" style="margin-left:10px;margin-bottom: 20px;" @click="showDialog">新增系</el-button>
    </div>
    <div>
      <el-table
              @selection-change="handleSelectionChange"
              :data="departments"
              border>
        <el-table-column
                type="selection"
                width="55">
        </el-table-column>
        <el-table-column
                prop="uid"
                label="序号"
                width="180">
        </el-table-column>
        <el-table-column
                prop="name"
                label="系名"
                width="180">
        </el-table-column>
        <el-table-column
                prop="majorsnum"
                label="专业数"
                width="180">
        </el-table-column>
        <el-table-column
                label="操作">
                align="left">
          <template slot-scope="scope">
            <el-button
                    size="mini"
                    @click="handleEdit(scope.row)">编辑</el-button>
            <el-button
                    size="mini"
                    type="danger"
                    @click="handleDelete(scope.row)">删除</el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-button type="danger" size="mini" style="margin-top: 12px" :disabled="multipleSelection.length === 0" @click="deleteDepartments">批量删除</el-button>
    </div>
    <el-dialog :title="dialogTitle[dialogStatus]" :visible.sync="dialogFormVisible" center>
      <el-form :model="form" :rules="rules" ref="department">
        <el-form-item label="系名" :label-width="formLabelWidth" prop="name">
          <el-input v-model="form.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="专业数" :label-width="formLabelWidth" prop="majorsnum">
          <el-input v-model="form.majorsnum" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="submitDepartment">确 定</el-button>
      </div>
    </el-dialog>
    <el-upload
            style="margin-top:20px;"
            action="/upload"
            multiple
            :on-success="handleSuccess"
            :limit="3"
            :file-list="fileList">
      <el-button size="small" type="primary">点击上传</el-button>
    </el-upload>
  </div>
</template>

<script>
// @ is an alias to /src


export default {
  name: 'Home',
  components: {
  },
  data () {
    return {
      fileList: [],
      departmentName: '',
      multipleSelection:[],
      dialogTitle: {
        addDepartment: "新增系",
        editDepartment: "编辑系"
      },
      dialogStatus: "",
      rules: {
        name: [
            { required: true, message: '请输入姓名', trigger: 'blur' }
        ]
      },
      msg: '',
      departments:[],
      search: '',
      dialogFormVisible: false,
      form: {
        name: '',
        majorsnum: ''
      },
      formLabelWidth: '120px',
    }
  },
  created() {
    this.findAllDepartments();
  },
  watch:{
    departmentName () {
        this.findAllDepartments();
    }
  },
  methods: {
    // deleteFile (file) {
    //   console.log(file)
    // },
    handleSuccess (file) {
      const filename = file.name;
      this.$message({
        message: '文件上传成功！',
        type: 'success'
      });
    },
    searchDepartmentByName () {
        if (this.departmentName !== '') {
            this.$axios.get("/department/findDepartmentByName?name="+this.departmentName).then( (resp)=> {
                this.departments = resp.data;
            }).catch( (error)=>{
                this.$message({
                    type: 'error',
                    message: "查询失败，原因是"+error.data.message
                });
            })
        }
    },
    deleteDepartments () {
      this.$confirm('此操作将永久删除系, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        let ids = '?';
        this.multipleSelection.forEach( (item)=>{
          ids += 'ids='+item.uid+'&'
        });
        this.$axios.post("/department/deleteDepartmentsByIds"+ids).then( (resp)=> {
          if (resp) {
            this.findAllDepartments();
            this.$message.success("删除成功！");
          }
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        });
      });
    },
    handleSelectionChange(val) {
      this.multipleSelection = val;
      console.log(val)
    },
    submitDepartment () {
      if (this.dialogStatus === 'addDepartment'){
        this.addDepartment();
      } else if(this.dialogStatus === "editDepartment") {
        this.editDepartment();
      }
    },
    findAllDepartments () {
      this.$axios.get("/department/findAllDepartments")
              .then((res) => {
                this.departments = res.data
              })
              .catch(error => {
                this.$message({
                  type: 'error',
                  message: "查询失败，原因是"+error.data.message
                });
              });
    },
    handleEdit (row) {
      this.dialogFormVisible = true;
      this.dialogStatus = "editDepartment";
      this.form.uid = row.uid;
      this.form.name = row.name;
      this.form.majorsnum = row.majorsnum;
    },
    handleDelete (row) {
      this.$confirm('此操作将永久删除该系, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.$axios.post("/department/deleteDepartment?uid="+row.uid).then ((resp)=>{
          this.$message.success("删除成功!")
          this.findAllDepartments();
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        });
      });
    },
    showDialog () {
      this.form.uid = '';
      this.form.name = '';
      this.form.majorsnum = '';
      this.dialogFormVisible = true;
      this.dialogStatus = "addDepartment";
    },
    addDepartment () {
      this.$refs.department.validate((valid) => {
        if (valid) {
          this.$axios.post("/department/addDepartment",this.form).then( (resp)=>{
            if (resp) {
              this.dialogFormVisible = false;
              this.$message.success("添加成功！");
              this.findAllDepartments();
            }
          }).catch((error)=>{
            this.$message({
              message: '添加数据失败，原因是'+error.data.message,
              type: 'error'
            })
          })
        } else {
          this.$message({
            message: '请输入所有字段',
            type: 'error'
          })
          return false;
        }
      });
    },
    editDepartment () {
      this.$axios.post("/department/updateDepartment",this.form).then( (resp)=>{
        this.dialogFormVisible = false;
        this.$message.success("修改成功!");
        this.findAllDepartments();
      }).catch( (error)=> {
        this.$message({
          message: '数据更新失败，原因是'+error.data.message,
          type: 'error'
        })
      })
    }
  }
}
</script>
<style scoped>
  .table {
    margin: 0 auto;
    clear: both;
  }
</style>
