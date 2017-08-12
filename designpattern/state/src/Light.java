/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public class Light {
    private State  state;

    public Light(){
        state = Off.getInstance();
    }

    public void setState(State state){
        this.state = state;
    }

    public void on_button_pushed(){
        state.on_button_pushed(this);
    }

    public void off_button_pusehd(){
        state.off_button_pushed(this);

    }
}
