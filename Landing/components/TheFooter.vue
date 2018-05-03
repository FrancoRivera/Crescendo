<template>
  <div class="footer-wrapper">
    <b-container fluid class="footer-content">
      <social-nav class="mb-4" />
      <b-row>
        <b-col cols="12" sm="8" >
          <h3 class="mb-3">Ubicaciones</h3>
          <b-row>
            <b-col cols="12" sm="4">
              <p>
                <em>Brooklyn</em>
                <br>
                <small>
                  376 Calle Sin Nombre
                  <br>
                  <em>Brooklyn, NY — 11231</em>
                  <br>
                  (718) 555-1234
                </small>
              </p>
            </b-col>
            <b-col cols="12" sm="4">
              <p>
                <em>Queens</em>
                <br>
                <small>
                  47-33 Calle Sin Nombre
                  <br>
                  <em>Long Island City, NY — 11101</em>
                  <br>
                  (347) 555-1234
                </small>
              </p>
            </b-col>
            <b-col cols="12" sm="4">
              <p>
                <em>Food Truck</em>
                <br>
                <small>
                  25 Calle Sin Nombre
                  <br>
                  <em>Nueva York, NY — 10003</em>
                  <br>
                  (917) 555-1234
                </small>
              </p>
            </b-col>
          </b-row>
        </b-col>
      </b-row>
      <b-row class="mt-3">
        <b-col cols="12">
          <p>Crescendo</p>
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import SocialNav from '~/components/SocialNav'
export default {
  name: 'the-footer',
  components: {
    SocialNav
  }
}
</script>

<style lang="scss" scoped>
@import "assets/scss/main";
$section-padding: 60px;

.footer-wrapper {
  padding: {
    bottom: $section-padding;
    top: $section-padding;
  }
  background-color: #3c342f;
  color: white;

  @include media-breakpoint-up(md) {
    padding: {
      left: 1.8rem;
      right: 1.8rem;
    }
  }
  @include media-breakpoint-up(lg) {
    padding: {
      left: 3rem;
      right: 3rem;
    }
  }
  @include media-breakpoint-up(xl) {
    padding: {
      left: 6rem;
      right: 6rem;
    }
  }
}

.footer-content {
  max-width: 1440px;
}
</style>
