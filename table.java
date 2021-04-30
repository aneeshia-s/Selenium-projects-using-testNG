import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class table {
	WebDriver driver;
	
  @Test
  public void a()  {
	  
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  WebElement row1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"));
	  String str = row1.getText();
	  System.out.println(str);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  	System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("file:///C:/Users/vishnu/Desktop/aneeshia/table.html");
  }

  @AfterTest
  public void afterTest() {
  }

}
