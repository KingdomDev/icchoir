import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Members from '@/components/Members'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/members',
      name: 'Members',
      component: Members
    }
  ]
})
