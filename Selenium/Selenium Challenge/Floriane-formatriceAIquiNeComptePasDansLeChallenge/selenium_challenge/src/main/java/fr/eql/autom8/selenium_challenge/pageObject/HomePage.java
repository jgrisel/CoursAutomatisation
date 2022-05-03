package fr.eql.autom8.selenium_challenge.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import fr.eql.autom8.selenium_challenge.dto.Person;

public class HomePage {

	@FindBy(xpath="/html/body/app-root/div[1]/nav/div/a")
	private WebElement title;

	@FindBy(xpath = "/html/body/app-root/div[2]/app-rpa1/div/div[1]/div[6]/button")
	private WebElement startButton;

	@FindBy(xpath="html/body/app-root/div[2]/app-rpa1/div/div[2]/form/input")
	private WebElement submitButton;
	
	@FindBy(xpath="/html/body/app-root/div[2]/app-rpa1/div/div[2]/div[2]")
	private WebElement finalLabel;

	private WebElement firstNameField;
	private WebElement lastNameField;
	private WebElement companyNameField;
	private WebElement roleField;
	private WebElement addressField;
	private WebElement emailField;
	private WebElement phoneNumberField;

	public void fillForms(WebDriver driver, String language, List<Person> persons) {
		
		startButton.click();

		for (Person person : persons) {
			List<WebElement> elements = driver.findElements(By.tagName("input"));
			//find WebElements :
			for (WebElement element : elements) {
				String attributeValue = element.getAttribute("ng-reflect-name");
				if (attributeValue != null) {
					switch (attributeValue) {
					case "labelFirstName":
						firstNameField = element;
						break;
					case "labelLastName":
						lastNameField = element;
						break;
					case "labelCompanyName":
						companyNameField = element;
						break;
					case "labelRole":
						roleField = element;
						break;
					case "labelAddress":
						addressField = element;
						break;
					case "labelEmail":
						emailField = element;
						break;
					case "labelPhone":
						phoneNumberField = element;
						break;
					default:
						break;
					}
				}
			}

			//fill WebElements
			fillField(firstNameField, person.getFirstName());
			fillField(lastNameField, person.getLastName());
			fillField(companyNameField, person.getCompanyName());
			fillField(roleField, person.getRole());
			fillField(addressField, person.getAddress());
			fillField(emailField, person.getEmail());
			fillField(phoneNumberField, person.getPhoneNumber());

			//Submit
			submitButton.click();
		}

	}

	private void fillField(WebElement field, String info) {
		field.clear();
		field.sendKeys(info);
	}

	public String getScore(String language) {
		StringBuilder sb = new StringBuilder();
		sb.append(language).append(" : " ).append(finalLabel.getText());
		return sb.toString();
	}

	//For assertions :
	public boolean isHomePage() {
		return title.isDisplayed();
	}

	public boolean isTestNotStartedYet() {
		return startButton.getText().equals("START") || startButton.getText().equals("開始");
	}

	public boolean isTestFinished() {
		return finalLabel.isDisplayed();
	}

	public boolean isTestSuccess() {
		return finalLabel.getText().contains("100%");
	}

}
