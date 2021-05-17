<template>
  <div>
    <el-container>
      <el-header class="home-header">
        <div class="title">后台管理</div>
        <div class="user-info">
          <el-dropdown trigger="click" @command="logout">
        <span>
          {{user.name}}<i class="el-icon-arrow-down el-icon--right"></i>
        </span>
            <el-dropdown-menu slot="dropdown" class="user-info">
              <el-dropdown-item command="logout">退出</el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
        </div>
      </el-header>
      <el-container>
        <el-aside width="200px">
          <el-menu @select="menuClick">
            <el-submenu :index="index+''" v-for="(item,index) in routes" v-if="!item.hidden" :key="index">
              <template slot="title">
                <span>{{item.name}}</span>
              </template>
              <el-menu-item :index="item2.path" v-for="(item2,index) in item.children" :key="index">{{item2.name}}</el-menu-item>
            </el-submenu>
          </el-menu>
        </el-aside>
        <el-main>
          <el-breadcrumb separator="/" v-if="this.$router.currentRoute.path!=='/home'">
            <el-breadcrumb-item :to="{ path: '/home' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item><a href="/">{{this.$router.currentRoute.name}}</a></el-breadcrumb-item>
          </el-breadcrumb>
          <div v-if="this.$router.currentRoute.path === '/home'">后台管理管理系统</div>
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>
<script>
  export default {
    name: 'About',
    data () {
      return {
        user: JSON.parse(window.sessionStorage.getItem("user")),
        routes:[
            // index
          {
            // path: "/home",
            name:'首页',
            children:[
              {
                path: '/home/gonggao',
                name: '公告管理',
              },
              {
                path: '/home/kecheng',
                name: '动态管理',
              },
              {
                path: '/home/resource',
                name:'资源管理',
              }
            ]
          },
          {
            name: '课程介绍',
            children: []
          },
          {
            name: '教学团队',
            children: [
              {
                path: '/home/teacherTeam',
                name:'教师团队',
              },
            ]
          },
          {
            name: '课程建设',
            children: []
          },
          {
            name: '问题与答题',
            children: []
          },
          {
            name: '课程研究',
            children: []
          }
        ],
      }

    },

    computed: {
      // routes () {
      //   //console.log(this.$store.state.routes);
      //   return this.$store.state.routes;
      // }
    },
    methods: {
      menuClick (index) {
        this.$router.push(index);
        console.log(index);
      },
      logout (data) {
        if (data === 'logout') {
          this.$confirm('您确定要退出吗?', '提示', {
            confirmButtonText: '确定',
            cancelButtonText: '取消',
            type: 'warning'
          }).then(() => {
            this.$axios.get("/logout").then ((res)=>{
            })
            window.sessionStorage.removeItem('user')
            this.$store.commit("findAllRoutes",[])
            this.$router.replace("/")
          }).catch(() => {
            this.$message({
              type: 'info',
              message: '已取消退出'
            });
          });
        }
      }
    }
  }
</script>
<style scoped>
  .home-header {
    background-color: #409eff;
    height: 60px;
    line-height: 60px;
    display: flex;
  }
  .home-header .title {
    font-size: 30px;
    font-family: 华文隶书;
    color: #fff;
    margin:0 auto;
  }
  .user-info {
    cursor: pointer;
  }

</style>