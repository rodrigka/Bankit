package BankitPackage;

import javax.swing.JOptionPane;
import junit.framework.TestCase;

public class Test extends TestCase{
	
	/*
	 * Test 1
	 */
	
	public double calculTaux(String p) {
		double tauxInteret = 0;
		if (p.equals("pret immobilier")){
        	tauxInteret = 1.2;
        } else if (p.equals("credit consommation")){
        	tauxInteret = 3.2;
        } else if (p.equals("hypotheque")){
        	tauxInteret = 0.8;
        } else if (p.equals("pret etudiant")){
        	tauxInteret = 0.5;
        }
		return tauxInteret;
	}

	public void testCalculTaux() throws Exception {
		 assertEquals(1.2,calculTaux("pret immobilier"));
	}
	
	
	/*
	 * Test 2 : calcul d'un emprunt avec un pret immobilier
	 */
	
	public double calculEmprunt(double duree, double capEmprunte) {
		double tauxInteret = 1.2;
		double total = 0;
		double roundtotal =0;
		try {
			tauxInteret = tauxInteret * 0.01;   //Mettre de taux d'interet en pourcentage 3,2 => 0.032 = 3,2%.
        	total = ((capEmprunte * (tauxInteret/12) * Math.pow(1+(tauxInteret/12),duree)) / (Math.pow(1+(tauxInteret/12),duree)-1));
        	roundtotal = Math.round(total*100.0)/100.0;
        	
		}catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage(),"Erreur de format", JOptionPane.ERROR_MESSAGE);
		}
		return roundtotal;
	}
	
	public void testcalculEmprunt() throws Exception {
		 assertEquals(10.06,calculEmprunt(10,100));
	}
	
	
	/*
	 * Test 3 : calcul d'un emprunt avec un pret étudiant
	 */
	
	public double calculEmprunt2(double duree, double capEmprunte) {
		double tauxInteret = 0.5;
		double total = 0;
		double roundtotal =0;
		try {
			tauxInteret = tauxInteret * 0.01;   //Mettre de taux d'interet en pourcentage 3,2 => 0.032 = 3,2%.
        	total = ((capEmprunte * (tauxInteret/12) * Math.pow(1+(tauxInteret/12),duree)) / (Math.pow(1+(tauxInteret/12),duree)-1));
        	roundtotal = Math.round(total*100.0)/100.0;
        	
		}catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage(),"Erreur de format", JOptionPane.ERROR_MESSAGE);
		}
		return roundtotal;
	}
	
	public void testcalculEmprunt2() throws Exception {
		 assertEquals(10.02,calculEmprunt2(10,100));
	}
	
}
