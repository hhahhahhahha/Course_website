<template>
  <div>
    <div class="title">课程公告</div>
    <div style="height: 4px; background-color: #7591f3" >
    </div>
    <div style="height: 100px">
      <p v-if="msg==''" style="font-size: 10px">暂无课程内容</p>
      <p v-for="m in msg" style="font-size: 10px" >{{m.data}}</p>
    </div>
    <el-footer style="height: 1px;background-color: #7591f3" >
    </el-footer>
  </div>
</template>

<script>
export default {
  name: "gonggao",
  data() {
    return {
      msg:'',
    }
  },
  methods:{
  },
  created() {
    this.$axios.get("/data/1")
        .then((res)=>{
            this.msg=res.data;
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
</style>