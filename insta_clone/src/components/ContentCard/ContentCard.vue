<template>
        <Card :bordered="false" style="min-height:600px; margin-bottom:50px">
            <p slot="title">No border title</p>
              <div style="position: relative; height: 480px">
                  <Content v-for="content in contents"
                  :key="content.key"
                  style="height: 90%; width:100%; position: absolute;"
                  :id="content.key"
                  :class="content.class"

                  :src="content.src"/>
                  <div style="bottom: 10px; position: absolute; display: flex;  justify-content: center; width: 100%">
                    <div  v-for="content in contents"
                      :key="content.key"
                       v-bind:class="[{ active: content.class == 'display' }, 'page']"
                      style="width:10px; height:10px;  border-radius: 50px 50px; bottom:5">
                    </div>
                  </div>

              </div>

              <div class="arrow-box">
                  <Icon type="ios-arrow-dropleft" size="40" @click="contentBackward()"/>
                  <Icon type="ios-arrow-dropright" size="40" @click="contentForward()"/>

              </div>

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
      'current': 0,
      'contents': [
        {'key': 1,
          'src': 'https://scontent-nrt1-1.cdninstagram.com/vp/da43cf601874db387524e1c2aa0d90a7/5C5E1F67/t51.2885-15/e35/42773122_287525568532436_5230539931501279540_n.jpg',
          'class': 'display'
        },
        {'key': 2,
          'src': 'http://cdn.namuwikiusercontent.com/s/8e30ce0b740dcdab7930aa8f746b0153eae7b46b4afae43697796ad29b5511c0bbada9719b41a3f5c270316898962c71a5e561020478aeb260415941dc8fe6afda1f8ee8f9b054f2b1a88c6702d8d2d1?e=1541297556&k=vCpJMH_fsuozr1_NPYqu_g',
          'class': 'none'
        }

      ]
    }
  },
  methods: {
    contentForward () {
      let next = idxGetter.getNext(this.current)
      if (next !== null) {
        this.contents[this.current].class = 'none'
        this.contents[next].class = 'display'
        this.current = next
      }
    },
    contentBackward () {
      let before = idxGetter.getBefore(this.current)
      if (before !== null) {
        this.contents[this.current].class = 'none'
        this.contents[before].class = 'display'
        this.current = before
      }
    }
  },
  mounted () {
    idxGetter = new KeyGetter(this.contents)
  },
  components: {
    Footer,
    Content,
    Comment
  }
}
let idxGetter

class KeyGetter {
  constructor (lists) {
    this.lists = lists
  }
  getNext (idx) {
    if (this.lists[idx + 1] !== undefined) {
      return ++idx
    }
    return null
  }
  getBefore (idx) {
    if (this.lists[idx - 1] !== undefined) {
      return --idx
    }
    return null
  }
}
</script>

<style scoped>
.arrow-box{
  background: 0 0;
  border: 0;
  justify-self: center;
  outline: 0;
  position: absolute;
  top: 45%;
  cursor: pointer;
  display: flex;
  justify-content: space-between;
  width: 100%;
  right: 1px
}
.display{
  display:block
}
.none{
  display: none
}
.page.active{
  background-color: red
}
.page{
  background-color: gray
}
</style>
<style>
.ivu-card-body{
  min-height: 550px
}
.ivu-card-head{
  height: 50px;
}

</style>
<!-- Add "scoped" attribute to limit CSS to this component only -->
