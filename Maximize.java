import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Maximize {
	
	WebDriver driver;
  @Test
  public void f() throws AWTException {
	  
	 // WebElement html = driver.findElement(By.tagName("html"));
	  //html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
	  
	  //JavascriptExecutor executor = (JavascriptExecutor)driver;
	  //executor.executeScript("document.body.style.zoom = '1.5'");
	  
	  Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_EQUALS);
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_EQUALS);
	  
	  

  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://en.wikipedia.org/wiki/William_Shakespeare");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
