package navi;

public class HDScreen extends Screan {
    @Override
    public void drawMap(Map map) {
        System.out.println("Draw map" + map.getClass().getName() + " on HD screen");
    }
}
