<template>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <router-link class="navbar-brand" to="/">ICChoir LYON</router-link>
      <button class="navbar-toggler"
              type="button"
              data-toggle="collapse"
              data-target="#navbarResponsive"
              aria-controls="navbarResponsive"
              aria-expanded="false"
              aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse"
           id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <router-link class="nav-link" to="/">Accueil
              <span class="sr-only">(current)</span>
            </router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="members">Membres</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="calendar">Calendrier</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="#">Médias</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="#">Documents</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="#">Contact</router-link>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>

<script>
  export default {
    name: 'custom-menu',
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
