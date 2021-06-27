package activities;

import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        int[] Arr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(Arr));
        int temp_sum = 0;
        
        //Loop through array
        for (int number : Arr) {
            
            if (number == 10) {
                
                temp_sum += 10;
            }

            
            if (temp_sum > 30) {
                break;
            }     
    }
      //Print result
        System.out.println(temp_sum == 30);
    }
}

