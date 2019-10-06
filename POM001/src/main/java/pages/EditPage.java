package pages;

import base.ProjectSpecificClass;

public class EditPage extends ProjectSpecificClass {

	public EditPage enterCompanyname(){
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("DCKAP");
		return this;
	}
	
	public EditPage enterDepartmentName(){
		driver.findElementByName("departmentName").sendKeys("Development");
		return this;
	}
	
	public EditPage enterProfileTitle(){
		driver.findElementByName("generalProfTitle").sendKeys("Developer");
		return this;
	}
	
	public ViewLeadPage clickUpdate(){
		driver.findElementByXPath("//input[@type='submit']").click();
		return new ViewLeadPage();
	}
	
}
