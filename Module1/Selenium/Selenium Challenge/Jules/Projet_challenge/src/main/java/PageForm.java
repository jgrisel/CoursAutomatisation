import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class PageForm {
	
	
	
	public String Titledisplayed(WebDriver driver) {
		return(driver.getTitle());		
	}
	
	public void LangSelect(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("/html/body/app-root/div[2]/app-rpa1/div/div[1]/div[1]/div[2]/a")))
		.moveToElement(driver.findElement(By.xpath("/html/body/app-root/div[2]/app-rpa1/div/div[1]/div[1]/div[2]/ul/li[2]/span"))).click().build().perform();
	}
	
	public void StartButton(WebDriver driver) {
	WebElement bouton_Start = driver.findElement(By.xpath("//button"));
	bouton_Start.click();
	}
	
	public void Form1(WebDriver driver, Properties propertyJDD) {
	
	WebElement FN = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelFirstName\" ]"));
    FN.sendKeys(propertyJDD.getProperty("FN1"));
    WebElement LN = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelLastName\" ]"));
    LN.sendKeys(propertyJDD.getProperty("LN1"));
    WebElement CN = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelCompanyName\" ]"));
    CN.sendKeys(propertyJDD.getProperty("CN1"));
    WebElement RIC = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelRole\" ]"));
    RIC.sendKeys(propertyJDD.getProperty("RIC1"));		
    WebElement Adress = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelAddress\" ]"));
    Adress.sendKeys(propertyJDD.getProperty("Address1"));
    WebElement Mail = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelEmail\" ]"));
    Mail.sendKeys(propertyJDD.getProperty("Mail1"));
    WebElement Phone = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelPhone\" ]"));
    Phone.sendKeys(propertyJDD.getProperty("PN1"));
	}
	
	public void SubmitButton(WebDriver driver) {
    WebElement bouton_Submit = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
    bouton_Submit.click();
	}
	
	public void Form2(WebDriver driver, Properties propertyJDD) {
		WebElement FN2 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelFirstName\" ]"));
	    FN2.sendKeys(propertyJDD.getProperty("FN2"));
	    WebElement LN2 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelLastName\" ]"));
	    LN2.sendKeys(propertyJDD.getProperty("LN2"));
	    WebElement CN2 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelCompanyName\" ]"));
	    CN2.sendKeys(propertyJDD.getProperty("CN2"));
	    WebElement RIC2 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelRole\" ]"));
	    RIC2.sendKeys(propertyJDD.getProperty("RIC2"));		
	    WebElement Adress2 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelAddress\" ]"));
	    Adress2.sendKeys(propertyJDD.getProperty("Address2"));
	    WebElement Mail2 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelEmail\" ]"));
	    Mail2.sendKeys(propertyJDD.getProperty("Mail2"));
	    WebElement Phone2 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelPhone\" ]"));
	    Phone2.sendKeys(propertyJDD.getProperty("PN2"));
		}
	
	public void Form3(WebDriver driver, Properties propertyJDD) {
		WebElement FN3 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelFirstName\" ]"));
	    FN3.sendKeys(propertyJDD.getProperty("FN3"));
	    WebElement LN3 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelLastName\" ]"));
	    LN3.sendKeys(propertyJDD.getProperty("LN3"));
	    WebElement CN3 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelCompanyName\" ]"));
	    CN3.sendKeys(propertyJDD.getProperty("CN3"));
	    WebElement RIC3 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelRole\" ]"));
	    RIC3.sendKeys(propertyJDD.getProperty("RIC3"));		
	    WebElement Adress3 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelAddress\" ]"));
	    Adress3.sendKeys(propertyJDD.getProperty("Address3"));
	    WebElement Mail3 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelEmail\" ]"));
	    Mail3.sendKeys(propertyJDD.getProperty("Mail3"));
	    WebElement Phone3 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelPhone\" ]"));
	    Phone3.sendKeys(propertyJDD.getProperty("PN3"));
		}
	
	public void Form4(WebDriver driver, Properties propertyJDD) {
		WebElement FN4 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelFirstName\" ]"));
	    FN4.sendKeys(propertyJDD.getProperty("FN4"));
	    WebElement LN4 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelLastName\" ]"));
	    LN4.sendKeys(propertyJDD.getProperty("LN4"));
	    WebElement CN4 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelCompanyName\" ]"));
	    CN4.sendKeys(propertyJDD.getProperty("CN4"));
	    WebElement RIC4 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelRole\" ]"));
	    RIC4.sendKeys(propertyJDD.getProperty("RIC4"));		
	    WebElement Adress4 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelAddress\" ]"));
	    Adress4.sendKeys(propertyJDD.getProperty("Address4"));
	    WebElement Mail4 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelEmail\" ]"));
	    Mail4.sendKeys(propertyJDD.getProperty("Mail4"));
	    WebElement Phone4 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelPhone\" ]"));
	    Phone4.sendKeys(propertyJDD.getProperty("PN4"));
		}
	
	public void Form5(WebDriver driver, Properties propertyJDD) {
		WebElement FN5 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelFirstName\" ]"));
	    FN5.sendKeys(propertyJDD.getProperty("FN5"));
	    WebElement LN5 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelLastName\" ]"));
	    LN5.sendKeys(propertyJDD.getProperty("LN5"));
	    WebElement CN5 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelCompanyName\" ]"));
	    CN5.sendKeys(propertyJDD.getProperty("CN5"));
	    WebElement RIC5 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelRole\" ]"));
	    RIC5.sendKeys(propertyJDD.getProperty("RIC5"));		
	    WebElement Adress5 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelAddress\" ]"));
	    Adress5.sendKeys(propertyJDD.getProperty("Address5"));
	    WebElement Mail5 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelEmail\" ]"));
	    Mail5.sendKeys(propertyJDD.getProperty("Mail5"));
	    WebElement Phone5 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelPhone\" ]"));
	    Phone5.sendKeys(propertyJDD.getProperty("PN5"));
		}
	
	public void Form6(WebDriver driver, Properties propertyJDD) {
		WebElement FN6 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelFirstName\" ]"));
	    FN6.sendKeys(propertyJDD.getProperty("FN6"));
	    WebElement LN6 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelLastName\" ]"));
	    LN6.sendKeys(propertyJDD.getProperty("LN6"));
	    WebElement CN6 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelCompanyName\" ]"));
	    CN6.sendKeys(propertyJDD.getProperty("CN6"));
	    WebElement RIC6 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelRole\" ]"));
	    RIC6.sendKeys(propertyJDD.getProperty("RIC6"));		
	    WebElement Adress6 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelAddress\" ]"));
	    Adress6.sendKeys(propertyJDD.getProperty("Address6"));
	    WebElement Mail6 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelEmail\" ]"));
	    Mail6.sendKeys(propertyJDD.getProperty("Mail6"));
	    WebElement Phone6 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelPhone\" ]"));
	    Phone6.sendKeys(propertyJDD.getProperty("PN6"));
		}
	
	public void Form7(WebDriver driver, Properties propertyJDD) {
		WebElement FN7 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelFirstName\" ]"));
	    FN7.sendKeys(propertyJDD.getProperty("FN7"));
	    WebElement LN7 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelLastName\" ]"));
	    LN7.sendKeys(propertyJDD.getProperty("LN7"));
	    WebElement CN7 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelCompanyName\" ]"));
	    CN7.sendKeys(propertyJDD.getProperty("CN7"));
	    WebElement RIC7 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelRole\" ]"));
	    RIC7.sendKeys(propertyJDD.getProperty("RIC7"));		
	    WebElement Adress7 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelAddress\" ]"));
	    Adress7.sendKeys(propertyJDD.getProperty("Address7"));
	    WebElement Mail7 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelEmail\" ]"));
	    Mail7.sendKeys(propertyJDD.getProperty("Mail7"));
	    WebElement Phone7 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelPhone\" ]"));
	    Phone7.sendKeys(propertyJDD.getProperty("PN7"));
		}
	
	public void Form8(WebDriver driver, Properties propertyJDD) {
		WebElement FN8 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelFirstName\" ]"));
	    FN8.sendKeys(propertyJDD.getProperty("FN8"));
	    WebElement LN8 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelLastName\" ]"));
	    LN8.sendKeys(propertyJDD.getProperty("LN8"));
	    WebElement CN8 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelCompanyName\" ]"));
	    CN8.sendKeys(propertyJDD.getProperty("CN8"));
	    WebElement RIC8 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelRole\" ]"));
	    RIC8.sendKeys(propertyJDD.getProperty("RIC8"));		
	    WebElement Adress8 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelAddress\" ]"));
	    Adress8.sendKeys(propertyJDD.getProperty("Address8"));
	    WebElement Mail8 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelEmail\" ]"));
	    Mail8.sendKeys(propertyJDD.getProperty("Mail8"));
	    WebElement Phone8 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelPhone\" ]"));
	    Phone8.sendKeys(propertyJDD.getProperty("PN8"));
		}
	
	public void Form9(WebDriver driver, Properties propertyJDD) {
		WebElement FN9 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelFirstName\" ]"));
	    FN9.sendKeys(propertyJDD.getProperty("FN9"));
	    WebElement LN9 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelLastName\" ]"));
	    LN9.sendKeys(propertyJDD.getProperty("LN9"));
	    WebElement CN9 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelCompanyName\" ]"));
	    CN9.sendKeys(propertyJDD.getProperty("CN9"));
	    WebElement RIC9 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelRole\" ]"));
	    RIC9.sendKeys(propertyJDD.getProperty("RIC9"));		
	    WebElement Adress9 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelAddress\" ]"));
	    Adress9.sendKeys(propertyJDD.getProperty("Address9"));
	    WebElement Mail9 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelEmail\" ]"));
	    Mail9.sendKeys(propertyJDD.getProperty("Mail9"));
	    WebElement Phone9 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelPhone\" ]"));
	    Phone9.sendKeys(propertyJDD.getProperty("PN9"));
		}
	
	public void Form10(WebDriver driver, Properties propertyJDD) {
		WebElement FN10 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelFirstName\" ]"));
	    FN10.sendKeys(propertyJDD.getProperty("FN10"));
	    WebElement LN10 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelLastName\" ]"));
	    LN10.sendKeys(propertyJDD.getProperty("LN10"));
	    WebElement CN10 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelCompanyName\" ]"));
	    CN10.sendKeys(propertyJDD.getProperty("CN10"));
	    WebElement RIC10 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelRole\" ]"));
	    RIC10.sendKeys(propertyJDD.getProperty("RIC10"));		
	    WebElement Adress10 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelAddress\" ]"));
	    Adress10.sendKeys(propertyJDD.getProperty("Address10"));
	    WebElement Mail10 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelEmail\" ]"));
	    Mail10.sendKeys(propertyJDD.getProperty("Mail10"));
	    WebElement Phone10 = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelPhone\" ]"));
	    Phone10.sendKeys(propertyJDD.getProperty("PN10"));
		}
}
