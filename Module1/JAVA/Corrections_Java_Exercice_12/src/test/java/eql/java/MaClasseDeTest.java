package eql.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import eql.exception.AgeEleveException;

public class MaClasseDeTest{
	
	@Test
	
	//exercice 5
	public void premierTest() throws AgeEleveException{
		
		System.out.println("\npremier test".toUpperCase());
		//instanciation de l'ojet éleve à parti du constructeur
		Eleve eleve = new Eleve("Dusser", "Quentin", 9);
		
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
	
	public void attribuerNiveauClasse() throws AgeEleveException {
		System.out.println("\ntroisième test".toUpperCase());
		Eleve eleve = new Eleve("Dusser", "Quentin", 7);
		eleve.setNiveauClasse(NiveauClasse.CE1);
		assertTrue(eleve.getNiveauClasse().equals(NiveauClasse.CE1));
	}

	
	//exercice 9
	@Test
	public void augmentationDeSalaireTest(){
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
	
	// exercice 10
	@Test
	
	public void assignerClasseEleveTest() throws AgeEleveException {
		System.out.println("\ncinquième test".toUpperCase());
		Eleve eleve = new Eleve("Petit", "Emmanuel", 9);
		Ecole ecole = new Ecole();
		ecole.assignerClasseEleve(eleve);
		
		assertTrue(eleve.getNiveauClasse().equals(NiveauClasse.CM1));
		
	}
	
	//exercice 11
	@Test
	public void presentationStaffTest() {
		
		System.out.println("\nsixième test".toUpperCase());
		
		PersonnelAdministratif personnelAdmin1 = new PersonnelAdministratif("Bouquin","Carole");
		PersonnelAdministratif personnelAdmin2 = new PersonnelAdministratif("Choux","Nicole");
		PersonnelAdministratif personnelAdmin3 = new PersonnelAdministratif("Lambrouille","Didier");
		
		Enseignant enseignant1 = new Enseignant("Laffond", "Martin");
		Enseignant enseignant2 = new Enseignant("Corbière", "Janette");
		Enseignant enseignant3 = new Enseignant("Le Boudet", "Jean-Marc");
		Enseignant enseignant4 = new Enseignant("Lacrosse", "Thierry");

		  List <EmployeEcole> listeEmployes = new ArrayList <EmployeEcole>();
		  listeEmployes.add(personnelAdmin1);
		  listeEmployes.add(personnelAdmin2);
		  listeEmployes.add(personnelAdmin3);
		  listeEmployes.add(enseignant1);
		  listeEmployes.add(enseignant2);
		  listeEmployes.add(enseignant3);
		  listeEmployes.add(enseignant4);
		  
		  for(EmployeEcole employe : listeEmployes){
			  employe.sePresenter();
		  }
		  
		  assertTrue(listeEmployes.contains(enseignant1)
				  &&listeEmployes.contains(enseignant2)
				  &&listeEmployes.contains(enseignant3)
				  &&listeEmployes.contains(enseignant4));


	}
	
	//Exercice 12
	@Test (expected=AgeEleveException.class, timeout=1000)
	
	public void AgeEleveTestNonPassant() throws AgeEleveException {
		System.out.println("\nseptième test".toUpperCase());
	try {
		Eleve eleve = new Eleve("Magimel","Benoit",28);
	}
	catch(AgeEleveException ex){
		System.out.println(" SUCCES L'ELEVE DE 28 ANS N'EST PAS PASSE!! ");
		throw ex;
	}
	}
	
	
}