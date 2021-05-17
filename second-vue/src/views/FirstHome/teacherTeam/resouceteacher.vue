<template>
  <div id="app" style="width: 100%; margin: 0 auto">
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
      >
      </el-table-column>

    </el-table>
  </div>
</template>

<script>
import $ from 'jquery'
export default {
  name: "resouceteacher",
  data() {
    return {
      page: [],
    }
  },
  created() {
    $.get("/teacher").then(res => {
      this.page = res;
      console.log(res)
    })
  },
}
</script>

<style scoped>

</style>