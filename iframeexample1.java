import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class iframeexample1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement watch = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[1]/div/div/a"));
	  watch.click();
	  
	  driver.switchTo().frame("videohy");
	  Thread.sleep(3000);
	  WebElement watch1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/video"));
	  watch1.click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.quest-global.com/\n");
  }

  @AfterTest
  public void afterTest() {
  }

}
