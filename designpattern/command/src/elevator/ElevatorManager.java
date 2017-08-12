package elevator;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jinwoopark on 2017. 8. 11..
 */
public class ElevatorManager {
    private List<ElevatorController> controllers;
    private List<ElevatorController> tmpController;
    public ElevatorManager(int controllerCount){
       this.controllers =  new ArrayList<>(controllerCount);
       this.tmpController = new ArrayList<>();
    }

    public void addController(ElevatorController controller){
        this.controllers.add(controller);
    }

    private int selectElevator(int destination, Direction direction){
        if(direction.ordinal() == Direction.DOWN.ordinal()){
           this.tmpController = controllers.stream().filter(controller -> controller.getCurFloor() <= destination)
                          .sorted( (a, b) -> {
                              if( a.getCurFloor() > b.getCurFloor()) return -1;
                              else if(a.getCurFloor() == b.getCurFloor()) return  0;
                              else return 1;
                          }).collect(Collectors.toList());

        }else{
            this.tmpController= controllers.stream().filter((controller) -> controller.getCurFloor() >= destination)
                    .sorted( (a, b) -> {
                        if( a.getCurFloor() > b.getCurFloor()) return 1;
                        else if(a.getCurFloor() == b.getCurFloor()) return  0;
                        else return -1;
                    }).collect(Collectors.toList());
        }
        return 0;
    }

    public void requestElevator(int destination, Direction direction) {
        int selectedElevator = selectElevator(destination, direction);
        System.out.println(selectedElevator + " is selected");
        this.tmpController.get(selectedElevator).gotoFloor(destination);
    }


}
