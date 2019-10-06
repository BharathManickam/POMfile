package pages;

import base.ProjectSpecificClass;

public class MyLeadsPage extends ProjectSpecificClass {

	public CreateLeadPage clickCreateLead(){
		driver.findElementByXPath("//a[@href='/crmsfa/control/createLeadForm']").click();
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeads(){
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();
	}
}
