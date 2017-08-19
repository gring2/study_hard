/**
 * Created by jinwoopark on 2017. 8. 16..
 */
public class Customer<T extends Customer> {
    private String name;
    private int point;

    public Customer(String name, int point){
        this.name = name;
        this.point = point;
    }

    public int getPoint(){
        return this.point;
    }

    public void setPoint(int point){
        this.point = point;
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }



}
