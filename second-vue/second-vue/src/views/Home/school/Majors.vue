<template>
  <div>
    <div style="margin-top:50px;">
      <el-input v-model="majorsName" placeholder="请输入专业姓名" style="width:80%" clearable></el-input>
      <el-button type="primary" style="margin-left: 10px;" @click="searchMajorsByName">搜索</el-button>
      <el-button type="primary" style="margin-left:10px;margin-bottom: 20px;" @click="showDialog">新增专业</el-button>
    </div>
    <div>
      <el-table
              @selection-change="handleSelectionChange"
              :data="majorss"
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
                label="专业名"
                width="180">
        </el-table-column>
        <el-table-column
                prop="belong"
                label="所属系"
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
      <el-button type="danger" size="mini" style="margin-top: 12px" :disabled="multipleSelection.length === 0" @click="deleteMajorss">批量删除</el-button>
    </div>
    <el-dialog :title="dialogTitle[dialogStatus]" :visible.sync="dialogFormVisible" center>
      <el-form :model="form" :rules="rules" ref="majors">
        <el-form-item label="专业名" :label-width="formLabelWidth" prop="name">
          <el-input v-model="form.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="所属系" :label-width="formLabelWidth" prop="belong">
          <el-input v-model="form.belong" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="submitMajors">确 定</el-button>
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
      majorsName: '',
      multipleSelection:[],
      dialogTitle: {
        addMajors: "新增专业",
        editMajors: "编辑专业"
      },
      dialogStatus: "",
      rules: {
        name: [
            { required: true, message: '请输入姓名', trigger: 'blur' }
        ]
      },
      msg: '',
      majorss:[],
      search: '',
      dialogFormVisible: false,
      form: {
        name: '',
        belong: ''
      },
      formLabelWidth: '120px',
    }
  },
  created() {
    this.findAllMajorss();
  },
  watch:{
    majorsName () {
        this.findAllMajorss();
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
    searchMajorsByName () {
        if (this.majorsName !== '') {
            this.$axios.get("/majors/findMajorsByName?name="+this.majorsName).then( (resp)=> {
                this.majorss = resp.data;
            }).catch( (error)=>{
                this.$message({
                    type: 'error',
                    message: "查询失败，原因是"+error.data.message
                });
            })
        }
    },
    deleteMajorss () {
      this.$confirm('此操作将永久删除专业, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        let ids = '?';
        this.multipleSelection.forEach( (item)=>{
          ids += 'ids='+item.uid+'&'
        });
        this.$axios.post("/majors/deleteMajorssByIds"+ids).then( (resp)=> {
          if (resp) {
            this.findAllMajorss();
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
    submitMajors () {
      if (this.dialogStatus === 'addMajors'){
        this.addMajors();
      } else if(this.dialogStatus === "editMajors") {
        this.editMajors();
      }
    },
    findAllMajorss () {
      this.$axios.get("/majors/findAllMajorss")
              .then((res) => {
                this.majorss = res.data
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
      this.dialogStatus = "editMajors";
      this.form.uid = row.uid;
      this.form.name = row.name;
      this.form.belong = row.belong;
    },
    handleDelete (row) {
      this.$confirm('此操作将永久删除该专业, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.$axios.post("/majors/deleteMajors?uid="+row.uid).then ((resp)=>{
          this.$message.success("删除成功!")
          this.findAllMajorss();
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
      this.form.belong = '';
      this.dialogFormVisible = true;
      this.dialogStatus = "addMajors";
    },
    addMajors () {
      this.$refs.majors.validate((valid) => {
        if (valid) {
          this.$axios.post("/majors/addMajors",this.form).then( (resp)=>{
            if (resp) {
              this.dialogFormVisible = false;
              this.$message.success("添加成功！");
              this.findAllMajorss();
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
    editMajors () {
      this.$axios.post("/majors/updateMajors",this.form).then( (resp)=>{
        this.dialogFormVisible = false;
        this.$message.success("修改成功!");
        this.findAllMajorss();
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
