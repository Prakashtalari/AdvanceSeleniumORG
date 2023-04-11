package librery;

import org.openqa.selenium.By;

import Utiles.AppUtiles;

public class login extends AppUtiles
{
	
public void Adminlogin(String uname,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
	}
public boolean  Adminmoduledisplayed()
{
if (driver.findElement(By.linkText("Admin")).isDisplayed()) 
{
	return true;
}else 
{
	return false;
	
}
}
	
public void Logout()
{
driver.findElement(By.partialLinkText("Welcome Qedge")).click();
driver.findElement(By.linkText("Logout")).click();

}
public boolean isErrmsgdisplayed()
{

      String errmsg = 	driver.findElement(By.id("spanMessage")).getText();
	if (errmsg.toLowerCase().contains("invalid")) 
	{
		return true;

	}else {
		return false;
	}
}
	public boolean isEmpModuledisplayed()
	{
		try {
			if (driver.findElement(By.linkText("Admin")).isDisplayed()) 
			{
				return false;
			}
		} catch (Exception e) {
			
		}
		return false;
	}
	
}
