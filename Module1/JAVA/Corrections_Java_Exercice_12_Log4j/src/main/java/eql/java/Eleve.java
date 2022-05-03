package eql.java;

import org.slf4j.LoggerFactory;

import eql.exception.AgeEleveException;

public class Eleve extends Personne {
	
	static org.slf4j.Logger Logger= LoggerFactory.getLogger(Eleve.class);
	//exercice 2

	private int age;
	
	//exercice 4
	private boolean absent;
	private NiveauClasse niveau_classe;
	
	//exercice 3
	public Eleve(String c, String m, int p) throws AgeEleveException{
        super(c,m);
        if (p<6 || p>10) {
        	throw new AgeEleveException("L'age de l'�l�ve doit �tre compris entre 6 et 10 ans");
        }
		age = p;
	}
	
	//exercice 1
	public void apprendre(){
		
	}
	
	//exercice 4
	public void setAbsent(boolean a) {
		absent=a;
	}
	

	public void setNiveauClasse(NiveauClasse n_v) {
		Logger.info("affectation de l'�l�ve � la classe " + n_v);
		niveau_classe=n_v;
	}
	
	public boolean getAbsent() {
		return absent;
	}
	
	public NiveauClasse getNiveauClasse() {
		return niveau_classe;
	}
	

	//Exercice 10
	
	public int getAge() {
		return age;
	}
}

