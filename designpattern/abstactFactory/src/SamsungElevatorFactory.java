

public class SamsungElevatorFactory  implements ElevatorFactory{
    private static SamsungElevatorFactory samsungFactory = null;
    private SamsungElevatorFactory(){}
    @Override
    public Motor createMotor() {
        return new SamsungMotor();
    }

    @Override
    public Door createDoor() {
        return new SamsungDoor();
    }

    public static ElevatorFactory getInstance(){
        if(samsungFactory == null) samsungFactory = new SamsungElevatorFactory();
        return samsungFactory;
    }

}
