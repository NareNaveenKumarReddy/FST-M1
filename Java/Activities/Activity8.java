package activities;

class CustomException extends Exception {
    private String message = null;
 
    public CustomException(String message) {
        this.message = message;
    }
 
    @Override
    public String getMessage() {
        return message;
    }
}
 
public class Activity8 {
	static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
	
    public static void main(String[] args){  
        try {
            // Method call with non-null argument
            Activity8.exceptionTest("Will print to console");
            // Method call with null argument
            Activity8.exceptionTest(null); // Exception will be thrown here
        } catch(CustomException e) {
            System.out.println(e.getMessage());
        }
    }
 
    
}