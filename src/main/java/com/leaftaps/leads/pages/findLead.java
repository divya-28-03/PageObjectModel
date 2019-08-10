package com.leaftaps.leads.pages;

import org.openqa.selenium.interactions.Actions;

import com.leaftaps.base.ProjectSpecificMethods;

public class findLead extends ProjectSpecificMethods{
	
	public findLead(){
	}
	
	
	public findLead fName(String data)
	{
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(data);
	return this;
	}
	
	public findLead lead() 
	{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		return this;
	}
	public viewLead first()
	{
		//driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10218'])[3]").click();
		//return new viewLead();
		//Actions builder=new Actions(driver);
		//builder.click(driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10218'])[3]")).perform();
		driver.findElementByLinkText("10218").click();
		return new viewLead();
	}
	

}


