<template>
  <el-container>
    <el-main>
      <div class="main_content">
        <div class="main_contit">
          <h2>《Java语言程序设计》课程简介</h2>
        </div>
        <div class="main_conDiv" id="vsb_content_2"><h1><p class="vsbcontent_start">《Java语言程序设计》课程简介</p></h1>
          <p><strong>课程编号：</strong><strong>054203</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <strong>课程性质：专业基础课</strong></p>
          <p><strong>开课单位：管理学院</strong><strong>管理工程系 </strong><strong>总学时：</strong><strong>48</strong></p>
          <p><strong>理论学时：</strong><strong>40&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>实验学时：</strong><strong>8</strong></p>
          <p><strong>上机学时：</strong><strong>0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>学 分：</strong><strong>3.0</strong></p>
          <p><strong>内容简介：</strong></p>
          <p>本课程是信息管理与信息系统专业开设的专业基础课程，作为计算机技术课程之一，是管理信息系统开发实现的语言基础，在本专业人才培养方案中占有重要的地位。本课程注重理论性和实践性的紧密结合，目的在于培养学生掌握面向对象编程思想和机制，并具备运用Java语言进行程序设计的基本能力。通过本课程的学习，使学生理解与掌握计算机面向对象程序设计的基本概念、基本思想与基本方法、异常的处理机制、Applet小应用程序的编写方法、图形用户界面设计及事件处理机制、线程创建及同步、输入输出流、数据库编程等。本课程通过课堂讲授、课内实验、课外自主实验等教学环节，以启发式教学思想为指导，运用比较分析、实例讲解、情景创建等教学方法，帮助学生深入体会面向对象编程思想，并能够运用java程序设计语言进行初步的算法实现和系统设计。</p>
          <p><strong>先修课程：</strong><strong>C语言程序设计</strong><strong>、</strong><strong>数据库原理、数据结构</strong></p>
          <p><strong>撰写人：王纯子</strong></p>
          <p>A Brief Introduction to Java Programming Language Course</p>
          <p><strong>Course ID:</strong><strong>054203&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>Course Type:</strong><strong>Major basic courses</strong></p>
          <p><strong>Offered by (School): Department of management engineering, School of management&nbsp;&nbsp; </strong><strong>Total Hours: 48</strong></p>
          <p><strong>Teaching Hours: 40</strong><strong>E&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; xperimental Hours: 8&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>Using Computer Hours: 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </strong><strong>Credit: 3.0</strong></p>
          <p><strong>Course Description:</strong></p>
          <p><strong>This course is a basic course of information management and information system</strong><strong>m</strong><strong>ajor.</strong><strong>As one of the courses of computer technology, it is the language foundation of the development and implementation of management information system, and occupies an important position in the professional training program.</strong></p>
          <p><strong>This course pays attention to the close combination of theory and practice. The purpose is to train students to master the idea and mechanism of object oriented programming, and to have the basic ability of programming with Java language.</strong></p>
          <p><strong>Through this course, make students understand and master computer object-oriented programming basic concept, the basic ideas and basic methods, processing mechanism, abnormal Applet small application program method, graphical user interface design and event handling mechanism, thread creation and synchronization, input and output flow, database programming etc.</strong></p>
          <p><strong>The course is guided by the heuristic teaching thought through classroom teaching, in class experiment, extracurricular independent experiment and other teaching links. Using comparative analysis, case interpretation, scenario creation and other teaching methods to help students understand the object-oriented programming ideas, and can use the Java programming language for preliminary algorithm implementation and system design.</strong></p>
          <p><strong>Prerequisite Course:</strong><strong>C Language Programming,</strong><strong>D</strong><strong>atabase Principle, Data Structure</strong></p>
          <p class="vsbcontent_end"><strong>Written by:</strong><strong>Wang Chunzi</strong></p><div id="div_vote_id"></div>
        </div>
        <div class="main_art">
          <ul>
            <li @click="currents('/introduce/accounting')"><lable>上一篇：</lable>《金融会计学》课程简介</li>
            <li @click="currents('/introduce/conduct')"><lable>上一篇：</lable>《服务管理A》课程简介</li>
          </ul>
        </div>
      </div>
    </el-main>
  </el-container>
</template>

<script>
export default {
  name: "Java",
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