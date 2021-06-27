package seleniumactivites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        
        String pageTitle = driver.getTitle();
        System.out.println("Title of the page is "+ pageTitle);
        
        WebElement firstnameLocator = driver.findElement(By.id("firstName"));
        firstnameLocator.sendKeys("Naveen Kumar");
        
        WebElement lastnameLocator = driver.findElement(By.id("lastName"));
        lastnameLocator.sendKeys("Reddy Nare");
        
        WebElement emailLocator = driver.findElement(By.id("email"));
        emailLocator.sendKeys("naveen.nare09@gmail.com");
        
        WebElement phonenumberLocator = driver.findElement(By.id("number"));
        phonenumberLocator.sendKeys("8926377663");
        
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).submit();
        
        driver.close();
        
        System.out.println("Form details submitted and closed browser");

	}

}
