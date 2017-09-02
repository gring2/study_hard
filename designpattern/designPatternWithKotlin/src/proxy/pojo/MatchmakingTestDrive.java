package src.proxy.pojo;

import java.lang.reflect.Proxy;

public class MatchmakingTestDrive {

    public static void main(String[] args){
        MatchmakingTestDrive test = new MatchmakingTestDrive();
        test.drive();
    }

    public MatchmakingTestDrive(){

    }

    public PersonBean getPersonFromDatabase(String name){
                PersonBean person = new PersonBeanImpl();
                person.setName(name);
                person.setGender("male");
                person.setInterests("driving");
                person.setHotOrNotRating(10);
                return person;

    }

    public void drive(){
        PersonBean joe = getPersonFromDatabase("Joe");
        PersonBean ownerProxy = getOwnerProxy(joe);


    System.out.println("Name is ${ownerProxy?.getName()}");
    ownerProxy.setInterests("bowling, Go");
    System.out.println("Interest is setted ${ownerProxy.getInterests()}");
    try{
        ownerProxy.setHotOrNotRating(100);
    }catch (Exception e){
            System.out.println("Can not set rating from owner proxy");
    }
    System.out.println("Rating is ${ownerProxy.getHotOrNotRating()}");

    PersonBean noOwner = getNoOwnerProxy(joe);
    System.out.println("Name is ${noOwner?.getName()}");
    try{
        noOwner.setInterests("SEX");
    }catch (Exception e){
            System.out.println("Can not set interest from non owner");
    }

    noOwner.setHotOrNotRating(3);
    System.out.println("Rating set from non owner proxy");
    System.out.println("Rating is ${noOwner.getHotOrNotRating()}");
    }

    public PersonBean getOwnerProxy(PersonBean personBean){

        PersonBean personProxy = (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));

        return personProxy;
    }

    public PersonBean getNoOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
               new NonOwnerInvocationHandler(personBean));
    }
}
