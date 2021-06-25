<template>
  <el-container>
    <el-main>
      <div class="main_content">
        <div class="main_contit">
          <h2>《金融会计学》课程简介</h2>
        </div>
        <div class="main_conDiv" id="vsb_content_2"><h1><p class="vsbcontent_start">《金融会计学》课程简介</p></h1>
          <p></p>
          <p><strong>课程编号：</strong><strong>053326</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <strong>课程性质：</strong><strong>专业选修课</strong></p>
          <p><strong>开课单位：</strong><strong>管理学院会计系</strong>&nbsp;&nbsp;&nbsp;&nbsp; <strong>总学时：</strong><strong>24</strong></p>
          <p><strong>理论学时：</strong>24&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <strong>实验学时：</strong></p>
          <p><strong>上机学时：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>学 分：1.5</strong></p>
          <p><strong>内容简介：</strong></p>
          <p>《金融会计学》是为适应培养经济管理专门人才而开设一门专业课程，是金融学专业、会计学专业、财务管理专业的专业选修课程。本科程《金融会计制度》为依据，结合不同金融部门会计核算特点与实务，在重点介绍金融理论和会计基本理论基础上，讲授银行非银行业务的会计核算方法。本课程以课堂教学为主，学生通过学习金融企业会计制度、金融企业会计的基本核算、金融会计分析相应知识，掌握金融会计的核算方法与程序；了解我国现行金融体制及金融企业性质、作用，学生将具备一定金融会计核算的能力、组织管理以及运用会计手段从事金融经营和金融监督工作的能力，并能够在实际工作中运用金融企业会计的核算方法和各项业务处理方法。</p>
          <p><strong>先修课程：</strong>财务会计、初级会计实务</p>
          <p><strong>撰写人：</strong>刘静、李军训</p>
          <h1><p>COURSE</p></h1>
          <p><strong>Course ID:</strong><strong>053326&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>Course Type:</strong><strong>major optional course</strong></p>
          <p><strong>Offered by(School): Management school Accounting Department&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>Total Hours: 24 hours</strong></p>
          <p><strong>Teaching Hours:</strong><strong>24 hours&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>Experimental Hours:</strong></p>
          <p><strong>Using Computer Hours:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>Credit:</strong><strong>1.5</strong></p>
          <p><strong>Course Description:</strong></p>
          <p>Finance andaccounting is a major course aims atmeeting the needs of training specialists</p>
          <p>for economic management.It is amajoroptional course forfinance major,accounting major</p>
          <p>and financial management majorstudents.The course ison the basis of finance and</p>
          <p>accounting system, combined with accounting practicecharacteristicof different financial</p>
          <p>sectors.The course is focusedon the introduction of finance principal and accounting theory,</p>
          <p>teaching banksor non banksaccounting measurement approaches. through teaching finance</p>
          <p>enterprisesaccountingsystem ,andbasicaccounting approaches offinance enterprises ,equip</p>
          <p>studentswithability of accounting, organizeandmanagementability,students is able tp use</p>
          <p>accounting methods, engage infinance operating and supervisingwork.</p>
          <p></p>
          <p><strong>Prerequisite Course: Financial Accounting</strong><strong>,</strong><strong>Primary accounting practice</strong></p>
          <p class="vsbcontent_end"><strong>Written by: Liu Jing</strong><strong>,</strong><strong>Li Jun Xun</strong></p>
          <p></p><div id="div_vote_id"></div>
        </div>
        <div class="main_art">
          <ul>
            <li @click="currents('/introduce/Java')"><lable>上一篇：</lable>《Java语言程序设计》课程简介</li>
            <li @click="currents('/introduce/conduct')"><lable>上一篇：</lable>《服务管理A》课程简介</li>
          </ul>
        </div>
      </div>
    </el-main>
  </el-container>
</template>

<script>
export default {
  name: "accounting",
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
.main_contit {
  width: 950px;
  margin: 0 auto;
  height: auto;
  overflow: hidden;
  border-bottom: 1px dashed #eee;
}
.main_contit h2 {
  width: 950px;
  text-align: center;
  line-height: 28px;
  font-size: 24px;
  color: #000000;
  font-weight: normal;
  margin-top: 46px;
}
.main_conDiv {
  text-indent: 2em;
  font-size: 14px;
  line-height: 30px;
  color: #666666;
}
h1, h2, h3, h4, h5, h6 {
  font-size: 100%;
  font-weight: normal;
}
#vsb_content_2 P {
  LINE-HEIGHT: 150%;
  text-indent: 2em;
  font-size: 14px;
}
#vsb_content_2 DIV {
  LINE-HEIGHT: 150%;
  text-indent: 2em;
  font-size: 14px;
}
.main_art {
  width: 978px;
  margin: 72px auto 0;
  background: #fbfbfb;
  height: auto;
  overflow: hidden;
}
</style>