package eql.java;

import org.slf4j.LoggerFactory;

public final class Ecole {
	
	static org.slf4j.Logger Logger= LoggerFactory.getLogger(Ecole.class);
	
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
		Logger.info("L'Ecole a augmenté l'employé. Son nouveau salaire est de : " + new_salaire);
		}
		else {
		Logger.warn("Au vu du nombre d'absences de l'employé ce mois-ci, l'Ecole a décidé de ne pas augmenter ce dernier. Son salaire demeure donc à : " + employe.getSalaire());
		}
	}
	
	//exercice 10
	
	public void assignerClasseEleve(Eleve e) {
		switch(e.getAge()) {
		case 6 : e.setNiveauClasse(NiveauClasse.CP); break;
		case 7 : e.setNiveauClasse(NiveauClasse.CE1); break;
		case 8 : e.setNiveauClasse(NiveauClasse.CE2); break;
		case 9 : e.setNiveauClasse(NiveauClasse.CM1); break;
		case 10 : e.setNiveauClasse(NiveauClasse.CM2); break;
		}
	}
}