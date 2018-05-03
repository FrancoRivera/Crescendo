export const isExtraSmall = width => width < 576
export const isSmall = width => width >= 576
export const isMedium = width => width >= 768
export const isLarge = width => width >= 992
export const isExtraLarge = width => width >= 1200

export const getInnerWidth = _ => window.innerWidth

export const responsiveMixin = {
  data () {
    return {
      isExtraSmall: false,
      isSmall: true,
      isMedium: false,
      isLarge: false,
      isExtraLarge: false
    }
  },
  mounted () {
    this.$handleResize()
    window.addEventListener('resize', this.handleResize)
  },
  methods: {
    $handleResize () {
      const innerWidth = getInnerWidth()
      this.isExtraSmall = isExtraSmall(innerWidth)
      this.isSmall = isSmall(innerWidth)
      this.isMedium = isMedium(innerWidth)
      this.isLarge = isLarge(innerWidth)
      this.isExtraLarge = isExtraLarge(innerWidth)
    }
  },
  beforeDestroy () {
    window.removeEventListener('resize', this.handleResize)
  }
}
