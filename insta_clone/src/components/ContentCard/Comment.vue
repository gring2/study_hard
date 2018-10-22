<template>
    <div class="comment-area" style="">
        <div style="width:90%; padding-right:20px">
            <Input type="textarea"  placeholder="Enter text" 
                    wrap="soft"
                    :autosize="true"
                    class="commentBox"
            />
        </div>
        <div >
            <Icon type="ios-more" style="right: 16px; bottom: 16px; position:absolute" size="25"/>
        </div>    

    </div>
</template>

<script>
export default {
  name: 'Comment',
  data () {
    return {
    }
  }
}
</script>

<style scoped>
  .comment-area{
    display: flex;
    justify-content: space-between;
  }
</style>
<style>
  .commentBox > textarea{
    resize: none
  }
</style>