import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageForm2 {
	
	public String Titledisplayed(WebDriver driver) {
		return(driver.getTitle());		
	}
	
	
	public void Form(WebDriver driver, Properties propertyJDD) {
		WebElement bouton_Start = driver.findElement(By.xpath("//button"));
		bouton_Start.click();
		for (int i=1; i<11; i++){
			WebElement FN = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelFirstName\" ]"));
		    FN.sendKeys(propertyJDD.getProperty("FN"+i));
		    WebElement LN = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelLastName\" ]"));
		    LN.sendKeys(propertyJDD.getProperty("LN"+i));
		    WebElement CN = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelCompanyName\" ]"));
		    CN.sendKeys(propertyJDD.getProperty("CN"+i));
		    WebElement RIC = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelRole\" ]"));
		    RIC.sendKeys(propertyJDD.getProperty("RIC"+i));		
		    WebElement Adress = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelAddress\" ]"));
		    Adress.sendKeys(propertyJDD.getProperty("Address"+i));
		    WebElement Mail = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelEmail\" ]"));
		    Mail.sendKeys(propertyJDD.getProperty("Mail"+i));
		    WebElement Phone = driver.findElement(By.xpath("//input[@ng-reflect-name=\"labelPhone\" ]"));
		    Phone.sendKeys(propertyJDD.getProperty("PN"+i));
		    WebElement bouton_Submit = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		    bouton_Submit.click();
			}

	}
	
}
