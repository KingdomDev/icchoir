<template>
  <div>
    <custom-menu></custom-menu>

    <div class="container" id="medias">
      <h2>Bibliothèque - Audios</h2>

      <div>
        <custom-menu-media></custom-menu-media>
      </div>

      <div class="col-lg-12" style="height: 100vh"
           v-if="audios && audios.length" id="audios">
        <div class="card-columns">
          <div v-for="audio of audios" :key="audio.id"
            class="card">
            <div class="card-header">
              {{audio.name}}
            </div>
            <div class="card-body">
              <audio controls="controls" :src="audioDirectory + audio.url">
              </audio>
            </div>
          </div>
        </div>
        <!--b-card-group columns >
          <b-card v-for="audio of audios" :key="audio.id"
                  bg-variant="ligth"
                  :header="audio.name"
                  class="audio-card">
            <audio controls>
              <source :src="audioDirectory + audio.url" type="audio/mpeg">
              Your browser does not support the audio element.
            </audio>
          </b-card>
        </b-card-group-->
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
        api: 'http://localhost:8080/api/medias/audio',
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
      axios.get(this.api).
      then(response => {
        this.audios = response.data;
        //console.log(this.audios)
      }).catch (e => {
        this.errors.push(e);
      });
    },

    /*computed: {
      filteredList() {
        return this.audios.filter(audio => {
          return audio.name.toLowerCase().includes(CustomMenuMedia.data().search.toLowerCase())
        })
      }
    }*/
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  #medias {
    'height': 80vh
  }

  .audio-card {
    height: 15vh;
  }

  .audio-card audio {
    /*width: 80%;*/
  }
</style>
