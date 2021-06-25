<template>
  <el-container>
    <el-main>
      <a class="item free " href="//www.imooc.com/learn/1309" target="_blank" data-cid="1309" data-type="1" data-title="探秘 MySQL 多版本并发控制原理">
        <div class="img" style="background-image: url('//img.mukewang.com/60b6144609a8bb6505400304.png')"></div>
        <p class="title ellipsis2">探秘 MySQL 多版本并发控制原理</p>
        <p class="title ellipsis2">免费</p>
      </a>
      <a class="item free " href="//www.imooc.com/learn/1308" target="_blank" data-cid="1308" data-type="1" data-title="人工智能--语音入门 ">
        <div class="img" style="background-image: url('//img4.mukewang.com/608a96d90975fb8d05400304.png')"></div>
        <p class="title ellipsis2">人工智能--语音入门 </p>
        <p class="title ellipsis2">免费</p>
      </a>
      <a class="item free " href="//www.imooc.com/learn/1306" target="_blank" data-cid="1306" data-type="1" data-title="2小时极速入门 TypeScript">
        <div class="img" style="background-image: url('//img.mukewang.com/607fc1a4097d454805400304.png')"></div>
        <p class="title ellipsis2">2小时极速入门 TypeScript</p>
        <p class="title ellipsis2">免费</p>
      </a>
      <a class="item free " href="//www.imooc.com/learn/1304" target="_blank" data-cid="1304" data-type="1" data-title="趣味 C++ 入门">
        <div class="img" style="background-image: url('//img.mukewang.com/606c41a60914530f05400304.png')"></div>
        <p class="title ellipsis2">趣味 C++ 入门</p>
        <p class="title ellipsis2">免费</p>
      </a>
      <a class="item free " href="//www.imooc.com/learn/1303" target="_blank" data-cid="1303" data-type="1" data-title="直面JavaScript中的30个疑难杂症">
        <div class="img" style="background-image: url('//img2.mukewang.com/6020a85e09228d8905400304.png')"></div>
        <p class="title ellipsis2">直面JavaScript中的30个疑难杂症</p>
        <p class="title ellipsis2">免费</p>


      </a>
      <a class="item free " href="//www.imooc.com/learn/1301" target="_blank" data-cid="1301" data-type="1" data-title="领略Rust之美，挑战双高语言">
        <div class="img" style="background-image: url('//img2.mukewang.com/601112b30995261a05400304.png')"></div>
        <p class="title ellipsis2">领略Rust之美，挑战双高语言</p>
        <p class="title ellipsis2">免费</p>
      </a>
      <a class="item free " href="//www.imooc.com/learn/1300" target="_blank" data-cid="1300" data-type="1" data-title="vue3.0实现todolist">
        <div class="img" style="background-image: url('//img3.mukewang.com/600ebd8b08a2013605400304.jpg')"></div>
        <p class="title ellipsis2">vue3.0实现todolist</p>
        <p class="title ellipsis2">免费</p>
      </a>
      <a class="item free " href="//www.imooc.com/learn/1299" target="_blank" data-cid="1299" data-type="1" data-title="高性能 FastAPI 框架入门精讲">
        <div class="img" style="background-image: url('//img.mukewang.com/600a8570097f897e05400304.png')"></div>
        <p class="title ellipsis2">高性能 FastAPI 框架入门精讲</p>
        <p class="title ellipsis2">免费</p>
      </a>
    </el-main>
  </el-container>
</template>

<script>
export default {
  name: "freeclass"
}
</script>

<style scoped>
.item {
  position: relative;
  width: 270px;
  height: 270px;
  float: left;
  margin: 0 20px 20px 0;
  box-shadow: 0 4px 8px 0 rgb(95 101 105 / 5%);
  border-radius: 8px;
  background-color: #fff;
  transition: all .2s;
}
.item .img {
  height: 152px;
  background: no-repeat center/cover;
  margin-bottom: 8px;
  border-radius: 8px 8px 0 0;
  overflow: hidden;
}
.item .title.ellipsis2 {
  overflow: hidden;
  text-overflow: ellipsis;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
}
.item .title {
  color: #545c63;
  line-height: 20px;
  height: 40px;
  margin-bottom: 8px;
  padding: 0 8px;
}

</style>