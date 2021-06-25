<template>
  <el-container style="height: 100%;">
    <el-aside width="125px" >
      <el-menu mode="vertical" style="height: 100%" @select="menuClick">
        <el-menu-item :index="item2.name" v-for="(item2,index) in navList" :key="index">{{item2.navItem}}</el-menu-item>
      </el-menu>
    </el-aside>
    <el-main>
      <div v-if="this.$router.currentRoute.path === '/teacherTeam'">
        <div>
          <img src="~@/assets/banner55.jpg">
        </div>
        <div style="margin-left: 300px;margin-right: 300px;font-size: x-large;margin-top: 50px;color: #7591f3">
            名师风采
        </div>
        <div class="in-style">
          学校现有教职工2200余人，其中专任教师1700余人；教授及其他高级职称教师722人；具有硕士学位教师918人，具有博士学位教师400人，具有硕士、博士学位教师占专任教师 70% 以上；博士生导师22人，硕士生导师359人。拥有“新世纪百千万人才工程”国家级人选、海外青年学者合作研究基金获得者、有突出贡献的中青年专家国家级人选、享受国务院政府特殊津贴专家、全国杰出专业...
        </div>

        <div style="margin-top: 10px;height: 5px;width: auto;background-color: #B3C0D1;" class="in-style"></div>
        <div style="margin-top: 5px;height: 5px;width: auto;background-color: #B3C0D1;" class="in-style"></div>

        <div style="margin-left: 300px;margin-right: 300px;font-size: x-large;margin-top: 20px;color: #7591f3">
          教授、研究员等正高职称人员
        </div>
        <div class="in-style">
          学校现有教职工2200余人，其中专任教师1700余人；教授及其他高级职称教师722人；具有硕士学位教师918人，具有博士学位教师400人，具有硕士、博士学位教师占专任教师 70% 以上；博士生导师22人，硕士生导师359人。拥有“新世纪百千万人才工程”国家级人选、海外青年学者合作研究基金获得者、有突出贡献的中青年专家国家级人选、享受国务院政府特殊津贴专家、全国杰出专业...
        </div>
      </div>
      <router-view></router-view>
    </el-main>
  </el-container>
</template>

<script>

export default {
  name: "teacherTeam",
  data() {
    return {
      navList:[
        {name:'/teacherTeam/teacherResource',navItem:'教师团队'},
      ] }
  },
  methods: {
    menuClick(index) {
      this.$router.push(index);
    },
  },
}
</script>

<style scoped>
.in-style{
  margin-top: 20px;
  margin-left: 300px;
  margin-right: 400px;
  background-color: #a6d9e8;
  font-size: large;
  text-align: center;
  color: white;
}
</style>