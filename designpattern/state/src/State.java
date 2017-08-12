/**
 * Created by jinwoopark on 2017. 8. 8..
 */
public interface State {
    void on_button_pushed(Light light);
    void off_button_pushed(Light light);

}
