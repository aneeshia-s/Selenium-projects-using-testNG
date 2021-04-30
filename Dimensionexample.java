import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Dimensionexample {
	WebDriver driver;
  @Test
  public void f() {
	  Dimension d = driver.manage().window().getSize();
	  System.out.println(d.height);
	  System.out.println(d.width);
	  Dimension newd = new Dimension(700,600);
	  driver.manage().window().setSize(newd);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
