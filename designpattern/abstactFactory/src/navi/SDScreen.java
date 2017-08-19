package navi;

public class SDScreen extends Screan {
    @Override
    public void drawMap(Map map) {
        System.out.println("Draw map" + map.getClass().getName() + " on SD screen");
    }
}
