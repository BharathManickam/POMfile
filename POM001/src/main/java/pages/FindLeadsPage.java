package pages;

import base.ProjectSpecificClass;

public class FindLeadsPage extends ProjectSpecificClass {
	
	public FindLeadsPage enterFirstName(){
		driver.findElementByXPath("((//label[text()='First name:'])[3]/following::input)[1]").sendKeys("Thrinesh");
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButtonandSleep() throws InterruptedException{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		return this;
	}

	public ViewLeadPage clickFirstResult(){
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
		return new ViewLeadPage();
	}
}
