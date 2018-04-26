<template>
  <div>
    <custom-menu></custom-menu>
    <div class="container">
      <h2>Membres</h2>
      <table class="table">
        <thead class="thead-light">
          <tr>
            <th scope="col">#</th>
            <th scope="col">Prénom</th>
            <th scope="col">Nom</th>
            <th scope="col">Poste</th>
          </tr>
        </thead>
        <tbody v-if="members && members.length">
          <tr v-for="member of members">
            <th scope="row">#</th>
            <td>{{member.firstName}}</td>
            <td>{{member.lastName}}</td>
            <td> - </td>
          </tr>
        </tbody>
      </table>
    </div>
    <custom-footer></custom-footer>
  </div>
</template>

<script>
  import CustomMenu from './Menu.vue'
  import CustomFooter from './Footer.vue'

  import axios from 'axios'

  export default {
    name: 'Members',

    data() {
      return {
        members: [],
        errors: [],
      }
    },

    components: {
      CustomMenu,
      CustomFooter,
    },

    created() {
      axios.get(`http://localhost:8080/persons`).
      then(response => {
        this.members = response.data;
        console.log(this.members);
      }).catch (e => {
        this.errors.push(e);
      });
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
