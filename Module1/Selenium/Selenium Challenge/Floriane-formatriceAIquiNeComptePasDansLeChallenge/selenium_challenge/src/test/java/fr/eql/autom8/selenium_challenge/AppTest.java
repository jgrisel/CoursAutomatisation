package fr.eql.autom8.selenium_challenge;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom8.selenium_challenge.dto.Person;
import fr.eql.autom8.selenium_challenge.pageObject.HomePage;

public class AppTest {

	//Data Driver :
	private static String driverName = "webdriver.gecko.driver";
	private static String driverSrc = "src/main/resources/driver/geckodriver.exe";
	private static WebDriver driver;
	
	//DATA :
	private List<Person> englishPersons = Person.createEnglishPersons();
	private List<Person> japanesePersons = Person.createJapanesePerson();
	private HomePage page = new HomePage();
	private String english = "english";
	private String romanian = "romanian";
	private String japanese = "japanese";
	private String url = "https://www.rpachallenge.com";
	private static List<String> results = new ArrayList<String>();
	
	@Before
	public void beforeTest() {
		System.setProperty(driverName, driverSrc);
		driver = new FirefoxDriver();
		page = PageFactory.initElements(driver, HomePage.class);
	}
	
	@Test
	public void testEnglish() {

		initHomePageByLanguage(driver, english);

		assertTrue(page.isHomePage());
		assertTrue(page.isTestNotStartedYet());

		page.fillForms(driver, english, englishPersons);

		assertTrue(page.isTestFinished());
		assertTrue(page.isTestSuccess());
		
		results.add(page.getScore(english));
		driver.close();
	}

	@Test
	public void testRomanian() {

		initHomePageByLanguage(driver, romanian);

		assertTrue(page.isHomePage());
		assertTrue(page.isTestNotStartedYet());

		page.fillForms(driver, romanian, englishPersons);

		assertTrue(page.isTestFinished());
		assertTrue(page.isTestSuccess());

		results.add(page.getScore(romanian));
		driver.close();
	}


	@Test
	public void testJapanese() {

		initHomePageByLanguage(driver, japanese);

		assertTrue(page.isHomePage());
		assertTrue(page.isTestNotStartedYet());

		page.fillForms(driver, japanese, japanesePersons);

		assertTrue(page.isTestFinished());
		assertTrue(page.isTestSuccess());

		results.add(page.getScore(japanese));
		driver.close();
	}
	
	@AfterClass 
	public static void afterClass() {
		for (String result : results) {
			System.out.println(result);
		}
	}
	
	private void initHomePageByLanguage(WebDriver driver, String language) {
		language = language.toLowerCase();
		StringBuilder sb = new StringBuilder();
		if (language.equals("english")) {
			url = sb.append(url).append("/?lang=EN").toString();
		} else if(language.equals("romanian")) {
			url = sb.append(url).append("/?lang=RO").toString();
		} else if (language.equals("japanese")) {
			url = sb.append(url).append("/?lang=JA").toString();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
	}

}
