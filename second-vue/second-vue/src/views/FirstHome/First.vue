<template>

  <div class="body-style" style="width: auto;height: 850px;margin-bottom: 20px">
    <div >
      <img style="margin-left: 50px" src="~@/assets/banner20210225.jpg">
    </div>
    <div class="welcome-style" style="width: auto;height: auto;margin-top: 20px">欢迎来到重庆师范大学</div>
    
    <div>
      <div style="background-color:cadetblue;width: 1450px;height: 5px;margin-left: 50px;margin-top: 20px">
      </div>
      <div style="background-color:cadetblue;width: 600px;height: 5px;margin-left: 50px;margin-top: 5px">
      </div>
      <div style="background-color:cadetblue;width: 600px;height: 5px;margin-left: 50px;margin-top: 5px">
      </div>
      <div style="background-color: #B3C0D1;width: 600px;height: 650px;margin-left: 50px;margin-top: 20px">
        <div style="margin-top: 0px;margin-left: 0px;width:600px;height: 200px">
          <img  src="~@/assets/101.jpg">
        </div>
        <div style="margin-top: 3px;margin-left: 0px;width:600px;height: 8px;background-color: white"></div>
        <div>
          文脉深厚，教泽流长。重庆师范大学创办于1954年，是重庆市人民政府举办的全日制综合性普通本科院校，是西部教师教育事业的重要基地之一，办学历史源于1906年官立川东师范学堂。学校1986年获批硕士学位授予单位，2003年更名为重庆师范大学，2017年获批硕士研究生推免单位，2018年获批博士学位授予单位，2020年综合实力跃升全国高校前200名。作为新中国最早创办的高等师范院校之一，学校始终秉承“立教无类，以文化人”的办学理念，恪守“厚德、笃学、砺志、创新”的校训精神，立足西部、扎根重庆、服务全国，建立起学前教育、小学教育、中等教育、高等教育、继续教育、职业技术教育、特殊教育和海外华文教育师资培养培训的完备教师教育体系。构建起师范教育和非师范教育“两轮驱动”，基础教育、职业教育和汉语国际教育“三驾马车”，文化传承与创新、决策咨询与公共服务、科技攻关与应用转化“三大板块”的特色办学格局。
        </div>
        <div style="margin-top: 3px;margin-left: 0px;width:600px;height: 8px;background-color: white"></div>
        <div>
          师道尊严，彬彬济济。学校现有17个二级学院，在校学生3万人左右，其中全日制本科生24000余人、研究生近5000人、留学生300余人；在职教职工2000余人，其中正高职称和博士1000余人，博士生导师和硕士生导师800余位。有国际系统与控制科学院院士、国家级特聘教授、国家“万人计划”人选、“新世纪百千万人才工程”国家级人选、国家级有突出贡献的中青年专家、全国杰出专业技术人才、全国文化名家暨“四个一批”理论人才、国家“优青”、教育部科技委数理学部委员、“中国青年科技奖”获得者、享受国务院政府特殊津贴专家、“海外杰青”获得者、中国科学院“百人计划”人选等国家级专门人才30人次。有教育部重点人才工程人选、重庆市重点人才工程人选230余人次。
        </div>
      </div>

      <div style="background-color:#B3C0D1;margin-top: -650px;margin-left: 700px;font-size: xx-large;height: 650px">
        <div>
          <div>
            <gonggao></gonggao>
          </div>
          <div style="background-color: white;margin-top: 100px;margin-left: 0px;width: auto;height: 40px"></div>
          <div style="background-color: white;margin-top: 10px;margin-left: 0px;width: auto;height: 5px"></div>
          <div style="background-color: white;margin-top: 5px;margin-left: 0px;width: auto;height: 5px"></div>
          <div style="display: flex;margin-top: 10px;margin-top: 20px">
            <div style="width: 49%">
              <kecheng></kecheng>
            </div>
            <div style="width: 1.1%;background-color: white;height: 400px;margin-top: -30px">
            </div>
            <div style="width: 49%">
              <resource></resource>
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>
</template>
<script>
import gonggao from "@/views/FirstHome/First/gonggao";
import kecheng from "@/views/FirstHome/First/kecheng";
import resource from "@/views/FirstHome/First/resource";


export default {
  name: 'helloworld',
  components: {gonggao, resource, kecheng},
}
</script>
<style scoped>
.body-style{
  background-color:white;
  margin-left: -10px;
  margin-right: -10px;
}
.welcome-style{
  text-align: center;
  color: #720a0a;
  font-size: xx-large;
  margin-top: -10px;
  margin-bottom: 5px;
}
.photo-div{
  margin-left: 10px;
  margin-right: 10px;
}
</style>