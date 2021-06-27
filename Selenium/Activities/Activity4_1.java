package seleniumactivites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net");
        
        String pageTitle = driver.getTitle();
        System.out.println("Title of the home page is "+ pageTitle);
        
        driver.findElement(By.xpath("//a[@id=\"about-link\"]")).click();
        
        System.out.println("Title of the New page is "+ driver.getTitle());
        
        driver.close();
        
	}

}
