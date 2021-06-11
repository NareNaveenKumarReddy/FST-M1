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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
	WebDriver driver;
	
	  @Test (priority=0)
	  public void loginPage() {
		  driver.findElement(By.id("txtUsername")).sendKeys("orange");
		  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		  driver.findElement(By.id("btnLogin")).click();
		  
		//Wait for Home Page to load
		  WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.linkText("Dashboard"), "Dashboard"));
		  
		  
		  
		  
	  }
	  
	  @Test (priority=1)
	  public void applyLeave() throws InterruptedException {
		  
		  Thread.sleep(5000);
		  
		  driver.findElement(By.linkText("Apply Leave")).click();
		  
		  Select leaveType = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		  leaveType.selectByVisibleText("privilege leaves");
		  
		  WebElement fromDate = driver.findElement(By.id("applyleave_txtFromDate"));
		  fromDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		  fromDate.sendKeys("2021-07-11");
			
		  WebElement toDate = driver.findElement(By.id("applyleave_txtToDate"));
		  toDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		  toDate.sendKeys("2021-07-15");
		  
		  driver.findElement(By.id("applyleave_txtComment")).sendKeys("Planning to go for vacation");
		  
		  driver.findElement(By.id("applyBtn")).click();
		  
	  }
	  
	  @Test (priority=2)
	  public void leaveStatus() {
		  driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		  String status = driver.findElement(By.xpath("//a[contains(@href,'viewLeaveRequest/id/15')]")).getText();
		  System.out.println(status);
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