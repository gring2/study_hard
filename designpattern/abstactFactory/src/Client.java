import com.sun.javafx.scene.traversal.Direction;

public class Client {

    public static void main(String[] args){
        Door lgdoor = DoorFactory.createDoor(VendorID.LG);
        Motor lgMotor = MotorFactory.createMotor(VendorID.LG);
        lgMotor.setDoor(lgdoor);
        lgdoor.doOpen();
        lgMotor.move(Direction.UP);
    }
}
