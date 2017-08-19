public class LGElevatorFactory implements ElevatorFactory{
    private static LGElevatorFactory lgFactory = null;
    private LGElevatorFactory(){};
    @Override
    public Motor createMotor() {
        return new LGMotor();
    }

    @Override
    public Door createDoor() {
        return new LGDoor();
    }
    public static ElevatorFactory getInstance() {
        if(lgFactory == null) lgFactory = new LGElevatorFactory();
        return lgFactory;
    }

}
