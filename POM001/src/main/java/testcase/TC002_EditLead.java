package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificClass;
import pages.LoginPage;

public class TC002_EditLead extends ProjectSpecificClass{
	
		
		@BeforeTest
		public void setData(){
			excelFileName="TC001";
		}
		
		@Test(dataProvider="CreateLeadData")
		public void editLead(String username, String password) throws InterruptedException{
			new LoginPage()
			.enterUsername(username)
			.enterPassword(password)
			.clickLogin()
			.clickCRMSFA()
			.clickLeads()
			.clickFindLeads()
			.enterFirstName()
			.clickFindLeadsButtonandSleep()
			.clickFirstResult()
			.clickEditButton()
			.enterCompanyname()
			.enterDepartmentName()
			.enterProfileTitle()
			.clickUpdate()
			.verifyCompanyName();
		}

}
