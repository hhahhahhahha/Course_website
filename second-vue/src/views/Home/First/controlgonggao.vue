<template>
  <div id="app" style="width: 100%; margin: 0 auto">
    <h2>公告信息</h2>
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
          label="序号"
          type="index"
          width="100"
          align="center">
      </el-table-column>
      <el-table-column
          prop="data"
          label="公告"
      >
      </el-table-column>
      <el-table-column
          fixed="right"
          label="操作"
          width="250"
      >
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
               title="公告信息"
               :visible.sync="dialogVisible"
               width="30%">
      <el-form ref="form" :model="form" label-width="80px" :rules="rules" >
        <el-form-item label="公告内容" prop="data">
          <el-input v-model="form.data"></el-input>
        </el-form-item >
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
  name: "controlgonggao",
  data() {
    return {
      page: [],
      name: '',
      dialogVisible: false,
      form: {
        id:'',
        data:'',
        index:'',
        flag:'',
      },
      rules: {}
    }
  },
  created() {
    this.loadTable();
  },
  methods: {
    loadTable() {
      $.get("/data/1").then(res => {
        this.page = res;
        console.log(this.page)
      })
    },
    add() {
      Object.keys(this.form).forEach(key => {
        this.form[key] = ''
      });
      this.dialogVisible = true;
    },
    edit(row) {
      Object.keys(this.form).forEach(key => {
        this.form[key] = row[key]
      });
      this.dialogVisible = true;
    },
    save(form) {
      console.log(form);
      let data = JSON.stringify(this.form);
      this.$refs.form.validate((valid) => {
        if (valid) {
          if (this.form.id === '') {
            $.ajax({
              url: '/data',
              type: 'post',
              contentType: 'application/json',
              data: data
            }).then(res => {
              this.dialogVisible = false;
              this.loadTable();
            })
          } else {
            console.log(111)
            $.ajax({
              url: '/data/update',
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
        url: '/data/' + id,
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