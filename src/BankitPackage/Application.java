package BankitPackage;

import java.awt.EventQueue;

public class Application {
	
	public Accueil frameAcc;
	public TableauDeBord frameTdb;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Accueil window = new Accueil();
				window.getFrameAcc().setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				TableauDeBord window = new TableauDeBord();
				window.getFrameTdb().setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		});
	}

}
