import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Useridpwdtask {
	WebDriver driver;
	//user id: mngr319998
	// pwd: UjazAvE 

  @Test
  public void True() throws InterruptedException {
	  
	WebElement user = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
	user.sendKeys("mngr319998");
	WebElement pwd = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	pwd.sendKeys("UjazAvE");
	WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	login.click();
	Thread.sleep(2000);
  }
  
  
  @Test
  public void TrueFalse() throws InterruptedException {
	  
	WebElement user = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
	user.sendKeys("mngr");
	WebElement pwd = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	pwd.sendKeys("UjazAvE");
	WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	login.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
  }
  
  @Test
  public void FalseTrue() throws InterruptedException {
	  
	WebElement user = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
	user.sendKeys("mngr319998");
	WebElement pwd = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	pwd.sendKeys("1234556");
	WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	login.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
  }
  
  @Test
  public void False() throws InterruptedException {
	  
	WebElement user = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
	user.sendKeys("mngr");
	WebElement pwd = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	pwd.sendKeys("1234556");
	WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	login.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  	System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
  }

}
