<template>
  <div>
    <custom-menu></custom-menu>
    <div class="container" id="medias">
      <h2>Bibliothèque - Documents</h2>
      <custom-menu-media></custom-menu-media>
      <div class="row">
        <p>{{document}}</p>
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
    name: 'medias-documents',

    data () {
      return {
        api: 'http://localhost:8080/api/documents/piece/',
        document: 'toto',
        errors: [],
        documentDirectory: '/static/document/'
      }
    },

    components: {
      CustomMenu,
      CustomFooter,
      CustomMenuMedia
    },

    created() {
      axios.get(this.api + this.$route.params.id).
      then(response => {
        this.document = response.data;
      }).catch (e => {
        this.errors.push(e);
      });
    },

    /*mounted() {
      let recaptchaScript = document.createElement('script');
      recaptchaScript.setAttribute('src', '/static/lib/pdfobject.min.js');
      recaptchaScript.async = true;
      document.head.appendChild(recaptchaScript);
    },*/
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
