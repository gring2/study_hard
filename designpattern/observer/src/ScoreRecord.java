import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public class ScoreRecord extends Subject{
    private List<Integer> scores = new ArrayList<>();

    public void addScore(int score){
        scores.add(score);
        notifyObserver();
    }

    public List<Integer> getScoreRecord(){
        return scores;
    }
}
