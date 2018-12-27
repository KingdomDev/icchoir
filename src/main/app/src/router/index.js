import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Medias from '@/components/Medias'
import Audios from '@/components/Audios'
import Videos from '@/components/Videos'
import Documents from '@/components/Documents'

import Document from '@/components/Document'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Audios
    }/*,
    {
      path: '/medias',
      name: 'Medias',
      component: Medias
    },
    {
      path: '/audios',
      name: 'Audios',
      component: Audios
    },
    {
      path: '/videos',
      name: 'Videos',
      component: Videos
    },
    {
      path: '/documents',
      name: 'Documents',
      component: Documents
    },
    {
      path: '/documents/:id',
      name: 'Document',
      component: Document,
      props: {}
    }*/
  ]
})
