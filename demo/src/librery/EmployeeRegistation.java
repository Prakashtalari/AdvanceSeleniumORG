package librery;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import Utiles.AppUtiles;

public class EmployeeRegistation extends AppUtiles
{
	
	public boolean AddEmployee(String empname,String lname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.name("firstName")).sendKeys(empname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
String empid=	driver.findElement(By.id("employeeId")).getAttribute("Value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		
		driver.findElement(By.id("searchBtn")).click();
	    
	WebElement emptable =driver.findElement(By.id("resultTable"));
	List<WebElement> rows, clos;
		
		rows=emptable.findElements(By.tagName("tr"));
		boolean flag = false;
		for(int i=1;i<rows.size();i++)
		{
			clos = rows.get(i).findElements(By.tagName("td"));
			if (clos.get(i).getText().equalsIgnoreCase(empid))
			{
				flag = true;
				break;
				
			}
		}		
		
		return flag;
	}	
	public boolean AddEmployee(String empname,String mname, String lname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.name("firstName")).sendKeys(empname);
		driver.findElement(By.name("middleName")).sendKeys(mname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
String empid=	driver.findElement(By.id("employeeId")).getAttribute("Value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		
		driver.findElement(By.id("searchBtn")).click();
	    
	WebElement emptable =driver.findElement(By.id("resultTable"));
	List<WebElement> rows, clos;
		
		rows=emptable.findElements(By.tagName("tr"));
		boolean flag = false;
		for(int i=1;i<rows.size();i++)
		{
			clos = rows.get(i).findElements(By.tagName("td"));
			if (clos.get(i).getText().equalsIgnoreCase(empid))
			{
				flag = true;
				break;
				
			}
		}		
		
		return flag;
	}	
	
	

}
