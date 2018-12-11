<template>
  <div>
    <custom-menu></custom-menu>
    <div class="container" id="medias">
      <h2>Bibliothèque - Videos</h2>
      <custom-menu-media></custom-menu-media>
      <div class="col-lg-8" v-if="videos && videos.length" id="videos">
        <div v-for="video of videos" :key="video.id">
          <h5 class="mt-0 mb-1">{{video.name}}</h5>
          <iframe width="400" height="200" src="https://www.youtube.com/embed/watch?v=Imldy_tJGz4">
          </iframe>
        </div>
      </div>
    </div>
    <custom-footer></custom-footer>
  </div>
</template>

<script>
  import CustomMenu from './Menu.vue'
  import CustomFooter from './Footer.vue'
  import CustomMenuMedia from './MenuMedia.vue'

  import axios from 'axios'

  export default {
    name: 'medias-videos',

    data () {
      return {
        api: 'http://localhost:8080/api',
        videos: []
      }
    },

    components: {
      CustomMenu,
      CustomFooter,
      CustomMenuMedia
    },

    created() {
      axios.get(this.api + `/medias/video`).
      then(response => {
        this.videos = response.data;
        console.log(this.videos)
      }).catch (e => {
        this.errors.push(e);
      });
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  #calendar {
  'height': 100vh
  }
</style>
