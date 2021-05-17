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
    component: resolve=> require(['../views/Home.vue'],resolve),
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
      }
    ]
  },
]

const router = new VueRouter({
  // mode: 'history',
  routes,
})

export default router
