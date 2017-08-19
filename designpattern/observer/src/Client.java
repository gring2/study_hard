
/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public class Client {
    public static void main(String[] args){
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord,3);
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord,5);

        MinMaxView dataSheetView = new MinMaxView(scoreRecord);
        StatisticsView statisticsView = new StatisticsView(scoreRecord);
        scoreRecord.attach(dataSheetView);
        scoreRecord.attach(dataSheetView3);
        scoreRecord.attach(dataSheetView5);
        scoreRecord.attach(statisticsView);
        for(int index = 1; index <= 5; index++){
            int score = index * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}
