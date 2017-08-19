/**
 * Created by jinwoopark on 2017. 8. 14..
 */
public class ExternalEmail extends EmailDecorator {

    public ExternalEmail(Email email) {
        super(email);
    }

    @Override
    public String getContent() {
        String content =  super.getContent();
        String external = addDisclaimer(content);
        return external;
    }

    private String addDisclaimer(String content) {
        return content + " Company xyz";
    }
}
