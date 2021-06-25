<template>
  <el-container style="height: 100%;">
    <el-main>
      <div class="topimage" :height="bannerHeight +'px'"loop>
        <img  src="../image/01.jpg" alt="">
      </div>
    </el-main>

    <!--    </el-container>-->
  </el-container>
</template>

<script>
export default {
  name: "dynamic",
  data(){
    return{
      img_list:[
        require('../image/1.gif'),
        require('../image/2.jpg'),
        require('../image/3.jpg'),
      ],
      bannerHeight:1000,
      screenWidth:0,
    }
  },
  methods:{
    setSize:function (){
      this.bannerHeight = 600/1550 *this.screenWidth
    }
  },
  mounted() {
    this.screenWidth = window.innerWidth
    this.setSize()
    window.onresize=() =>{
      this.screenWidth = window.innerWidth
      this.setSize()
    }
  }
}
</script>

<style scoped>
.topimage{
  height: 100%;
  width: 100%;
}
img{
  width: 100%;
  height: inherit;
}
.detail[data-v-39d61b84] {
  height: 32px;
  font-size: 20px;
  color: #74787c;
  margin-top: 50px;
  text-align: center;
}
.title[data-v-39d61b84] {
  font-size: 40px;
  font-weight: 500;
  color: #1f2023;
  margin-top: 50px;
  text-align: center;
}
.list[data-v-39d61b84] {
  padding: 0;
}
ul[data-v-39d61b84] {
  display: flex;
  justify-content: space-between;
  align-items: center;
  flex-wrap: wrap;
}
li[data-v-39d61b84] {
  height: 320px;
  text-align: center;
  width: 288px;
  background: linear-gradient(
      180deg
      ,#fff,#f4f8ff 130%);
  border-radius: 8px 8px 0 8px;
  margin-top: 24px;
  padding: 40px 24px;
}
.headimg[data-v-39d61b84] {
  width: 64px;
  margin: 0 auto;
  height: 64px;
  margin-bottom: 24px;
}
.title[data-v-39d61b84] {
  font-weight: 600;
  color: #1f2023;
  font-size: 24px;
  margin-bottom: 8px;
}
.detail[data-v-39d61b84] {
  font-size: 14px;
  color: #74787c;
  line-height: 24px;
}
</style>