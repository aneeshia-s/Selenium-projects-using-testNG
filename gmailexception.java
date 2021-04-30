import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class gmailexception {
	WebDriver driver;
	
	
  @Test
  public void f() throws Exception{
	  	
	  	
	  	System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	  
		String str= driver.getTitle();
		String str1= "Sign in – Google accounts";
		Assert.assertEquals(str, str1);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		email.sendKeys("aneeshia");
  }
  
  
  @Test
  public void g() throws Exception{
	  	
	  	System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	  	
	  
		String str= driver.getTitle();
		String str1= "gmail";
		Assert.assertEquals(str, str1, "Title not matched");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		email.sendKeys("aneeshia");
  }
  
}
