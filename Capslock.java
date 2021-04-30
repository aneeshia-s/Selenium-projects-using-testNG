import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Capslock {
	WebDriver driver;
	
  @Test
  public void f() throws AWTException {
	  
	  
	  //driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	  //WebElement search= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
	  
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	  robot.keyPress(KeyEvent.VK_A);
	  robot.delay(1500);

	  
	  driver.navigate().back();
	  robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	  robot.delay(1500);
	  robot.keyPress(KeyEvent.VK_A);
	  
	 
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.google.com/");
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  
}
