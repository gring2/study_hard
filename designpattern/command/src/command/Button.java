package command;

/**
 * Created by jinwoopark on 2017. 8. 11..
 */
public class Button {
    private Command command;

    public Button(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressed(){
        command.execute();
    }
}
