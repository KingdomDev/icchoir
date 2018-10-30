<template>
  <div>
    <custom-menu></custom-menu>
    <div class="container" id="medias">
      <h2>Bibliothèque - Audios</h2>
      <custom-menu-media></custom-menu-media>
      <div class="col-lg-12" v-if="audios && audios.length" id="audios">
        <b-card v-for="audio of filteredList" :key="audio.id"
                bg-variant="ligth"
                :header="audio.name"
                class="audio-card col-md-4">
          <audio controls>
            <source :src="audioDirectory + audio.url" type="audio/mpeg">
            Your browser does not support the audio element.
          </audio>
        </b-card>
      </div>
    </div>
    <!--custom-footer></custom-footer-->
  </div>
</template>

<script>
  import CustomMenu from './Menu.vue'
  import CustomFooter from './Footer.vue'
  import CustomMenuMedia from './MenuMedia.vue'

  import axios from 'axios'

  export default {
    name: 'medias-audios',

    data () {
      return {
        api: 'http://localhost:8080/api',
        audios: [],
        audioDirectory: '/static/audio/'
      }
    },

    components: {
      CustomMenu,
      CustomFooter,
      CustomMenuMedia
    },

    created() {
      axios.get(this.api + `/medias/audio`).
      then(response => {
        this.audios = response.data;
        //console.log(this.audios)
      }).catch (e => {
        this.errors.push(e);
      });
    },

    computed: {
      filteredList() {
        return this.audios.filter(audio => {
          return audio.name.toLowerCase().includes(CustomMenuMedia.data().search.toLowerCase())
        })
      }
    }
  }

  /*$(document).ready(function(){
    $("#medias").click(function(){
      $("#audios").hide();
    });
  });*/
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  #medias {
    'height': 80vh
  }

  .audio-card {
    float: left;
    width: 33.33%;
  }
</style>
