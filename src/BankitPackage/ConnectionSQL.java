package BankitPackage;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionSQL {

	Connection c;
	Statement statement;
	ResultSet result;
	
	
	public void connexion() {
        try {
            final String control = "org.sqlite.JDBC";
            Class.forName(control);
            final String url_bd = "jdbc:sqlite:BankitBd.db";
            c = (Connection) DriverManager.getConnection(url_bd);
            statement = c.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

	
	public void deconnexion() {
        try {
            if (c != null) {
                if (statement != null) {
                    statement.close();
                } 
                c.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

}
