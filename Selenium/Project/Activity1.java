package projectactivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity1 {
WebDriver driver;
	
	@BeforeMethod
	  public void beforeTest() {
		  driver = new FirefoxDriver();
	      driver.get("http://alchemy.hguy.co/orangehrm");
	  }
	@Test
	  public void titleTest() {
		  String pageTitle = driver.getTitle();
	      
	      //Assertion for page title
	      Assert.assertEquals("OrangeHRM", pageTitle);
	      
	      //print pageTitle
	      System.out.println("Title of the page: "+pageTitle);
	}
	
	@AfterMethod
	  public void afterTest() {
		  driver.close();
	  }
	
	}


