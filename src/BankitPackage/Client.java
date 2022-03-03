package BankitPackage;

import java.util.ArrayList;

public class Client {

	/*
	 * Attributs :
	 */
	
	int numCompte;
	float montantCompte;
	String dateDerniereConn;
	boolean emprunt = false;
	
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
}
