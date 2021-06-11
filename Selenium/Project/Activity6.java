package projectactivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;
	
	  @Test (priority=0)
	  public void loginPage() throws InterruptedException {
		  driver.findElement(By.id("txtUsername")).sendKeys("orange");
		  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		  driver.findElement(By.id("btnLogin")).click();
		  
		  //Verify Directory item to be clickable
		  WebDriverWait wait = new WebDriverWait(driver, 15);
		  WebElement directory = driver.findElement(By.id("menu_directory_viewDirectory"));
		  if (directory.isDisplayed()) {
			  System.out.println("Directory Item is Visible");
		  };
		  if (wait.until(ExpectedConditions.elementToBeClickable(directory)) != null) {
			  System.out.println("Directory Item is Clickable");
			  directory.click();
			  directory.click();
			 
			  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("head"), "Search Directory"));
		  }
		  
		  String heading = driver.findElement(By.className("head")).getText();
		  Assert.assertEquals("Search Directory",heading);
		  System.out.println( "heading of the page matches" +heading);
		  
	  }
	 
	  
	  @BeforeClass
	  public void beforeTest() {
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	      driver.get("http://alchemy.hguy.co/orangehrm");
	      
	  	
	  }
	  
	  @AfterClass
	  public void afterTest() {
		  driver.close();
	  }

	  
	}
