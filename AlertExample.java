import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class AlertExample {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement cid = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	  cid.sendKeys("321");
	  WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	  submit.click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
  }

  @AfterTest
  public void afterTest() {
  }

}
