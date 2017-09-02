package src.proxy

import java.lang.reflect.Proxy

fun main(args: Array<String>) {
    drive()
}
fun getPersonFromDatabase(name:String):PersonBean{
    when(name){
        "Joe" ->{
           val person = PersonBeanImpl()
            person.setName(name)
            person.setGender("male")
            person.setInterests("driving")
            person.setHotOrNotRating(10)
            return person
        }

    }
    return PersonBeanImpl()

}
fun drive(){
    val joe = getPersonFromDatabase("Joe")
    val ownerProxy = getOwnerProxy(joe)


    println("Name is ${ownerProxy?.getName()}")
    ownerProxy!!.setInterests("bowling, Go")
    println("Interest is setted ${ownerProxy.getInterests()}")
    try{
        ownerProxy.setHotOrNotRating(100)
    }catch (e:Exception){
        println("Can not set rating from owner proxy")
    }
    println("Rating is ${ownerProxy.getHotOrNotRating()}")

    val noOwner = getNoOwnerProxy(joe)
    println("Name is ${noOwner?.getName()}")
    try{
        noOwner!!.setInterests("SEX")
    }catch (e:Exception){
        println("Can not set interest from non owner")
    }

    noOwner!!.setHotOrNotRating(3)
    println("Rating set from non owner proxy")
    println("Rating is ${noOwner.getHotOrNotRating()}")
}

fun getOwnerProxy(personBean: PersonBean):PersonBean{
    val invoker = OwnerInvocationHandler(personBean)
    val personProxy = Proxy.newProxyInstance(
            personBean.javaClass.classLoader,
            personBean.javaClass.interfaces,
            invoker) as PersonBean
    println(personProxy)
    return personProxy
}

fun getNoOwnerProxy(personBean: PersonBean):PersonBean?{
    return Proxy.newProxyInstance(
            personBean.javaClass.classLoader,
            personBean.javaClass.interfaces,
            NoOwnerInvocationHandler(personBean)) as PersonBean?
}