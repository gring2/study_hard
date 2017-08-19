package navi;

public class Expensive extends GPS{
    @Override
    public Location findCurrentLocation() {
        System.out.println("Find current location with Expensive GPS");
        return null;
    }
}
