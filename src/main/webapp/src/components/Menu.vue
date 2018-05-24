<template>
  <b-navbar toggleable="md" type="dark"
            variant="dark" fixed="top">
    <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

    <router-link class="navbar-brand" to="/">ICChoir LYON</router-link>

    <b-collapse is-nav id="nav_collapse">
      <b-navbar-nav>
        <li class="nav-item active">
          <router-link class="nav-link" :to="{name: 'Home'}">Accueil
            <span class="sr-only">(current)</span>
          </router-link>
        </li>

        <li class="nav-item">
          <router-link class="nav-link" :to="{name: 'Members'}">Membres</router-link>
        </li>

        <li class="nav-item">
          <router-link class="nav-link" :to="{name: 'Calendar'}">Calendrier</router-link>
        </li>

        <li class="nav-item">
          <router-link class="nav-link" to="#">Contact</router-link>
        </li>
      </b-navbar-nav>

      <b-navbar-nav class="ml-auto">
        <!--li class="nav-item" right>
          <router-link class="nav-link" to="#">Inscription</router-link>
        </li-->

        <li class="nav-item" right>
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
        </li>
      </b-navbar-nav>
    </b-collapse>
  </b-navbar>
</template>

<script>
  import axios from 'axios'

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
</style>
