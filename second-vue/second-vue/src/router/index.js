import Vue from 'vue'
import VueRouter from 'vue-router'
import Student from '../views/Home/routine/Student'
import Home from '../views/Home'
import Login from '../views/Login'
import firstHome from "@/views/FirstHome";
import first from "@/views/FirstHome/First";
import introduce from "@/views/FirstHome/introduce";
import teacherTeam from "@/views/FirstHome/teacherTeam";
import resouceteacher from "@/views/FirstHome/teacherTeam/resouceteacher";
import controlTeacher from "@/views/Home/teacherTeam/controlTeacher";
import controlgonggao from "@/views/Home/First/controlgonggao";
import controlkecheng from "@/views/Home/First/controlkecheng";
import controlresource from "@/views/Home/First/controlresource";
import libo from "@/views/FirstHome/introduce/libo";
import yxh from "@/views/FirstHome/introduce/yxh";
import ly from "@/views/FirstHome/introduce/ly";
import conduct from "@/views/FirstHome/introduce/conduct";
import accounting from "@/views/FirstHome/introduce/accounting";
import Java from "@/views/FirstHome/introduce/Java";
import dynamic from "@/views/FirstHome/dynamic/dynamic";
import build from "@/views/FirstHome/build/build";
import question from "@/views/FirstHome/question";
import research from "@/views/FirstHome/research/research";
import resourse from "@/views/FirstHome/resource/resourse";

// import answer1 from "@/views/FirstHome/question/answer1"
// import answer2 from "@/views/FirstHome/question/answer2"
// import answer3 from "@/views/FirstHome/question/answer3"
// import answer4 from "@/views/FirstHome/question/answer4"
// import coquestion from "@/views/FirstHome/question/coquestion"
// import rsquestion from "@/views/FirstHome/question/rsquestion"

import answer1 from "@/views/FirstHome/question/answer1"
import answer2 from "@/views/FirstHome/question/answer2"
import answer3 from "@/views/FirstHome/question/answer3"
import answer4 from "@/views/FirstHome/question/answer4"
import coquestion from "@/views/FirstHome/question/coquestion"
import rsquestion from "@/views/FirstHome/question/rsquestion"

import vidio from "@/views/FirstHome/resource/vidio"
import links from "@/views/FirstHome/resource/links"
import freeclass from "@/views/FirstHome/resource/freeclass"
import Classes from "@/views/Home/source/Classes";
import Introduced from "@/views/Home/source/Introduced";
import Answer from "@/views/Home/source/Answer";
import Link from "@/views/Home/source/Link";
import Department from "@/views/Home/school/Department";
import Majors from "@/views/Home/school/Majors";
import Information from "@/views/Home/routine/Information";
import Score from "@/views/Home/routine/Score";

Vue.use(VueRouter);

const originalPush = VueRouter.prototype.push

VueRouter.prototype.push = function push(location) {
  return originalPush.call(this, location).catch(err => err)
}

const routes = [
  {
    path: '/login',
    name: 'Login',
    component: Login,
    hidden: true
  },
  {
    path: '/home',
    component: Home,
    children: [
      {
        path: 'teacherTeam',
        name: '教师团队',
        component: controlTeacher,
      },
      {
        path: 'gonggao',
        name: '公告',
        component: controlgonggao,
      },
      {
        path: 'kecheng',
        name:'动态',
        component: controlkecheng,
      },
      {
        path: 'resource',
        name: '资源',
        component: controlresource,
      },
      {
        path:'classes',
        name:'课程',
        component:Classes,
      },
      {
        path:'introduced',
        name:'介绍',
        component: Introduced,
      },
      {
        path:'answer',
        name:'答疑',
        component: Answer,
      },
      {
        path:'link',
        name: '学习网站',
        component: Link,
      },
      {
        path:'department',
        name:'学院目录',
        component: Department,
      },
      {
        path:'major',
        name: '专业目录',
        component: Majors,
      },
      {
        path:'information',
        name:'学生信息',
        component: Information,
      },
      {
        path:'score',
        name:'考试成绩',
        component: Score,
      },
      {
        path:'student',
        name: '学生名单',
        component: Student,
      },
    ],
  },
  {
    path:'/',
    name: 'FirstHome',
    component: firstHome,
    hidden: true,
    children:[
      {
        path:'first',
        name:'first',
        component: first,
        hidden:true,
      },
      {
        path:'introduce',
        name:'introduce',
        component: introduce,
        hidden:true,
        children:[
          {
            path:'Java',
            name:'Java',
            component: Java,
            hidden:true,
          },
          {
            path:'accounting',
            name:'accounting',
            component: accounting,
            hidden:true,
          },
          {
            path:'conduct',
            name:'conduct',
            component: conduct,
            hidden:true,
          },
          {
            path:'ly',
            name:'ly',
            component: ly,
            hidden:true,
          },
          {
            path:'yxh',
            name:'yxh',
            component: yxh,
            hidden:true,
          },
          {
            path:'libo',
            name:'libo',
            component: libo,
            hidden:true,
          },
        ]
      },
      {
        path: 'teacherTeam',
        name:'teacherTeam',
        component: teacherTeam,
        hidden: true,
        children:[
          {
            path:'teacherResource',
            name:'teacherResource',
            component: resouceteacher,
            hidden:true,
          },
        ]
      },
      {
        path:'dynamic',
        name:'dynamic',
        component: dynamic,
        hidden:true,
      },
      {
        path: 'build',
        name: 'build',
        component: build,
        hidden: true,
      },
      {
        path: 'question',
        name: 'question',
        component: question,
        hidden: true,
        children:[
          {
            path:'answer1',
            name:'answer1',
            component:answer1,
            hidden:true,
          },
          {
            path:'answer2',
            name: 'answer2',
            component: answer2,
            hidden: true,
          },
          {
            path:'answer3',
            name:'answer3',
            component: answer3,
            hidden: true,
          },
          {
            path: 'answer4',
            name:'answer4',
            component:answer4,
            hidden: true
          },
          {
            path: 'coquestion',
            name: 'coquestion',
            component: coquestion,
            hidden: true,
          },
          {
            path: 'rsquestion',
            name: 'rsquestion',
            component: rsquestion,
            hidden: true,
          },
        ]

      },
      {
        path: 'research',
        name: 'research',
        component: research,
        hidden: true,
      },
      {
        path:'resourse',
        name:'resourse',
        component: resourse,
        hidden:true,
        children:[
          {
            path:'vidio',
            name:'vidio',
            component:vidio,
            hidden:true,
          },
          {
            path: 'links',
            name: 'links',
            component: links,
            hidden: true,
          },
          {
            path: 'freeclass',
            name: 'freeclass',
            component: freeclass,
            hidden: true,
          },
        ]
      },
    ]
  },
]

const router = new VueRouter({
  // mode: 'history',
  routes,
})

export default router
