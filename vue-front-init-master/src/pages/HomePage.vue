<template>
  <div id="homePage">
    <h1>{{ msg }}</h1>
  </div>
</template>
<script setup lang="ts">
import { ref } from 'vue'

const msg = ref('欢迎前端万用模板项目')
</script>
