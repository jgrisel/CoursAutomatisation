package challenge;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {

    public static WebDriver driver;

        /*
    *** DATA ***
    */
    /*
    * Firts Name*
    */
    private String fName1 = "John";
    private String fName2 = "Jane";
    private String fName3 = "Albert";
    private String fName4 = "Michael";
    private String fName5 = "Doug";
    private String fName6 = "Jessie";
    private String fName7 = "Stan";
    private String fName8 = "Michelle";
    private String fName9 = "Stacy";
    private String fName10 = "Lara";

    /*
    *Last Name
    */
    private String lName1 = "Smith";
    private String lName2 = "Dorsey";
    private String lName3 = "Kipling";
    private String lName4 = "Robertson";
    private String lName5 = "Derrick";
    private String lName6 = "Marlove";
    private String lName7 = "Hamm";
    private String lName8 = "Norton";
    private String lName9 = "Shelby";
    private String lName10 = "Palmer";

    /*
    * Company Name
    */
    private String cName1 = "IT Solutions";
    private String cName2 = "MediCare";
    private String cName3 = "Waterfront";
    private String cName4 = "MediCare";
    private String cName5 = "Timepath Inc.";
    private String cName6 = "Aperture Inc.";
    private String cName7 = "Sugarwell";
    private String cName8 = "Aperture Inc.";
    private String cName9 = "TechDev";
    private String cName10 = "Timepath Inc.";

    /*
    * Role In Company
    */
    private String rName1 = "Analyst";
    private String rName2 = "Medical Engineer";
    private String rName3 = "Accountant";
    private String rName4 = "IT Specialist";
    private String rName5 = "Analyst";
    private String rName6 = "Scientist";
    private String rName7 = "Advisor";
    private String rName8 = "Scientist";
    private String rName9 = "HR Manager";
    private String rName10 = "Programmer";

    /*
    * Adress
    */
    private String adress1 ="98 North Road";
    private String adress2 ="11 Crown Street";
    private String adress3 ="22 Guild Street";
    private String adress4 ="17 Farburn Terrace";
    private String adress5 ="99 Shire Oak Road";
    private String adress6 ="27 Cheshire Street";
    private String adress7 ="10 Dam Road";
    private String adress8 ="13 White Rabbit Street";
    private String adress9 ="19 Pineapple Boulevard";
    private String adress10 ="87 Orange Street";

    /*
    * email
    */
    private String email1 = "jsmith@itsolutions.co.uk";
    private String email2 = "jdorsey@mc.com";
    private String email3 = "kipling@waterfront.com";
    private String email4 = "mrobertson@mc.com";
    private String email5 = "dderrick@timepath.co.uk";
    private String email6 = "jmarlowe@aperture.us";
    private String email7 = "shamm@sugarwell.org";
    private String email8 = "mnorton@aperture.us";
    private String email9 = "sshelby@techdev.com";
    private String email10 = "lpalmer@timepath.co.uk";

    /*
    * Phone Number
    */
    private String pNumber1 ="40716543298";
    private String pNumber2 ="40791345621";
    private String pNumber3 ="40735416854";
    private String pNumber4 ="40733652145";
    private String pNumber5 ="40799885412";
    private String pNumber6 ="40733154268";
    private String pNumber7 ="40712462257";
    private String pNumber8 ="40731254562";
    private String pNumber9 ="40741785214";
    private String pNumber10 ="40731653845";

    @BeforeClass
    public static void set(){
        //System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();       
    }
    
    @Before
    public void setBeforeEach(){
        driver.get("https://www.rpachallenge.com/");
        driver.manage().window().maximize();
    }


    @Test
    public void affichageSite(){
        assert(true);
        w4it(1000);
    }



    @Test
    public void challenge(){

        //Appuyer sur start
        driver.findElement(By.xpath("//button[.='Start']")).click();

        //remplir le 1er formulaire
        driver.findElement(By.xpath("//label[.='First Name']/following-sibling::input")).sendKeys(fName1);
        driver.findElement(By.xpath("//label[.='Last Name']/following-sibling::input")).sendKeys(lName1);
        driver.findElement(By.xpath("//label[.='Company Name']/following-sibling::input")).sendKeys(cName1);
        driver.findElement(By.xpath("//label[.='Role in Company']/following-sibling::input")).sendKeys(rName1);
        driver.findElement(By.xpath("//label[.='Email']/following-sibling::input")).sendKeys(email1);
        driver.findElement(By.xpath("//label[.='Address']/following-sibling::input")).sendKeys(adress1);
        driver.findElement(By.xpath("//label[.='Phone Number']/following-sibling::input")).sendKeys(pNumber1);

        //submit le formulaire
        driver.findElement(By.xpath("//input[@type='submit']")).click();


        //remplir le 2 formulaire
        driver.findElement(By.xpath("//label[.='First Name']/following-sibling::input")).sendKeys(fName2);
        driver.findElement(By.xpath("//label[.='Last Name']/following-sibling::input")).sendKeys(lName2);
        driver.findElement(By.xpath("//label[.='Company Name']/following-sibling::input")).sendKeys(cName2);
        driver.findElement(By.xpath("//label[.='Role in Company']/following-sibling::input")).sendKeys(rName2);
        driver.findElement(By.xpath("//label[.='Email']/following-sibling::input")).sendKeys(email2);
        driver.findElement(By.xpath("//label[.='Address']/following-sibling::input")).sendKeys(adress2);
        driver.findElement(By.xpath("//label[.='Phone Number']/following-sibling::input")).sendKeys(pNumber2);

        //submit le formulaire
        driver.findElement(By.xpath("//input[@type='submit']")).click();  
        
        //remplir le 3 formulaire
        driver.findElement(By.xpath("//label[.='First Name']/following-sibling::input")).sendKeys(fName3);
        driver.findElement(By.xpath("//label[.='Last Name']/following-sibling::input")).sendKeys(lName3);
        driver.findElement(By.xpath("//label[.='Company Name']/following-sibling::input")).sendKeys(cName3);
        driver.findElement(By.xpath("//label[.='Role in Company']/following-sibling::input")).sendKeys(rName3);
        driver.findElement(By.xpath("//label[.='Email']/following-sibling::input")).sendKeys(email3);
        driver.findElement(By.xpath("//label[.='Address']/following-sibling::input")).sendKeys(adress3);
        driver.findElement(By.xpath("//label[.='Phone Number']/following-sibling::input")).sendKeys(pNumber3);

        //submit le formulaire
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        //remplir le 4 formulaire
        driver.findElement(By.xpath("//label[.='First Name']/following-sibling::input")).sendKeys(fName4);
        driver.findElement(By.xpath("//label[.='Last Name']/following-sibling::input")).sendKeys(lName4);
        driver.findElement(By.xpath("//label[.='Company Name']/following-sibling::input")).sendKeys(cName4);
        driver.findElement(By.xpath("//label[.='Role in Company']/following-sibling::input")).sendKeys(rName4);
        driver.findElement(By.xpath("//label[.='Email']/following-sibling::input")).sendKeys(email4);
        driver.findElement(By.xpath("//label[.='Address']/following-sibling::input")).sendKeys(adress4);
        driver.findElement(By.xpath("//label[.='Phone Number']/following-sibling::input")).sendKeys(pNumber4);

        //submit le formulaire
        driver.findElement(By.xpath("//input[@type='submit']")).click();         


        //remplir le 5 formulaire
        driver.findElement(By.xpath("//label[.='First Name']/following-sibling::input")).sendKeys(fName5);
        driver.findElement(By.xpath("//label[.='Last Name']/following-sibling::input")).sendKeys(lName5);
        driver.findElement(By.xpath("//label[.='Company Name']/following-sibling::input")).sendKeys(cName5);
        driver.findElement(By.xpath("//label[.='Role in Company']/following-sibling::input")).sendKeys(rName5);
        driver.findElement(By.xpath("//label[.='Email']/following-sibling::input")).sendKeys(email5);
        driver.findElement(By.xpath("//label[.='Address']/following-sibling::input")).sendKeys(adress5);
        driver.findElement(By.xpath("//label[.='Phone Number']/following-sibling::input")).sendKeys(pNumber5);

        //submit le formulaire
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        
        //remplir le 6 formulaire
        driver.findElement(By.xpath("//label[.='First Name']/following-sibling::input")).sendKeys(fName6);
        driver.findElement(By.xpath("//label[.='Last Name']/following-sibling::input")).sendKeys(lName6);
        driver.findElement(By.xpath("//label[.='Company Name']/following-sibling::input")).sendKeys(cName6);
        driver.findElement(By.xpath("//label[.='Role in Company']/following-sibling::input")).sendKeys(rName6);
        driver.findElement(By.xpath("//label[.='Email']/following-sibling::input")).sendKeys(email6);
        driver.findElement(By.xpath("//label[.='Address']/following-sibling::input")).sendKeys(adress6);
        driver.findElement(By.xpath("//label[.='Phone Number']/following-sibling::input")).sendKeys(pNumber6);

        //submit le formulaire
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        
        //remplir le 7 formulaire
        driver.findElement(By.xpath("//label[.='First Name']/following-sibling::input")).sendKeys(fName7);
        driver.findElement(By.xpath("//label[.='Last Name']/following-sibling::input")).sendKeys(lName7);
        driver.findElement(By.xpath("//label[.='Company Name']/following-sibling::input")).sendKeys(cName7);
        driver.findElement(By.xpath("//label[.='Role in Company']/following-sibling::input")).sendKeys(rName7);
        driver.findElement(By.xpath("//label[.='Email']/following-sibling::input")).sendKeys(email7);
        driver.findElement(By.xpath("//label[.='Address']/following-sibling::input")).sendKeys(adress7);
        driver.findElement(By.xpath("//label[.='Phone Number']/following-sibling::input")).sendKeys(pNumber7);

        //submit le formulaire
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        
        //remplir le 8 formulaire
        driver.findElement(By.xpath("//label[.='First Name']/following-sibling::input")).sendKeys(fName8);
        driver.findElement(By.xpath("//label[.='Last Name']/following-sibling::input")).sendKeys(lName8);
        driver.findElement(By.xpath("//label[.='Company Name']/following-sibling::input")).sendKeys(cName8);
        driver.findElement(By.xpath("//label[.='Role in Company']/following-sibling::input")).sendKeys(rName8);
        driver.findElement(By.xpath("//label[.='Email']/following-sibling::input")).sendKeys(email8);
        driver.findElement(By.xpath("//label[.='Address']/following-sibling::input")).sendKeys(adress8);
        driver.findElement(By.xpath("//label[.='Phone Number']/following-sibling::input")).sendKeys(pNumber8);

        //submit le formulaire
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        
        //remplir le 9 formulaire
        driver.findElement(By.xpath("//label[.='First Name']/following-sibling::input")).sendKeys(fName9);
        driver.findElement(By.xpath("//label[.='Last Name']/following-sibling::input")).sendKeys(lName9);
        driver.findElement(By.xpath("//label[.='Company Name']/following-sibling::input")).sendKeys(cName9);
        driver.findElement(By.xpath("//label[.='Role in Company']/following-sibling::input")).sendKeys(rName9);
        driver.findElement(By.xpath("//label[.='Email']/following-sibling::input")).sendKeys(email9);
        driver.findElement(By.xpath("//label[.='Address']/following-sibling::input")).sendKeys(adress9);
        driver.findElement(By.xpath("//label[.='Phone Number']/following-sibling::input")).sendKeys(pNumber9);

        //submit le formulaire
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        
        //remplir le 10 formulaire
        driver.findElement(By.xpath("//label[.='First Name']/following-sibling::input")).sendKeys(fName10);
        driver.findElement(By.xpath("//label[.='Last Name']/following-sibling::input")).sendKeys(lName10);
        driver.findElement(By.xpath("//label[.='Company Name']/following-sibling::input")).sendKeys(cName10);
        driver.findElement(By.xpath("//label[.='Role in Company']/following-sibling::input")).sendKeys(rName10);
        driver.findElement(By.xpath("//label[.='Email']/following-sibling::input")).sendKeys(email10);
        driver.findElement(By.xpath("//label[.='Address']/following-sibling::input")).sendKeys(adress10);
        driver.findElement(By.xpath("//label[.='Phone Number']/following-sibling::input")).sendKeys(pNumber10);

        //submit le formulaire
        driver.findElement(By.xpath("//input[@type='submit']")).click();


        assert(driver.findElement(By.xpath("//div[@class='message2']")).isDisplayed());
    }

    @Test
    public void newChallenger(){

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(fName1, lName1, cName1, rName1, adress1, email1, pNumber1));
        persons.add(new Person(fName2, lName2, cName2, rName2, adress2, email2, pNumber2));
        persons.add(new Person(fName3, lName3, cName3, rName3, adress3, email3, pNumber3));
        persons.add(new Person(fName4, lName4, cName4, rName4, adress4, email4, pNumber4));
        persons.add(new Person(fName5, lName5, cName5, rName5, adress5, email5, pNumber5));
        persons.add(new Person(fName6, lName6, cName6, rName6, adress6, email6, pNumber6));
        persons.add(new Person(fName7, lName7, cName7, rName7, adress7, email7, pNumber7));
        persons.add(new Person(fName8, lName8, cName8, rName8, adress8, email8, pNumber8));
        persons.add(new Person(fName9, lName9, cName9, rName9, adress9, email9, pNumber9));
        persons.add(new Person(fName10, lName10, cName10, rName10, adress10, email10, pNumber10));

        //Appuyer sur start
        driver.findElement(By.xpath("//button[.='Start']")).click();
       
        for(Person p : persons){
            //stockage du bouton submit
            WebElement b = null;

            for(WebElement we: driver.findElements(By.xpath("//input"))){
                String k = we.getAttribute("ng-reflect-name");
                if(k==null) b = we;
                else we.sendKeys(p.remove(k));
            }
            b.click();
        }

        assert(driver.findElement(By.xpath("//div[.='Congratulations!']"))!=null);

    }

    @After
    public void end(){
        w4it(5000);
    }

    @AfterClass
    public static void down(){
        driver.quit();
    }

    public void w4it(int t){
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
