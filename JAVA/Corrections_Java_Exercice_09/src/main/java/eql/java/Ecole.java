package eql.java;

import javax.swing.plaf.synth.SynthSpinnerUI;

public final class Ecole {
	
	
	//méthodes
	
/*	public void augmenterSalaireEnseignant(Enseignant prof, double new_salaire){
		prof.setSalaire(new_salaire);
	}
	
	public void augmenterSalairePersoAdmin(PersonnelAdministratif PA, double new_salaire){
		PA.setSalaire(new_salaire);
	}*/
	
	
	//Grace au polymorphisme je peux faire une méthode générale applicable aux deux types d'employes
	public void augmenterPersonnel(EmployeEcole employe, double new_salaire) {
		if(employe.getAbsenceMois()<=4) {
		employe.setSalaire(new_salaire);
		System.out.println("L'Ecole a augmenté l'employé. Son nouveau salaire est de : " + new_salaire);
		}
		else {
		System.out.println("Au vu du nombre d'absences de l'employé ce mois-ci, l'Ecole a décidé de ne pas augmenter ce dernier. Son salaire demeure donc à : " + employe.getSalaire());
		}
	}
	

	
}