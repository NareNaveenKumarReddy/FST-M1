package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity6 {
	WebDriver driver;
  @Test
  @Parameters({"username", "password"})
  public void loginTest(String username,String password) {
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.cssSelector("button[type='submit']")).click();
	  
	  
	  String loginmsg = driver.findElement(By.id("action-confirmation")).getText();
	  System.out.println("Login Message: "+ loginmsg);
	  Assert.assertEquals("Welcome Back, admin", loginmsg);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
      driver.get("https://www.training-support.net/selenium/login-form");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
