package seleniumactivites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
			driver.get(" https://training-support.net/selenium/dynamic-controls");
			System.out.println("Title of the page : "+driver.getTitle());
			
			//Find the text field
	        WebElement textField = driver.findElement(By.xpath("//div[@id='dynamicText']"));
	        System.out.println("The text field is enabled: " + textField.isEnabled());
	        
	        //Click the "Enable Input" button to enable the input field
	        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
	        
	        System.out.println("The text field is enabled: " + textField.isEnabled());
	 
	        //Close the browser
	        driver.close();

		}


}
