/**
 * Created by jinwoopark on 2017. 8. 4..
 */
public class A1 {

    public static void doIt(){
        System.out.println("doIt: A1 class method");
    }

    public void doThat(){
        System.out.println("doThat: A1 class method");
    }

}

class child extends A1 {
    public static void doIt(){
        System.out.println("DoIT child class method");
    }

    public void doThat(){
        System.out.println("doThat child class method");
    }

}

class Main {
    public static void main(String[] args){
        A1 a = new child();
        child a2 = new child();

        a.doIt();
        a.doThat();
        a2.doIt();
    }
}

