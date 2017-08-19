package navi;

public abstract class Navi {
    protected GPS gps;
    protected Map map;
    protected Screan screan;
    protected PathFinder pathFinder;

    public PathFinder getPathFinder(){
        return this.pathFinder;
    }
    public GPS getGps(){
        return this.gps;
    }
}
