<template>
  <div id="app">
       <Layout>
        <Header style="padding: 0"><HeaderNav/></Header>
        <Content>
    <div>
      <p>
        If iView is successfully added to this project, you'll see an
        <code v-text="'<Button>'"></code>
        below
      </p>
      <Button type="primary">Button</Button>
    </div>
    <HelloWorld msg="Welcome to Your Vue.js App"/>
        </Content>
        <Footer>Footer</Footer>
    </Layout>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import HeaderNav from '@/components/HeaderNav'

export default {
  name: 'app',
  components: {
    HelloWorld,
    HeaderNav
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
