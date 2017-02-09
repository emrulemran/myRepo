package basic.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotExample {
    public static void main(String[] args) {
        
        try {
             
            Robot robot = new Robot();
            // Creates the delay of 5 sec so that you can open notepad before
            // Robot start writting
            robot.delay(5000);
            robot.keyPress(KeyEvent.VK_H);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyPress(KeyEvent.VK_B);
            robot.keyPress(KeyEvent.VK_U);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyPress(KeyEvent.VK_Y);
            robot.delay(5000);
            robot.keyPress(KeyEvent.VK_ALT);  
            robot.keyPress(KeyEvent.VK_F4);  
            robot.keyRelease(KeyEvent.VK_ALT);  
            robot.keyRelease(KeyEvent.VK_F4);
            robot.delay(5000);
            robot.keyPress(KeyEvent.VK_N);
            
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}