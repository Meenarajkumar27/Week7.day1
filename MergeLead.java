package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class MergeLead extends ProjectSpecificMethods  {
	@BeforeTest
	public void getfilename() {
		Sheetname ="MergeLead";
	}
	@Test(dataProvider="getdata")
	public void createLead(String Username,String Password,String fname1,String fname2) throws InterruptedException {
		new LoginPage(driver).enterUserName(Username).enterPassword(Password).clickSubmit().clickCRMLink().clickMyLead().clickMergeLead().
		selectFromLead(fname1).selectToLead(fname2).clickMergeButton().clickFindLead().enterLeadID().clickFindLeadsButton().verfiyNoRecordIsDisplayed();


}
}
