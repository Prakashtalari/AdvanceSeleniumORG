package TestCases;

import org.seleniumhq.jetty9.server.Authentication.User;

import Utiles.AppUtiles;
import librery.login;
import librery.newuserRegistation;

public class UserRegistationTestCase extends AppUtiles
{

	public static void main(String[] args) throws InterruptedException 
	{
		AppUtiles.launchapp("http://orangehrm.qedgetech.com");
		
		login lp = new login();
		lp.Adminlogin("Admin","Qedge123!@#");
		
		newuserRegistation  us = new newuserRegistation();
	boolean res =	us.adduser("ESS","navya Demo","Navya1","Qedge123!@#");
if (res) {
	System.out.println("New User Registation Successfully ,Testpass");
}else {
	System.out.println("new User Registation notSuccessfully ,TestFail");
}
	lp.Logout();
	AppUtiles.closeapp();
	
	}

}
