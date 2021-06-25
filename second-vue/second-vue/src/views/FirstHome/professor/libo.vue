<template>
  <el-container>
    <el-main>
      <div class="main_content">
        <div class="main_contit">
          <h2>李勃</h2>
        </div>
        <div class="main_conDiv" id="vsb_content">
          <pre><p>{{msg}}</p></pre>
        </div>
        <div class="main_art">
          <ul>
            <li><lable>上一篇：</lable><a href="5836.htm">梁杰</a></li>
            <li><lable>下一篇：</lable><a href="5834.htm">邵鹏</a></li>
          </ul>
        </div>
      </div>
    </el-main>
  </el-container>
</template>

<script>
export default {
  name: "libo",
  data() {
    return {
      msg:'',
    }
  },
  methods:{
    currents(current){
      this.$router.push(current);
    },
  },
  created() {
    this.$axios.get("/teacher/3")
        .then((res)=>{
          this.msg=res.data.des;
        })
        .catch(error => {
          this.$message({
            type: 'error',
            message: "查询失败，原因是"+error.data.message
          });
        });
  }
}
</script>

<style scoped>
.main_content {
  width: 978px;
  margin: 0 auto;
  height: auto;
  overflow: hidden;
  background: #fff;
  border: 1px solid #EEEEEE;
  border-top: none;
}
.main_contit {
  width: 950px;
  margin: 0 auto;
  height: auto;
  overflow: hidden;
  border-bottom: 1px dashed #eee;
}
.main_contit h2 {
  width: 950px;
  text-align: center;
  line-height: 28px;
  font-size: 24px;
  color: #000000;
  font-weight: normal;
  margin-top: 46px;
}
.main_contit p {
  width: 950px;
  text-align: center;
  font-size: 14px;
  color: #999999;
  margin: 34px 0 10px 0;
}
.main_conDiv {
  text-indent: 2em;
  font-size: 14px;
  line-height: 30px;
  color: #666666;
}
.main_art {
  width: 978px;
  margin: 72px auto 0;
  background: #fbfbfb;
  height: auto;
  overflow: hidden;
}
</style>