/**
 * Created by jinwoopark on 2017. 8. 14..
 */
public class SecureEmail extends EmailDecorator {
    public SecureEmail(Email email) {
        super(email);
    }

    @Override
    public String getContent() {
        String content =  super.getContent();
        String enc = encrypt(content);

        return enc;
    }

    private String encrypt(String content){
        return content + " Encrypted";
    }
}
