package eql.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaClasseDeTest{
	
	@Test
	
	//exercice 5
	public void premierTest(){
		
		System.out.println("\npremier test".toUpperCase());
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
		System.out.println("\ndeuxième test".toUpperCase());
		
		 //Enseignant en1 = new Enseignant("Laffond", "Martin"); --> polymorphisme
		 EmployeEcole enseignant = new Enseignant("Laffond", "Martin");
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
	

//exercice 8	
	@Test
	
	public void attribuerNiveauClasse() {
		System.out.println("\ntroisième test".toUpperCase());
		Eleve eleve = new Eleve("Dusser", "Quentin", 28);
		eleve.setNiveauClasse(NiveauClasse.CE1);
		assertTrue(eleve.getNiveauClasse().equals(NiveauClasse.CE1));
	}

	
	//exercice 9
	@Test
	public void augmentationDeSalaire(){
		System.out.println("\nquatrieme test".toUpperCase());
		
		 Enseignant enseignant = new Enseignant("Laffond", "Martin");
		 PersonnelAdministratif personnelAdmin = new PersonnelAdministratif("Bouquin","Carole");
		 Ecole ecole = new Ecole();
		
		 enseignant.setAbsenceMois(5);
		 personnelAdmin.setAbsenceMois(4);
		 
		 enseignant.demanderAugmentation(ecole, enseignant, 4000);
		 personnelAdmin.demanderAugmentation(ecole, personnelAdmin, 2500);

		 assertTrue(enseignant.getSalaire() == 0);
		 assertTrue(personnelAdmin.getSalaire() == 2500);
		 
	}
}