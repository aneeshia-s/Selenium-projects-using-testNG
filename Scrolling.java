import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Scrolling {
  WebDriver driver;
  
	
	@Test
  public void f() {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scrolllink = driver.findElement(By.xpath("//*[@id=\"Poems\"]"));
		js.executeScript("arguments[0].scrollIntoView();", scrolllink);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		


		
		
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://en.wikipedia.org/wiki/William_Shakespeare");
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
