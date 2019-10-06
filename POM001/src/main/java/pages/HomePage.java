package pages;

import base.ProjectSpecificClass;

public class HomePage extends ProjectSpecificClass{
	
	public LoginPage clickLogout(){
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}
	
	public MyHomePage clickCRMSFA(){
		driver.findElementByXPath("//a[@style='color: black;']").click();
		return new MyHomePage();
	}

}
