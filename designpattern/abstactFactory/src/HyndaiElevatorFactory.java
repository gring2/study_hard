public class HyndaiElevatorFactory implements ElevatorFactory{
    private static ElevatorFactory hyndaiFactory=null;
    private HyndaiElevatorFactory(){

    }
    @Override
    public Motor createMotor() {
        return new HyndaiMotor();
    }

    @Override
    public Door createDoor() {
        return new HyndaiDoor();
    }

    public static ElevatorFactory getInstance() {
        if(hyndaiFactory == null) hyndaiFactory = new HyndaiElevatorFactory();
        return hyndaiFactory;
    }
}
