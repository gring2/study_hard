package battery;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public class Battery  extends Subject{
    private int level = 100;
    private BatteryLevelDisplay display;
    private LowBatteryWarning warning;

    public Battery(){
    }

    public void consume(int level){
        this.level-=level;
        notifyObserver();
    }

    public int getLevel(){
        return this.level;
    }
}
