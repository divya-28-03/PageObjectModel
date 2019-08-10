package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class editLead extends ProjectSpecificMethods {

public editLead(){
	
}
public editLead companyname(String data)
{
	driver.findElementById("updateLeadForm_companyName").clear();
	driver.findElementById("updateLeadForm_companyName").sendKeys(data);
    return this;
}
public viewLead update()
{
	driver.findElementByXPath("//input[@class='smallSubmit']").click();
	return new viewLead();
}

	
	
}
