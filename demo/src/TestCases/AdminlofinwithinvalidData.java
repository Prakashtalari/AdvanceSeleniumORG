package TestCases;

import Utiles.AppUtiles;
import librery.login;

public class AdminlofinwithinvalidData extends AppUtiles
{

	public static void main(String[] args) 
	{
		AppUtiles.launchapp("http://orangehrm.qedgetech.com");
		
		login lp = new login();
		lp.Adminlogin("abc", "xyz");
		
	boolean res =	lp.isErrmsgdisplayed();
if (res) {
	
	System.out.println("system Should displayed Appropriate error message ,test pass");
}else {
	System.out.println("System notShould displayed Appropriate error message ,test fail");
}
AppUtiles.closeapp();
	}

	
}
