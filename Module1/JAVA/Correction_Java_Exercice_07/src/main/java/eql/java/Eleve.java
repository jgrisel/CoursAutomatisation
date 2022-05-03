package eql.java;

public class Eleve extends Personne {
	
	//exercice 2

	private int age;
	
	//exercice 4
	private boolean absent;
	private String niveau_classe;
	
	//exercice 3
	public Eleve(String c, String m, int p) {
        super(c,m);
		age = p;
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

