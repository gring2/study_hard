package command;

/**
 * Created by jinwoopark on 2017. 8. 11..
 */
public class LampOffCommand implements Command{
    private Lamp thelamp;

    public LampOffCommand(Lamp thelamp){
        this.thelamp = thelamp;
    }
    @Override
    public void execute() {
        thelamp.turnOff();
    }
}
