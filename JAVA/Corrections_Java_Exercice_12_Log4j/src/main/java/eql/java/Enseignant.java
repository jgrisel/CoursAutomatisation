package eql.java;

import org.slf4j.LoggerFactory;

public class Enseignant extends Personne implements EmployeEcole{

	private double salaire;
	private int nb_absences_mois_en_cours;
	
	static org.slf4j.Logger Logger= LoggerFactory.getLogger(Enseignant.class);

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
		Logger.error("Le professeur comptabilise "+ nb_absences_mois_en_cours + " absences ce mois-ci");
		return nb_absences_mois_en_cours;
	}
	
	public void setAbsenceMois(int nbAbsences) {
		nb_absences_mois_en_cours = nbAbsences;
	}
	
	// méthodes
	
	
	
	public void sePresenter() {
		Logger.info(" Bonjour, je m'appelle "+ getPrenom() + " " + getNom() +" je suis professeur et mon salaire est de " + salaire);
	}
	
	public void demanderAugmentation(Ecole ecole, EmployeEcole enseignant,  double augmentationSouhaitee) {
		Logger.warn("l'enseignant demande un nouveau salaire à hauteur de " + augmentationSouhaitee );
		ecole.augmenterPersonnel(enseignant, augmentationSouhaitee);
	}



}