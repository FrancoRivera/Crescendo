<template>
  <div>
    <nuxt />
    <the-footer />
  </div>
</template>

<script>
import TheFooter from '~/components/TheFooter'

export default {
  name: 'default-layout',
  components: {
    TheFooter
  }
}
</script>
