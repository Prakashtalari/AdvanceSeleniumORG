package mar24;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class property_File 
    {
    	WebDriver driver;
    	Properties con;
   @BeforeTest
   public void setup() throws Throwable
   {
	   con=new Properties();
	   con.load(new FileInputStream("OR.properties"));
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(con.getProperty("url"));
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
   }
   
   @Test
   public void verifylogin()
   {
	   driver.findElement(By.xpath(con.getProperty("objreset"))).click();
	   driver.findElement(By.xpath(con.getProperty("objuser"))).sendKeys(con.getProperty("Enteruser"));
	   driver.findElement(By.xpath(con.getProperty("objpass"))).sendKeys(con.getProperty("Enterpass"));
	   driver.findElement(By.xpath(con.getProperty("objloginbtn"))).click();
	   
	   String Expected_Title = "Dashboard « Stock Accounting";
	   String Actual_Title = driver.getTitle();
	   if (Expected_Title.equalsIgnoreCase(Actual_Title))
	   {
		   Reporter.log("Login success::"+Expected_Title+"   "+Actual_Title,true);
		
	}else {
		Reporter.log("Login Success::"+Expected_Title+"     "+Actual_Title,true);
	}
	   
   }
	 @AfterTest
	 public void tearDown()
	 {
		driver.quit(); 
	 }
	   
   
   
   
   
   
   
   
   
   
}
