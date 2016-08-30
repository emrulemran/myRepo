package array.practice;

public class ReverseArray {

	public static void main(String[] args) {

		String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

		for (int i = weekDays.length - 1; i >= 0; i--) {
			System.out.println(weekDays[i]);
		}

	}
}