package car;

public class LimpState extends CarState {
    public static int LIMP_MODE_MAX_SPEED = 60;
    private static CarState limpState = null;
    private LimpState(Car car) {
        super(car);
    }
    public static CarState getInstance(Car car){
        if(limpState == null) limpState = new LimpState(car);
        return limpState;
    }
    @Override
    public void engineFailedDetected() {

    }

    @Override
    public void speedUp(int target) {
        System.out.println("Speed: " + car.getSpeed());
        if(target > car.getSpeed() && target < LIMP_MODE_MAX_SPEED){
            car.setSpeed(target);
        }
        System.out.println(" ==> " + car.getSpeed());

    }

    @Override
    public void engineRepaired() {
        car.setState(car.getNormalState());
    }
}
