package projectactivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


public class Activity5 {
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
		  
        
		  driver.findElement(By.xpath("//input[@id='btnSave']")).click(); 
		  
	  }
	  
	  @Test (priority=1)
	  public void editEmployeeDetails() {
		  
          // Editing First Name
		  WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
		  firstName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		  firstName.sendKeys("Mohan");
		  
		  // Editing Last Name
		  WebElement lastName = driver.findElement(By.id("personal_txtEmpLastName"));
		  lastName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		  lastName.sendKeys("Patel");
		  
		  // Editing Gender
		  driver.findElement(By.id("personal_optGender_1")).click();
		  
		  
		  // Editing Nationality
		  Select nation = new Select(driver.findElement(By.id("personal_cmbNation")));
		  
		//Select Indian by visible text
	     nation.selectByVisibleText("Indian");
	     
	     // Editing DOB
		  WebElement dob = driver.findElement(By.id("personal_DOB"));
		  dob.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		  dob.sendKeys("2002-07-09");
		  
		  // Saving Employee details
		  driver.findElement(By.id("btnSave")).click();
	     
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