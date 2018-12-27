<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse"
            data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01"
            aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
      <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
        <li class="nav-item active">
          <router-link class="nav-link" to="/">Audios <span class="sr-only">(current)</span></router-link>
        </li>
        <!--li class="nav-item">
          <router-link class="nav-link" to="/">Vidéos</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/">Documents</router-link>
        </li-->
      </ul>
      <form class="form-inline my-2 my-lg-0">
        <input class="form-control mr-sm-2" v-model="search"
               type="text" placeholder="Rechercher" aria-label="Rechercher">
      </form>
    </div>
  </nav>
</template>

<script>
  export default {
    name: 'custom-menu-media',

    data() {
      return {
        search: ''
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
