package challenge_selenium;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChallengeTest {

	@Test
	
	public void test() throws FileNotFoundException, IOException {
		Properties propertyJDD = new Properties();
    	propertyJDD.load(new FileInputStream("C:\\Users\\Formation\\eclipse-workspace\\challenge_selenium\\src\\main\\resources\\JDD\\jdd.properties"));

    	
    	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Formation\\eclipse-workspace\\projet_selenium\\projet_selenium\\src\\main\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();             
        driver.manage().window().maximize();
     
        
        //accès à l'url de l'app
        driver.get("https://www.rpachallenge.com/");
        
        
        WebElement start = driver.findElement(By.xpath("//*[@class=\"waves-effect col s12 m12 l12 btn-large uiColorButton\"]"));
        start.click();
        
        
        WebElement fname = driver.findElement(By.xpath("//*[@ng-reflect-name=\"labelFirstName\"]"));
        fname.sendKeys(propertyJDD.getProperty("fName1"));
        
        WebElement lname = driver.findElement(By.xpath("//*[@ng-reflect-name=\"labelLastName\"]"));
        lname.sendKeys(propertyJDD.getProperty("lName1"));
        
        WebElement cname = driver.findElement(By.xpath("//*[@ng-reflect-name=\"labelCompanyName\"]"));
        cname.sendKeys(propertyJDD.getProperty("cName1"));
        
        WebElement rcomp = driver.findElement(By.xpath("//*[@ng-reflect-name=\"labelRole\"]"));
        rcomp.sendKeys(propertyJDD.getProperty("rComp1"));
        
        WebElement address = driver.findElement(By.xpath("//*[@ng-reflect-name=\"labelAddress\"]"));
        address.sendKeys(propertyJDD.getProperty("address1"));
        
        WebElement email = driver.findElement(By.xpath("//*[@ng-reflect-name=\"labelEmail\"]"));
        email.sendKeys(propertyJDD.getProperty("email1"));
        
        WebElement pnum = driver.findElement(By.xpath("//*[@ng-reflect-name=\"labelPhone\"]"));
        pnum.sendKeys(propertyJDD.getProperty("pNum1"));
        
        WebElement submit = driver.findElement(By.xpath("//*[@class=\"btn uiColorButton\"]"));
        submit.click();
        

        fname = driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following-sibling::input"));
        fname.sendKeys(propertyJDD.getProperty("fName2"));
        lname = driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input"));
        lname.sendKeys(propertyJDD.getProperty("lName2"));
        cname = driver.findElement(By.xpath("//label[contains(text(),'Company Name')]/following-sibling::input"));
        cname.sendKeys(propertyJDD.getProperty("cName2"));
        rcomp = driver.findElement(By.xpath("//label[contains(text(),'Role in Company')]/following-sibling::input"));
        rcomp.sendKeys(propertyJDD.getProperty("rComp2"));
        address = driver.findElement(By.xpath("//label[contains(text(),'Address')]/following-sibling::input"));
        address.sendKeys(propertyJDD.getProperty("address2"));
        email = driver.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input"));
        email.sendKeys(propertyJDD.getProperty("email2"));
        pnum = driver.findElement(By.xpath("//label[contains(text(),'Phone Number')]/following-sibling::input"));
        pnum.sendKeys(propertyJDD.getProperty("pNum2"));
        submit.click();
        
        
        fname = driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following-sibling::input"));
        fname.sendKeys(propertyJDD.getProperty("fName3"));
        lname = driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input"));
        lname.sendKeys(propertyJDD.getProperty("lName3"));
        cname = driver.findElement(By.xpath("//label[contains(text(),'Company Name')]/following-sibling::input"));
        cname.sendKeys(propertyJDD.getProperty("cName3"));
        rcomp = driver.findElement(By.xpath("//label[contains(text(),'Role in Company')]/following-sibling::input"));
        rcomp.sendKeys(propertyJDD.getProperty("rComp3"));
        address = driver.findElement(By.xpath("//label[contains(text(),'Address')]/following-sibling::input"));
        address.sendKeys(propertyJDD.getProperty("address3"));
        email = driver.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input"));
        email.sendKeys(propertyJDD.getProperty("email3"));
        pnum = driver.findElement(By.xpath("//label[contains(text(),'Phone Number')]/following-sibling::input"));
        pnum.sendKeys(propertyJDD.getProperty("pNum3"));
        submit.click();

        fname = driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following-sibling::input"));
        fname.sendKeys(propertyJDD.getProperty("fName4"));
        lname = driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input"));
        lname.sendKeys(propertyJDD.getProperty("lName4"));
        cname = driver.findElement(By.xpath("//label[contains(text(),'Company Name')]/following-sibling::input"));
        cname.sendKeys(propertyJDD.getProperty("cName4"));
        rcomp = driver.findElement(By.xpath("//label[contains(text(),'Role in Company')]/following-sibling::input"));
        rcomp.sendKeys(propertyJDD.getProperty("rComp4"));
        address = driver.findElement(By.xpath("//label[contains(text(),'Address')]/following-sibling::input"));
        address.sendKeys(propertyJDD.getProperty("address4"));
        email = driver.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input"));
        email.sendKeys(propertyJDD.getProperty("email4"));
        pnum = driver.findElement(By.xpath("//label[contains(text(),'Phone Number')]/following-sibling::input"));
        pnum.sendKeys(propertyJDD.getProperty("pNum4"));
        submit.click();
        
        fname = driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following-sibling::input"));
        fname.sendKeys(propertyJDD.getProperty("fName5"));
        lname = driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input"));
        lname.sendKeys(propertyJDD.getProperty("lName5"));
        cname = driver.findElement(By.xpath("//label[contains(text(),'Company Name')]/following-sibling::input"));
        cname.sendKeys(propertyJDD.getProperty("cName5"));
        rcomp = driver.findElement(By.xpath("//label[contains(text(),'Role in Company')]/following-sibling::input"));
        rcomp.sendKeys(propertyJDD.getProperty("rComp5"));
        address = driver.findElement(By.xpath("//label[contains(text(),'Address')]/following-sibling::input"));
        address.sendKeys(propertyJDD.getProperty("address5"));
        email = driver.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input"));
        email.sendKeys(propertyJDD.getProperty("email5"));
        pnum = driver.findElement(By.xpath("//label[contains(text(),'Phone Number')]/following-sibling::input"));
        pnum.sendKeys(propertyJDD.getProperty("pNum5"));
        submit.click();
        
        fname = driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following-sibling::input"));
        fname.sendKeys(propertyJDD.getProperty("fName6"));
        lname = driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input"));
        lname.sendKeys(propertyJDD.getProperty("lName6"));
        cname = driver.findElement(By.xpath("//label[contains(text(),'Company Name')]/following-sibling::input"));
        cname.sendKeys(propertyJDD.getProperty("cName6"));
        rcomp = driver.findElement(By.xpath("//label[contains(text(),'Role in Company')]/following-sibling::input"));
        rcomp.sendKeys(propertyJDD.getProperty("rComp6"));
        address = driver.findElement(By.xpath("//label[contains(text(),'Address')]/following-sibling::input"));
        address.sendKeys(propertyJDD.getProperty("address6"));
        email = driver.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input"));
        email.sendKeys(propertyJDD.getProperty("email6"));
        pnum = driver.findElement(By.xpath("//label[contains(text(),'Phone Number')]/following-sibling::input"));
        pnum.sendKeys(propertyJDD.getProperty("pNum6"));
        submit.click();
        
        fname = driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following-sibling::input"));
        fname.sendKeys(propertyJDD.getProperty("fName7"));
        lname = driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input"));
        lname.sendKeys(propertyJDD.getProperty("lName7"));
        cname = driver.findElement(By.xpath("//label[contains(text(),'Company Name')]/following-sibling::input"));
        cname.sendKeys(propertyJDD.getProperty("cName7"));
        rcomp = driver.findElement(By.xpath("//label[contains(text(),'Role in Company')]/following-sibling::input"));
        rcomp.sendKeys(propertyJDD.getProperty("rComp7"));
        address = driver.findElement(By.xpath("//label[contains(text(),'Address')]/following-sibling::input"));
        address.sendKeys(propertyJDD.getProperty("address7"));
        email = driver.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input"));
        email.sendKeys(propertyJDD.getProperty("email7"));
        pnum = driver.findElement(By.xpath("//label[contains(text(),'Phone Number')]/following-sibling::input"));
        pnum.sendKeys(propertyJDD.getProperty("pNum7"));
        submit.click();
        
        fname = driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following-sibling::input"));
        fname.sendKeys(propertyJDD.getProperty("fName8"));
        lname = driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input"));
        lname.sendKeys(propertyJDD.getProperty("lName8"));
        cname = driver.findElement(By.xpath("//label[contains(text(),'Company Name')]/following-sibling::input"));
        cname.sendKeys(propertyJDD.getProperty("cName8"));
        rcomp = driver.findElement(By.xpath("//label[contains(text(),'Role in Company')]/following-sibling::input"));
        rcomp.sendKeys(propertyJDD.getProperty("rComp8"));
        address = driver.findElement(By.xpath("//label[contains(text(),'Address')]/following-sibling::input"));
        address.sendKeys(propertyJDD.getProperty("address8"));
        email = driver.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input"));
        email.sendKeys(propertyJDD.getProperty("email8"));
        pnum = driver.findElement(By.xpath("//label[contains(text(),'Phone Number')]/following-sibling::input"));
        pnum.sendKeys(propertyJDD.getProperty("pNum8"));
        submit.click();
        
        fname = driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following-sibling::input"));
        fname.sendKeys(propertyJDD.getProperty("fName9"));
        lname = driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input"));
        lname.sendKeys(propertyJDD.getProperty("lName9"));
        cname = driver.findElement(By.xpath("//label[contains(text(),'Company Name')]/following-sibling::input"));
        cname.sendKeys(propertyJDD.getProperty("cName9"));
        rcomp = driver.findElement(By.xpath("//label[contains(text(),'Role in Company')]/following-sibling::input"));
        rcomp.sendKeys(propertyJDD.getProperty("rComp9"));
        address = driver.findElement(By.xpath("//label[contains(text(),'Address')]/following-sibling::input"));
        address.sendKeys(propertyJDD.getProperty("address9"));
        email = driver.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input"));
        email.sendKeys(propertyJDD.getProperty("email9"));
        pnum = driver.findElement(By.xpath("//label[contains(text(),'Phone Number')]/following-sibling::input"));
        pnum.sendKeys(propertyJDD.getProperty("pNum9"));
        submit.click();
        
        fname = driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following-sibling::input"));
        fname.sendKeys(propertyJDD.getProperty("fName10"));
        lname = driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following-sibling::input"));
        lname.sendKeys(propertyJDD.getProperty("lName10"));
        cname = driver.findElement(By.xpath("//label[contains(text(),'Company Name')]/following-sibling::input"));
        cname.sendKeys(propertyJDD.getProperty("cName10"));
        rcomp = driver.findElement(By.xpath("//label[contains(text(),'Role in Company')]/following-sibling::input"));
        rcomp.sendKeys(propertyJDD.getProperty("rComp10"));
        address = driver.findElement(By.xpath("//label[contains(text(),'Address')]/following-sibling::input"));
        address.sendKeys(propertyJDD.getProperty("address10"));
        email = driver.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input"));
        email.sendKeys(propertyJDD.getProperty("email10"));
        pnum = driver.findElement(By.xpath("//label[contains(text(),'Phone Number')]/following-sibling::input"));
        pnum.sendKeys(propertyJDD.getProperty("pNum10"));
        submit.click();
        
        
	}

	

}
