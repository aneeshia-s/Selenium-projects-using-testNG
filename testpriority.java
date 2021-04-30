

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testpriority {
	WebDriver driver;
	
	 @Test(priority=1)
	  public void openBrowser()
	 {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		  driver=new FirefoxDriver();
		  
	  }
	  @Test(priority=2)
	  public void launchGoogle()
	  {
		  driver.get("https://www.google.com/");
	  }
	  @Test(priority=3)
	  public void performSearchAndClick1stLink() throws InterruptedException
	  {
		  WebElement search= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		  search.sendKeys("facebook");
		  search.submit();
		  Thread.sleep(2000);
		  WebElement fb= driver.findElement(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[1]/div[3]/div/div/div/div/div[1]/a/div[1]"));
		  fb.click();
		  
	  }
	  @Test(priority=4)
	  public void FaceBookPageTitleVerification()

	  {
		 String str1 = driver.getTitle();
		 System.out.println(str1);
		 String str2="Sign up for Facebook | Facebook";
		 if(str1.equals(str2)) {
			 System.out.println("same");
		 }
		 
	  }
}
