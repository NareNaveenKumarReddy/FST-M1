package activities;
import java.util.Arrays;
public class Activity4 {
	
	public static void insertionSort(int array[]) {
	    for (int i = 1; i < array.length; i++) {
	        int temp = array[i];
	        int j = i-1;
	        while ((j >=0) && (array[j] > temp)) {
	            array[j+1] = array[j];
	            j--;
	        }
	        array[j+1] = temp;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 4,7,1,8,2,9,0,2,4,7,3,6,3,6,3,53,43,5,6,4,4 };
		System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(data));
		insertionSort(data);
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(data));

	}

}
