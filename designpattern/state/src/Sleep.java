/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class Sleep implements State{
    private static Sleep sleep = new Sleep();

    private Sleep(){

    }

    public static Sleep getInstance(){
        return sleep;
    }
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On");
        light.setState(On.getInstance());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off");
        light.setState(Off.getInstance());

    }
}
