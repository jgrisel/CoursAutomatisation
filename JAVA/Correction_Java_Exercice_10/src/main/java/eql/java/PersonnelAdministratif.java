package eql.java;

public class PersonnelAdministratif extends Personne implements EmployeEcole{
	
	private double salaire;
	private int nb_absences_mois_en_cours;
	
	public PersonnelAdministratif(String nom, String prenom) {
		super(nom,prenom);
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
		System.out.println("L'employ� administratif comptabilise "+ nb_absences_mois_en_cours + " absences ce mois-ci");
		return nb_absences_mois_en_cours;
	}
	
	public void setAbsenceMois(int nbAbsences) {
		nb_absences_mois_en_cours = nbAbsences;
	}
	
	public void demanderAugmentation(Ecole ecole, EmployeEcole admin,  double augmentationSouhaitee) {
		System.out.println("le membre du personnel administratif demande un nouveau salaire � hauteur de " + augmentationSouhaitee );
		ecole.augmenterPersonnel(admin, augmentationSouhaitee);
	}
	
	
	//m�thodes
	
	public void sePresenter() {
		System.out.println(" Bonjour, je m'appelle "+ getPrenom() + " " + getNom() +" je suis membre du personnel administratif et mon salaire est de " + salaire);
	}
}