package eql.java;

public class Enseignant {
	
	private String nom;
	private String prenom;
	private double salaire;
	private int nb_absences_mois_en_cours;

	//constructeur 
	
	public Enseignant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
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
		return nb_absences_mois_en_cours;
	}
	
	public void setAbsenceMois(int nbAbsences) {
		nb_absences_mois_en_cours = nbAbsences;
	}
	
	// méthodes
	
	public void sePresenter() {
		System.out.println(" Bonjour, je m'appelle "+ prenom + " " + nom +" je suis professeur et mon salaire est de " + salaire);
	}
}