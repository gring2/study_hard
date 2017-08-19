public class DoorFactory {

    public static Door createDoor(VendorID id) {
        Door door = null;

        switch (id) {
            case LG:
                door = new LGDoor();
                break;
            case HYNDAI:
                door = new HyndaiDoor();
                break;

        }
        return door;
    }
}
