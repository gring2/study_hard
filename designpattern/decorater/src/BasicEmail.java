/**
 * Created by jinwoopark on 2017. 8. 14..
 */
public class BasicEmail implements Email {
    private String content;

    public BasicEmail(String content){
        this.content = content;
    }
    @Override
    public String getContent() {
        return this.content;
    }
}
