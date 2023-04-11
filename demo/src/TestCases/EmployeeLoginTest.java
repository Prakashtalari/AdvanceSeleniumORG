package TestCases;

import Utiles.AppUtiles;
import librery.login;

public class EmployeeLoginTest extends AppUtiles
{

	public static void main(String[] args)
	{
		AppUtiles.launchapp("http://orangehrm.qedgetech.com");
		
		login lp = new login();
		lp.Adminlogin("Navya1", "Qedge123!@#");
		
		boolean res = lp.isEmpModuledisplayed();
		if (res) {
			System.out.println("Employee Login Successfully");
		}else {
			System.out.println("Employee Login Unsuccessfully");
		}
	
     lp.Logout();
     
     AppUtiles.closeapp();    

}
 
}
