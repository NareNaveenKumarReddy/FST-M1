package seleniumactivites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println("Title of the page : "+driver.getTitle());
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Naveen");
		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Naveen.nare09@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"number\"]")).sendKeys("9862178553");
		driver.findElement(By.xpath("//textarea")).sendKeys("This is first message");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.close();
		
		

	}

}
