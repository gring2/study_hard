<template>
    <div>
        <ContentCard/>
        <ContentCard/>
        <ContentCard/>

    </div>
</template>

<script>
import ContentCard from '@/components/ContentCard/ContentCard'
export default {
  name: 'ContentList',
  components: {
    ContentCard
  },
  data () {
    return {
    }
  }
}
</script>
