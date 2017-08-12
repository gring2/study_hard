package elevator;

/**
 * Created by jinwoopark on 2017. 8. 11..
 */
public class ElevatorController {
    private int id;
    private int curFloor;
    public ElevatorController(int id){
        this.id = id;
    }
    public void gotoFloor(int destination) {
        this.curFloor = destination;
        System.out.println("Destination to" + destination);

    }

    public int getCurFloor(){
        return this.curFloor;
    }
}
