package seleniumactivites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        
        // Print title of the page
        System.out.println("Title of the page : "+driver.getTitle());
        
        // Find the username and password input fields. Type in the credentials
        driver.findElement(By.xpath("//input[starts-with(@class,'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@class,'password')]")).sendKeys("password");
        
        // Click login button
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        
      //Wait for login message to appear
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Welcome Back, admin"));
        
      //getText() and print it
        String loginmessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login Message: "+ loginmessage);
        
      // close the browser
        driver.close();

	}

}
