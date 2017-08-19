package motor;

public class HyndaiMotor extends Motor{
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyndai Motor " + direction);
    }
}
