<template>
  <div>
    <custom-menu></custom-menu>
    <div class="container" id="medias">
      <h2>Bibliothèque</h2>
      <custom-menu-media></custom-menu-media>
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
    name: 'Medias',

    data () {
      return {
        choirEvents: []
      }
    },

    components: {
      CustomMenu,
      CustomFooter,
      CustomMenuMedia
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  #calendar {
  'height': 100vh
  }
</style>
