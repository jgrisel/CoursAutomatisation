package eql.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaClasseDeTest{
	
	@Test
	
	//exercice 5
	public void premierTest(){
		//instanciation de l'ojet éleve à parti du constructeur
		Eleve eleve = new Eleve("Dusser", "Quentin", 28);
		
		//renseigne la variable absent par l'intermédiaire du setter
		eleve.setAbsent(false);
		
		//Affiche en console l'état de l'élève e1
		System.out.println("L'élève 'e1' est-il absent ? ---> "+ eleve.getAbsent());
		
		//vérifie la bonne valorisation du setter
		assertEquals(eleve.getAbsent(), false);
		assertFalse(eleve.getAbsent());		
	}

	
}