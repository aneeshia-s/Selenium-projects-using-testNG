import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginusingDB {
	
	WebDriver driver;
	Connection con;
	ResultSet rs;
	
	
  @Test
  public void True() throws ClassNotFoundException, SQLException, InterruptedException {
	  
	  //WEBSITE 
	  WebElement username = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
	  username.sendKeys("fdgghgfhgf");
	  WebElement password = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
	  password.sendKeys("dfgdfg");
	  WebElement login = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
	  login.click();
	  WebElement message = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
	  String msg = message.getText();
	  Thread.sleep(3000);
	  
	  //DATABASE
	  String query = "SELECT message_displayed FROM `login` WHERE username='fdgghgfhgf' AND password='dfgdfg' ";
	  Statement stmt = con.createStatement();	
	  rs= stmt.executeQuery(query);
	  while (rs.next()){
		  String dbmessage = rs.getString(1);
		  Assert.assertEquals(msg, dbmessage);
		  System.out.println(msg);
		  }
	  }
  
  
	
  @Test
  public void False() throws ClassNotFoundException, SQLException, InterruptedException {
	  
	  //WEBSITE 
	  WebElement username = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
	  username.sendKeys("fdgghgfhgf");
	  WebElement password = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
	  password.sendKeys("dfgdfgh");
	  WebElement login = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
	  login.click();
	  WebElement message = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
	  String msg = message.getText();
	  Thread.sleep(3000);
	  
	  //DATABASE
	  String query = "SELECT message_displayed FROM `login` WHERE username='fdgghgfhgf' AND password='dfgdfgh' ";
	  Statement stmt = con.createStatement();	
	  rs= stmt.executeQuery(query);
	  while (rs.next()){
		  String dbmessage = rs.getString(1);
		  Assert.assertEquals(msg, dbmessage);
		  System.out.println(msg);
		  }
	  }
  
  
  @BeforeMethod
  public void beforeMethod() throws SQLException, ClassNotFoundException {
	  
	  	System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://thedemosite.co.uk/login.php");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		String dburl = "jdbc:mysql://localhost:3306/aneeshia";
		String user= "root";
		String pwd ="";
		con = DriverManager.getConnection(dburl, user, pwd);
		Class.forName("com.mysql.jdbc.Driver");	
  }
}
