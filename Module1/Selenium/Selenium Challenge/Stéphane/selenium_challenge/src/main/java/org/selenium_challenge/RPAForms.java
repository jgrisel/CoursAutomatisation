package org.selenium_challenge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RPAForms {
	
	@FindBy(xpath = "//button")
	WebElement start;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelRole']")
	WebElement labelRole;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelCompanyName']")
	WebElement labelCompanyName;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelFirstName']")
	WebElement labelFirstName;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelPhone']")
	WebElement labelPhone;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelAddress']")
	WebElement labelAdress;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelLastName']")
	WebElement labelLastName;
	
	@FindBy(xpath = "//input[@ng-reflect-name='labelEmail']")
	WebElement labelEmail;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//ul[@id='dropdown1']")
	WebElement language;
	
	public void go() {
		start.click();
	}
	
	public void formInputs(String r, String cn, String fn, String p, String ad, String em, String ln) {
			labelRole.sendKeys(r);
			labelCompanyName.sendKeys(cn);
			labelFirstName.sendKeys(fn);
			labelPhone.sendKeys(p);
			labelAdress.sendKeys(ad);
			labelEmail.sendKeys(em);
			labelLastName.sendKeys(ln);
			submit.click();
	}
	
	public boolean elementsPresents() {
        boolean presence;
        if (start.isDisplayed()
        && labelRole.isDisplayed()
        && labelCompanyName.isDisplayed()
        && labelFirstName.isDisplayed()
        && labelPhone.isDisplayed()
        && labelAdress.isDisplayed()
        && labelLastName.isDisplayed()
        && labelEmail.isDisplayed()
        && submit.isDisplayed()) {
            presence=true;
        }
        else {
            presence=false;
        }
        return presence;
    }
}
