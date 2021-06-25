<template>
  <el-container>
    <el-main>
      <div data-v-65405da8="" class="tab-content">
        <ul data-v-65405da8="" class="ul-list">
          <li data-v-65405da8=""><a data-v-65405da8="" @click="currents('/question/answer1')">1、如何管理后台资源</a></li>
          <li data-v-65405da8=""><a data-v-65405da8="" @click="currents('/question/answer2')">2、如何管理？</a></li>
        </ul>
      </div>
    </el-main>
  </el-container>
</template>

<script>
export default {
  name: "coquestion",
  methods:{
    login(){
      this.$router.push('/login');
    },
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