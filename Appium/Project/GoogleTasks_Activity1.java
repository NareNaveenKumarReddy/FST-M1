package Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class GoogleTasks_Activity1 {
	
	AppiumDriver<MobileElement> driver = null;

	String[] taskList = {
			"Complete Activity with Google Tasks",
			"Complete Activity with Google Keep",
			"Complete the second Activity Google Keep"
	};
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
				
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "POCOF1");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);
		
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        
	}   	
	
	@Test
	public void addTasks() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	 
		
		for (String task : taskList ) { 
			
			driver.findElementById("tasks_fab").click();
			
			driver.findElementById("add_task_title").sendKeys(task);	 
			
			driver.findElementById("add_task_done").click();
	 
		}

		List<MobileElement> tasks = driver.findElementsById("task_name");
		
		Assert.assertEquals(tasks.size(), 3);
		Assert.assertEquals(tasks.get(0).getText(), taskList[2]);
		Assert.assertEquals(tasks.get(1).getText(), taskList[1]);
		Assert.assertEquals(tasks.get(2).getText(), taskList[0]);
	  
	}
		
	@AfterClass
    public void tearDown() {
        driver.quit();
    }

}