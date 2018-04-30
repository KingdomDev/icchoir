<template>
  <b-navbar toggleable="md" type="dark"
            variant="dark" fixed="top">
    <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

    <router-link class="navbar-brand" to="/">ICChoir LYON</router-link>

    <b-collapse is-nav id="nav_collapse">
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
          <router-link class="nav-link" to="medias">Bibliothèque</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="#">Contact</router-link>
        </li>
      </ul>
    </b-collapse>
  </b-navbar>
</template>

<script>
  export default {
    name: 'custom-menu',
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
