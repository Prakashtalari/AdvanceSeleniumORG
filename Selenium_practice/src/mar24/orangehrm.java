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

import com.gargoylesoftware.css.dom.Property;

public class orangehrm 
{
	WebDriver driver;
	Properties con;
	
	@BeforeTest
	public  void  setup() throws Throwable
	{
		con = new Properties();
		con.load(new FileInputStream("OR.properties"));
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(con.getProperty("url"));
		
	}
	@Test
	public void Admintest()
	{
		driver.findElement(By.xpath(con.getProperty("objuser"))).sendKeys("Enteruser");
		driver.findElement(By.xpath(con.getProperty("objpass"))).sendKeys("Enterpass");
		driver.findElement(By.xpath(con.getProperty("objloginbtn"))).click();
		
		String Expected_Title = "OrangeHRM";
		String Actula_Title  = driver.getTitle();
		if (Expected_Title.equalsIgnoreCase(Actula_Title)) 
		{
			Reporter.log("Admin Login Success::"+Expected_Title+"   "+Actula_Title,true);
			
		}else {
			Reporter.log("Admin Login fail::"+Expected_Title+"   "+Actula_Title,true);
		}
	}
	@AfterTest
	public void CloseApp()
	{
		driver.close();
	}
}
