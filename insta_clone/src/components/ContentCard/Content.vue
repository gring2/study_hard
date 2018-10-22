<template>
    <div>
      <div style="height:100%">
        <div style="width: 100%; height:100%">
          <img :src="src"
          >
        
        </div>
      </div>
      
    </div>
</template>

<script>
export default {
  name: 'Content',
  props: ['src', 'id'],
  data () {
    return {
    }
  }
}
</script>
<style scoped>
  img{
    width:inherit; height: inherit
  }
</style>
<!-- Add "scoped" attribute to limit CSS to this component only -->
