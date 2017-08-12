package command;

/**
 * Created by jinwoopark on 2017. 8. 11..
 */
public class LampOnCommand implements Command{
    private Lamp lamp;

    public LampOnCommand(Lamp thelamp){
        this.lamp = thelamp;
    }
    @Override
    public void execute() {
        lamp.turnOn();
    }
}
