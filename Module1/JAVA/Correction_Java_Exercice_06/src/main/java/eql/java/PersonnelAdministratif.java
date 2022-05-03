package eql.java;

public class PersonnelAdministratif{
	
	private String nom;
	private String prenom;
	private double salaire;
	private int nb_absences_mois_en_cours;
	
	public PersonnelAdministratif(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	//getter et setter salaire
	
	public double getSalaire() {
		return salaire;
	}
	
	public void setSalaire(double new_salaire) {
		salaire = new_salaire;
	}
	
	
	//getter et setter nb_absences_mois_en_cours
	
	public int getAbsenceMois() {
		return nb_absences_mois_en_cours;
	}
	
	public void setAbsenceMois(int nbAbsences) {
		nb_absences_mois_en_cours = nbAbsences;
	}
	
	
	//méthodes
	
	public void sePresenter() {
		System.out.println(" Bonjour, je m'appelle "+ prenom + " " + nom +" je suis membre du personnel administratif et mon salaire est de " + salaire);
	}
}