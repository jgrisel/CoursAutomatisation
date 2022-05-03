package eql.java;

public interface EmployeEcole{
	
	public void sePresenter();
	
	public void setSalaire(double d);
	
	public void setAbsenceMois(int i);
	
	public int getAbsenceMois();
	
	public double getSalaire(); 
	
	public void demanderAugmentation(Ecole ecole, EmployeEcole e, double d);
}