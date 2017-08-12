/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class Off implements State{

    private static Off off = new Off();
    private Off(){

    }

    public static Off getInstance(){
        return off;
    }
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On");
        light.setState(On.getInstance());
    }

    @Override
    public void off_button_pushed(Light light) {
           System.out.println("Nothing happened");
    }
}
