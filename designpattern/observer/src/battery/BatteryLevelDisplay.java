package battery;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public class BatteryLevelDisplay implements Observer{
    private Battery subject;
    public BatteryLevelDisplay(Battery subject){
        this.subject =subject;
    }
    @Override
    public void update() {
        int level = subject.getLevel();
        System.out.println( "Remained Battery is "+ level +" Now");
    }
}
