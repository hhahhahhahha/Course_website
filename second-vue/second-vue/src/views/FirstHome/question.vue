<!--<template>-->
<!--  <el-container>-->
<!--    <el-main>-->
<!--      <div data-v-65405da8="" class="banner">-->
<!--        <div data-v-65405da8="" class="help-search">-->
<!--          <i data-v-65405da8="" class="el-icon-search"></i>-->
<!--          <input data-v-65405da8="" type="text" placeholder="搜索您的问题或关键词，例如作业、班级">-->
<!--          <span data-v-65405da8="">搜索</span>-->
<!--        </div>-->
<!--      </div>-->

<!--      <div data-v-65405da8="" class="tab-content" style="margin-top: 50px;background-color: #B3C0D1">-->
<!--        <ul data-v-65405da8="" class="ul-list">-->
<!--          <li data-v-65405da8=""><a data-v-65405da8="" @click="currents('/question/answer1')">1、资料上传是否有大小限制？</a></li>-->
<!--          <li data-v-65405da8=""><a data-v-65405da8="" @click="currents('/question/answer2')">2、外链资源的链接提示无法添加？</a></li>-->
<!--          <li data-v-65405da8=""><a data-v-65405da8="" @click="currents('/question/answer3')">3、资料模块下的内容学生都可以下载吗？</a></li>-->
<!--          <li data-v-65405da8=""><a data-v-65405da8="" @click="currents('/question/answer4')">4、附件资源中的内容无法排序进行？</a></li>-->
<!--        </ul>-->
<!--      </div>-->
<!--    </el-main>-->
<!--  </el-container>-->
<!--</template>-->

<!--<script>-->
<!--export default {-->
<!--  name: "question",-->
<!--  methods:{-->
<!--    currents(current){-->
<!--      this.$router.push(current);-->
<!--    },-->
<!--    handleSelect(key, keyPath) {-->
<!--      console.log(key, keyPath);-->
<!--    }-->
<!--  },-->
<!--}-->
<!--</script>-->

<!--<style scoped>-->
<!--.banner[data-v-65405da8] {-->
<!--  width: 100%;-->
<!--  min-width: 1224px;-->
<!--  height: 240px;-->
<!--  background: url(~@/views/FirstHome/image/top5.jpg) 50% center / cover no-repeat;-->
<!--  position: relative;-->
<!--  display: flex;-->
<!--  align-items: center;-->
<!--  justify-content: center;-->
<!--}-->
<!--.banner .help-search[data-v-65405da8] {-->
<!--  width: 440px;-->
<!--  height: 34px;-->
<!--  opacity: 1;-->
<!--  background: rgb(255, 255, 255);-->
<!--  border-radius: 4px;-->
<!--  display: flex;-->
<!--  align-items: center;-->
<!--}-->
<!--.banner .help-search i[data-v-65405da8] {-->
<!--  color: rgb(195, 201, 209);-->
<!--  margin: 0px 8px;-->
<!--}-->
<!--.banner .help-search input[data-v-65405da8] {-->
<!--  flex: 110%;-->
<!--  font-size: 12px;-->
<!--  outline: none;-->
<!--}-->
<!--.banner .help-search span[data-v-65405da8] {-->
<!--  width: 55px;-->
<!--  font-size: 12px;-->
<!--  text-align: center;-->
<!--  color: rgb(66, 133, 244);-->
<!--  border-left: 1px solid rgb(240, 240, 240);-->
<!--  height: 34px;-->
<!--  line-height: 34px;-->
<!--  cursor: pointer;-->
<!--}-->
<!--.tab-content[data-v-65405da8] {-->
<!--  width: 100%;-->
<!--}-->
<!--.tab-content .ul-list[data-v-65405da8] {-->
<!--  padding: 24px;-->
<!--}-->
<!--.tab-content .ul-list li[data-v-65405da8] {-->
<!--  height: 56px;-->
<!--  margin-left: 14px;-->
<!--  position: relative;-->
<!--}-->
<!--</style>-->
<template>
  <el-container>
    <el-main>
      <div data-v-65405da8="" class="banner">
        <div style="margin-top:50px; display: flex">
          <el-input v-model="answerName" placeholder="请输入学生姓名" style="width:80%" clearable></el-input>
          <el-button type="primary" style="margin-left: 10px;" @click="searchAnswerByName">搜索</el-button>
        </div>
      </div>
      <div id="tab-first" aria-controls="pane-first" role="tab" aria-selected="true" tabindex="0" class="el-tabs">常见问题</div>
      <el-container style="height: 100%;margin-top: 20px" >
        <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
          <el-menu >
            <el-menu-item  @click="currents('/question/rsquestion')">资源问题</el-menu-item>
            <el-menu-item  @click="currents('/question/coquestion')">管理问题</el-menu-item>
            <el-menu-item  @click="currents('')">其他问题</el-menu-item>
          </el-menu>
        </el-aside>
        <!--    <el-container>-->
        <!--      <el-header>Header</el-header>-->
        <el-main>
          <div v-if="this.$router.currentRoute.path === '/answer'">请点击左侧导航栏选择相关问题</div>
          <router-view></router-view>
        </el-main>

        <!--    </el-container>-->
      </el-container>
    </el-main>
  </el-container>
</template>

<script>
import Test from "@/views/FirstHome/introduce";
export default {
  name: "answer",
  components: {Test},
  data () {
    return {
      answerName: '',
      msg: '',
      search: '',
    }
  },
  watch:{
    answerName () {
      this.findAllAnswers();
    }
  },
  methods:{
    login(){
      this.$router.push('/login');
    },
    currents(current){
      this.$router.push(current);
    },
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    },
    searchAnswerByName () {
      if (this.answerName !== '') {
        this.$axios.get("/answer/findAnswerByName?name="+this.answerName).then( (resp)=> {
          this.answers = resp.data;
        }).catch( (error)=>{
          this.$message({
            type: 'error',
            message: "查询失败，原因是"+error.data.message
          });
        })
      }
    },
    findAllAnswers () {
      this.$axios.get("/answer/findAllAnswers")
          .then((res) => {
            this.answers = res.data
          })
          .catch(error => {
            this.$message({
              type: 'error',
              message: "查询失败，原因是"+error.data.message
            });
          });
    },
  },
}
</script>

<style scoped>
.banner[data-v-65405da8] {
  width: 100%;
  min-width: 1224px;
  height: 240px;
  background: url(../FirstHome/image/top5.jpg) 50% center / cover no-repeat;
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
.el-tabs{
  margin-top: 40px;
  font-size: x-large;
}
</style>