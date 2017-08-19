package car;

public class CarStateFactory {
    public static CarState getState (CarStateID id, Car car){
        CarState state = null;
        if(id == CarStateID.NORMAL){
            state = NormalState.getInstance(car);
        }else{
            state = LimpState.getInstance(car);
        }
        return state;
    }
}
