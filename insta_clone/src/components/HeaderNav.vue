/* eslint-disable */
<template>
  <Row style="height: 100%">
    <Col span=4 style="height: 100%"><img src="../assets/logo.png"></Col>
    <Col span=12>
       <Input v-model="keyword" placeholder="Enter keyword..."  clearable/>
    </Col>
    <Col span=2>
        <div>&nbsp;</div>
    </Col>
    <Col span=2>
      <Icon type="ios-compass-outline" size="40" color="#fff"/>
    </Col>
    <Col span=2>

      <Icon type="md-heart-outline" size="40" color="#fff"/>
    </Col>
    <Col span=2>

      <Icon type="ios-contact-outline" size="40" color="#fff"/>
    </Col>

  </Row>
</template>

<script>
export default {
  name: 'HeaderNav',
  data () {
    return {
      keyword: ''
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

img{
  height: 100%;
  width: 50%
}
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
