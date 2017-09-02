package src.proxy

class PersonBeanImpl:PersonBean {
    private var name:String = ""
    private var gender:String = ""
    private var interests:String = ""
    private var rating:Int = 0
    var ratingCount:Int = 0

    override fun getName(): String {
        return this.name
    }

    override fun getGender(): String {
        return this.gender
    }

    override fun getInterests(): String {
        return this.interests
    }

    override fun getHotOrNotRating(): Int {
       return if (ratingCount == 0) 0 else (this.rating/this.ratingCount)
    }

    override fun setName(name: String) {
        this.name = name
    }

    override fun setGender(gender: String) {
        this.gender = gender
    }

    override fun setInterests(interests: String) {
        this.interests = interests
    }

    override fun setHotOrNotRating(rating:Int) {
        this.rating += rating
        this.ratingCount++
    }
}