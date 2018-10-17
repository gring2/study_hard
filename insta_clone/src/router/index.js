import Vue from 'vue'
import Router from 'vue-router'
import ContentList from '@/components/ContentList'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'ContentCard',
      component: ContentList
    }
  ]
})
