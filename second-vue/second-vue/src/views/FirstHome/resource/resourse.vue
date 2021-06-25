<!--<template>-->
<!--  <div>-->
<!--    <el-container style="height: 500px; border: 1px solid #eee">-->
<!--      <el-aside width="200px" style="background-color: rgb(238, 241, 246)">-->
<!--        <el-menu :default-openeds="['1', '3']">-->
<!--          <el-submenu index="1">-->
<!--            <template slot="title"><i class="el-icon-message"></i>导航一</template>-->
<!--            <el-menu-item-group>-->
<!--              <template slot="title">分组一</template>-->
<!--              <el-menu-item index="1-1">选项1</el-menu-item>-->
<!--              <el-menu-item index="1-2">选项2</el-menu-item>-->
<!--            </el-menu-item-group>-->
<!--            <el-menu-item-group title="分组2">-->
<!--              <el-menu-item index="1-3">选项3</el-menu-item>-->
<!--            </el-menu-item-group>-->
<!--            <el-submenu index="1-4">-->
<!--              <template slot="title">选项4</template>-->
<!--              <el-menu-item index="1-4-1">选项4-1</el-menu-item>-->
<!--            </el-submenu>-->
<!--          </el-submenu>-->
<!--          <el-submenu index="2">-->
<!--            <template slot="title"><i class="el-icon-menu"></i>导航二</template>-->
<!--            <el-menu-item-group>-->
<!--              <template slot="title">分组一</template>-->
<!--              <el-menu-item index="2-1">选项1</el-menu-item>-->
<!--              <el-menu-item index="2-2">选项2</el-menu-item>-->
<!--            </el-menu-item-group>-->
<!--            <el-menu-item-group title="分组2">-->
<!--              <el-menu-item index="2-3">选项3</el-menu-item>-->
<!--            </el-menu-item-group>-->
<!--            <el-submenu index="2-4">-->
<!--              <template slot="title">选项4</template>-->
<!--              <el-menu-item index="2-4-1">选项4-1</el-menu-item>-->
<!--            </el-submenu>-->
<!--          </el-submenu>-->
<!--          <el-submenu index="3">-->
<!--            <template slot="title"><i class="el-icon-setting"></i>导航三</template>-->
<!--            <el-menu-item-group>-->
<!--              <template slot="title">分组一</template>-->
<!--              <el-menu-item index="3-1">选项1</el-menu-item>-->
<!--              <el-menu-item index="3-2">选项2</el-menu-item>-->
<!--            </el-menu-item-group>-->
<!--            <el-menu-item-group title="分组2">-->
<!--              <el-menu-item index="3-3">选项3</el-menu-item>-->
<!--            </el-menu-item-group>-->
<!--            <el-submenu index="3-4">-->
<!--              <template slot="title">选项4</template>-->
<!--              <el-menu-item index="3-4-1">选项4-1</el-menu-item>-->
<!--            </el-submenu>-->
<!--          </el-submenu>-->
<!--        </el-menu>-->
<!--      </el-aside>-->

<!--      <el-container>-->
<!--        <el-header style="text-align: right; font-size: 12px">-->
<!--          <el-dropdown>-->
<!--            <i class="el-icon-setting" style="margin-right: 15px"></i>-->
<!--            <el-dropdown-menu slot="dropdown">-->
<!--              <el-dropdown-item>查看</el-dropdown-item>-->
<!--              <el-dropdown-item>新增</el-dropdown-item>-->
<!--              <el-dropdown-item>删除</el-dropdown-item>-->
<!--            </el-dropdown-menu>-->
<!--          </el-dropdown>-->
<!--          <span>资源列表</span>-->
<!--        </el-header>-->

<!--        <el-main>-->
<!--          <el-table :data="tableData">-->
<!--            <el-table-column prop="date" label="日期" width="140">-->
<!--            </el-table-column>-->
<!--            <el-table-column prop="name" label="资源名" width="120">-->
<!--            </el-table-column>-->
<!--            <el-table-column prop="address" label="内容">-->
<!--            </el-table-column>-->
<!--          </el-table>-->
<!--        </el-main>-->
<!--      </el-container>-->
<!--    </el-container>-->
<!--  </div>-->
<!--</template>-->

<!--<script>-->
<!--export default {-->
<!--  data() {-->
<!--    const item = {-->
<!--      date: '2016-05-02',-->
<!--      name: '设计报告',-->
<!--      address: 'java设计报告'-->
<!--    };-->
<!--    return {-->
<!--      tableData: Array(20).fill(item)-->
<!--    }-->
<!--  }-->
<!--};-->
<!--</script>-->

<!--<style scoped>-->
<!--.el-header {-->
<!--  background-color: #B3C0D1;-->
<!--  color: #333;-->
<!--  line-height: 60px;-->
<!--}-->

<!--.el-aside {-->
<!--  color: #333;-->
<!--}-->
<!--</style>-->

<template>
  <el-container style="height: 100%;" >
    <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
      <el-menu >
        <el-menu-item index="2-1" @click="currents('/resourse/vidio')">视频资源</el-menu-item>
        <el-menu-item index="2-1" @click="currents('/resourse/links')">学习网站</el-menu-item>
        <el-menu-item index="2-1" @click="currents('/resourse/freeclass')">免费课程</el-menu-item>
      </el-menu>
    </el-aside>
    <!--    <el-container>-->
    <!--      <el-header>Header</el-header>-->
    <el-main>
      <div v-if="this.$router.currentRoute.path === '/resourse'" style="background-color: #eaeaea;margin-top: -20px;height: 1250px;">
        <div style="margin-top: -10px;text-align: center;background-color: #eaeaea;height:auto;font-size: x-large">
          课程资源
        </div>
        <div>
          <img src="~@/assets/banner20201216.jpg" style="margin-left: 20px">
        </div>
        <div style="height: 3px;width: auto;background-color: white;margin-top: 20px;"></div>
        <div>
          <div style="margin-top: 10px;text-align: center;font-size: x-large">学术资源</div>
          <div style="margin-top: 20px;width: 30%;height: 330px;background-color: #666666;margin-left: 10px">
            <div style="width: auto;height: 30px;text-align: center;color: white">标题</div>
            <div style="width: auto;height: 3px;background-color: white"></div>
            <div style="margin-left:5px;font-size: large;color: white">内容</div>
          </div>
          <div style="margin-top: -330px;width: 30%;height: 330px;background-color: #666666;margin-left: 430px">
            <div style="width: auto;height: 30px;text-align: center;color: white">标题</div>
            <div style="width: auto;height: 3px;background-color: white"></div>
            <div style="margin-left:5px;font-size: large;color: white">内容</div>
          </div>
          <div style="margin-top: -330px;width: 30%;height: 330px;background-color: #666666;margin-left: 850px">
            <div style="width: auto;height: 30px;text-align: center;color: white">标题</div>
            <div style="width: auto;height: 3px;background-color: white"></div>
            <div style="margin-left:5px;font-size: large;color: white">内容</div>
          </div>
          <div style="margin-top: 20px;width: 30%;height: 330px;background-color: #666666;margin-left: 10px">
            <div style="width: auto;height: 30px;text-align: center;color: white">标题</div>
            <div style="width: auto;height: 3px;background-color: white"></div>
            <div style="margin-left:5px;font-size: large;color: white">内容</div>
          </div>
          <div style="margin-top: -330px;width: 30%;height: 330px;background-color: #666666;margin-left: 430px">
            <div style="width: auto;height: 30px;text-align: center;color: white">标题</div>
            <div style="width: auto;height: 3px;background-color: white"></div>
            <div style="margin-left:5px;font-size: large;color: white">内容</div>
          </div>
          <div style="margin-top: -330px;width: 30%;height: 330px;background-color: #666666;margin-left: 850px">
            <div style="width: auto;height: 30px;text-align: center;color: white">标题</div>
            <div style="width: auto;height: 3px;background-color: white"></div>
            <div style="margin-left:5px;font-size: large;color: white">内容</div>
          </div>
        </div>
      </div>
      <router-view></router-view>
    </el-main>

    <!--    </el-container>-->
  </el-container>
</template>

<script>
export default {
  data() {
    return {
      tableData: Array(20).fill(item)
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
    }
  },
};
</script>

<style scoped>
.el-header {
  background-color: #B3C0D1;
  color: #333;
  line-height: 60px;
}

.el-aside {
  color: #333;
}
</style>