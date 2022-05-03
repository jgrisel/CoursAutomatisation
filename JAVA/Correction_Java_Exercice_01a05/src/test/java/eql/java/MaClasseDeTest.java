package eql.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaClasseDeTest{
	
	@Test
	
	//exercice 5
	public void premierTest(){
		//instanciation de l'ojet �leve � parti du constructeur
		Eleve eleve = new Eleve("Dusser", "Quentin", 28);
		
		//renseigne la variable absent par l'interm�diaire du setter
		eleve.setAbsent(false);
		
		//Affiche en console l'�tat de l'�l�ve e1
		System.out.println("L'�l�ve 'e1' est-il absent ? ---> "+ eleve.getAbsent());
		
		//v�rifie la bonne valorisation du setter
		assertEquals(eleve.getAbsent(), false);
		assertFalse(eleve.getAbsent());		
	}

	
}