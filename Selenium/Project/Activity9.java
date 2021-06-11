package projectactivities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {
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
		 
	  }
	  
	  @Test (priority=1)
	  public void emergencyContacts() {
		  
      driver.findElement(By.linkText("Emergency Contacts")).click();
      
    //No.of Columns
      List<WebElement>  col = driver.findElements(By.xpath("//table[@id='emgcontact_list']/thead/tr[1]/th"));
      System.out.println("No of cols are : " +col.size()); 
      //No.of rows 
      List<WebElement>  rows = driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr")); 
      System.out.println("No of rows are : " + rows.size());
      
    //divided xpath In three parts to pass Row_count and Col_count values.
      String first_part = "//table[@id='emgcontact_list']/tbody/tr[";
      String second_part = "]/td[";
      String third_part = "]";
      
      for (int i=1; i<=rows.size(); i++){
    	  //Used for loop for number of columns.
    	  for(int j=2; j<=col.size(); j++){
    		  
    		//Prepared final xpath of specific cell as per values of i and j.
    		   String final_xpath = first_part+i+second_part+j+third_part;
    		   
    	   //Will retrieve value from located cell and print It.
    	   String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
    	   System.out.print(Table_data +"  ");   
    	  }
    	   System.out.println("");
    	   System.out.println("");  
    	 } 
    	 
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

