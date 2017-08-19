import com.sun.javafx.scene.traversal.Direction;

public abstract class Motor {
    protected MotorStatus motorStatus;
    protected  Door door;
    public Motor(){
        this.motorStatus = MotorStatus.STOPPED;
    }
    public MotorStatus getMotorStatus(){
        return this.motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction d){
        if(this.motorStatus == MotorStatus.MOVED) return;
        if(door.getDoorStatus() == DoorStatus.OPENED) door.doClose();
        moveMotor();
        motorStatus = MotorStatus.MOVED;
    }

    protected abstract void moveMotor();

    public void setDoor(Door door){
        this.door = door;
    }
}
