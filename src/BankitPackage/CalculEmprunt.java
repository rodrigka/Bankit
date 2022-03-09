package BankitPackage;

public class CalculEmprunt {

	double capitalEmprunte;
	String pret;
	double dureeRembourse;
	double total;
	
	//Constructeur :
	public CalculEmprunt (double capitalEmprunte, String pret, double dureeRembourse) {
		this.setCapitalEmprunte(capitalEmprunte);
		this.setDureeRembourse(dureeRembourse);
		this.setPret(pret);
	}
	
	//methode calcul :
	
	public void calcul(String pret) {  
		double tauxInteret = 0;
		double capitalE = 0;
		if(pret == "pret immobilier") {
			tauxInteret = 1.2;
		} else if (pret == "credit a la consommation") {
			tauxInteret = 5;
		} else if (pret == "hypotheque") {
			tauxInteret = 0.8;
		} else if (pret == "pret etudiant") {
			tauxInteret = 0.5;
		}
		capitalE = this.capitalEmprunte + (this.capitalEmprunte*tauxInteret);
		total = capitalE/this.dureeRembourse;
		System.out.println(total);
	}

	public static void main(String[] args) {
		CalculEmprunt x = new CalculEmprunt(2000.0,"pret immobilier",36.0);
		x.calcul("pret immobilier");
	}
	
	public double getCapitalEmprunte() {
		return capitalEmprunte;
	}

	public void setCapitalEmprunte(double capitalEmprunte) {
		this.capitalEmprunte = capitalEmprunte;
	}

	public String getPret() {
		return pret;
	}

	public void setPret(String pret) {
		this.pret = pret;
	}

	public double getDureeRembourse() {
		return dureeRembourse;
	}

	public void setDureeRembourse(double dureeRembourse) {
		this.dureeRembourse = dureeRembourse;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
