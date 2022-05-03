package eql.java;

public class Eleve {
	
	//exercice 2
	private String nom;
	private String prenom;
	private int age;
	
	//exercice 4
	private boolean absent;
	private String niveau_classe;
	
	//exercice 3
	public Eleve(String n, String p, int a) {
		nom = n;
		prenom = p;
		age = a;
	}
	
	//exercice 1
	public void apprendre(){
		
	}
	
	//exercice 4
	public void setAbsent(boolean a) {
		absent=a;
	}
	
	
	public void setNiveauClasse(String n_v) {
		System.out.println("affectation de l'élève à la classe " + n_v);
		niveau_classe=n_v;
	}
	
	public boolean getAbsent() {
		return absent;
	}
	
	public String getNiveauClasse() {
		return niveau_classe;
	}
}

