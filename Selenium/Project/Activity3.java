package projectactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity3 {
	WebDriver driver;
	
  @Test (priority=0)
  public void loginPageTest() {
	  driver.findElement(By.id("txtUsername")).sendKeys("orange");
	  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	  driver.findElement(By.id("btnLogin")).click();
	//Wait for Home Page to load
	  WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.linkText("Dashboard"), "Dashboard"));
  }
  
  @Test (priority = 1)
  public void verifyHomePage() {
	  
	  System.out.println("Home Page Verification in Progress");
	  
	  String homePage = driver.findElement(By.xpath("//img[contains(@src,'logo.png')]")).getAttribute("alt");
      
      //Assertion for page title
      Assert.assertEquals("OrangeHRM", homePage);
      
      System.out.println("Home Page Verification in Done");
      
  }
  @BeforeSuite
  public void beforeTest() {
	  driver = new FirefoxDriver();
      driver.get("http://alchemy.hguy.co/orangehrm");
  }
  
  @AfterSuite
  public void afterTest() {
	  driver.close();
  }

  
}
