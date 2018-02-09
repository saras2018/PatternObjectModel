package testcases;

import org.testng.annotations.Test;

public class TC005_DuplicateLead{ //extends ProjectMethods {
/*	
	@BeforeClass
	public void setData() {
		testCaseName = "TC005_DuplicateLead";
		testDescription = "Duplicate Lead (positive)";
		category="sanity";
		authors = "saraswathi";
		dataSheetName = "TC005_DuplicateLead";
		browserName ="chrome";
	}
*/
	@Test(dataProvider="fetchData")
	public void editLead(String uname, String pwd) {
		/*
		  new LoginPage(driver, test)
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRM()
		.clickLeads()
		.clickFindLeads()
		.clickEMailTab()
		.enterEMail("xyz")
		.clickFindLeadsBtn()
		.clickFirstResult(new ViewLeadPage(driver, test));
		  new ViewLeadPage(driver, test)
		.clickDuplicateLeadBtn()
		.clickCreateLeadBtn()
		.closeBrowser();*/
		
		
	}
}
