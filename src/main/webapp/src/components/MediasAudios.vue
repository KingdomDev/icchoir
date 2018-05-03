<template>
  <div>
    <custom-menu></custom-menu>
    <div class="container" id="medias">
      <h2>Bibliothèque - Audios</h2>
      <custom-menu-media></custom-menu-media>
      <div class="col-lg-8" v-if="audios && audios.length" id="audios">
        <div v-for="audio of audios" :key="audio.id">
            <h5 class="mt-0 mb-1">{{audio.name}}</h5>
            <av-circle
              :outline-width="0"
              :progress-width="5"
              :outline-meter-space="5"
              :playtime="true"
              playtime-font="18px Monaco"
              audio-src="../assets/audios/IsraelNewBreed-Rez_Power.mp3"
            ></av-circle>
          <audio controls>
            <source src="../assets/audios/IsraelNewBreed-Rez_Power.mp3" type="audio/mpeg">
            Your browser does not support the audio element.
          </audio>
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
    name: 'medias-audios',

    data () {
      return {
        api: 'http://localhost:8080/api',
        audios: []
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
  .audio-box {
  'height': 25vh,
  'width': 50vw
  }
</style>
