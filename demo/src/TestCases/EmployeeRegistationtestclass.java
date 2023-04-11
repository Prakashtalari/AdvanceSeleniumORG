package TestCases;

import Utiles.AppUtiles;
import librery.EmployeeRegistation;
import librery.login;

public class EmployeeRegistationtestclass extends AppUtiles 
{

	public static void main(String[] args) 
	{
		AppUtiles.launchapp("http://orangehrm.qedgetech.com");
		
		login lp = new login();
		lp.Adminlogin("Admin","Qedge123!@#");
		
		
		EmployeeRegistation emp = new EmployeeRegistation();
	boolean res = 	emp.AddEmployee("navya", "Demo");
	if (res) {
		System.out.println("Employee Registation Test Pass");
	}else {
		System.out.println("Employee Registation Test Fail");
	}	
		
	lp.Logout();
	
	AppUtiles.closeapp();
		
	

	}

}
