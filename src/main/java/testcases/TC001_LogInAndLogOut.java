package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LogInAndLogOut extends ProjectMethods{
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC001_LogInAndLogOut";
		testDescription = "Login and Logout (positive)";
		category="smoke";
		authors = "sarath";
		dataSheetName = "TC001_Login";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInAndLogOut(String uName,String pwd/*,String vName*/) {
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		//.verifyLoggedInName(vName)
		.clickLogOut();
		
	}

}
