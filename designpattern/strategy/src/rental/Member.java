package rental;

/**
 * Created by jinwoopark on 2017. 8. 6..
 */
public class Member {
    private String name;
    private int accPrice;

    public Member(String name){
        this.name = name;
    }

    public void setAccPrice(int accPrice){
        this.accPrice += accPrice;
    }
}
