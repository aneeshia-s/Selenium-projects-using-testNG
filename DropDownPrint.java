import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
public class DropDownPrint {
	WebDriver driver;
			
  @Test
  public void f() {
	  
	  Select oselect = new Select(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")));
	  List <WebElement> elementCount = oselect.getOptions();
	  int isize = elementCount.size();
	  for(int i=0; i< isize ;i++) {
			String Options= elementCount.get(i).getText();
			System.out.println(Options);
		}  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://demo.guru99.com/test/newtours/register.php\n");
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
