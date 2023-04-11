package librery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utiles.AppUtiles;

public class newuserRegistation extends AppUtiles
{
	public boolean  adduser(String role,String empname,String uname,String pword) throws InterruptedException
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		Select rolelist = new Select(driver.findElement(By.id("systemUser_userType")));
		rolelist.selectByVisibleText(role);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pword);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pword);
		
		Thread.sleep(5000);
		driver.findElement(By.name("btnSave")).click();
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(uname);
		
		driver.findElement(By.id("searchBtn")).click();
		
	WebElement usertable=	driver.findElement(By.id("resultTable"));
	List<WebElement> rows,cols;
	rows = usertable.findElements(By.tagName("tr"));
	boolean flag = false;
	for(int i=1;i<rows.size();i++)
	{
	 cols=	rows.get(i).findElements(By.tagName("td"));
	 {
		 if (cols.get(i).getText().equals(uname))
		 {
			 flag =true;
			 break;
			
		}
	 }
	}
	return flag;	
	}

}
