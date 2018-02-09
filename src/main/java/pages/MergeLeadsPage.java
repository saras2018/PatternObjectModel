package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages.FindLeadsPage;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods {
	
	public MergeLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement eleFromLeadImage;
	public FindLeadsPage clickFromLeadImage(){
		click(eleFromLeadImage);
		switchToWindow(1);
		return new FindLeadsPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleToLeadImage;
	public FindLeadsPage clickToLeadImage(){
		this.click(eleToLeadImage);
		switchToWindow(1);
		return new FindLeadsPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='buttonDangerous']")
	private WebElement eleMergeBtn;
	public ViewLeadPage clickMergeBtn(){
		click(eleMergeBtn);
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
}
