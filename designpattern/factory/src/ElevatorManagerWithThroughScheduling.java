/**
 * Created by jinwoopark on 2017. 8. 18..
 */
public class ElevatorManagerWithThroughScheduling extends ElevatorManager {
    public ElevatorManagerWithThroughScheduling(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        ElevatorScheduler scheduler = ThroughputScheduler.getInstance();
        return scheduler;
    }
}
