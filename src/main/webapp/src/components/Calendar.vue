<template>
  <div>
    <custom-menu></custom-menu>
    <div class="container" id="calendar">
      <h2>Calendrier</h2>
      <vue-event-calendar
        :events="choirEvents"
      ></vue-event-calendar><br>
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

    data () {
      return {
        choirEvents: []
      }
    },

    components: {
      CustomMenu,
      CustomFooter
    },

    created() {
      axios.get(`http://localhost:8080/events`).
      then(response => {
        this.choirEvents = response.data;
        console.log(this.choirEvents);
      }).catch (e => {
        this.errors.push(e);
      });
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  #calendar {
    'height': 100vh
  }
</style>
