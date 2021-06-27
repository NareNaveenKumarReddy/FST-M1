package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		  driver = new FirefoxDriver();
	      driver.get("https://www.training-support.net");
	  }
	
  @Test
  public void titleTest() {
	  String pageTitle = driver.getTitle();
      
      //Assertion for page title
      Assert.assertEquals("Training Support", pageTitle);
                  
      //Find the clickable link on the page and click it
      driver.findElement(By.id("about-link")).click();
                  
      //Print title of new page
      System.out.println("New page title is: " + driver.getTitle());
      
      Assert.assertEquals(driver.getTitle(), "About Training Support");
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
