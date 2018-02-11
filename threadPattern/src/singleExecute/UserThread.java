package singleExecute;

public class UserThread extends Thread {
    private final Gate gate;
    private final String name;
    private final String address;
    public UserThread(Gate gate, String myname, String myaddress){
        this.gate = gate;
        this.name = myname;
        this.address = myaddress;
    }
    @Override
    public void run() {
        System.out.println(this.name + " BEGIN");
        while(true){
            gate.pass(name,address);
        }
    }
}
