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
	
	@Test
	public void presentationEnseignantPA(){
		
		double salaireEnseignant=2155.2;
		double salaireEnseignantAug=2200.99;
		double salairePersoAdmin=1836.6;
		double salairePersoAdminAug=4000;
		
		Enseignant enseignant = new Enseignant("Laffond", "Martin");
		PersonnelAdministratif personnelAdmin = new PersonnelAdministratif("Bouquin","Carole");
		 
		 enseignant.setSalaire(salaireEnseignant);
		 personnelAdmin.setSalaire(salairePersoAdmin);
		 
		 enseignant.sePresenter();
		 personnelAdmin.sePresenter();
		 
		 assertTrue(enseignant.getSalaire()==salaireEnseignant);
		 assertTrue(personnelAdmin.getSalaire()==salairePersoAdmin);
		 
		 // test méthode augmenter salaire
		 
		 Ecole ecole = new Ecole();
		 
		 ecole.augmenterSalaireEnseignant(enseignant, salaireEnseignantAug);
		 ecole.augmenterSalairePersoAdmin(personnelAdmin, salairePersoAdminAug);
		 
		 enseignant.sePresenter();
		 personnelAdmin.sePresenter();
		 
		 assertTrue(enseignant.getSalaire()==salaireEnseignantAug);
		 assertTrue(personnelAdmin.getSalaire()==salairePersoAdminAug);
		 
	}

	
}