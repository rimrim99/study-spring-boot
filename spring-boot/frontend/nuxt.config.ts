// nuxt.config.ts
export default defineNuxtConfig({
  devtools: { enabled: false },
  pages: true,

  // ✅ ここに追記（Spring Boot側へAPIプロキシ）
  routeRules: {
    '/api/**': { proxy: 'http://localhost:8081/**' }
  }
})
