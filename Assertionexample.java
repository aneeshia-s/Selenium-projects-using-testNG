import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionexample {
	WebDriver driver;
  @Test
  public void f() {
	  Assert.assertEquals("a","a" );
	  System.out.println("equal");
  }
  @Test
  public void fg() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		String str= driver.getTitle();
		String str1= "Googlee";
		
	  
	  Assert.assertNotEquals(str,str1, "not equal");
	  //System.out.println("not equal");
  }
  @Test
  public void fh() {
	 SoftAssert sf= new SoftAssert();
	 sf.assertNull("c");
	 System.out.println("soft assert done");
  }
}
