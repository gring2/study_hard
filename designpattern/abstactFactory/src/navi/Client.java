package navi;

public class Client {

    public static void main(String[] args){
        Navi navi = NaviFatory.getModelFactory(Grade.BASIC);
        Location l1 = navi.gps.findCurrentLocation();
        Location l2 = navi.gps.findCurrentLocation();
        navi.getPathFinder().findPath(l1,l2);
    }
}
