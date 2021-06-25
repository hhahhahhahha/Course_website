<template>
  <el-container>
    <el-main>
      <div class="main_content">
        <div class="main_contit">
          <h2>《服务管理A》课程简介</h2>
        </div>
        <div class="main_conDiv" id="vsb_content_2"><h1><p class="vsbcontent_start">《服务管理A》课程简介</p></h1>
          <p></p>
          <p><strong>课程编</strong><strong>号：</strong>051411&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <strong>课程性质：</strong><strong>专业核心课</strong></p>
          <p><strong>开课单位：</strong>管理学院工商管理系&nbsp;&nbsp;&nbsp; <strong>总学时：</strong><strong>32</strong></p>
          <p><strong>理论学时：</strong><strong>32&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>实验学时：</strong><strong>0</strong></p>
          <p><strong>上机学时：</strong><strong>0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; </strong><strong>学 分：</strong><strong>2</strong></p>
          <p><strong>内容简介：</strong></p>
          <p>本课程是工商管理专业的专业核心课，是该专业学生的知识结构和能力结构的重要组成部分，本课程在工商管理专业的人才培养方案中占有非常重要的地位。本课程研究的是服务性企业以及其他任何组织中所存在的服务运营管理问题。通过本课程的学习使学生了解服务业与制造业的主要区别，理解服务业务的基本特征，具备从事服务企业经营管理的基本观念和战略思想，掌握服务企业及服务业务设计、运营、管理的基本理论和方法，为学生从事服务业经营管理工作培养良好的素质和能力。</p>
          <p>本课程按照服务概述、构建服务企业以及服务运营的逻辑顺序，系统介绍服务管理的理论及方法。本课程主要内容包括：服务管理概述、服务战略、服务系统设计、服务设施选址与布局、服务接触、服务供求管理与收益管理、排队管理、 服务质量管理。本课程教学中，既要突出课程的理论性，又要注意理论联系实际，尽量采用多种教学手段与灵活的教学方法，并在课堂中引入一些典型的案例。本课程考核中期末考试成绩占60%，平时成绩占40%。</p>
          <p><strong>先修课程：</strong>管理学原理 微观经济学</p>
          <p><strong>撰写人：</strong>杨静</p>
          <h1><p>Service ManagementA</p></h1>
          <p><strong>Course ID:</strong>051411&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <strong>Course Type:</strong>professional core course</p>
          <p><strong>Offered by(School): School of Management,</strong></p>
          <p><strong>Department of Business Administration&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>Total Hours:</strong><strong>32</strong></p>
          <p><strong>Teaching Hours:</strong><strong>32&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>Experimental Hours:</strong><strong>0</strong></p>
          <p><strong>Using Computer Hours:</strong><strong>0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong><strong>Credit:</strong><strong>2</strong></p>
          <p><strong>Course Description:</strong></p>
          <p>Service Management A is the core course of Business Administration,it is an important part of the knowledge structure and ability structure of the students.This course occupies a very important position in the talent training program of business administration.This course studies service operation management problems in service enterprises and any other organizations.Through the study of this course, students can understand the main differences between service industry and manufacturing industry, understand the basic features of service business, have basic concepts and strategic ideas to engage in the management of service enterprises, and grasp the basic theories and methods of the design, operation and management of service enterprises and service business.This course trains good quality and ability for students in the management and operation of service industry.</p>
          <p>This course introduces the theory and method of service management systematically according to the service overview, the logic sequence of constructing service enterprises and service operations.The main contents of this course include: service management overview, service strategy, service system design, service facilities location and layout, service contact, service supply and demand management and income management, queuing management, service quality management.In the course of teaching, we should not only highlight the theoretical nature of the curriculum, but also pay attention to the theory and practice, try to adopt various teaching methods and flexible teaching methods as far as possible, and introduce some typical cases in the classroom.The final exam results of this course account for 60%, and 40% of normal grades.</p>
          <p></p>
          <p><strong>Prerequisite Course:</strong>Principles of Management Microeconomics</p>
          <p class="vsbcontent_end"><strong>Written by:</strong><strong>Yangjing</strong></p><div id="div_vote_id"></div>
        </div>
        <div class="main_art">
          <ul>
            <li @click="currents('/introduce/accounting')"><lable>上一篇：</lable>《金融会计学》课程简介</li>
            <li @click="currents('/introduce/Java')"><lable>上一篇：</lable>《Java语言程序设计》课程简介</li>
          </ul>
        </div>
      </div>
    </el-main>
  </el-container>
</template>

<script>
export default {
  name: "conduct",
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