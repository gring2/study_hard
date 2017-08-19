
public class HyndaiDoor extends Door{
    @Override
    protected void doClose() {
        System.out.println("close Hyndai Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("open Hyndai Door");

    }
}
