package org.selenium_challenge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class iFrames {
	@FindBy(xpath = "//input[@ng-reflect-name='labelRole']")
	WebElement labelRole;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelCompanyName']")
	WebElement labelCompanyName;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelFirstName']")
	WebElement labelFirstName;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelPhone']")
	WebElement labelPhone;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelAddress']")
	WebElement labelAddress;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelLastName']")
	WebElement labelLastName;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelEmail']")
	WebElement labelEmail;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	
	
	public void formInputs(String r, String cn, String fn, String p, String ad, String em, String ln) {
			labelRole.sendKeys(r);
			labelCompanyName.sendKeys(cn);
			labelFirstName.sendKeys(fn);
			labelPhone.sendKeys(p);
			labelAddress.sendKeys(ad);
			labelEmail.sendKeys(em);
			labelLastName.sendKeys(ln);
			submit.click();
	}
	
}
