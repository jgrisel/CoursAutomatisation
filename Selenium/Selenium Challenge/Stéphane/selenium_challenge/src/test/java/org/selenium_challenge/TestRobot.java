package org.selenium_challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestRobot {
	
	@Test
	public void RPAChallenge() throws FileNotFoundException, IOException {
		/*System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rpachallenge.com/");*/
		
        System.setProperty("webdriver.gecko.driver","src/main/resources/driver/geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.rpachallenge.com/");
             
    // Utilisation du .properties
    Properties propertyJDD = new Properties();
    propertyJDD.load(new FileInputStream("src/main/resources/JDD/RPA.properties")); 
    
	// Instance de page
	RPAForms rpaForms = PageFactory.initElements(driver2,RPAForms.class);
	assertTrue(rpaForms.elementsPresents());
	System.out.println("Tous les éléments sont présents");
	
	// Remplissage des 10 formulaires
	rpaForms.go();
	for (int i=1; i<11; i++) {
		rpaForms.formInputs(
			propertyJDD.getProperty("role"+i),
			propertyJDD.getProperty("company_name"+i),
			propertyJDD.getProperty("first_name"+i),
			propertyJDD.getProperty("phone"+i),
			propertyJDD.getProperty("adress"+i),
			propertyJDD.getProperty("email"+i),
			propertyJDD.getProperty("last_name"+i)
			);
		
		}
	}
}	
	
	/*
	assertEquals(propertyJDD.getProperty("last_name"+i), rpaForms.labelLastName.getText());
	assertEquals(propertyJDD.getProperty("company_name"+i), rpaForms.labelCompanyName.getText());
	assertEquals(propertyJDD.getProperty("first_name"+i), rpaForms.labelFirstName.getText());
	assertEquals(propertyJDD.getProperty("phone"+i), rpaForms.labelPhone.getText());
	assertEquals(propertyJDD.getProperty("adress"+i), rpaForms.labelAdress.getText());
	assertEquals(propertyJDD.getProperty("email"+i), rpaForms.labelEmail.getText());
	*/		
	
	/** Plusieurs classes**/
	/*MainPage mainPage = PageFactory.initElements();
	mainPage.go();
	for (int i=0; i<11; i++) {
		mainPage.formInputs(
			propertyJDD.getProperty("role"+i),
			propertyJDD.getProperty("company_name"+i),
			propertyJDD.getProperty("first_name"+i),
			propertyJDD.getProperty("phone"+i),
			propertyJDD.getProperty("adress"+i),
			propertyJDD.getProperty("email"+i),
			propertyJDD.getProperty("last_name"+i));
		}
	}*/

