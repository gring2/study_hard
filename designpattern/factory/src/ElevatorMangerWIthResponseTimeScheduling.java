/**
 * Created by jinwoopark on 2017. 8. 18..
 */
public class ElevatorMangerWIthResponseTimeScheduling extends ElevatorManager {
    public ElevatorMangerWIthResponseTimeScheduling(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        return ResponseTimeScheduler.getInstance();
    }
}
