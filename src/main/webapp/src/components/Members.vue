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
        <tbody>
          <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
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
        errors: []
      }
    },

    components: {
      CustomMenu,
      CustomFooter,
    },

    async getMembers() {
      try {
        const
          response = await axios.get(`http://localhost:8080/persons`)
        this.members = response.data
      } catch (e) {
        this.errors.push(e)
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
