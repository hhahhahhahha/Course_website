<template>
  <div>
    <div style="margin-top:50px;">
      <el-input v-model="answerName" placeholder="请输入" style="width:80%" clearable></el-input>
      <el-button type="primary" style="margin-left: 10px;" @click="searchAnswerByName">搜索</el-button>
      <el-button type="primary" style="margin-left:10px;margin-bottom: 20px;" @click="showDialog">新增</el-button>
    </div>
    <div>
      <el-table
              @selection-change="handleSelectionChange"
              :data="answers"
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
                label="问题名"
                width="180">
        </el-table-column>
        <el-table-column
                prop="content"
                label="解决方案"
                width="580">
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
      <el-button type="danger" size="mini" style="margin-top: 12px" :disabled="multipleSelection.length === 0" @click="deleteAnswers">批量删除</el-button>
    </div>
    <el-dialog :title="dialogTitle[dialogStatus]" :visible.sync="dialogFormVisible" center>
      <el-form :model="form" :rules="rules" ref="answer">
        <el-form-item label="课程名" :label-width="formLabelWidth" prop="name">
          <el-input v-model="form.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="专业数" :label-width="formLabelWidth" prop="content">
          <el-input v-model="form.content" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="submitAnswer">确 定</el-button>
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
      answerName: '',
      multipleSelection:[],
      dialogTitle: {
        addAnswer: "新增课程",
        editAnswer: "编辑课程"
      },
      dialogStatus: "",
      rules: {
        name: [
            { required: true, message: '请输入姓名', trigger: 'blur' }
        ]
      },
      msg: '',
      answers:[],
      search: '',
      dialogFormVisible: false,
      form: {
        name: '',
        content: ''
      },
      formLabelWidth: '120px',
    }
  },
  created() {
    this.findAllAnswers();
  },
  watch:{
    answerName () {
        this.findAllAnswers();
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
    searchAnswerByName () {
        if (this.answerName !== '') {
            this.$axios.get("/answer/findAnswerByName?name="+this.answerName).then( (resp)=> {
                this.answers = resp.data;
            }).catch( (error)=>{
                this.$message({
                    type: 'error',
                    message: "查询失败，原因是"+error.data.message
                });
            })
        }
    },
    deleteAnswers () {
      this.$confirm('此操作将永久删除课程, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        let ids = '?';
        this.multipleSelection.forEach( (item)=>{
          ids += 'ids='+item.uid+'&'
        });
        this.$axios.post("/answer/deleteAnswersByIds"+ids).then( (resp)=> {
          if (resp) {
            this.findAllAnswers();
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
    submitAnswer () {
      if (this.dialogStatus === 'addAnswer'){
        this.addAnswer();
      } else if(this.dialogStatus === "editAnswer") {
        this.editAnswer();
      }
    },
    findAllAnswers () {
      this.$axios.get("/answer/findAllAnswers")
              .then((res) => {
                this.answers = res.data
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
      this.dialogStatus = "editAnswer";
      this.form.uid = row.uid;
      this.form.name = row.name;
      this.form.content = row.content;
    },
    handleDelete (row) {
      this.$confirm('此操作将永久删除该课程, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.$axios.post("/answer/deleteAnswer?uid="+row.uid).then ((resp)=>{
          this.$message.success("删除成功!")
          this.findAllAnswers();
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
      this.form.content = '';
      this.dialogFormVisible = true;
      this.dialogStatus = "addAnswer";
    },
    addAnswer () {
      this.$refs.answer.validate((valid) => {
        if (valid) {
          this.$axios.post("/answer/addAnswer",this.form).then( (resp)=>{
            if (resp) {
              this.dialogFormVisible = false;
              this.$message.success("添加成功！");
              this.findAllAnswers();
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
    editAnswer () {
      this.$axios.post("/answer/updateAnswer",this.form).then( (resp)=>{
        this.dialogFormVisible = false;
        this.$message.success("修改成功!");
        this.findAllAnswers();
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
