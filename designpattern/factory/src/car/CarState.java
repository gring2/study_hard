package car;

public abstract class CarState {
    protected Car car;

    protected CarState(Car car){
        this.car = car;
    }
    public void speedDown(int target) {
        System.out.println("Speed: " + car.getSpeed());
        if(target < car.getSpeed()){
            car.setSpeed(target);
        }
        System.out.println(" ===> " + car.getSpeed());
    }

    public abstract void engineFailedDetected();

    public abstract void speedUp(int target);

    public abstract void engineRepaired();
}
