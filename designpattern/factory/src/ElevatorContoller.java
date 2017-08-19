/**
 * Created by jinwoopark on 2017. 8. 17..
 */
public class ElevatorContoller {
    private int id;
    private int curFloor;

    public ElevatorContoller(int id){
        this.id = id;
        curFloor = 1;
    }
    public void gotoFloor(int destination) {
        System.out.println("Elevator[" + id +"] Floor: "+curFloor);
        curFloor = destination;
        System.out.println(" ==> "+ curFloor);
    }
}
