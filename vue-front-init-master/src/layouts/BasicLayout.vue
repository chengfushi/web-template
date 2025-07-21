<template>
  <div id="basicLayout">
    <a-layout style="min-height: 100vh">
      <a-layout-header class="header"><GlobalHeader /></a-layout-header>
      <a-layout-content>
        <router-view class="content" />
      </a-layout-content>
      <a-layout-footer class="footer">
        <a href="https://github.com/chengfushi" target="_blank"> Github By ChengFu </a>
      </a-layout-footer>
    </a-layout>
  </div>
</template>

<script setup lang="ts">
import GlobalHeader from '@/components/GlobalHeader.vue'
</script>
<style>
#basicLayout .footer {
  padding: 16px;
  position: fixed;
  bottom: 0;
  left: 0;
  right: 0;
  text-align: center;
}
#basicLayout .content {
  margin-bottom: 28px;
  padding: 20px;
}
#basicLayout .header {
  padding-inline: 20px;
  margin-bottom: 16px;
  color: unset;
  background: white;
}
</style>
