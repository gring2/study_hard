package elevator;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public class Client {

    public static void main(String[] args){
//        ElevatorController elevatorController = new ElevatorController();
//        ElevatorDisplay elevatorDisplay = new ElevatorDisplay(elevatorController);
//        VoiceNotice voiceNotice = new VoiceNotice(elevatorController);
//        FloorDisplay floorDisplay = new FloorDisplay(elevatorController);
//        ControllRoomDisplay controllRoomDisplay = new ControllRoomDisplay(elevatorController);
//
//        elevatorController.attach(elevatorDisplay);
//        elevatorController.attach(voiceNotice);
//        elevatorController.attach(floorDisplay);
//        elevatorController.attach(controllRoomDisplay);
//        elevatorController.gotoFloor(5);
//        elevatorController.gotoFloor(10);

        TestOne one = new TestOne();
        TestTwo two = new TestTwo();
        System.out.println(" ONe " + one.getTestInt());
        System.out.println(" two " + two.getTestInt());
        one.change();
        System.out.println();
        System.out.println(" ONe " + one.getTestInt());
        System.out.println(" two " + two.getTestInt());

    }
}
