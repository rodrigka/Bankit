package BankitPackage;

import java.sql.*;

public class Connection {

	Connection c;
	PreparedStatement pst;
	ResultSet rs;
	
	public Connection () {
		try {
			Class.forName("org.sqlite.JDBC");                         
			c = (Connection) DriverManager.getConnection("jdbc:sqlite:BankitDb"); 
			System.out.println("Connexion Etablie");
		} catch (Exception e){
			System.out.println("Erreur de connexion");
			e.printStackTrace(); 
		}
	}
	
	public Connection connexion(){
		return c;
	}

}
