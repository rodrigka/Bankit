package BankitPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JProgressBar;

public class TableauDeBord {

	private JFrame frame;
	private JTable table;
	private JTextField textFieldMontant;
	private JTextField textFieldNCompte;
	private JTextField textFieldDate;

	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableauDeBord window = new TableauDeBord();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public TableauDeBord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1400, 900);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JPanel logo = new JPanel();
		logo.setBackground(new Color(102, 153, 255));
		logo.setBounds(0, 0, 284, 92);
		frame.getContentPane().add(logo);
		logo.setLayout(null);
		
		JLabel LogoNom = new JLabel("Bankit");
		LogoNom.setHorizontalAlignment(SwingConstants.CENTER);
		LogoNom.setForeground(Color.WHITE);
		LogoNom.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 52));
		LogoNom.setBounds(67, 11, 149, 71);
		logo.add(LogoNom);
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(102, 153, 255));
		menu.setBounds(0, 0, 284, 744);
		frame.getContentPane().add(menu);
		menu.setLayout(null);
		
		JLabel PrenomNom = new JLabel("Prenom Nom");
		PrenomNom.setBounds(10, 161, 112, 19);
		PrenomNom.setForeground(new Color(255, 255, 255));
		PrenomNom.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		menu.add(PrenomNom);
		
		JLabel NbAgent = new JLabel("N\u00B0 Agent : 12345");
		NbAgent.setForeground(Color.WHITE);
		NbAgent.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		NbAgent.setBounds(10, 179, 171, 25);
		menu.add(NbAgent);
		
		JLabel Profile = new JLabel("New label");
		Profile.setBorder(null);
		Profile.setBounds(0, 0, 284, 208);
		menu.add(Profile);
		Profile.setIcon(new ImageIcon("C:\\Users\\kater\\OneDrive\\Documents\\L3-SNGI\\S5\\Conception et programmation orient\u00E9s objet\\Fichiers Java\\Bankit\\Img\\FondProfil.jpg"));
		
		JLabel droitsAuteur = new JLabel("2022 - Bankit by Katerine Rodriguez");
		droitsAuteur.setForeground(new Color(255, 255, 255));
		droitsAuteur.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		droitsAuteur.setBounds(10, 659, 264, 25);
		menu.add(droitsAuteur);
		
		JLabel version = new JLabel("Version : 1.0.0");
		version.setBounds(10, 679, 264, 14);
		menu.add(version);
		version.setForeground(Color.WHITE);
		version.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		
		JPanel mesClients = new JPanel();
		mesClients.setBackground(Color.WHITE);
		mesClients.setBounds(283, 0, 1007, 718);
		frame.getContentPane().add(mesClients);
		mesClients.setLayout(null);
		
		JLabel lblTransactions = new JLabel("Transactions effectu\u00E9es");
		lblTransactions.setBounds(45, 253, 312, 43);
		mesClients.add(lblTransactions);
		lblTransactions.setHorizontalAlignment(SwingConstants.LEFT);
		lblTransactions.setForeground(new Color(153, 153, 255));
		lblTransactions.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		
		table = new JTable();
		table.setBounds(45, 307, 936, 158);
		table.setBackground(new Color(173, 216, 230));
		mesClients.add(table);
		
		JLabel lblChercherUnClient = new JLabel("Chercher un client");
		lblChercherUnClient.setBounds(656, 11, 256, 43);
		lblChercherUnClient.setHorizontalAlignment(SwingConstants.LEFT);
		lblChercherUnClient.setForeground(new Color(153, 153, 255));
		lblChercherUnClient.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		mesClients.add(lblChercherUnClient);
		
		JPanel ajoutAgent = new JPanel();
		ajoutAgent.setBackground(Color.WHITE);
		ajoutAgent.setBounds(283, 0, 1007, 711);
		frame.getContentPane().add(ajoutAgent);
		logo.setLayout(null);
		
		JPanel accueil = new JPanel();
		accueil.setBounds(283, 0, 1022, 710);
		frame.getContentPane().add(accueil);
		accueil.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		accueil.setBackground(Color.WHITE);
		accueil.setLayout(null);
		
		JPanel calculEmprunt = new JPanel();
		calculEmprunt.setBackground(Color.WHITE);
		calculEmprunt.setBounds(283, 0, 1007, 718);
		frame.getContentPane().add(calculEmprunt);
		calculEmprunt.setLayout(null);
		
		JPanel panelEmprunt = new JPanel();
		panelEmprunt.setBounds(45, 523, 728, 168);
		panelEmprunt.setLayout(null);
		panelEmprunt.setBackground(new Color(102, 204, 204));
		calculEmprunt.add(panelEmprunt);
		
		JLabel lblFaireUnEmprunt = new JLabel("Calculer un emprunt");
		lblFaireUnEmprunt.setBounds(45, 476, 280, 43);
		lblFaireUnEmprunt.setHorizontalAlignment(SwingConstants.LEFT);
		lblFaireUnEmprunt.setForeground(new Color(153, 153, 255));
		lblFaireUnEmprunt.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		calculEmprunt.add(lblFaireUnEmprunt);
		
		JLabel lblRaliserUneTransaction = new JLabel("R\u00E9aliser une transaction");
		lblRaliserUneTransaction.setHorizontalAlignment(SwingConstants.LEFT);
		lblRaliserUneTransaction.setForeground(new Color(153, 153, 255));
		lblRaliserUneTransaction.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblRaliserUneTransaction.setBounds(45, 11, 312, 43);
		mesClients.add(lblRaliserUneTransaction);
		
		JPanel realiserTransaction = new JPanel();
		realiserTransaction.setBackground(new Color(173, 216, 230));
		realiserTransaction.setBounds(45, 65, 495, 177);
		mesClients.add(realiserTransaction);
		realiserTransaction.setLayout(null);
		
		textFieldMontant = new JTextField();
		textFieldMontant.setForeground(new Color(173, 216, 230));
		textFieldMontant.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		textFieldMontant.setBounds(123, 98, 166, 31);
		realiserTransaction.add(textFieldMontant);
		textFieldMontant.setColumns(10);
		
		JLabel lblMontant = new JLabel("Montant");
		lblMontant.setHorizontalAlignment(SwingConstants.CENTER);
		lblMontant.setForeground(Color.WHITE);
		lblMontant.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblMontant.setBounds(16, 98, 97, 31);
		realiserTransaction.add(lblMontant);
		
		JLabel lblMontant_1 = new JLabel("N\u00B0 de compte");
		lblMontant_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMontant_1.setForeground(Color.WHITE);
		lblMontant_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblMontant_1.setBounds(16, 11, 140, 31);
		realiserTransaction.add(lblMontant_1);
		
		textFieldNCompte = new JTextField();
		textFieldNCompte.setForeground(new Color(173, 216, 230));
		textFieldNCompte.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		textFieldNCompte.setColumns(10);
		textFieldNCompte.setBounds(166, 11, 166, 31);
		realiserTransaction.add(textFieldNCompte);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblDate.setBounds(16, 56, 97, 31);
		realiserTransaction.add(lblDate);
		
		textFieldDate = new JTextField();
		textFieldDate.setForeground(new Color(173, 216, 230));
		textFieldDate.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		textFieldDate.setColumns(10);
		textFieldDate.setBounds(123, 56, 166, 31);
		realiserTransaction.add(textFieldDate);
		
		JRadioButton rdbtnDepot = new JRadioButton("D\u00E9pot");
		rdbtnDepot.setBounds(389, 86, 87, 23);
		realiserTransaction.add(rdbtnDepot);
		rdbtnDepot.setBackground(new Color(173, 216, 230));
		rdbtnDepot.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		rdbtnDepot.setForeground(Color.WHITE);
		
		JRadioButton rdbtnRetrait = new JRadioButton("Retrait");
		rdbtnRetrait.setBounds(389, 60, 87, 23);
		realiserTransaction.add(rdbtnRetrait);
		rdbtnRetrait.setForeground(Color.WHITE);
		rdbtnRetrait.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		rdbtnRetrait.setBackground(new Color(173, 216, 230));
		
		//Buttons :
		
		JButton btnAjouterAgent = new JButton("Ajouter un agent");
		btnAjouterAgent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAjouterAgent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accueil.setVisible(false);
				mesClients.setVisible(false);
				ajoutAgent.setVisible(true);
				calculEmprunt.setVisible(false);
			}
		});
		btnAjouterAgent.setHorizontalAlignment(SwingConstants.LEADING);
		btnAjouterAgent.setForeground(Color.WHITE);
		btnAjouterAgent.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnAjouterAgent.setFocusPainted(false);
		btnAjouterAgent.setBorderPainted(false);
		btnAjouterAgent.setBackground(new Color(102, 153, 255));
		btnAjouterAgent.setBounds(10, 348, 274, 23);
		menu.add(btnAjouterAgent);

		JButton btnMesClients = new JButton("Mes clients");
		btnMesClients.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMesClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					accueil.setVisible(false);
					mesClients.setVisible(true);
					ajoutAgent.setVisible(false);
					calculEmprunt.setVisible(false);
			}
		});
		btnMesClients.setHorizontalAlignment(SwingConstants.LEADING);
		btnMesClients.setForeground(Color.WHITE);
		btnMesClients.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnMesClients.setFocusPainted(false);
		btnMesClients.setBorderPainted(false);
		btnMesClients.setBackground(new Color(102, 153, 255));
		btnMesClients.setBounds(10, 276, 274, 23);
		menu.add(btnMesClients);
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accueil.setVisible(true);
				mesClients.setVisible(false);
				ajoutAgent.setVisible(false);
				calculEmprunt.setVisible(false);
			}
		});
		btnAccueil.setHorizontalAlignment(SwingConstants.LEADING);
		btnAccueil.setForeground(Color.WHITE);
		btnAccueil.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnAccueil.setFocusPainted(false);
		btnAccueil.setBorderPainted(false);
		btnAccueil.setBackground(new Color(102, 153, 255));
		btnAccueil.setBounds(10, 243, 274, 23);
		menu.add(btnAccueil);
		
		JButton btncalculerEmprunt = new JButton("Calculer emprunt");
		btncalculerEmprunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accueil.setVisible(false);
				mesClients.setVisible(false);
				ajoutAgent.setVisible(false);
				calculEmprunt.setVisible(true);
			}
		});
		btncalculerEmprunt.setHorizontalAlignment(SwingConstants.LEADING);
		btncalculerEmprunt.setForeground(Color.WHITE);
		btncalculerEmprunt.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btncalculerEmprunt.setFocusPainted(false);
		btncalculerEmprunt.setBorderPainted(false);
		btncalculerEmprunt.setBackground(new Color(102, 153, 255));
		btncalculerEmprunt.setBounds(10, 314, 274, 23);
		menu.add(btncalculerEmprunt);

		
		JPanel tdb1 = new JPanel();
		tdb1.setBounds(45, 65, 220, 71);
		tdb1.setFocusCycleRoot(true);
		tdb1.setBorder(null);
		tdb1.setBackground(new Color(102, 204, 153));
		accueil.add(tdb1);
		tdb1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 0, 61, 69);
		tdb1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kater\\OneDrive\\Documents\\L3-SNGI\\S5\\Conception et programmation orient\u00E9s objet\\Fichiers Java\\Bankit\\Img\\Membres.jpg.png"));
		
		JLabel lblTdB_1 = new JLabel("Nombre d'adh\u00E9rents");
		lblTdB_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTdB_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblTdB_1.setForeground(new Color(255, 255, 255));
		lblTdB_1.setBounds(73, 11, 137, 14);
		tdb1.add(lblTdB_1);
		
		JLabel lblTdB_1_1 = new JLabel("200");
		lblTdB_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTdB_1_1.setForeground(Color.WHITE);
		lblTdB_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblTdB_1_1.setBounds(73, 31, 137, 29);
		tdb1.add(lblTdB_1_1);
		
		JLabel lblTableauDeBord = new JLabel("Tableau de bord");
		lblTableauDeBord.setBounds(45, 11, 256, 43);
		lblTableauDeBord.setHorizontalAlignment(SwingConstants.LEFT);
		lblTableauDeBord.setForeground(new Color(153, 153, 255));
		lblTableauDeBord.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		accueil.add(lblTableauDeBord);
		
		JPanel tdb2 = new JPanel();
		tdb2.setBounds(292, 65, 220, 71);
		tdb2.setLayout(null);
		tdb2.setBorder(null);
		tdb2.setBackground(new Color(102, 204, 153));
		accueil.add(tdb2);
		
		JLabel lblTdB_2 = new JLabel("Taux de satisfaction");
		lblTdB_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTdB_2.setForeground(Color.WHITE);
		lblTdB_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblTdB_2.setBounds(73, 11, 137, 14);
		tdb2.add(lblTdB_2);
		
		JPanel tdb3 = new JPanel();
		tdb3.setBounds(45, 158, 220, 71);
		tdb3.setLayout(null);
		tdb3.setBorder(null);
		tdb3.setBackground(new Color(102, 204, 153));
		accueil.add(tdb3);
		
		JLabel lblTdB_3 = new JLabel("Total des transactions r\u00E9alis\u00E9es");
		lblTdB_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTdB_3.setForeground(Color.WHITE);
		lblTdB_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblTdB_3.setBounds(10, 11, 200, 14);
		tdb3.add(lblTdB_3);
		
		JPanel tdb4 = new JPanel();
		tdb4.setBounds(292, 158, 220, 71);
		tdb4.setLayout(null);
		tdb4.setBorder(null);
		tdb4.setBackground(new Color(102, 204, 153));
		accueil.add(tdb4);
		
		JLabel lblTdB_4 = new JLabel("Montant par client");
		lblTdB_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTdB_4.setForeground(Color.WHITE);
		lblTdB_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblTdB_4.setBounds(91, 11, 119, 14);
		tdb4.add(lblTdB_4);
		
		
		JButton btnRaportJournalier = new JButton("Faire un rapport ");
		btnRaportJournalier.setBounds(801, 476, 180, 32);
		mesClients.add(btnRaportJournalier);
		btnRaportJournalier.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRaportJournalier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRaportJournalier.setForeground(new Color(255, 255, 255));
		btnRaportJournalier.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnRaportJournalier.setFocusPainted(false);
		btnRaportJournalier.setBorderPainted(false);
		btnRaportJournalier.setBackground(new Color(102, 153, 255));
		
		JButton btnCalculEmprunt = new JButton("Calculer");
		btnCalculEmprunt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalculEmprunt.setAlignmentY(Component.TOP_ALIGNMENT);
		btnCalculEmprunt.setBounds(605, 125, 113, 32);
		panelEmprunt.add(btnCalculEmprunt);
		btnCalculEmprunt.setForeground(Color.WHITE);
		btnCalculEmprunt.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnCalculEmprunt.setFocusPainted(false);
		btnCalculEmprunt.setBorderPainted(false);
		btnCalculEmprunt.setBackground(new Color(102, 153, 255));
		
		JButton btnNewButton = new JButton("Sauvegarder");
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(336, 135, 140, 31);
		realiserTransaction.add(btnNewButton);
		
	}
}
