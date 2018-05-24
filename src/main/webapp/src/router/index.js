import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Members from '@/components/Members'
import Calendar from '@/components/Calendar'
import Medias from '@/components/Medias'
import MediasAudios from '@/components/MediasAudios'
import MediasVideos from '@/components/MediasVideos'
import MediasDocuments from '@/components/MediasDocuments'
import CreateUser from '@/components/users/CreateUser'
import MemberDetails from '@/components/MemberDetails'

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
    },
    {
      path: '/calendar',
      name: 'Calendar',
      component: Calendar
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
    },
    {
      path: '/admin-create-user',
      name: 'CreateUser',
      component: CreateUser
    },
    {
      path: '/member-details/:id',
      name: 'MemberDetails',
      component: MemberDetails
    }
  ]
})
