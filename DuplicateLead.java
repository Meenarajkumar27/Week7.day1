package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLead extends ProjectSpecificMethods  {
	@BeforeTest
	public void getfilename() {
		Sheetname ="DuplicateLead";
	}
	@Test(dataProvider="getdata")
	public void createLead(String Username,String Password,String email) throws InterruptedException {
		new LoginPage(driver).enterUserName(Username).enterPassword(Password).clickSubmit().clickCRMLink().clickMyLead().clickFindLead().
		clickEmailTab().enterEmailId(email).clickFindLeadsButton().getAndclickFirstnamefromLeadListTable().clickDuplicateButton().getFirstName().
		clickCreateLead().verifyDuplicateLeadisCreated();

}
}
