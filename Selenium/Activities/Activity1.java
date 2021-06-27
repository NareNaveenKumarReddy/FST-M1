package seleniumactivites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.training-support.net");
	        String pageTitle = driver.getTitle();
	        System.out.println("Title of the page is "+ pageTitle);
	        Thread.sleep(1000);
	        driver.close();

	}

}
