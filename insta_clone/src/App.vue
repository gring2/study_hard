<template>
  <div id="app">
       <Layout>
          <Header style="padding: 0"><HeaderNav/></Header>
            <Layout >
                <Content style="padding: 0px 20px 0px 20px">
                  <ContentList/>
                </Content>

                <Sider style="background: inherit;">Sider</Sider>
            </Layout>
      </Layout>
  </div>
</template>

<script>
import ContentList from '@/components/ContentList'
import HeaderNav from '@/components/HeaderNav'

export default {
  name: 'app',
  components: {
    ContentList,
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
.ivu-layout.ivu-layout-has-sider {
  padding-top: 50px;
}

</style>
