import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Medias from '@/components/Medias'
import MediasAudios from '@/components/MediasAudios'
import MediasVideos from '@/components/MediasVideos'
import MediasDocuments from '@/components/MediasDocuments'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/medias',
      name: 'Medias',
      component: Medias
    },
    {
      path: '/medias-audios',
      name: 'MediasAudios',
      component: MediasAudios
    },
    {
      path: '/medias-videos',
      name: 'MediasVideos',
      component: MediasVideos
    },
    {
      path: '/medias-documents',
      name: 'MediasDocuments',
      component: MediasDocuments
    }
  ]
})
