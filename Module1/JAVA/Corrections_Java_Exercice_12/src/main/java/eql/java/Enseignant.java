package eql.java;

public class Enseignant extends Personne implements EmployeEcole{

	private double salaire;
	private int nb_absences_mois_en_cours;

	//constructeur 
	
	public Enseignant(String nom, String prenom) {
		super(nom, prenom);
	}
	
	
	//getter et setter salaire
	
	public double getSalaire() {
		return salaire;
	}
	
	public void setSalaire(double d) {
		salaire = d;
	}
	
	
	//getter et setter nb_absences_mois_en_cours
	
	public int getAbsenceMois() {
		System.out.println("Le professeur comptabilise "+ nb_absences_mois_en_cours + " absences ce mois-ci");
		return nb_absences_mois_en_cours;
	}
	
	public void setAbsenceMois(int nbAbsences) {
		nb_absences_mois_en_cours = nbAbsences;
	}
	
	// méthodes
	
	public void sePresenter() {
		System.out.println(" Bonjour, je m'appelle "+ getPrenom() + " " + getNom() +" je suis professeur et mon salaire est de " + salaire);
	}
	
	public void demanderAugmentation(Ecole ecole, EmployeEcole enseignant,  double augmentationSouhaitee) {
		System.out.println("l'enseignant demande un nouveau salaire à hauteur de " + augmentationSouhaitee );
		ecole.augmenterPersonnel(enseignant, augmentationSouhaitee);
	}



}