<template>
<nav class="navbar-principal py-3 pt-md-25 px-3 px-md-5 px-lg-7">
  <nuxt-link tag="span" to="/" class="logo-wrapper">Crescendo</nuxt-link>
  <button
    v-show="!isMedium"
    class="navbar-open-icon-wrapper"
    type="button"
  >
  </button>
</nav>
</template>

<script>
import { responsiveMixin } from '~/utils/responsive'
import toCapital from 'to-capital-case'

export default {
  name: 'the-navbar',
  filters: {
    formatCase (words, condition) {
      return condition ? toCapital(words) : words
    }
  },
  mixins: [responsiveMixin],
  data () {
    return {
      navbarExpanded: false
    }
  },
  methods: {
    toggleNavbar () {
      if (this.isMedium) return
      this.navbarExpanded = !this.navbarExpanded
      document.body.classList.toggle('no-scroll')
    }
  }
}
</script>

<style lang="scss" scoped>
@import "node_modules/bootstrap/scss/functions";
@import "node_modules/bootstrap/scss/variables";
@import "node_modules/bootstrap/scss/mixins/breakpoints";

$maximum-breakpoint-before-expand: sm;
$minimum-breakpoint-before-contract: md;

$open-navbar-size: 24px;
$close-navbar-size: 24px;

$black: rgba(0, 0, 0, .8);
$brown: #3c342f;
$white: rgb(255, 255, 255);
$white-demitransparent: rgba(255, 255, 255, .8);

.navbar-principal {
  display: flex;
  justify-content: space-between;
  align-items: center;
  flex-wrap: wrap;
  width: 100%;

  @include media-breakpoint-down($maximum-breakpoint-before-expand) {
    background-color: $white;
  }
  @include media-breakpoint-up($minimum-breakpoint-before-contract) {
    justify-content: flex-start;
    flex-wrap: nowrap;
  }
}

.navbar-open-icon {
  &-wrapper {
    border: 0;
    outline: 0;
    stroke: $black;
    color: $black;
    background-color: transparent;
    cursor: pointer;
  }

  display: block;
  width: $open-navbar-size;
  height: $open-navbar-size;
}

.navbar-close-icon {
  &-wrapper {
    position: absolute;
    top: 22px;
    right: 22px;
    border: 0;
    outline: 0;
    stroke: $white;
    background-color: transparent;
    cursor: pointer;
  }

  z-index: 20;
  display: block;
  width: $close-navbar-size;
  height: $close-navbar-size;
}

.logo-wrapper {
  margin-right: 1rem;
  color: $black;
  font-size: 22px;
  font-weight: 700;
  letter-spacing: 2.2px;
  cursor: pointer;

  @include media-breakpoint-up($minimum-breakpoint-before-contract) {
  color: $white;
  }
}

.menu-wrapper {
  position: fixed;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  z-index: 20;
  flex-grow: 1;
  flex-basis: 100%;
  background-color: $brown;

  @include media-breakpoint-up($minimum-breakpoint-before-contract) {
    position: relative;
    left: unset;
    right: unset;
    top: unset;
    bottom: unset;
    background-color: transparent;
    display: flex;
    transition: none;
  }

  .menu-nav {
    display: flex;
    flex-direction: column;
    padding: 36px;
    list-style: none;

    @include media-breakpoint-up($minimum-breakpoint-before-contract) {
      padding-right: 0;
      padding-left: 0;
      margin-bottom: 0;
      flex-direction: row;
    }
  }

  .menu-option {
    padding: .5rem 1rem;
    font-size: 24px;
    font-weight: 400;
    letter-spacing: 0.4px;
    color: $white-demitransparent;
    cursor: pointer;

    @include media-breakpoint-up($minimum-breakpoint-before-contract) {
      flex-direction: row;
      font-size: 14px;
      font-weight: bold;
      color: $white;
      letter-spacing: 1.6px;

      &:hover {
        color: $white-demitransparent;
      }
    }
  }
}

.move-menu-enter-active, .move-menu-leave-active {
  @include media-breakpoint-down($maximum-breakpoint-before-expand) {
    transition: all .3s ease;
  }
}
.move-menu-enter, .move-menu-leave-to {
  @include media-breakpoint-down($maximum-breakpoint-before-expand) {
    transform: translateX(-100vw);
  }
}
</style>
