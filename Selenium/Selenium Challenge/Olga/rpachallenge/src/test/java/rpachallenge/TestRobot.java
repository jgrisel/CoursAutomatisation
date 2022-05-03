package rpachallenge;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestRobot {

	WebDriver driver;

	@Before

	public void setup() throws Exception{

		System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		
		Properties propertyJDD = new Properties();
		propertyJDD.load(new FileInputStream("src/main/resources/jdd/jdd.properties"));
		driver.get(propertyJDD.getProperty("link2"));

	}

	@After

	public void teardown() {
		// driver.quit();
	}

	@Test
	public void testRobot() throws Exception {
		
		assertTrue(driver.findElement(By.xpath("//button[contains(.,'Start')]")).isDisplayed());

		PageRobot page_robot = PageFactory.initElements(driver, PageRobot.class);
		page_robot.lang(driver);
		page_robot.robot(driver);
	
		assertTrue(driver.findElement(By.xpath("//div[@class='message2'][contains(., '100%')]")).isDisplayed());

	}
}