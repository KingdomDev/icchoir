<template>
  <div>
    <custom-menu></custom-menu>

    <h1>ADMIN- PAGE</h1>

    <!-- Footer -->
    <custom-footer></custom-footer>
  </div>
</template>

<script>
  import CustomMenu from './Menu.vue'
  import CustomFooter from './Footer.vue'

  import AuthService from './auth/AuthService';
  const auth = new AuthService();
  const { login, logout, authenticated, authNotifier } = auth;

  export default {
    name: 'Home',

    components: {
      CustomMenu,
      CustomFooter
    },

    data() {
      authNotifier.on('authChange', (authState) => {
        this.authenticated = authState.authenticated;
      });
      return {
        auth,
        authenticated,
      };
    },
    methods: {
      login,
      logout,
    },
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
