package BankitPackage;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public interface Requete {

	public void table();
	public void sauverTransac(ActionEvent event);
	public void rechercheInfosCompte(ActionEvent event);
	public void ajoutAgent(MouseEvent e);
	public void changerPassword(ActionEvent e);
}
