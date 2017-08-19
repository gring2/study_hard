package battery;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public class Client {

    public static void main(String[] args){
        Battery battery = new Battery();
        BatteryLevelDisplay batteryLevelDisplay = new BatteryLevelDisplay(battery);
        LowBatteryWarning lowBatteryWarning = new LowBatteryWarning(battery);

        battery.attach(batteryLevelDisplay);
        battery.attach(lowBatteryWarning);
        battery.consume(10);
        battery.consume(70);

    }
}
