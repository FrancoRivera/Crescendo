<template>
<div>
  <full-image-section :image="require('~/assets/hero.jpg')">
    <the-navbar />
    <b-container class="hero-container text-center">
      <div>
        <h1 class="title-bolder section-title">¿Buscando Músicos?</h1>
        <h3 class="font-weight-normal">
          Unete a una banda, busca audiciones, músicos calificados!
        </h3>
      </div>
    </b-container>
  </full-image-section>

  <b-container class="section-2-container text-center">
    <h2 class="mb-3"><strong>NUESTRA COMUNIDAD</strong></h2>
    <h3>
      ¡Se parte de esta comunidad, CONÉCTATE con músicos, encuentra nuevas OPORTUNIDADES como artista, crea el perfil de tu banda y mucho más en un solo lugar!
    </h3>
  </b-container>

  <full-image-section :image="require('~/assets/image-1.jpg')">
    <b-container class="section-3-container text-center">
      <div class="content-container">
        <div class="content-wrapper">
          <h1 class="title-bolder section-title">ESTILO DE VIDA</h1>
          <h3 class="pb-2">
            En Crescendo te podrás identificar como artista, compartimos lo que nos apasiana: La música!
          </h3>
          <b-button href="#" class="btn-lg btn-outline-light btn-rounded px-5 mt-3">
            Unirse
          </b-button>
        </div>
      </div>
    </b-container>
  </full-image-section>

  <b-container class="section-4-container">
    <b-row>
      <b-col cols="6" sm="4">
        <div class="image-wrapper">
          <b-img class="image-fullwidth" :src="require('~/assets/artist-1.jpg')"></b-img>
        </div>
      </b-col>
      <b-col cols="6" sm="4">
        <div class="image-wrapper">
          <b-img class="image-fullwidth" :src="require('~/assets/artist-2.jpg')"></b-img>
        </div>
      </b-col>
      <b-col cols="6" sm="4" class="my-4 my-sm-0">
        <div class="image-wrapper">
          <b-img class="image-fullwidth" :src="require('~/assets/artist-3.jpg')"></b-img>
        </div>
      </b-col>
    </b-row>
    <b-row class="mt-5">
      <b-col cols="12" sm="6">
        <p class="text-muted">
          Cras mattis consectetur purus sit amet fermentum. Sed posuere consectetur est at lobortis. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Sed posuere consectetur est at lobortis. Maecenas faucibus mollis interdum. Nulla vitae elit libero, a pharetra augue. Cras justo odio, dapibus ac facilisis.
        </p>
        <p class="text-muted">
          Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Aenean lacinia bibendum nulla sed consectetur.
        </p>
      </b-col>
      <b-col cols="12" sm="6">
        <p class="text-muted">
          Aenean lacinia bibendum nulla sed consectetur. Etiam porta sem malesuada magna mollis euismod. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Cras mattis consectetur purus sit amet fermentum.
        </p>
        <p class="text-muted">
          Nulla vitae elit libero, a pharetra augue. Maecenas sed diam eget risus varius blandit sit amet non magna. Cras mattis consectetur purus sit amet fermentum. Integer posuere erat a ante venenatis dapibus posuere velit luctus sem adipiscing elit.
        </p>
      </b-col>
    </b-row>
    <div class="text-center" >
      <b-button href="#" class="btn-md btn-outline-secondary btn-rounded px-4 py-3 mt-5">Unirse</b-button>
    </div>
  </b-container>

  <full-image-section :image="require('~/assets/image-2.jpg')">
    <b-container class="section-5-container text-center">
      <div class="content-container">
        <div class="content-wrapper">
          <h1 class="title-bolder section-title">NUESTRA COMUNIDAD</h1>
        </div>
      </div>
    </b-container>
  </full-image-section>

  <!-- NUESTROS CHEFS -->
  <b-container class="section-6-container">
    <b-row>
      <b-col cols="12" sm="4">
        <h3 class="title-bold">Musicos</h3>
        <p class="mt-3">Profesionales</p>
        <p>
          Nullam quis risus eget urna mollis ornare vel eu leo. Curabitur blandit tempus porttitor. Curabitur blandit tempus porttitor. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
        </p>
      </b-col>
      <b-col cols="12" sm="4">
        <h3 class="title-bold">MANAGERS</h3>
        <p class="mt-3">De eventos</p>
        <p>
          Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Sed posuere consectetur est at lobortis. Maecenas sed diam eget risus varius blandit sit amet non magna. Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque.
        </p>
      </b-col>
      <b-col cols="12" sm="4">
        <h3 class="title-bold">Aficionados</h3>
        <p class="mt-3">De la música</p>
        <p>
          Cras justo odio, dapibus ac facilisis in, egestas eget quam. Maecenas faucibus mollis interdum. Donec ullamcorper nulla non metus auctor fringilla. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Cum sociis natoque penatibus et magnis.
        </p>
      </b-col>
    </b-row>
  </b-container>
</div>
</template>

<script>
import TheNavbar from '~/components/TheNavbar'
import FullImageSection from '~/components/FullImageSection'

export default {
  name: 'index-page',
  components: {
    TheNavbar,
    FullImageSection
  }
}
</script>

<style lang="scss" scoped>
@import "assets/scss/main";

$hero-padding: 180px;
$section-2-padding: 160px;
$section-3-padding: 180px;
$section-4-padding: 120px;
$section-5-padding: 320px;
$section-6-padding: 120px;

.hero-container{
  padding: {
    top: $hero-padding * 0.5;
    bottom: $hero-padding * 0.5;
  }
  @include media-breakpoint-up(md) {
    padding: {
      top: $hero-padding * 0.6;
      bottom: $hero-padding * 0.6;
    }
  }
  @include media-breakpoint-up(lg) {
    padding: {
      top: $hero-padding * 0.8;
      bottom: $hero-padding * 0.8;
    }
  }
  @include media-breakpoint-up(xl) {
    padding: {
      top: $hero-padding;
      bottom: $hero-padding;
    }
  }
}

.section-title {
  font-size: $h1-font-size * 0.5;
  @include media-breakpoint-up(sm) {
    font-size: $h1-font-size * 0.8;
  }
  @include media-breakpoint-up(md) {
    font-size: $h1-font-size * 0.9;
  }
  @include media-breakpoint-up(lg) {
    font-size: $h1-font-size;
  }
  @include media-breakpoint-up(xl) {
    font-size: $h1-font-size * 1.1;
  }
}

.section-2-container {
  padding: {
    top: $section-2-padding;
    bottom: $section-2-padding;
  }
}

.section-3-container{
  padding: {
    top: $section-3-padding * 0.7;
    bottom: $section-3-padding * 0.7;
  }
  @include media-breakpoint-up(lg) {
    padding: {
      top: $section-3-padding * 0.8;
      bottom: $section-3-padding * 0.8;
    }
  }
  @include media-breakpoint-up(xl) {
    padding: {
      top: $section-3-padding;
      bottom: $section-3-padding;
    }
  }
}

.section-4-container {
  padding: {
    top: $section-4-padding;
    bottom: $section-4-padding;
  }
  .image-wrapper {
    position: relative;
    overflow: hidden;
    padding-bottom: 100%;

    .image-fullwidth {
      position: absolute;
      height: 100%;
    }
  }
}
.section-5-container {
  padding: {
    top: $section-5-padding * 0.8;
    bottom: $section-5-padding * 0.8;
  }

  @include media-breakpoint-up(lg) {
    padding: {
      top: $section-5-padding * 0.8;
      bottom: $section-5-padding * 0.8;
    }
  }
  @include media-breakpoint-up(xl) {
    padding: {
      top: $section-5-padding;
      bottom: $section-5-padding;
    }
  }
}

.section-6-container {
  padding: {
    top: $section-6-padding;
    bottom: $section-6-padding;
  }
}

.content-container {
  display: flex;
  justify-content: center;
}
.content-wrapper {
  width: 600px;
}
</style>
