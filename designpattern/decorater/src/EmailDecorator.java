/**
 * Created by jinwoopark on 2017. 8. 14..
 */
public class EmailDecorator implements Email {
    private Email email;
    public EmailDecorator(Email email){
        this.email = email;
    }

    @Override
    public String getContent() {
       return email.getContent();
    }
}
