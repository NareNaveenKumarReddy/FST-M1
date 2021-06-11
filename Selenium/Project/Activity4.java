package projectactivities;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class Activity4 {
	WebDriver driver;
	
	  @Test (priority=0)
	  public void loginPage() {
		  driver.findElement(By.id("txtUsername")).sendKeys("orange");
		  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		  driver.findElement(By.id("btnLogin")).click();
		//Wait for Home Page to load
		  WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.linkText("Dashboard"), "Dashboard"));
		  
		  driver.findElement(By.linkText("PIM")).click();
		  
          wait.until(ExpectedConditions.textToBePresentInElementLocated(By.linkText("Add Employee"), "Add Employee"));
		  
          
		  driver.findElement(By.linkText("Add Employee")).click();
		  
		  
	  }
	  
	  @Test (priority=1)
	  public void addEmployee() {

		  driver.findElement(By.id("firstName")).sendKeys("Robert");
		  driver.findElement(By.id("lastName")).sendKeys("Garg");
		  driver.findElement(By.id("btnSave")).click();
		  WebDriverWait wait1 = new WebDriverWait(driver, 10);
		  wait1.until(ExpectedConditions.textToBePresentInElementLocated(By.linkText("Personal Details"),"Personal Details"));
	  }
	  
	  @Test (priority=2)
	  public void verifyEmployee() {
		  driver.findElement(By.linkText("Employee List")).click();
		  driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Garg");
		  driver.findElement(By.id("searchBtn")).click();
		  Assert.assertEquals("Robert", "Robert");
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
