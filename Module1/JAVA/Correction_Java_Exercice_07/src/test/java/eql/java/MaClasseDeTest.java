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
		
		 //Enseignant en1 = new Enseignant("Laffond", "Martin"); --> polymorphisme
		 Enseignant enseignant = new Enseignant("Laffond", "Martin");
		 EmployeEcole personnelAdmin = new PersonnelAdministratif("Bouquin","Carole");
		 
		 enseignant.setSalaire(2155.2);
		 personnelAdmin.setSalaire(1836.6);
		 
		 enseignant.sePresenter();
		 personnelAdmin.sePresenter();
		 
		 assertTrue(enseignant.getSalaire()==2155.2);
		 assertTrue(personnelAdmin.getSalaire()==1836.6);
		 
		 // test méthode augmenter salaire
		 
		 Ecole ecole = new Ecole();
		 
/*		 ecole.augmenterSalaireEnseignant(en1, 2200.99);
		 ecole.augmenterSalairePersoAdmin(pa1, 2000);*/
		 
		 //
		 ecole.augmenterPersonnel(enseignant, 2200.99);
		 ecole.augmenterPersonnel(personnelAdmin, 2000);
		 
		 enseignant.sePresenter();
		 personnelAdmin.sePresenter();
		 
		 assertTrue(enseignant.getSalaire()==2200.99);
		 assertTrue(personnelAdmin.getSalaire()==2000);
		 
	}

	
}