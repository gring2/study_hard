<template>
        <Card :bordered="false" style="min-height:600px; margin-bottom:50px">
            <p slot="title">No border title</p>
              <Content style="height: 80%"/>
            <Footer style=""/>
            <Comment style="min-height: 30px"/>
        </Card>
</template>

<script>
import Footer from '@/components/ContentCard/Footer'
import Content from '@/components/ContentCard/Content'
import Comment from '@/components/ContentCard/Comment'

export default {
  name: 'ContentCard',
  data () {
    return {
    }
  },
  components: {
    Footer,
    Content,
    Comment
  }
}
</script>

<style>
.ivu-card-body{
  min-height: 550px
}
.ivu-card-head{
  height: 50px
}

</style>
<!-- Add "scoped" attribute to limit CSS to this component only -->
