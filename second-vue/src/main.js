import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import ElementUI, {Message} from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import store from './store'
import {findAllMenus} from "./config/menu";

Vue.config.productionTip = false
Vue.prototype.$axios = axios
Vue.use(ElementUI)

router.beforeEach((to,from,next)=> {
  if(to.path=='/home'){
      if (window.sessionStorage.getItem("user")) {
          let l=router;
          findAllMenus(router,store)
          //if(l==router) console.log(router);
          next();
        } else {
          next('/login');
        }
    next();
  }
  else next();
})

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
