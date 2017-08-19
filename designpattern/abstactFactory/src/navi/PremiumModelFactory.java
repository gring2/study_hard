package navi;

public class PremiumModelFactory extends Navi {

    public PremiumModelFactory(){
        gps = new Expensive();
        map = new LargeMap();
        screan = new HDScreen();
        pathFinder = new FastPathFinder();
    }
}
