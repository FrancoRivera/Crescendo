const nodeExternals = require('webpack-node-externals');

module.exports = {
  head: {
    title: 'crescendo-app',
    meta: [
      { charset: 'utf-8' },
      { name: 'viewport', content: 'width=device-width, initial-scale=1' },
      { hid: 'description', name: 'description', content: 'Encuentra tu sonido!' }
    ],
    link: [
      { rel: 'icon', type: 'image/x-icon', href: '/favicon.ico' },
      { rel: 'stylesheet', href: 'https://fonts.googleapis.com/css?family=Raleway:400,700,900' }
    ]
  },
  css: [
    '@/assets/scss/main.scss'
  ],
  plugins: [
    '~/plugins/bootstrap-vue',
  ],
  loading: { color: '#3B8070' },
  router: {
    base: process.env.ROUTER_BASE || '/'
  },
  build: {
    extend (config, { isDev, isClient, isServer }) {
      if (isDev && isClient) {
        config.module.rules.push({
          enforce: 'pre',
          test: /\.(js|vue)$/,
          loader: 'eslint-loader',
          exclude: /(node_modules)/
        })
      }
      if (isServer) {
        config.externals = [
          nodeExternals({
            whitelist: [/es6-promise|\.(?!(?:js|json)$).{1,5}$/i, /^bootstrap-vue/]
          })
        ]
      }
    }
  }
}
