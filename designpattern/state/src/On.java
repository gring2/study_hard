/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class On implements State{

    private static On on = new On();
    private On(){

    }

    public static On getInstance(){
        return on;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Sleep mode");
        light.setState(Sleep.getInstance());

    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off");
        light.setState(Off.getInstance());
    }
}
