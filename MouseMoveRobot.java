package basic.practice;

import java.awt.Robot;

public class MouseMoveRobot {
	public static void main(String[] args) {
		try {
			int Xcoordinate = 200;
			int Ycoordinate = 500;

			Robot a = new Robot();

			// this method will move your cursor to the location base on
			// Xcoordinate and Ycoordinate
			a.mouseMove(Xcoordinate, Ycoordinate);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
