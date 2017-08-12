package elevator;

/**
 * Created by jinwoopark on 2017. 8. 11..
 */
public class ElevatorButton {
    private Command command;
    public ElevatorButton(Command command){
        this.command = command;
    }

    public void pressed(){
        command.execute();
    }
}
