/**
 * Created by jinwoopark on 2017. 8. 6..
 */
public abstract class Robot {
    private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;
    public Robot(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setMovingStrategy(MovingStrategy movingStrategy){
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }
    public void attack(){
        attackStrategy.attack();
    };
    public void move(){
        movingStrategy.move();
    };
}
