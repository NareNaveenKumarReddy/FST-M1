package projectactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;

  @Test
  public void getHeaderURL() {
	  String headerURL = driver.findElement(By.xpath("//img[contains(@src,'logo.png')]")).getAttribute("src");
	  System.out.println("URL of the header image: "+ headerURL);
  }
  @BeforeMethod
  public void beforeTest() {
	  driver = new FirefoxDriver();
      driver.get("http://alchemy.hguy.co/orangehrm");
  }

  @AfterMethod
  public void afterTest() {
	  driver.close();
  }

}
