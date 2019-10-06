package pages;

import base.ProjectSpecificClass;

public class CreateLeadPage extends ProjectSpecificClass{
	
	public CreateLeadPage enterFirstName(String firstname){
		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lastname){
		driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
		return this;
	}
	public CreateLeadPage enterCompanyName(String companyName){
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys(companyName);
		return this;
	}
	
	public ViewLeadPage clickCreateLead(){
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		return new ViewLeadPage();
	}
	
	
	
	

}
