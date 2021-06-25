import Vue from 'vue'
import VueRouter from 'vue-router'
import Student from '../views/Student'
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
import question from "@/views/FirstHome/question/question";
import research from "@/views/FirstHome/research/research";
import resourse from "@/views/FirstHome/resource/resourse";

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
      }
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
      },
    ]
  },
]

const router = new VueRouter({
  // mode: 'history',
  routes,
})

export default router
