package seleniumactivites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        
        String pageTitle = driver.getTitle();
        System.out.println("Title of the page is "+ pageTitle);
        
        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("Text in Element: "+ idLocator.getText());
        
        WebElement classNameLocator = driver.findElement(By.className("green"));
        System.out.println("Text in Element: "+ classNameLocator.getText());
        
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in Element: "+ linkTextLocator.getText());
        
        WebElement cssSelectorLocator = driver.findElement(By.cssSelector("a#about-link"));
        System.out.println("Text in Element: "+ cssSelectorLocator.getText());
        
        driver.close();

	}

}
