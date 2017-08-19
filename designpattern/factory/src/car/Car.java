package car;

public class Car {
    private int speed;
    private CarState normalState;
    private CarState limpState;
    private CarState curState;

    public Car(){
        normalState =  CarStateFactory.getState(CarStateID.NORMAL,this);
        limpState =  CarStateFactory.getState(CarStateID.LIMP_MODE,this);
        curState = normalState;
    }

    public CarState getLimpState(){
        return this.limpState;
    }

    public CarState getNormalState() {
        return normalState;
    }

    public void setState(CarState state){
        curState = state;
    }

    public void speedDown(int target){
        curState.speedDown(target);
    }

    public void engineFailedDetected(){
        curState.engineFailedDetected();
    }

    public void speedUp(int target){
        curState.speedUp(target);
    }

    public void engineRepaired(){
        curState.engineRepaired();
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

}
