package seleniumactivites;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {
	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
 
        //Open browser
        driver.get("https://training-support.net/selenium/tables");
        
 
        //Get columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@id,'sortable')]/thead/tr/th"));
        //Get rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id,'sortable')]/tbody/tr"));
 
        //Number of columns
        System.out.println("Number of columns are: " + cols.size());
        //Number of rows
        System.out.println("Number of rows are: " + rows.size());
        
        // print the cell value at the second row and second column
        WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@id,'sortable')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + cellValue2_2.getText());
        
        //Click the header of the first column to sort by name.
        WebElement name = driver.findElement(By.xpath("//table[contains(@id,'sortable')]/thead/tr/th[1]"));
        name.click();
        
        // print the cell value at the second row and second column again
        System.out.println("Second row, second column value: " + cellValue2_2.getText());
        
        // Print the cell values of the table footer
        WebElement footer = driver.findElement(By.xpath("//table[contains(@id,'sortable')]/tfoot/tr"));
        System.out.println("Table Footer values: " + footer.getText());
        
        
        // close browser
        driver.close();
	}

}
