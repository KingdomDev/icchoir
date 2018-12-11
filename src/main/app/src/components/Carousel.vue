<template>
  <div>
    <b-carousel id="carousel1"
                style="text-shadow: 1px 1px 2px #333;"
                controls
                indicators
                background="#ababab"
                :interval="5000"
                v-model="slide"
                @sliding-start="onSlideStart"
                @sliding-end="onSlideEnd"
    >

      <!-- Text slides with image -->
      <b-carousel-slide caption="First slide">
        <img slot="img" class="d-block img-fluid w-100"
             src="../assets/images/caroussel1.jpg" alt="image slot">
      </b-carousel-slide>

      <!-- Slides with custom text -->
      <b-carousel-slide>
        <img slot="img" class="d-block img-fluid w-100"
             src="../assets/images/caroussel2.jpg" alt="image slot">
      </b-carousel-slide>

      <!-- Slides with image only -->
      <b-carousel-slide>
        <img slot="img" class="d-block img-fluid w-100"
             src="../assets/images/caroussel3.jpg" alt="image slot">
      </b-carousel-slide>

      <!-- Slides with img slot -->
      <!-- Note the classes .d-block and .img-fluid to prevent browser default image alignment -->
      <b-carousel-slide>
        <img slot="img" class="d-block img-fluid w-100"
             src="../assets/images/caroussel4.jpg" alt="image slot">
      </b-carousel-slide>

      <b-carousel-slide>
        <img slot="img" class="d-block img-fluid w-100"
             src="../assets/images/caroussel5.jpg" alt="image slot">
      </b-carousel-slide>

      <!-- Slides with image only -->
      <b-carousel-slide>
        <img slot="img" class="d-block img-fluid w-100"
             src="../assets/images/caroussel6.jpg" alt="image slot">
      </b-carousel-slide>

      <!-- Slides with img slot -->
      <!-- Note the classes .d-block and .img-fluid to prevent browser default image alignment -->
      <b-carousel-slide>
        <img slot="img" class="d-block img-fluid w-100"
             src="../assets/images/caroussel7.jpg" alt="image slot">
      </b-carousel-slide>

    </b-carousel>

    <p class="mt-4">
      Slide #: {{ slide }}<br>
      Sliding: {{ sliding }}
    </p>

  </div>
</template>

<script>
  export default {
    name: 'icchoir-carousel',
    data () {
      return {
        slide: 0,
        sliding: null
      }
    },
    methods: {
      onSlideStart (slide) {
        this.sliding = true
      },
      onSlideEnd (slide) {
        //this.sliding = false
      }
    }
  }
</script>
