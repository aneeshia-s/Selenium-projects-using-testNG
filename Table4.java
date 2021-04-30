import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Table4 {
	WebDriver driver;
  @Test
  public void f() {
	  
	  List <WebElement> rows = driver.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr/td/a"));
	  int numrows = rows.size();
	  List <WebElement> cols= driver.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr[1]/td"));
	  int numcols = cols.size();
	  System.out.println("number of rows: "+numrows+" &  number of columns: "+numcols);
	  
	  WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr[4]/td[1]/a"));
	  String str1 = element1.getText();
	  System.out.println("Company name is: "+str1);
	  WebElement element2 = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr[4]/td[4]"));
	  String str2 = element2.getText();
	  System.out.println("Current price is: "+str2);
	  
	  
			  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php#\n");
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
