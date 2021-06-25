<template>
  <div style="background-color: rgba(176,242,245,0.75);width: 1520px;margin-left: -20px;margin-top: -10px;height: 980px">
    <div style="margin-top: -18px;margin-left: 0px;height: 200px">
      <img src="~@/assets/Quicker_20210614_100429.png">
    </div>
    <div style="margin-top: 10px;height: 60px;width: 1520px;font-size: xx-large;color: #7591f3;text-align: center;margin-bottom: 10px">
      重庆国家数学应用中心
    </div>

    <div style="margin-top: 5px;margin-left: 430px;height: 200px;margin-right: 130px;width: 1360px;margin-bottom: 20px">
      <img src="~@/assets/banner20201124.jpg">
    </div>

    <div class="in-sty" style="height: 5px;width: 1220px;margin-left: 130px;background-color: white;margin-top: 5px"></div>
    <div class="in-sty" style="height: 5px;width: 600px;margin-left: 130px;background-color: white;margin-top: 45px"></div>
    <div class="in-sty" style="height: 400px;width: 600px;font-size: xx-large;margin-left: 130px;margin-top: 50px">
      <el-carousel height="400px">
        <el-carousel-item style="height: 400px">
          <img src="~@/assets/4mh79v5n9l.jpg">
        </el-carousel-item>
        <el-carousel-item style="height: 400px">
          <img src="~@/assets/2rsvj86naa.jpg">
        </el-carousel-item>
        <el-carousel-item style="height: 400px">
          <img src="~@/assets/23iso4ryyt.jpg">
        </el-carousel-item> <el-carousel-item style="height: 400px">
        <img src="~@/assets/3wbyvq4n4n.jpg">
      </el-carousel-item>
      </el-carousel>
    </div>
    <div class="in-sty" style="height: 400px;width: 600px;font-size: xx-large;margin-left: 750px;margin-top: -400px">
      <resource></resource>
    </div>
  </div>


</template>

<script>



import Resource from "@/views/FirstHome/First/resource";
export default {
  name: "research",
  components: {Resource}
}
</script>

<style scoped>
.in-sty{
  background-color: #a6d9e8;
  margin-bottom: -30px;
}
</style>