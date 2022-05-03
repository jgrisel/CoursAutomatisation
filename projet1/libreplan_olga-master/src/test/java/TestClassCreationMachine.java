import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClassCreationMachine {

	WebDriver driver;
	WebDriverWait wait;
	Logger logger = Logger.getLogger(TestClassGestionProfil.class.getName());

	@Before

	public void setup() throws Exception {

		// Initialisation du driver
		System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver.exe");
		driver = new FirefoxDriver();

		// initialiser le fichier.properties
		Properties propertyJDD = new Properties();
		propertyJDD.load(new FileInputStream("src/main/resources/JDD.properties/JDD.properties"));

		// aller sur le site du challenge
		driver.get(propertyJDD.getProperty("URL"));
		driver.manage().window().maximize();

	}

	@After

	public void teardown() {
		driver.quit();
	}

	@Test // creation Machine
	public void test() throws Exception {
		wait = new WebDriverWait(driver, 15); // Explicit wait

		// Instanciation du FileHandler qui va �crire dans le fichier app.log.
		// Each new message will be appended at the at of the log file.
		FileHandler fileHandler = new FileHandler("TestClassCreationMachine.log", true);
		logger.addHandler(fileHandler);

		try {
			logger.info("\ndeuxi�me test".toUpperCase());

			// v�rifier que la page est correcte
			assertEquals("LibrePlan: acc�s utilisateur", driver.getTitle());

			logger.info("initialiser la PageConnexion".toUpperCase());
			// initialiser la PageConnexion
			PageConnexion page_connexion = PageFactory.initElements(driver, PageConnexion.class);

			logger.info("se logger".toUpperCase());
			// se logger
			PageAccueil page_accueil = page_connexion.logIn(driver, "admin", "admin");

			WebElement fil_d_ariane_calendrier = wait
					.until(ExpectedConditions.visibilityOf(page_accueil.fil_d_ariane_calendrier)); // Explicit wait

			// v�rifier que la page est correcte
			assertTrue(page_accueil.verifPage(fil_d_ariane_calendrier));

			// ouvrir la page Machines
			logger.info("ouvrir la page Machines".toUpperCase());
			PageMachines page_machines = page_accueil.chooseOptionMenuMachine(page_accueil.Onglet_Ressources,
					page_accueil.Machines);

			// v�rifier que la page est correcte
			WebElement titreMachinesListe = wait
					.until(ExpectedConditions.visibilityOf(page_machines.titreMachinesListe)); // Explicit wait
			assertTrue(page_machines.verifPage(titreMachinesListe));

			// cr�er une machine
			logger.info("cr�er une machine".toUpperCase());
			page_machines.creationMachine();
			WebElement ongletDonneMachine = wait
					.until(ExpectedConditions.visibilityOf(page_machines.ongletDonneMachine)); // Explicit wait
			assertTrue(page_machines.verifPage(ongletDonneMachine));

			// champ de saisie renseign� avec une valeur par d�faut non modifiable
			assertFalse(page_machines.code.isEnabled());
			assertTrue(page_machines.checkbox.isEnabled());

			// nom : champ de saisie non renseign�
			assertTrue(page_machines.nom.getText().trim().isEmpty());
			// champ de saisie non renseign�
			assertTrue(page_machines.description.getText().trim().isEmpty());
			// champ type - 'Ressource normale' selectionn�
			assertEquals("Ressource normale", page_machines.typeSelected.getText());

			// ajouter une nouvelle machine ("MACHINETEST1", "MACHINETEST1", "Ressource
			// normale")
			logger.info("ajouter une nouvelle machine (\"MACHINETEST1\", \"MACHINETEST1\", \"Ressource normale"
					.toUpperCase());
			page_machines.ajouterMachine(driver, "MACHINETEST1", "MACHINETEST1", "Ressource normale");

			// v�rifier l'affichage du message "Machine enregistr�"
			WebElement messageBandeau = wait.until(ExpectedConditions.visibilityOf(page_machines.messageBandeau));
			assertEquals("Machine \"MACHINETEST1\" enregistr�", messageBandeau.getText());

			// v�rifier que la page est correcte
			WebElement titreMachinesModifier = wait
					.until(ExpectedConditions.visibilityOf(page_machines.titreMachinesModifier)); // Explicit wait
			assertTrue(page_machines.verifPage(titreMachinesModifier));

			// annuler l'action
			logger.info("annuler l'action".toUpperCase());
			page_machines.annulerAction();

			wait.until(ExpectedConditions.visibilityOf(page_machines.titreMachinesListe)); // Explicit wait
			assertTrue(page_machines.verifPage(titreMachinesListe));

			// v�rifier les valeurs affich�es dans le tableau
			assertEquals("MACHINETEST1", page_machines.getInfoTable()[0]);
			assertEquals("MACHINETEST1", page_machines.getInfoTable()[1]);
			assertTrue(page_machines.getInfoTable()[2].contains("MACHINE"));

			// supprimer la machin�e cr��e
			logger.info("supprimer la machin�e cr��e".toUpperCase());
			page_machines.supprimerMachine();
			wait.until(ExpectedConditions.visibilityOf(page_machines.messageBandeau));
			assertEquals("Machine \"MACHINETEST1\" supprim�", messageBandeau.getText());

		} catch (Exception e) {
			PageProfils.takeSnapShot(driver, PageProfils.getNameFile());

			logger.severe("Exception while taking screenshot ".toUpperCase() + e.getMessage());
			throw e;
		}

	}

}
