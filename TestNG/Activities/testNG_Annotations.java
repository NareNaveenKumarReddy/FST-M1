package testNGTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_Annotations {
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}
	
	
  @BeforeClass
  public void beforeclass() {
	  System.out.println("Before class");
   }
	
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("Before method");
  }
	
  @Test
  public void first() {
	  System.out.println("First Test case");
  }
  
  @Test
  public void second() {
	  System.out.println("Second Test case");
  }
  
  @AfterMethod
  public void aftermethod() {
	  System.out.println("After method");
  }
  @AfterClass
  public void afterclass() {
	  System.out.println("After class");
   }
  @AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}
}
