package car;

public class NormalState extends CarState {
    private static CarState normalState = null;

    private NormalState(Car car) {
        super(car);
    }
    public static CarState getInstance(Car car){
        if(normalState == null) normalState = new NormalState(car);
        return normalState;
    }
    @Override
    public void engineFailedDetected() {
        System.out.println("Speed: "+ car.getSpeed());
        car.setSpeed(LimpState.LIMP_MODE_MAX_SPEED);
        System.out.println(" ==> " + car.getSpeed());
        car.setState(car.getLimpState());
    }

    @Override
    public void speedUp(int target) {
        System.out.println("Speed: " + car.getSpeed());
        if(target > car.getSpeed()){
            car.setSpeed(target);
        }
        System.out.println(" ==> " + car.getSpeed());

    }

    @Override
    public void engineRepaired() {
        System.out.println("Unexpected Event");
    }
}
