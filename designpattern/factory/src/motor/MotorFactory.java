package motor;

public class MotorFactory {

    public static Motor getMotor(MotorVendorID id){
        Motor motor = null;
        switch (id){
            case LG:
                motor =  new LGMotor();
                break;
            case HYUNDAI:
                motor = new HyndaiMotor();
                break;
        }
        return motor;
    }
}
