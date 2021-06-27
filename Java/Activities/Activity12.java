package activities;

interface Addable {
	public int add(int num1, int num2);
}


public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable ad1 = (num1,num2) -> (num1 + num2);
		Addable ad2 = (int num1, int num2) -> {
		    return (num1 + num2);
		};
		System.out.println(ad2.add(150, 250));
	}

}
