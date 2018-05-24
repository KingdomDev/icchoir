<template>
  <div>
    <custom-menu></custom-menu>
    <div class="container">
      <div class="row">
        <div class="col-md-2">
          <h2>Membres - </h2>
        </div>
        <div class="col-md-2">
          <span>{{member.firstName}} {{member.lastName}}</span>
        </div>
      </div>

    </div>
    <custom-footer></custom-footer>
  </div>
</template>

<script>
  import CustomMenu from './Menu.vue'
  import CustomFooter from './Footer.vue'

  import axios from 'axios'

  export default {
    name: 'member-details',

    data() {
      return {
        api: 'http://localhost:8080/api',
        member: '',
        errors: []
      }
    },

    components: {
      CustomMenu,
      CustomFooter,
    },

    created() {
      axios.get(this.api + `/persons/` + this.$route.params.id).
      then(response => {
        this.member = response.data;
        console.log(this.member);
      }).catch (e => {
        this.errors.push(e);
      });
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
