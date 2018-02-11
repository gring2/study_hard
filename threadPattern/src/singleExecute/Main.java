package singleExecute;

public class Main {

    public static void main(String[] args){
        System.out.println("Testing Gate, hit CTRL+C to exit");
        Gate gate = new Gate();
        new UserThread(gate,"Alice", "Albania").start();
        new UserThread(gate,"Bobby", "Brazil").start();
        new UserThread(gate,"Chris", "China").start();

    }
}
