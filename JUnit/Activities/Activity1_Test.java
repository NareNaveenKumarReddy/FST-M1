package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class Activity1_Test {
	// Create a test fixture that declares a static ArrayList named list.
    static ArrayList<String> list;
    
    // Create a setUp() method with the @BeforeAll annotation
    
    @BeforeEach
    void setUp() throws Exception {
    	// Initialize a new ArrayList
    	list = new ArrayList<String>();

    	// Add values to the list
    	list.add("alpha"); // at index 0
    	list.add("beta"); // at index 1
    }
    
    @Test
    public void insertTest() {
    	
    	// Write an assertion to check the size of the ArrayList. The expected value is 2
    	assertEquals(2, list.size(), "Wrong size");
    	
    	// Add a new value to the list and write another assertion to check the size of the new list. 
    	// The expected values of the list should be 3.
    	list.add(2, "gamma"); // at index 2
    	assertEquals(3, list.size(), "Wrong size");

    	// Finally write assertions for checking each of the values in the ArrayList.
    	assertEquals("alpha", list.get(0), "Wrong element");
    	assertEquals("beta", list.get(1), "Wrong element");
    	assertEquals("gamma", list.get(2), "Wrong element");
    }
    
    @Test
    public void replaceTest() {
    	
    	// Finally, use the ArrayList set() method to replace the value on index 1 to a different value.
    	// Replace element in ArrayList
    	list.set(1, "charlie");
    	
    	// Write an assertion to check the size of the ArrayList. The expected value is 2
    	assertEquals(2, list.size(), "Wrong size");
    	
    	// Assert individual elements
    	assertEquals("alpha", list.get(0), "Wrong element");
    	assertEquals("delta", list.get(1), "Wrong element");
    	
    }

}
