import com.sun.javafx.scene.traversal.Direction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinwoopark on 2017. 8. 17..
 */
public abstract class ElevatorManager {
    private List<ElevatorContoller> contollers;

    public ElevatorManager(int controllerCount){
        contollers = new ArrayList<>(controllerCount);

        for(int i = 0; i<controllerCount; i++) {
            ElevatorContoller contoller = new ElevatorContoller(i + 1);
            contollers.add(contoller);
        }
    }
    protected abstract ElevatorScheduler getScheduler();
    void requestElevator(int destination, Direction direction){
       ElevatorScheduler scheduler = getScheduler();
       int selectedElevator = scheduler.selectElevator(this, destination, direction);
        contollers.get(selectedElevator).gotoFloor(destination);

    }

}
