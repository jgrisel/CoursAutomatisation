import java.io.FileInputStream;
import java.util.Properties;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class ChallengeTest2 {
	PageForm2 maPage;
	
	@Test
	public void test() throws Exception {
		//Initialisation du driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jgrisel\\eclipse-workspace\\Projet_challenge\\src\\main\\resources\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//initialiser le fichier.properties
		Properties propertyJDD = new Properties();
	    propertyJDD.load(new FileInputStream("C:\\Users\\jgrisel\\eclipse-workspace\\Projet_challenge\\src\\main\\resources\\JDD.properties\\JDD.properties"));
	    
	    //aller sur le site du challenge
	    driver.get(propertyJDD.getProperty("URL"));
	    driver.manage().window().maximize();
	    
	  //Initialisation de ma page
	  	maPage = PageFactory.initElements(driver, PageForm2.class); 
	  	
	  // click Start et remplir les formulaires avec boucle for	
	  	maPage.Form(driver, propertyJDD);
	    
	}
}
