package testcases;

import org.openqa.selenium.NoSuchSessionException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.EditLeadPage;
import pages.FindLeadsPage;
import pages.LoginPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC004_EditLead";
		testDescription = "Edit Lead (positive)";
		category="sanity";
		authors = "saraswathi";
		dataSheetName = "TC004_EditLead";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData",expectedExceptions=NoSuchSessionException.class)
	public void editLead(String uname, String pwd,String frstName,String compName) throws InterruptedException {
		
	     new LoginPage(driver, test)
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRM()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(frstName)
		.clickFindLeadsBtn()
		.clickFirstResult(new EditLeadPage(driver, test) );
	     new ViewLeadPage(driver, test)
		.clickEditBtn()
		.enterCompName(compName)
		.clickUpdate()
		.verifyCompName(compName);
		
		
	}
}
