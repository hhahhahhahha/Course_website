<template>
  <el-container >
<!--    <el-header  class="home-header">-->
    <div class="home-header">
      <div class="login-location">
        <el-dropdown trigger="click" @command="login">
          <span class="login-style">登录</span>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item command="login">登录</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
      </div>
      <img class="image-style" src="~@/assets/logo.png" height="41" width=auto>
      <h1 class="div-style">数据结构精品课程</h1>
      <div style="margin-left: 800px;margin-right: 400px;">
        <el-input placeholder="请输入内容" v-model="inputstring" >
          <el-button slot="append" icon="el-icon-search"></el-button>
        </el-input>
      </div>
      <div class="button-location">
        <el-button  style="width:80px" @click="currents('/first')">首页</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/introduce')">课程介绍</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/teacherTeam')">教学团队</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/build')">课程建设</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/resourse')">课程资源</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/question')">问题与答题</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/research')">课程研究</el-button>
      </div>
    </div>
    <el-main class="view-styles">
      <div v-if="this.$router.currentRoute.path === '/'">数据结构精品课程</div>
      <router-view></router-view>
    </el-main>
    <el-footer class="footer-styles">
      <div>地址：重庆    邮编：406213</div>
      <div >项目参与者：ywb</div>
      <div >联系电话：909090</div>
    </el-footer>
  </el-container>
</template>
<script>

import hello_world from "@/views/FirstHome/First";
import test from "@/views/FirstHome/introduce";

export default {
  name: "FirstHome",
  components: {hello_world,test},
  data(){
    return{
      current:'test',
      inputstring:'',
    }
  },
  methods:{
    login(){
      this.$router.push('/login');
    },
    currents(current){
      this.$router.push(current);
    }
  }
}
</script>

<style scoped>
  .home-header {
    background-color: rgba(23, 40, 128, 0.73);
    position: relative;
    height: 250px;
    /*line-height: 60px;*/
  }
  .image-style{
    /*background-color: #0e6ddc;*/
    max-width: 20%;
    height: auto;
    margin-left: 200px;
    margin-top: 20px;
  }
  .div-style{
    color: rgb(248, 249, 250);
    font-size: 20px;
    font-family: 华文楷体;
    width: 170px;
    background-color: rgba(23, 40, 128, 0.73);
    margin-top: 0px;
    margin-left: 200px;
  }
  .login-location{
    /*position: absolute;*/
    margin-left: 1320px;
    margin-top: 0px;
  }
  .login-style {
    cursor: pointer;
    color: darkred;
    font-size: 20px;
    /*background-color: black;*/
  }
  .button-location{
    margin-left: 400px;
    font-size: 0px;
    bottom: 0px;
  }
  .view-styles{
    background-color: rgba(248, 255, 254, 0.95);
    height: auto;
    min-height: 420px;
    /*display: flex;*/
    /*margin-left: 10px;*/
  }
  .footer-styles{
    background-color: rgba(23, 40, 128, 0.73);
    text-align: center;
  }
</style>