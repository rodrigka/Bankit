package BankitPackage;

public class CalculEmprunt {

	double capitalEmprunte;
	String pret;
	int dureeRembourse;
	double total;
	double tauxInteret;
	
	//Constructeur :
	public CalculEmprunt (	float capitalEmprunte, String pret, int dureeRembourse) {
		this.getCapitalEmprunte();
		this.getDureeRembourse();
		this.getPret();
	}
	
	//methode calcul :
	
	public double calculEmprunt() {
		if(pret == "pr\\u00EAt immobilier") {
			tauxInteret = 1.2;
		} else if (pret == "cr\u00E9dit \u00E0 la consommation") {
			tauxInteret = 5;
		} else if (pret == "hypoth\u00E8que") {
			tauxInteret = 0.8;
		} else if (pret == "pr\u00EAt \u00E9tudiant") {
			tauxInteret = 0.5;
		}
		capitalEmprunte = capitalEmprunte + (capitalEmprunte*tauxInteret);
		total = capitalEmprunte/dureeRembourse;
		return total;
	}
	
	public void afficherCalcul() {
		System.out.println(total);
	}

	public static void main(String[] args) {
		CalculEmprunt x = new CalculEmprunt(2000,"pr\\\\u00EAt immobilier",5);
		x.afficherCalcul();
		
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

	public int getDureeRembourse() {
		return dureeRembourse;
	}

	public void setDureeRembourse(int dureeRembourse) {
		this.dureeRembourse = dureeRembourse;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
}
