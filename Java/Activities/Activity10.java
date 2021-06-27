package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashSet 
		Set<String> hs = new HashSet<String>();
		
		// Add 6 objects using add() method to the HashSet
		hs.add("Java");
		hs.add("Python");
		hs.add("SQL");
		hs.add("HTML");
		hs.add("CSS");
		hs.add("Python");
		hs.add("NodeJS");
		
		// print the size of the HashSet using the size() method
		System.out.println("Size of HashSet : "+hs.size());
		
		// Remove an element using the remove() method
		hs.remove("CSS");
		
		// remove an element that is not present in the Set.
		hs.remove("Pandas");
		
		// contains() method to check if an item is in the Set or not
		System.out.println("Is Python is in Set: " + hs.contains("Python"));
		
		// Print the updated set
		System.out.println("Updated Set Values: "+hs);
		

	}

}
