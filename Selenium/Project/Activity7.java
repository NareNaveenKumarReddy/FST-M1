package projectactivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	
	  @Test (priority=0)
	  public void loginPage() {
		  driver.findElement(By.id("txtUsername")).sendKeys("orange");
		  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		  driver.findElement(By.id("btnLogin")).click();
		  
		//Wait for Home Page to load
		  WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.linkText("Dashboard"), "Dashboard"));
		  
		  //Actions actions = new Actions(driver);
		  WebElement myInfo = driver.findElement(By.id("menu_pim_viewMyDetails"));
		  //actions.moveToElement(myInfo).click(myInfo).build().perform();
		  //actions.click(myInfo).perform();
		  myInfo.click();
		  myInfo.click();
		  
		  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.linkText("Personal Details"),"Personal Details"));
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		  // Find element by link text and store in variable "Element"        		
	        WebElement qualification = driver.findElement(By.linkText("Qualifications"));

	        //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", qualification);
	  }
	  
	  @Test (priority=1)
	  public void addEmployeeQualifications() {
		  
        driver.findElement(By.linkText("Qualifications")).click();
        
        WebDriverWait wait1 = new WebDriverWait(driver, 15);
        //wait1.until(ExpectedConditions.textToBePresentInElementLocated(By.linkText("head"), "Work Experience"));
        
        driver.findElement(By.id("addWorkExperience")).click();
        
        wait1.until(ExpectedConditions.textToBePresentInElementLocated(By.id("headChangeWorkExperience"), "Add Work Experience"));
        
        driver.findElement(By.id("experience_employer")).sendKeys("IBM India Pvt Ltd");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("Automation Tester");
        
        WebElement fromDate = driver.findElement(By.id("experience_from_date"));
		fromDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		fromDate.sendKeys("2018-09-24");
		
		WebElement toDate = driver.findElement(By.id("experience_to_date"));
		toDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		toDate.sendKeys("2021-10-25");
        
       
        driver.findElement(By.id("experience_comments")).sendKeys("Happy to be part of IBM...Looking forward for good positions");
        driver.findElement(By.id("btnWorkExpSave")).click();
        
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