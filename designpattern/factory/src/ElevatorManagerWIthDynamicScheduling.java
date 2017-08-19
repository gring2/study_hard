import java.util.Calendar;

/**
 * Created by jinwoopark on 2017. 8. 18..
 */
public class ElevatorManagerWIthDynamicScheduling extends ElevatorManager {
    public ElevatorManagerWIthDynamicScheduling(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        ElevatorScheduler scheduler = null;
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(hour < 12)
             scheduler = ResponseTimeScheduler.getInstance();
        else scheduler = ThroughputScheduler.getInstance();
        return scheduler;
    }
}
