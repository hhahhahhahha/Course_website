<template>
  <el-container >
<!--    <el-header  class="home-header">-->
    <div class="home-header">
      <div  style="margin-top: 10px;margin-bottom: 10px">
        <el-button  class="head-title-button" style="width:80px " @click="currents('')">学生</el-button>
        <el-button  class="head-title-button" style="margin-right:0px;" @click="currents('/teacherTeam/')">教工</el-button>
        <el-button  class="head-title-button" style="margin-right:0px;" @click="currents('/')">校友</el-button>
        <el-button  class="head-title-button" style="margin-right:0px;" @click="currents('/')">考生</el-button>
        <el-button  class="head-title-button" style="margin-right:0px;" @click="currents('/')">访客</el-button>
        <el-button  class="head-title-button" style="margin-left:400px;" @click="currents('/')">ENGLISH</el-button>
        <el-button  class="head-title-button" style="margin-right:0px;" @click="currents('/')">校园门户</el-button>
        <el-button  class="head-title-button" style="margin-right:0px;" @click="currents('/')">数字图书</el-button>
        <el-button  class="head-title-button" style="margin-right:0px;" @click="currents('/')">校园邮箱</el-button>
        <el-button  class="head-title-button" style="margin-right:0px;" @click="currents('/')">自服务系统</el-button>
        <el-button  class="head-title-button" style="margin-right:0px;" @click="currents('/')">上网登录</el-button>
      </div>
      <div class="login-location">
        <el-dropdown trigger="click" @command="login">
          <span class="login-style">登录</span>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item command="login">登录</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
      </div>
      <img class="image-style" src="~@/assets/logo2.png" height="41" width=auto>
      <div  style="height: 41px;width: auto;margin-left: 700px;
            margin-top: -70px;font-size:xxx-large;margin-bottom: 70px;
            color: #720a0a">
        厚德   笃学   励志   创新
      </div>

      <div style="margin-left: 700px;margin-right: 200px;">
        <el-input placeholder="请输入内容" v-model="inputstring" >
          <el-button slot="append" icon="el-icon-search"></el-button>
        </el-input>
      </div>
      <div class="button-location" style="margin-top: 10px;margin-bottom: 10px">
        <el-button  style="width:80px" @click="currents('/first')">首页</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/introduce')">课程介绍</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/teacherTeam')">教学团队</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/build')">课程建设</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/resourse')">课程资源</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/question')">问题与答题</el-button>
        <el-button  style="margin-right:0px;" @click="currents('/research')">课程研究</el-button>
      </div>
    </div>
    <el-main class="view-styles" style="margin-top: 0px">
      <div v-if="this.$router.currentRoute.path === '/'" class="title-first">
        <div style="height:50px;margin-top: 3px;text-align: center;font-size: x-large;background-color:white">
          学校概要
        </div>
        <div style="background-color: cadetblue;width: auto;margin-left:30px;height: 3px"></div>
        <div style="width: auto;height:auto;background-color: rgba(248, 255, 254, 0.95);">
            <div style="width:auto;height: auto;margin-top:20px;">
              <el-carousel style="width:auto;height: 400px">
                <el-carousel-item style="margin-left: 25px;margin-right:25px;width:auto ;height: 400px">
                  <img src="../assets/banner20210507.jpg">
                </el-carousel-item>
                <el-carousel-item style="margin-left: 25px;margin-right:25px;width:auto ;height: 400px">
                  <img src="../assets/banner20210330.png">
                </el-carousel-item>
                <el-carousel-item style="margin-left: 25px;margin-right:25px;width:auto ;height: 400px">
                  <img src="../assets/banner20201113.jpg">
                </el-carousel-item>
                <el-carousel-item style="margin-left: 25px;margin-right:25px;width:auto ;height: 400px">
                  <img src="../assets/banner20201216.jpg">
                </el-carousel-item>
                <el-carousel-item style="margin-left: 25px;margin-right:25px;width:auto ;height: 400px">
                  <img src="../assets/banner20210309.jpg">
                </el-carousel-item>
                <el-carousel-item style="margin-left: 25px;margin-right:25px;width:auto ;height: 400px">
                  <img src="../assets/banner20210225.jpg">
                </el-carousel-item>
              </el-carousel>
            </div>
          <div style="font-size: xx-large;margin-top: 20px;margin-left: 20px;color: #74787c">
            公告栏
          </div>
          <div style="background-color: cadetblue;width: auto;margin-left:30px;height: 3px"></div>
          <div style="margin-top: 10px">
            <el-row :gutter="10" style="margin-left: 15px">
              <div style="width: 30%;height: 350px;margin-left: 10px;background-color:#B3C0D1;margin-bottom: 10px">
                <kecheng></kecheng>
              </div>
              <div style="width: 30%;height: 350px;margin-left: 500px;background-color:#B3C0D1;margin-bottom: 10px;margin-top:-360px">
                <resource></resource>
              </div>
              <div style="width: 30%;height: 350px;margin-left: 1000px;background-color:#B3C0D1;margin-bottom: 10px;margin-top:-360px">
                <gonggao style="font-size: larger"></gonggao>
              </div>
            </el-row>

            <div style="font-size: xx-large;margin-left: 0px">新闻要点</div>
            <div style="background-color: cadetblue;width: auto;margin-left:30px;height: 3px"></div>
            <el-row :gutter="10" style="margin-left: 20px;margin-top: 15px">
              <div style="width: 35%;height: auto;margin-left: 10px;background-color:#B3C0D1;margin-bottom: 10px">
                <div style="font-size: larger">重师要闻当前位置: 网站首页 > 重师要闻 > 正文
                  互动 教研 共生——“川渝教研共同体”阅读教学研讨会暨重师附小“1+X厚读”工作坊教研活动开幕</div>
                <div style="height: 3px;width: auto;background-color: black"></div>
                <div style="font-size: large">强国必先强教，强教必先强师。为促进教师专业化发展，积极推进课堂教学改革，全面提高教学质量，6月11日上午，由我校基础教育研究院主办、重庆师范大学附属实验小学承办的“川渝教研共同体”阅读教学研讨会暨重师附小“1+X厚读”工作坊教研活动于重庆师范大学附属实验小学行知礼堂举行。校党委常委、副校长、基础教育研究院执行院长孟小军，对外联络与合作中心负责人，文学院与教育科学学院相关专家专家、90多位研究生，成渝地区联盟体十几所学校校长及教师代表出席开幕式。活动在重师附属实验小学学生们热情的表演中拉开帷幕。开场节目《逐梦少年》融合了航天、海洋等现代化元素，展现学生们青春年少的活力与自信，科技强国的愿望与憧憬，赢得台下嘉宾的阵阵掌声。</div>
              </div>
              <div style="width: 20%;height: auto;margin-left: 560px;background-color:#B3C0D1;margin-bottom: 10px;margin-top:-310px">
               <div>
                 <div style="font-size:large;margin-top: 2px">
                   【党史学习教育】校工会举办教职工学习“四史”知识竞赛
                 </div>
                 <div style="background-color: black;width: auto;height: 2px"></div>
                 <div style="font-size: small">为深入学习贯彻习近平新时代中国特色社会主义思想，特别是习近平总书记关于党史、新中国史、改革开放史、社会主义发展史的重要论述，隆重纪念党的百年华诞，增强学习实效，6月10日，校工会在博雅楼503会议室举办教职工学习“四史”知识竞赛，22个二级工会派代表参加了竞赛。</div>
                 <div style="font-size: small">各二级工会高度重视，积极开展线上线下预赛、选拔。此次竞赛活动通过试卷答题的形式进行，共涵盖判断题、选择题、填空题三种题型200道题，经过100分钟的答题，最终瞿聪、叶利娟两名教师获得满分，与其余42名教职工分别获得一、二、三等奖，地理与旅游学院工会、马克思主义学院工会、机关二工会获得优秀组织奖。</div>
               </div>
              </div>
              <div style="width: 36%;height: 400px;margin-left: 880px;background-color:#B3C0D1;margin-bottom: 10px;margin-top:-420px">
                <div style="font-size: larger;margin-top: 3px">
                  “向杰出校友学习 做师德高尚的新时代好老师”——我校召开座谈会追思救人英雄王红旭
                </div>
                <div style="width: auto;height: 5px;background-color: black"></div>
                <div style="font-size: large">   重庆师范大学体育学院2004级毕业生、重庆大渡口区育才小学教师王红旭，勇救两名落水儿童，献出了年仅35岁的宝贵生命，他的英雄壮举引起强烈的社会反响。我校师生也被杰出校友的英雄壮举所深深感动。6月8日下午，我校于综合办公楼226会议室召开“向杰出校友王红旭老师学习 做师德高尚的新时代好老师”座谈会。全体校领导，党政办、宣传部、教师工作部、学工部、研工部、团委、校友办负责人，王红旭老师生前教师、同学代表，部分师生代表参加座谈会，会议由校党委书记曾礼主持。</div>
              </div>
            </el-row>

          </div>
        </div>


        <div style="margin-left: -120px;width: auto;height: auto;font-size: xx-large;margin-top: 80px">
          学校印象
        </div>
        <div style="background-color: cadetblue;width: auto;margin-left:30px;height: 3px"></div>
        <div style="background-color: cadetblue;width: auto;margin-left:30px;height: 3px;margin-top: 2px;margin-bottom: 2px"></div>
        <div style="margin-top: 5px">
          <div style="width: 400px;margin-left: 30px">
            <img src="../assets/25zrre66hy.jpg">
          </div>
          <div style="width: 400px;margin-left: 450px;margin-top: -200px">
            <img src="../assets/3ugdoa20i9.jpg">
          </div>
          <div style="width: 400px;margin-left: 870px;margin-top: -250px">
            <img src="../assets/33a35xxksi.jpg">
          </div>
        </div>
      </div>
      <router-view></router-view>
    </el-main>
    <el-footer class="footer-styles" style="height: auto">
      <div style="margin-top: 10px;margin-bottom: 10px;height: auto">
        <div style="margin-top: 3px">地址：重庆市沙坪坝区大学城中路37号重庆师范大学</div>
        <div style="margin-top: 3px">计算机与信息科学学院    2018级软件工程</div>
        <div style="margin-top: 3px">项目参与者：陈勇 杨文彪 马光健</div>
        <div style="margin-top: 3px">联系电话：01010101</div>
        <div style="margin-top: 3px;">邮编：406213</div>
      </div>
    </el-footer>
  </el-container>
</template>

<script>

import hello_world from "@/views/FirstHome/First";
import test from "@/views/FirstHome/introduce";
import Gonggao from "@/views/FirstHome/First/gonggao";
import Kecheng from "@/views/FirstHome/First/kecheng";
import Resource from "@/views/FirstHome/First/resource";

export default {
  name: "FirstHome",
  components: {Resource, Kecheng, Gonggao, hello_world,test},
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
    height: 350px;
    /*line-height: 60px;*/
  }
  .image-style{
    /*background-color: #0e6ddc;*/
    max-width: 40%;
    height: auto;
    margin-left: 60px;
    margin-top: 10px;
  }
  .div-style{
    color: rgb(248, 249, 250);
    font-size: 20px;
    font-family: 华文楷体;
    width: 170px;
    background-color: rgba(23, 40, 128, 0.73);
    margin-top: 10px;
    margin-left: 200px;
  }
  .login-location{
    /*position: absolute;*/
    margin-left: 1320px;
    margin-top: 20px;
  }
  .login-style {
    cursor: pointer;
    color: darkred;
    font-size: 25px;
    /*background-color: black;*/
  }
  .button-location{
    margin-left: 700px;
    font-size: 0px;
    bottom: 0px;
  }
  .view-styles{
    background-color: rgba(248, 255, 254, 0.95);
    height: auto;
    min-height: 820px;
    /*display: flex;*/
    /*margin-left: 10px;*/
  }
  .footer-styles{
    background-color: rgba(23, 40, 128, 0.73);
    text-align: center;
  }
  .title-first{
    text-align: center;
    width: auto;
    height: 40px;
    font-size: x-large;
    background-color: white;
    margin-right: 0px;
    margin-left: 0px;
    margin-top: 0px;
  }
  .head-title-button{
    margin-left: 30px;
    background-color: rgba(23, 40, 128, 0.73);
    text-align: center;
    height: auto;
    color: white;
  }
</style>