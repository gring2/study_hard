package motor;

public class Client {

    public static void main(String[] args){
        Motor motor = MotorFactory.getMotor(MotorVendorID.LG);
        ElevatorController controller = new ElevatorController(1,motor);
        controller.gotoFloor(5);
        controller.gotoFloor(3);


        Motor hmotor = MotorFactory.getMotor(MotorVendorID.HYUNDAI);
        ElevatorController controller1 = new ElevatorController(2, hmotor);
        controller1.gotoFloor(4);
        controller1.gotoFloor(6);
    }
}
