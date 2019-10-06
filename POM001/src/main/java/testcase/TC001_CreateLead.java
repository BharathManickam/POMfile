package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificClass;
import pages.LoginPage;

public class TC001_CreateLead extends ProjectSpecificClass {
	
	@BeforeTest
	public void setData(){
		excelFileName="TC001";
	}
	
	
	@Test(dataProvider="CreateLeadData")
	public void createLead(String username, String password, String firstname, String lastname, String companyname){
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.enterCompanyName(companyname)
		.clickCreateLead()
		.verifyFirstName();
	}

}
