package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_LogInForFailure extends ProjectMethods{
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC002_LogInForFailure";
		testDescription = "Login (negative)";
		category="sanity";
		authors = "gayathri";
		dataSheetName = "TC002_LoginFailure";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInAndLogOut(String uName,String pwd,String errMsg) {
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLoginFailure()
		.verifyErrMsg(errMsg);
		
	}

}
