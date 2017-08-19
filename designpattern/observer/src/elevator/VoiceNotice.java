package elevator;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public class VoiceNotice extends AbstractObserver {

    public VoiceNotice(ElevatorController subject) {
        super(subject);
    }

    @Override
    public void update() {
      int floor =  super.subject.getCurFloor();

      System.out.println("<VOICE > " + floor +"<VOICE>");
    }
}
