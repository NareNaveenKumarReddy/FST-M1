package seleniumactivites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity7_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        
        // Print title of the page
        System.out.println("Title of the page : "+driver.getTitle());
        
        // Input fields of Sign Up form
        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("Naveen Kumar");
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("Naveen09");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("Naveen09");
        driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("Naveen.nare09@gmail.com");
        
        // Click SignUp button
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        
      //Wait for login message to appear
        //wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Welcome Back, admin"));
        
      //getText() and print it
        String signupmessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Sign Up Message: "+ signupmessage);
        
      // close the browser
        driver.close();

	}

}



