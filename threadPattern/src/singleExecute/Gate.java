package singleExecute;

public class Gate {
    private int counter = 0 ;
    private String name = " nobody";
    private String address = "Nowhere";

    public synchronized void pass(String name, String address){
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    public void check(){
        if(name.charAt(0) != address.charAt(0)){
            System.out.println("Broken" + toString());
        }
    }

    @Override
    public synchronized String toString() {
        return "No." +
                "counter=" + counter +
                ", name='" + name + '\'' +
                ", address='" + address + '\'';
    }
}
