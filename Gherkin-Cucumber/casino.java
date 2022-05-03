package casinoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CasinoSteps {
	
	private List<Map<String, String>> liste_personne;
	
	@Given("the following persons")
	public void the_following_persons(List<Map<String, String>> liste_personne) {
		this.liste_personne=liste_personne;
		
	}

	@When("they ask if they could go in a casino")
	public void they_ask_if_they_could_go_in_a_casino() {
		for(Map<String, String> m : liste_personne ) {
			int age = Integer.parseInt(m.get("age"));
			boolean gambler = Boolean.parseBoolean(m.get("gambler"));
			if (age>17 && gambler == false) {
				System.out.println("of course come in");	
				
			}
			else {
				System.out.println("no way, get out my face !");
			}
		}
	}

	@Then("the bouncer should say {string}")
	public void the_bouncer_should_say(String string) {
	}
	
}