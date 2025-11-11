<template>
  <main style="padding:24px">
    <h1>ユーザー一覧</h1>

    <p v-if="pending">Loading...</p>
    <ul v-else>
      <li v-for="u in data" :key="u.id">
        {{ u.name }}（{{ u.city }}）
      </li>
    </ul>
  </main>
</template>

<script setup lang="ts">
const { data, pending, error } = await useFetch('/api/users')
</script>
