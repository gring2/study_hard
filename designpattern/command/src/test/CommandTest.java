package test;

import command.Button;
import command.Lamp;
import command.LampOffCommand;
import command.LampOnCommand;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jinwoopark on 2017. 8. 11..
 */
public class CommandTest {
    private static Button button;
    private static Lamp lamp;
    private static LampOnCommand lampOn;
    private static LampOffCommand lampOff;
    @BeforeAll

    public static void makeButton(){
        lamp = new Lamp();
        lampOn = new LampOnCommand(lamp);
        lampOff = new LampOffCommand(lamp);
        button = new Button(lampOn);

    }
    @Test
    public void testTurnOn(){
        button.pressed();
        assertTrue(true);

    }
    @Test
    public void testTurnOff(){
        button.setCommand(lampOff);
        button.pressed();
        assertTrue(true);

    }

}
