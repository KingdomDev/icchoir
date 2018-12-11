<template>
  <div id="app">
    <div style="text-align: center">
      <img src="./assets/images/logo.png">
      <p>Have a cup of coffee: <font-awesome-icon icon="coffee" /></p>
    </div>
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
