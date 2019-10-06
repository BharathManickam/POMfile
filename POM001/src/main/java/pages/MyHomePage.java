package pages;

import base.ProjectSpecificClass;

public class MyHomePage extends ProjectSpecificClass{
	
	public MyLeadsPage clickLeads(){
		driver.findElementByXPath("//a[text()='Leads']").click();
		return new MyLeadsPage();
	}

}
