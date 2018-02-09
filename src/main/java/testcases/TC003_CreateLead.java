package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC003_CreateLead";
		testDescription = "Create Lead (positive)";
		category="sanity";
		authors = "sarath";
		dataSheetName = "TC003_CreateLead";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String uname, String pwd,String compName,String fName,String lName,String pHone , String eMail) {
		
		new LoginPage(driver, test)
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.verifyLoggedInName("Demo")
		.clickCRM()
		.clickLeads()
		.clickCreateLead()
		.compName(compName)
		.firstName(fName)
		.lastName(lName)
		.pHone(pHone)
		.eMail(eMail)
		.dropDownSource()
		.parentAccount()
		.clickDemoAccount1()
		.clickCreateLeadButton()
		.printCompName();
		
		
		
	}

}
