package eql.java;

public final class Ecole {
	
	
	//m�thodes
	
/*	 public void augmenterSalaireEnseignant(Enseignant prof, double new_salaire){
		prof.setSalaire(new_salaire);
	}
	
	public void augmenterSalairePersoAdmin(PersonnelAdministratif PA, double new_salaire){
		PA.setSalaire(new_salaire);
	}*/
	
	
	//Grace au polymorphisme je peux faire une m�thode g�n�rale applicable aux deux types d'employes
	public void augmenterPersonnel(EmployeEcole employe, double new_salaire) {
		employe.setSalaire(new_salaire);
	}
	
}