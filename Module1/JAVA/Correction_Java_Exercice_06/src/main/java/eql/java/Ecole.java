package eql.java;

public final class Ecole {
	
	
	//méthodes
	
	public void augmenterSalaireEnseignant(Enseignant prof, double new_salaire){
		prof.setSalaire(new_salaire);
	}
	
	public void augmenterSalairePersoAdmin(PersonnelAdministratif PA, double new_salaire){
		PA.setSalaire(new_salaire);
	}
}