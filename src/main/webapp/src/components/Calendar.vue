<template>
  <div>
    <custom-menu></custom-menu>
    <div class="container" id="calendar">
      <vue-event-calendar
        :events="demoEvents"
      ></vue-event-calendar><br>
    </div>
    <custom-footer></custom-footer>
  </div>
</template>

<script>
  import CustomMenu from './Menu.vue'
  import CustomFooter from './Footer.vue'

  export default {
    name: 'Members',

    data () {
      return {
        demoEvents: [{
          date: '2016/11/12', // Required
          title: 'Foo' // Required
        }, {
          date: '2016/12/15',
          title: 'Bar',
          desc: 'description',
          customClass: 'disabled highlight' // Custom classes to an calendar cell
        }]
      }
    },

    components: {
      CustomMenu,
      CustomFooter
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  #calendar {
    'height': 100vh
  }
</style>
