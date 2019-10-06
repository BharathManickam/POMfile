package pages;

import base.ProjectSpecificClass;

public class ViewLeadPage extends ProjectSpecificClass {
	
	public ViewLeadPage verifyFirstName(){
		System.out.println(driver.findElementById("viewLead_firstName_sp").getText());
		return this;
	}
	
	public EditPage clickEditButton(){
		driver.findElementByLinkText("Edit").click();
		return new EditPage();
	}
	
	public void verifyCompanyName(){
		String companyName = driver.findElementById("viewLead_companyName_sp").getText();
		if(companyName.contains("DCKAP")){
			
			System.out.println("Yes the given text is there");
		}
		else{
			System.out.println("No the text is different");
		}
	}

}
