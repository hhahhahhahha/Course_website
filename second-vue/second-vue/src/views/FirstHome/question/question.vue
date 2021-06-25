<template>
  <el-container>
    <el-main>
      <div data-v-65405da8="" class="banner">
        <div data-v-65405da8="" class="help-search">
          <i data-v-65405da8="" class="el-icon-search"></i>
          <input data-v-65405da8="" type="text" placeholder="搜索您的问题或关键词，例如作业、班级">
          <span data-v-65405da8="">搜索</span>
        </div>
      </div>
    </el-main>
  </el-container>
</template>

<script>
export default {
  name: "question"
}
</script>

<style scoped>
.banner[data-v-65405da8] {
  width: 100%;
  min-width: 1224px;
  height: 240px;
  background: url(../image/top5.jpg) 50% center / cover no-repeat;
  position: relative;
  display: flex;
  align-items: center;
  justify-content: center;
}
.banner .help-search[data-v-65405da8] {
  width: 440px;
  height: 34px;
  opacity: 1;
  background: rgb(255, 255, 255);
  border-radius: 4px;
  display: flex;
  align-items: center;
}
.banner .help-search i[data-v-65405da8] {
  color: rgb(195, 201, 209);
  margin: 0px 8px;
}
.banner .help-search input[data-v-65405da8] {
  flex: 110%;
  font-size: 12px;
  outline: none;
}
.banner .help-search span[data-v-65405da8] {
  width: 55px;
  font-size: 12px;
  text-align: center;
  color: rgb(66, 133, 244);
  border-left: 1px solid rgb(240, 240, 240);
  height: 34px;
  line-height: 34px;
  cursor: pointer;
}

</style>