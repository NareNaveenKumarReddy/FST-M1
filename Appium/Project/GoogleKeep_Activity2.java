package Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GoogleKeep_Activity2 {
	
AppiumDriver<MobileElement> driver = null;
WebDriverWait wait;

	@BeforeClass
	public void setUp() throws MalformedURLException {
				
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "POCOF1");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);
		

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver,10);	
        
	}   	
	
	@Test
	public void addNote() throws InterruptedException {
		
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

	 driver.findElementById("new_note_button").click();

	 wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById("editable_title"))).click();
	 driver.findElementById("editable_title").sendKeys("Team Meeting"); 

	 wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById("edit_note_text")));
	 driver.findElementById("edit_note_text").sendKeys("There is a team meeting at 12 AM");

	 driver.findElementByAccessibilityId("Navigate up").click();   

	 String note = driver.findElementById("index_note_text_description").getText();
	 
	 Assert.assertEquals(note, "There is a team meeting at 12 AM");
	                  
	}
	
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}

