<template>
  <div class="hello" id="home">
    <custom-menu></custom-menu>

    <div class="container col-lg-8">

      <div class="row" style="height: 100vh">
        <div class="col-md-8">
          <icchoir-carousel></icchoir-carousel>
        </div>

        <div class="col-md-4">
          <h1>Expression Impact</h1>
          <p>This is a template that is great for small businesses.
            It doesn't have too much fancy flare to it,
            but it makes a great use of the standard Bootstrap core components.
            Feel free to use this template for any project you want!</p>
          <a class="btn btn-primary btn-lg" href="#">Call to Action!</a>
        </div>
      </div>
    </div>

    <custom-footer></custom-footer>
  </div>
</template>

<script>
import CustomFooter from "./Footer.vue"
import IcchoirCarousel from './Carousel.vue'
import CustomMenu from './Menu.vue'
import TopHead from "./TopHead.vue"

export default {
  components: {
    CustomFooter,
    CustomMenu,
    IcchoirCarousel,
    TopHead
  },

  name: 'Home',
  data () {
    return {
      msg: 'Expression Impact Lyon'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  #home {
    height: 100vh;
  }
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
