<template>
  <div>
    <top-head></top-head>

    <!--div class="container col-lg-8" id="menu">
      <b-navbar toggleable="md"
                type="white"
                variant="white">
        <button class="navbar-toggler" type="button" data-toggle="collapse"
                data-target="#navbarToCollapse" aria-controls="navbarToCollapse"
                aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <b-collapse is-nav id="navbarToCollapse">
          <ul class="nav justify-content-center nav-fill">
            <li class="nav-item">
              <router-link class="nav-link" :to="{name: 'Home'}">Accueil
                <span class="sr-only">(current)</span>
              </router-link>
            </li>

            <li class="nav-item">
              <router-link class="nav-link" to="#">Membres</router-link>
            </li>

            <li class="nav-item">
              <router-link class="nav-link" to="#">Calendrier</router-link>
            </li>

            <li class="nav-item">
              <router-link class="nav-link" :to="{name: 'Documents'}">Bibliothèque</router-link>
            </li>

            <li class="nav-item">
              <router-link class="nav-link" to="#">Contact</router-link>
            </li>
          </ul>

          <b-navbar-nav class="ml-auto">
            <!--li class="nav-item" right>
              <router-link class="nav-link" to="#">Inscription</router-link>
            </li-->

            <!--li class="nav-item" right>
              <div>
                <b-button @click="showModal">Connexion</b-button>
                <b-modal id="modalPrevent"
                         ref="modal"
                         title="Connexion"
                         @ok="handleOk"
                         @shown="clearName"
                         centered
                         hide-footer>
                  <form @submit.stop.prevent="handleSubmit">
                    <b-form-group horizontal
                                  :label-cols="4"
                                  label="Nom d'utilisateur"
                                  label-for="input_default">
                        <b-form-input type="text"
                                  v-model="user.username">
                        </b-form-input>
                    </b-form-group>

                    <b-form-group horizontal
                                  :label-cols="4"
                                  label="Mot de passe"
                                  label-for="input_default">
                        <b-form-input type="password"
                                  v-model="user.password">
                        </b-form-input>
                    </b-form-group>
                    <b-btn class="mt-2" variant="outline-danger" @click="hideModal">Annuler</b-btn>
                    <b-btn class="mt-2" variant="outline-info" @click="handleOk">Valider</b-btn>
                  </form>
                </b-modal>
              </div>
            </li-->
          <!--/b-navbar-nav>
        </b-collapse>
      </b-navbar>
    </div-->
  </div>
</template>

<script>
  import axios from 'axios'
  import TopHead from "./TopHead.vue"

  export default {
    name: 'custom-menu',

    data () {
      return {
        user: {
          username: '',
          password: '',
          admin: 0
        }
      }
    },

    components: {
      TopHead
    },

    methods: {
      showModal () {
        this.$refs.modal.show()
      },
      hideModal() {
        this.$refs.modal.hide()
      },
      clearName () {
        this.username = '';
        this.password = '';
      },
      handleOk (evt) {
        // Prevent modal from closing
        evt.preventDefault()
        if (!this.username) {
          alert("Le nom d'utilisateur est requis")
        } else if (!this.password) {
          alert("Le mot de passe est requis")
        } else {
          this.handleSubmit()
        }
      },
      handleSubmit () {
        axios.post('http://localhost:8080/users/sing-in')
        this.$refs.modal.hide()
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  #menu {

  }

  .nav-link {
    font-size: 1.5em;
    color: #1b1e21;
    text-decoration: none;
    padding-right: 2rem;
    padding-left: 2rem;
    padding-top: 12px;
    padding-bottom: 12px;
  }

  .nav-link:hover {
    text-decoration: none;
    background-color: #d1d1d1;
  }

  .nav-link:active {

  }
  .container {
    white-space: nowrap;
    width:100%;
  }
</style>
