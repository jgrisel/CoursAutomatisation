package rpachallenge;

import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageRobot {

	WebDriver driver;
	
	public void lang(WebDriver webdriver) throws Exception {
		Actions action = new Actions(webdriver);
		WebElement we = webdriver.findElement(By.xpath("//div[@class='col l3 hide-on-med-and-down right dropButton']"));
		action.moveToElement(we).moveToElement(webdriver.findElement(By.xpath("//span[text() ='RO']"))).click().build().perform();
	}
	

	public void robot(WebDriver driver) throws Exception {	

		Scanner sc = new Scanner(new File("src/main/resources/challenge.csv"));
		sc.useDelimiter("\n");

		driver.findElement(By.xpath("//button[contains(.,'Start')]")).click();

		while (sc.hasNext()) // returns a boolean value
		{

			String[] personne = sc.next().split(";"); // find and returns the next complete token from this scanner

			driver.findElement(By.xpath("//div/input[@ng-reflect-name='labelFirstName']")).sendKeys(personne[0]);
			driver.findElement(By.xpath("//div/input[@ng-reflect-name='labelLastName']")).sendKeys(personne[1]);
			driver.findElement(By.xpath("//div/input[@ng-reflect-name='labelCompanyName']")).sendKeys(personne[2]);
			driver.findElement(By.xpath("//div/input[@ng-reflect-name='labelRole']")).sendKeys(personne[3]);
			driver.findElement(By.xpath("//div/input[@ng-reflect-name='labelAddress']")).sendKeys(personne[4]);
			driver.findElement(By.xpath("//div/input[@ng-reflect-name='labelEmail']")).sendKeys(personne[5]);
			driver.findElement(By.xpath("//div/input[@ng-reflect-name='labelPhone']")).sendKeys(personne[6]);
			driver.findElement(By.xpath("//input[@type='submit']")).click();

		}
		sc.close(); // closes the scanner
	}

}
