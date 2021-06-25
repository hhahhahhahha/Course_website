<template>
  <el-container>
    <el-main>
      <div data-v-65405da8="" class="tab-content">
        <ul data-v-65405da8="" class="ul-list">
          <li data-v-65405da8=""><a data-v-65405da8="" @click="currents('/question/answer1')">1、资料上传是否有大小限制？</a></li>
          <li data-v-65405da8=""><a data-v-65405da8="" @click="currents('/question/answer2')">2、外链资源的链接提示无法添加？</a></li>
          <li data-v-65405da8=""><a data-v-65405da8="" @click="currents('/question/answer3')">3、资料模块下的内容学生都可以下载吗？</a></li>
          <li data-v-65405da8=""><a data-v-65405da8="" @click="currents('/question/answer4')">4、附件资源中的内容无法排序进行？</a></li>
        </ul>
      </div>
    </el-main>
  </el-container>
</template>


<script>
export default {
  name: "rsquestion",
  methods:{
    currents(current){
      this.$router.push(current);
    },
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    }
  },
}
</script>

<style scoped>
.tab-content[data-v-65405da8] {
  width: 100%;
}
.tab-content .ul-list[data-v-65405da8] {
  padding: 24px;
}
.tab-content .ul-list li[data-v-65405da8] {
  height: 56px;
  margin-left: 14px;
  position: relative;
}
</style>