<template>
    <div>
      <div class="content-bar">
        <div>
              <Icon type="ios-heart-outline" size="25" style=""/>
              <Icon type="ios-text-outline" size="25"/>

              <Icon type="ios-share-outline" size="25"/>

        </div>
        <div>
              <Icon type="ios-bookmark-outline" size="25"/>

        </div>

      </div>
      <div>Here is for cotents...</div>

    </div>
</template>

<script>
export default {
  name: 'ContentCardFooter',
  data () {
    return {
    }
  }
}
</script>
<style scoped>
  .content-bar{
    display: flex;
    justify-content: space-between
  }
</style>
<!-- Add "scoped" attribute to limit CSS to this component only -->
