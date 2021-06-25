<!--<template>-->
<!--  <el-container style="height: 100%;">-->
<!--    <el-aside width="125px" >-->
<!--        <el-menu mode="vertical" style="height: 100%" @select="menuClick">-->
<!--          <el-menu-item :index="item2.name" v-for="(item2,index) in navList" :key="index">{{item2.navItem}}</el-menu-item>-->
<!--        </el-menu>-->
<!--    </el-aside>-->
<!--      <el-main>-->
<!--        <div v-if="this.$router.currentRoute.path === '/introduce'">详细信息请点击左侧导航栏</div>-->
<!--        <router-view></router-view>-->
<!--      </el-main>-->
<!--  </el-container>-->
<!--</template>-->

<!--<script>-->
<!--export default {-->
<!--  name: "test",-->
<!--  data() {-->
<!--    return {-->
<!--      navList:[-->
<!--        {name:'',navItem:'课程介绍'},-->
<!--        {name:'',navItem:'课程简介'},-->
<!--        {name:'',navItem:'课程安排'},-->
<!--        {name:'',navItem:'课程大纲'},-->
<!--        {name:'',navItem:'课程理念'},-->
<!--      ] }-->
<!--  },-->
<!--  methods: {-->
<!--    menuClick(index) {-->
<!--      this.$router.push(index);-->
<!--    },-->
<!--  },-->
<!--}-->
<!--</script>-->

<!--<style scoped>-->

<!--</style>-->

<template>
  <el-container style="height: 100%;" >
    <el-aside width="200px" style="background-color: rgb(238, 241, 246);height: 900px">
      <el-menu :default-openeds="['1', '2']">
        <el-submenu index="1">
          <template slot="title"><i class="el-icon-message"></i>分类</template>
          <el-submenu index="1-1">
            <template slot="title">计算机类</template>
            <el-menu-item index="1-4-1" @click="currents('/introduce/Java')">Java语言程序设计</el-menu-item>
          </el-submenu>
          <el-submenu index="1-2">
            <template slot="title">金融类</template>
            <el-menu-item index="1-4-1" @click="currents('/introduce/accounting')">金融会计学</el-menu-item>
          </el-submenu>
          <el-submenu index="1-3">
            <template slot="title">管理类</template>
            <el-menu-item index="1-4-1" @click="currents('/introduce/conduct')">服务管理A</el-menu-item>
          </el-submenu>
          <el-submenu index="1-4">
            <template slot="title">人文科学类</template>
            <el-menu-item index="1-4-1" @click="currents('/introduce/bala')">沟通与礼仪</el-menu-item>
          </el-submenu>
        </el-submenu>
        <el-submenu index="2">
          <template slot="title"><i class="el-icon-user"></i>任课导师</template>
          <el-menu-item index="2-1" @click="currents('/introduce/yxh')">杨小红</el-menu-item>
          <el-menu-item index="2-2" @click="currents('/introduce/ly')">邵鹏</el-menu-item>
          <el-menu-item index="2-3" @click="currents('/introduce/libo')">李渤</el-menu-item>
        </el-submenu>
      </el-menu>
    </el-aside>
    <!--    <el-container>-->
    <!--      <el-header>Header</el-header>-->
    <el-main>
      <div v-if="this.$router.currentRoute.path === '/introduce'" style="background-color: #eaeaea;margin-top: -20px;height: 900px">
        <div class="voidmain">重点课程</div>
        <div>
          <img src="~@/assets/banner20201113.jpg" style="margin-left: 20px">
        </div>
        <div style="height: 3px;width: auto;background-color: white;margin-top: 20px;"></div>
        <div>
          <div style="margin-top: 10px;text-align: center;font-size: x-large">学术建设</div>
          <div style="margin-top: 20px;width: 30%;height: 330px;background-color: #666666;margin-left: 10px">
            <div style="width: auto;height: 30px;text-align: center;color: white">标题</div>
            <div style="width: auto;height: 3px;background-color: white"></div>
            <div style="margin-left:5px;font-size: large;color: white">内容</div>
          </div>
          <div style="margin-top: -330px;width: 30%;height: 330px;background-color: #666666;margin-left: 430px">
            <div style="width: auto;height: 30px;text-align: center;color: white">标题</div>
            <div style="width: auto;height: 3px;background-color: white"></div>
            <div style="margin-left:5px;font-size: large;color: white">内容</div>
          </div>
          <div style="margin-top: -330px;width: 30%;height: 330px;background-color: #666666;margin-left: 850px">
            <div style="width: auto;height: 30px;text-align: center;color: white">标题</div>
            <div style="width: auto;height: 3px;background-color: white"></div>
            <div style="margin-left:5px;font-size: large;color: white">内容</div>
          </div>
        </div>
      </div>
      <router-view></router-view>
    </el-main>

    <!--    </el-container>-->
  </el-container>
</template>

<script>
export default {
  name: "test",
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
.voidmain{
  font-size: xx-large;
  text-align: center;
  margin-top: 10px;
  margin-bottom: 20px;
  background-color:#eaeaea;
}
</style>