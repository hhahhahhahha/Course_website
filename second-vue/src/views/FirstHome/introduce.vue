<template>
  <el-container style="height: 100%;">
    <el-aside width="125px" >
        <el-menu mode="vertical" style="height: 100%" @select="menuClick">
          <el-menu-item :index="item2.name" v-for="(item2,index) in navList" :key="index">{{item2.navItem}}</el-menu-item>
        </el-menu>
    </el-aside>
      <el-main>
        <div v-if="this.$router.currentRoute.path === '/introduce'">详细信息请点击左侧导航栏</div>
        <router-view></router-view>
      </el-main>
  </el-container>
</template>

<script>
export default {
  name: "test",
  data() {
    return {
      navList:[
        {name:'',navItem:'课程介绍'},
        {name:'',navItem:'课程简介'},
        {name:'',navItem:'课程安排'},
        {name:'',navItem:'课程大纲'},
        {name:'',navItem:'课程理念'},
      ] }
  },
  methods: {
    menuClick(index) {
      this.$router.push(index);
    },
  },
}
</script>

<style scoped>

</style>