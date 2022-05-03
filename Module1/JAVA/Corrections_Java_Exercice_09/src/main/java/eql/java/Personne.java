package eql.java;

public class Personne{

	private String nom;
	private String prenom;
	
	
	public Personne (String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	// getter sur nom et prenom pour les méthodes de presentation
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getNom() {
		return nom;
	}
}