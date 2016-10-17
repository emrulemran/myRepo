package advanced.practice;
/* Author: MD Emrul Emran 
 * 
 */
import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		// Created hashtable class object to use Its different properties.
		Hashtable<String, Integer> myHashTable = new Hashtable<String, Integer>();

		myHashTable.put("Wheel", 4); // Store value 4 In key = Legs
		myHashTable.put("Headlights", 2); // Store value 2 In key = Eyes
		myHashTable.put("Steering Wheel", 1); // Store value 1 In key = Mouth

		// Accessing hash table values using keys.
		System.out.println("A car has " + myHashTable.get("Wheel") + " wheels.");
		System.out.println("A car has " + myHashTable.get("Headlights") +" headlights.");
		System.out.println("A car has " + myHashTable.get("Steering Wheel") + " steering wheel.");
	}
}