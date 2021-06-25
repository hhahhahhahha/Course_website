<template>
  <div>
    <div>
      <el-table
          @selection-change="handleSelectionChange"
          :data="links"
          border>
        <el-table-column
            prop="uid"
            label="序号"
            width="180">
        </el-table-column>
        <el-table-column
            prop="name"
            label="网站名"
            width="180">
        </el-table-column>
        <el-table-column
            prop="content"
            label="链接"
            width="480">
        </el-table-column>
      </el-table>
    </div>
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
      linkName: '',
      multipleSelection:[],
      dialogStatus: "",
      msg: '',
      links:[],
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
    this.findAllLinks();
  },
  watch:{
    linkName () {
      this.findAllLinks();
    }
  },
  methods: {
    // deleteFile (file) {
    //   console.log(file)
    // },

    handleSelectionChange(val) {
      this.multipleSelection = val;
      console.log(val)
    },

    findAllLinks () {
      this.$axios.get("/link/findAllLinks")
          .then((res) => {
            this.links = res.data
          })
          .catch(error => {
            this.$message({
              type: 'error',
              message: "查询失败，原因是"+error.data.message
            });
          });
    },

  }
}
</script>
<style scoped>
.table {
  margin: 0 auto;
  clear: both;
}
</style>
