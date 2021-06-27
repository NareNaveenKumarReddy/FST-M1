package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        //declaring ArrayList of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("RED");
        myList.add("BLUE");
        myList.add("GREEN");
        //Adding object at specific index
        myList.add(3, "PINK");
        myList.add(1, "YELLOW");
        
        System.out.println("List of colors in array:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is BLACK is in list: " + myList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("PINK");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}