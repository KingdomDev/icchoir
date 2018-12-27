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
              <b-carousel id="carousel_audio"
                          style="text-shadow: 1px 1px 2px #333;"
                          controls
                          indicators
                          background="#ffffff"
                          v-model="slide"
              >
                <!-- All song audio clide -->
                <b-carousel-slide caption="Chant complet">
                  <img slot="img" class="d-block img-fluid w-100"
                       src="../assets/images/caroussel7.jpg" alt="image slot">
                  <audio controls="controls" :src="audioDirectory + audio.url">
                  </audio>
                </b-carousel-slide>

                <!-- Alto slide -->
                <b-carousel-slide caption="Alto"
                                  v-if="audio.voiceToMedias.length">
                  <img slot="img" class="d-block img-fluid w-100"
                       src="../assets/images/caroussel7.jpg" alt="image slot">
                    <audio controls="controls" :src="audio_voice_directory + audio.voiceToMedias[0]">
                    </audio>
                </b-carousel-slide>

                <!-- Soprano slide -->
                <b-carousel-slide caption="Soprano"
                  v-if="audio.voiceToMedias.length">
                  <img slot="img" class="d-block img-fluid w-100"
                       src="../assets/images/caroussel7.jpg" alt="image slot">
                    <audio controls="controls" :src="audio_voice_directory + audio.voiceToMedias[1]">
                    </audio>
                </b-carousel-slide>

                <!-- Tenor slide -->
                <b-carousel-slide caption="Tenor"
                                  v-if="audio.voiceToMedias.length">
                  <img slot="img" class="d-block img-fluid w-100"
                       src="../assets/images/caroussel7.jpg" alt="image slot">
                  <audio controls="controls" :src="audio_voice_directory + audio.voiceToMedias[2]">
                  </audio>
                </b-carousel-slide>

              </b-carousel>
            </div>
            <!--ul class="list-group list-group-flush"
                v-if="audio.voiceToMedias.length">
              <li class="list-group-item">
                Alto :
                <audio controls="controls" :src="audio_voice_directory + audio.voiceToMedias[0]">
                </audio>
              </li>
              <li class="list-group-item">Soprano</li>
              <li class="list-group-item">Tenor</li>
            </ul-->
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
        audioDirectory: 'http://localhost/icchoir/chants/',
        audio_voice_directory: 'http://localhost/icchoir/chants-voix/',

        slide: 0,
        sliding: null
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

    methods: {
      onSlideStart (slide) {
        this.sliding = true
      },
      onSlideEnd (slide) {
        this.sliding = false
      }
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
