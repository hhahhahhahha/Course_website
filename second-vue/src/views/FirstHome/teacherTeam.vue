<template>
  <el-container style="height: 100%;">
    <el-aside width="125px" >
      <el-menu mode="vertical" style="height: 100%" @select="menuClick">
        <el-menu-item :index="item2.name" v-for="(item2,index) in navList" :key="index">{{item2.navItem}}</el-menu-item>
      </el-menu>
    </el-aside>
    <el-main>
      <div v-if="this.$router.currentRoute.path === '/teacherTeam'">详细信息请点击左侧导航栏</div>
      <router-view></router-view>
    </el-main>
  </el-container>
</template>

<script>

export default {
  name: "teacherTeam",
  data() {
    return {
      navList:[
        {name:'/teacherTeam/teacherResource',navItem:'教师团队'},
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