/**
 * Created by jinwoopark on 2017. 8. 14..
 */
public class Client {

    public static void main(String[] args){
        System.out.println(new SecureEmail(new ExternalEmail(new BasicEmail("Basic "))).getContent());
    }
}
