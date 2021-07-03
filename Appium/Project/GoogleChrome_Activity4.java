package Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GoogleChrome_Activity4 {
	
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;
	String[] taskList = { 
			"Add tasks to list",
			"Get number of tasks",
			"Clear the list"
	}; 
	
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
				
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "POCOF1");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
	}   	
	
	@Test
	public void todoList() throws InterruptedException {
		
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
	 driver.get("https://www.training-support.net/selenium");	

	 driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(5)"));	 
	 driver.findElement(MobileBy.xpath("//android.view.View[contains(@text,'To-Do List')]")).click();

     for( String task : taskList) {
 
    	 wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[@resource-id='taskInput']")));
         driver.findElementByXPath("//android.widget.EditText[@resource-id='taskInput']").sendKeys(task);

         wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[@text='Add Task']")));
         driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();   
             
         System.out.println("Task \""+task+"\" has been added successfully" );
     }
     

     wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@resource-id='tasksList']/android.view.View[4]/android.view.View")));
     List<MobileElement> tasks = driver.findElementsByXPath("//android.view.View[@resource-id='tasksList']/android.view.View");

     for(int i = 2;i<=tasks.size();i++) { 
    	
    	String taskElement = "//android.view.View[@resource-id='tasksList']/android.view.View["+i+"]/android.view.View" ;
    	MobileElement taskAdded = driver.findElementByXPath(taskElement);
    	taskAdded.click();
    	Assert.assertEquals(taskAdded.getText(), taskList[i-2]);
    	     	  	     	
     }

     driver.findElementByXPath("//android.view.View[@resource-id='tasksCard']/android.view.View[3]").click();

     MobileElement taskList = driver.findElementByXPath("//android.view.View[@resource-id='tasksList']");
     Assert.assertFalse(taskList.isDisplayed());
     	 
    }
	
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
