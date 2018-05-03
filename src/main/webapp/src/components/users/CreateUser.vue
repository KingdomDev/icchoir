<template>
  <div>
    <users-menu></users-menu>
    <div class="container">
      <h5>Ajouter un nouveau membre</h5>
      <b-form @submit.stop.prevent="onSubmit" @reset="onReset">
        <b-form-group id="member-gender" label="Genre*">
          <b-form-select
            id="member-gender-input"
            v-model="member.gender"
            :options="genderOptions"
            class="col-sm-1"
            required size="sm"></b-form-select>
        </b-form-group>

        <b-form-group id="member-firstName" label="Prénom(s)*">
          <b-form-input id="member-firstName-input"
                        v-model="member.firstName"
                        class="col-sm-3"
                        description="Vous pouvez écrire plusieurs prénoms"
                        placeholder="(requis)"
                        required size="sm"></b-form-input>
        </b-form-group>
        <b-form-group id="member-lastName" label="Nom*" >
          <b-form-input id="member-lastName-input"
                        v-model="member.lastName"
                        class="col-sm-3"
                        placeholder="(requis)"
                        required size="sm"></b-form-input>
        </b-form-group>

        <b-form-group id="member-birthdate" label="Date de naissance">
          <b-form-input id="member-birthdate-input"
                        v-model="member.birthdate"
                        class="col-sm-3"
                        type="date" size="sm"></b-form-input>
        </b-form-group>
        <b-form-group id="member-address" label="Adresse">
          <b-form-input id="member-address-input"
                        v-model="member.address"
                        class="col-sm-3"
                        placeholder="(facultatif)"
                        type="text" size="sm"></b-form-input>
        </b-form-group>

        <!--p>Informations de connexion</p>
        <b-form-group id="icchoirUser-icchoirUsername" label="Nom d'utilisateur*">
          <b-form-input id="icchoirUser-icchoirUsername-input"
                        v-model="icchoirUser.icchoirUsername"
                        class="col-sm-3"
                        type="text" size="sm"
                        placeholder="(requis)"
                        required></b-form-input>
        </b-form-group>
        <b-form-group-- id="icchoirUser-password" label="Mot de passe*">
          <b-form-input id="icchoirUser-password-input"
                        v-model="icchoirUser.password"
                        class="col-sm-3"
                        type="password" size="sm"
                        placeholder="(requis)"
                        required></b-form-input>
        </b-form-group-->

        <b-button type="submit" variant="primary">Valider</b-button>
        <b-button type="reset" variant="danger">Réinitialiser</b-button>
      </b-form>
    </div><br>
    <custom-footer></custom-footer>
  </div>
</template>

<script>
  import UsersMenu from './UsersMenu.vue'
  import CustomFooter from '../Footer.vue'

  import axios from 'axios'

  export default {
    name: 'create-user',

    data() {
      return {
        api: 'http://localhost:8080/api',
        errors: [],
        genderOptions: [
          {value: 'M', text: 'Monsieur'},
          {value: 'F', text: 'Madame'}
        ],
        member: {
          id: null,
          firstName: '',
          lastName: '',
          birthdate: '',
          address: '',
          gender: ''
        }/*,
        icchoirUser: {
          id: null,
          firstName: '',
          password: '',
          admin: 0
        }*/
      }
    },

    components: {
      UsersMenu,
      CustomFooter,
    },

    methods: {
      onSubmit(evt) {
        evt.preventDefault();
        if(!this.member.firstName) {
          alert('Le prénom est requis')
        } else if(!this.member.lastName) {
          alert('Le nom est requis')
        } /*else if(!this.icchoirUser.username) {
          alert("Le nom d'utilisateur est requis")
        } else if(!this.icchoirUser.password) {
          alert('Le mot de passe est requis')
        }*/ else {
          console.log("-->Sending post request<--");
          console.log(this.member);
          axios.post(this.api + '/persons', this.member)
            .then(function (response) {
              console.log(response);
            })
            .catch(function (error) {
              this.errors.push(error);
              console.log(error);
            });
        }
      },
      onReset(evt) {
        evt.preventDefault();
        this.member.firstName = '';
        this.member.lastName = '';
        this.member.birthdate = '';
        this.member.address = '';
        this.member.gender = '';

        /*this.icchoirUser.username = '';
        this.icchoirUser.password = '';*/
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
