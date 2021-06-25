<template>
  <div id="app" style="width: 100%; margin: 0 auto">
    <h2>老师信息</h2>
    <el-row>
      <el-col :span="6" style="margin-bottom: 10px">
        <el-button type="primary" @click="add">新增</el-button>
        <el-input v-model="name" style="width: 70%" @keyup.enter.native="loadTable"></el-input>
      </el-col>

    </el-row>
    <el-table
        :data="page"
        stripe
        border
        style="width: 100%">
      <el-table-column
          prop="name"
          label="老师名"
          width="70%"
      >
      </el-table-column>
      <el-table-column prop="number"
                       label="工号"
                       width="200%"
      >
      </el-table-column>
      <el-table-column prop="major"
                       label="专业"
                       width="100%"
      >
      </el-table-column>
      <el-table-column prop="job_title"
                       label="职称"
                       width="70%"
      >
      </el-table-column>
      <el-table-column prop="email"
                       label="邮箱"
                       width="200%"
      >
      </el-table-column>
      <el-table-column
          fixed="right"
          label="操作">
        <template slot-scope="scope">
          <el-button
              @click="edit(scope.row)">编辑</el-button>
          <el-button
              type="danger"
              @click="open(scope.row.id)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>


    <el-dialog id="dialog_id"
               title="老师信息"
               :visible.sync="dialogVisible"
               width="30%">
      <el-form ref="form" :model="form" label-width="80px" :rules="rules" >
        <el-form-item label="老师名" prop="name">
          <el-input v-model="form.name" placeholder="老师的名字(两到五个汉字）"
          ></el-input>
        </el-form-item >
        <el-form-item label="工号" >
          <el-input v-model="form.number" placeholder="13位数字"
          >
<!--                    oninput = "value=value.replace(/[^\d]/g,'')"-->
<!--                    maxlength="13"-->
          </el-input>
        </el-form-item>
        <el-form-item label="专业" prop="major">
          <el-input v-model="form.major"></el-input>
        </el-form-item>
        <el-form-item label="职称" prop="job_title">
          <el-input v-model="form.job_title"></el-input>
        </el-form-item>
        <el-form-item label="邮箱" prop="email">
          <el-input v-model="form.email"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
            <el-button @click="dialogVisible = false">取 消</el-button>
            <el-button type="primary" @click="save(form)">确 定</el-button>
        </span>
    </el-dialog>
  </div>
</template>

<script>
import $ from "jquery";

export default {
  name: "controlTeacher",
  data() {
    return {
      page: [],
      name: '',
      dialogVisible: false,
      form: {
        id:'',
        name:'',
        number:'',
        major:'',
        job_title:'',
        email:'',
      },
      rules: {
        name: [
          { required: true, message: '请输入姓名', trigger: 'blur'},
          { min:2,max:5,message: '老师名长度在2-5个字符',trigger: 'change'}
        ],
        number:[
          {required:true,min:13,max: 13,message:'13位数字',trigger:'blur'}
        ],
        sex: [
          { required: true, message: '请选择性别', trigger: 'change' }
        ],
        age: [
          { required: true, message: '年龄不能为空'},
          { pattern: /^([1-9]|[1-5]\d|60)$/ , message: '年龄位1-60'}
        ],
        grade:[
          { required: true, message: '请输入年级',trigger: 'blur' },
          { pattern: /[1-6]/,message: '年级错误'}
        ],
        height:[
          { required: true, message: '请输入身高',trigger: 'blur' },
          {pattern:/^1[0-9][0-9]$/,message: '数据错误'},
        ],
        weight: [
          { required: true, message: '请输入体重',trigger: 'blur' },
          { pattern: /[4-9][0-9]$/,message: '超出范围',}
        ],
        classes:[
          { required: true, message: '请输入班级',trigger: 'blur' },
          { pattern:/^1?[0-9]$/,message: '1-20内的数字'},
        ],
        qq:[
          { required: true, message: '请输入身高',trigger: 'blur' },
          {min: 4, max:15,message:'4-15个数字',trigger: 'blur'},
          {pattern:/^[0-9]*$/,message: '数据要求是数字',trigger:'blur'},
        ],
        phone: [
          { required: true, message: '请输入手机号',trigger: 'blur' },
          {
            pattern: /^1[3-9]\d{9}$/,
            message: '手机号格式错误'
          }
        ],
      },
    }
  },
  created() {
    this.loadTable();
  },
  methods: {
    loadTable() {
      $.get("/teacher").then(res => {
        this.page = res;
      })
    },
    add() {
      Object.keys(this.form).forEach(key => {
        this.form[key] = ''
      });
      this.form.hobbys = [];
      this.dialogVisible = true;
    },
    edit(row) {
      Object.keys(this.form).forEach(key => {
        this.form[key] = row[key]
      });
      this.dialogVisible = true;
    },
    save(form) {
      // this.form.hobby = this.form.hobbys.join(",");
      // console.log(this.form.hobby);
      let data = JSON.stringify(this.form);
      this.$refs.form.validate((valid) => {
        if (valid) {
          if (this.form.id === '') {
            $.ajax({
              url: '/teacher',
              type: 'post',
              contentType: 'application/json',
              data: data
            }).then(res => {
              this.dialogVisible = false;
              this.loadTable();
            })
          } else {
            $.ajax({
              url: '/teacher',
              type: 'put',
              contentType: 'application/json',
              data: data
            }).then(res => {
              this.dialogVisible = false;
              this.loadTable();
            })
          }
        } else {
          this.$message({
            message: '请输入所有字段',
            type: 'error'
          })
          return false;
        }
      });
    },
    del(id) {
      $.ajax({
        url: '/teacher/' + id,
        type: 'delete',
        contentType: 'application/json'
      }).then(res => {
        this.loadTable();
      })
    },
    open(id) {
      this.$confirm('此操作将永久删除该记录, 是否继续?', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.del(id);
        this.loadTable(1);
        this.$message({
          type: 'success',
          message: '删除成功!'
        });
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        });
      });
    }
  }
}
</script>

<style scoped>

</style>