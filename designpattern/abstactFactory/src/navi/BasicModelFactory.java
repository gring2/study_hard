package navi;

public class BasicModelFactory extends Navi {

    public BasicModelFactory(){
        gps = new CheapGPS();
        map = new SmallMap();
        screan = new SDScreen();
        pathFinder = new SlowPathFinder();
    }
}
