package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import pages.MergeLeadsPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC006_MergeLead";
		testDescription = "Merge Lead (positive)";
		category="sanity";
		authors = "saraswathi";
		dataSheetName = "TC006_MergeLead";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void mergeLead(String uname, String pwd) throws InterruptedException {
		
		  new LoginPage(driver, test)
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRM()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadImage()
		.clickFirstResult(new MergeLeadsPage(driver, test));
		  new MergeLeadsPage(driver, test)
		  .clickToLeadImage()
		  .clickResult()
		   .clickMergeBtn()
		  .clickFindLeads()
		  .enterLeadID()
		  .clickFindLeadsBtn()
		  .verifyNoRecordsMessage()
		  .closeBrowser();
		  
				  
				  
		  
		  
				
		
	}
}
