public class MotorFactory {

    public static Motor createMotor(VendorID id){
      Motor motor = null;

      switch (id){
          case LG:
              motor = new LGMotor();
              break;
          case HYNDAI:
              motor = new HyndaiMotor();
              break;
      }
      return motor;
    }
}
