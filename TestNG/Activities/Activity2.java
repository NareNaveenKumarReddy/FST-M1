package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	@BeforeClass
	  public void beforeClass() {
		  driver = new FirefoxDriver();
	      driver.get("https://www.training-support.net/selenium/target-practice");
	  }

  @Test
  public void getTitle() {
	  String pageTitle = driver.getTitle();
      
      //Assertion for page title
      Assert.assertEquals(pageTitle,"Target Practice");
  }
  
  @Test
  public void lookBlackButton() {
	  WebElement blackButton = driver.findElement(By.xpath("//button[contains(@class,'black')]"));
	  
	  Assert.assertEquals(blackButton.getText(), "black");
  }
  
  @Test (enabled = false)
  public void thirdMethod() {
	  System.out.println("Skipping this test by setting it's enabled parameter to false");
	  
  }
  
  @Test
  public void aSkipTest() throws SkipException {
	    String condition ="Skip Test";

	    if(condition.equals("Skip Test")){
		throw new SkipException("Skipped");
	    } else {
		//Execute test case when conditions are satisfied
	    }
	}
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
