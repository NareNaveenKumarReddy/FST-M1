package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// Create a Map named colours with integer keys and String values
		
		Map<Integer, String> colours = new HashMap<>();
		
		// Add 5 random colours to it and print the Map to the console
		colours.put(1,"orange");
		colours.put(2,"Green");
		colours.put(3, "Grey");
		colours.put(4, "White");
		colours.put(5, "Black");
		
		System.out.println("Colour Names in Map: "+colours);
		
		colours.remove(4);
		
		System.out.println("Is Green exists in Map: "+colours.containsValue("Green"));
		
		System.out.println("Size of Map: "+colours.size());
	}

}
