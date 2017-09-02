package src.proxy

interface PersonBean {
    fun getName():String
    fun getGender():String
    fun getInterests():String
    fun getHotOrNotRating():Int

    fun setName(name:String)
    fun setGender(gender:String)
    fun setInterests(interests:String)
    fun setHotOrNotRating(rating:Int)
}