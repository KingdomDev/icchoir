<template>
  <div>
    <custom-menu></custom-menu>
    <div class="container" id="medias">
      <h2>Bibliothèque - Documents</h2>
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
    name: 'medias-documents',

    data () {
      return {
        choirEvents: []
      }
    },

    components: {
      CustomMenu,
      CustomFooter,
      CustomMenuMedia
    },

    created() {
      axios.get(`http://localhost:8080/events`).
      then(response => {
        this.choirEvents = response.data;
        console.log(this.choirEvents);
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
