package collectionsdemo;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String args[]) {

		ArrayList<String> obj = new ArrayList<String>();

		obj.add("Newton");
		obj.add("Pristley");
		obj.add("Harvey");
		obj.add("Thmopson");
		obj.add("Chadwick");
		obj.add("Darwin");
		obj.add("Lamarck");
		obj.add("Curie");
		obj.add("Vesalius");

		System.out.println("Displaying elements of original ArrayList:" + obj);
		for (String str : obj)
			System.out.println(str);

		// adding elements in specified index positions
		obj.add(0, "Einstein");
		obj.add(1, "Farraday");

		// Displaying elements
		System.out.println("ArrayList after add operation:");
		for (String str : obj)
			System.out.println(str);

		// Remove elements
		obj.remove("Curie");
		obj.remove("Vesalius");

		// Displaying elements
		System.out.println("ArrayList after remove operation:");
		for (String str : obj)
			System.out.println(str);


		obj.remove(1); // Removes Second element from the List

		// Displaying elements
		System.out.println("Final ArrayList:");
		for (String str : obj)
			System.out.println(str);
	}
}
