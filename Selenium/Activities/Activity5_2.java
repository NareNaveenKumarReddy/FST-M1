package seleniumactivites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
			driver.get(" https://training-support.net/selenium/dynamic-controls");
			System.out.println("Title of the page : "+driver.getTitle());
			
			//Find the checkbox
	        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
	        System.out.println("The checkbox Input is selected: " + checkboxInput.isSelected());
	        
	        //Click the checkbox to select it
	        checkboxInput.click();
	        
	        System.out.println("The checkbox Input is Selected: " + checkboxInput.isSelected());
	 
	        //Close the browser
	        driver.close();

		}

	}
