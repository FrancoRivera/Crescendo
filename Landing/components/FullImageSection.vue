<template>
  <div class="full-background-wrapper">
    <div class="full-background-image jarallax" :style="`background-image: url('${image}');`"></div>
    <div class="full-background-overlay" :style="`background-color: rgba(0, 0, 0, ${opacity});`"></div>
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: 'full-image-section',
  props: {
    image: {
      type: String,
      required: true
    },
    opacity: {
      type: Number,
      default: 0.455
    }
  },
  mounted () {
    if (!window.jarallax) {
      require('jarallax/dist/jarallax.min');
    }
    window.jarallax(document.querySelectorAll('.jarallax'), {
        speed: 0.2
    });
  }
}
</script>

<style lang="scss" scoped>
@import "node_modules/bootstrap/scss/functions";
@import "node_modules/bootstrap/scss/variables";
@import "node_modules/bootstrap/scss/mixins/breakpoints";

.full-background-wrapper {
  color: #f5f5f5;
  position: relative;
}
.full-background-image {
  position: absolute;
  width: 100%;
  height: 100%;
  background-size: 120%;
  z-index: -2;
}
.full-background-overlay {
  position: absolute;
  width: 100%;
  height: 100%;
  z-index: -1;
}
</style>
