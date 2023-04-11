package TestCases;

import Utiles.AppUtiles;
import librery.login;

public class Adminlogintestwithvaliddata extends AppUtiles
{

	public static void main(String[] args) 
	{
    AppUtiles.launchapp("http://orangehrm.qedgetech.com");
		
		login lp = new login();
		lp.Adminlogin("Admin", "Qedge123!@#");
		
	boolean res =lp.Adminmoduledisplayed();
	
	if (res) {
		System.out.println("Admin Module displayed test pass");
	}else {
		System.out.println("Admin Module Not displayed test fail");
	}

	lp.Logout();
	
	AppUtiles.closeapp();
	
		
		
		
	}


	

}
