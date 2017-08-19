public class ElevatorFactoryFactory {

    public static ElevatorFactory getFactory(VendorID id){
        ElevatorFactory factory = null;
        switch (id){
            case HYNDAI:
               factory= HyndaiElevatorFactory.getInstance();
                break;
            case LG:
                factory = LGElevatorFactory.getInstance();
                break;
            case SAMSUNG:
                factory = SamsungElevatorFactory.getInstance();
                break;
        }
        return factory;
    }
}
