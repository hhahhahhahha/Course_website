<template>
  <el-container>
    <el-main>
      <div>
        <div class="main_contit">
          <h2>3、资料模块下的内容学生都可以下载吗？</h2>
        </div>
        <div data-v-65405da8="" class="content-for-html">
          <span>
              <p>{{msg}}</p>
          </span>
        </div>
      </div>
    </el-main>
  </el-container>
</template>

<script>
export default {
  name: "answer3",
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
    this.$axios.get("/answer/3")
        .then((res)=>{
          this.msg=res.data.content;
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
P {
  LINE-HEIGHT: 150%;
  text-indent: 2em;
  font-size: 14px;
}
.main_contit h2 {
  width: 950px;
  line-height: 28px;
  font-size: 24px;
  color: #000000;
  font-weight: normal;
  margin-top: 46px;

}
.content-for-html{
  margin-top: 40px;
}
</style>