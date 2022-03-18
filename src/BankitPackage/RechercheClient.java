/*package BankitPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

public class RechercheClient implements ActionListener{

	TableauDeBord tdb = new TableauDeBord();
	
	public void actionPerformed(ActionEvent event){
		ConnectionSQL c = new ConnectionSQL();
		try {
			String montant;
			montant = tdb.getNbcompte().getText();
			c.connexion();
			
			String check = "";
			c.result = c.statement.executeQuery(check);
			
			if(c.result.next()) {
				
			}else {
				JOptionPane.showMessageDialog(null,"Login ou mot de passe invalides", "Oh oh !", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(),"Erreur de connexion", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}*/
