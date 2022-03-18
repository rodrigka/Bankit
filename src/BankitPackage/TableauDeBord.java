package BankitPackage;

import java.awt.event.ActionListener; 
 import java.awt.event.ActionEvent;
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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableauDeBord {

	private double tauxInteret = 0;
	private JFrame frame;
	private JTable table;
	private JTextField textFieldMontant;
	private JTextField textFieldNCompte;
	private JTextField textFieldDate;
	private JTextField textFieldCapitalEmp;
	private JTextField textFieldDuree;
	private JTextField nbcompte;
	private JPasswordField passwordField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JLabel lblMdPactuel;
	private JComboBox comboBoxTypePret;
	private JTextField textFieldCapEmprunte;

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
	
	public JTextField getNbcompte() {
		return nbcompte;
	}

	public void setNbcompte(JTextField nbcompte) {
		this.nbcompte = nbcompte;
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
		
		
		
		/*
		 *  Panel calculer emprunt :
		 */
		
		JPanel calculEmprunt = new JPanel();
		calculEmprunt.setBackground(Color.WHITE);
		calculEmprunt.setBounds(283, 0, 1007, 718);
		frame.getContentPane().add(calculEmprunt);
		calculEmprunt.setLayout(null);
		
		JPanel panelEmprunt = new JPanel();
		panelEmprunt.setBounds(161, 300, 728, 248);
		panelEmprunt.setLayout(null);
		panelEmprunt.setBackground(new Color(173, 216, 230));
		calculEmprunt.add(panelEmprunt);
		
		JLabel lblFaireUnEmprunt = new JLabel("Calculer un pr\u00EAt");
		lblFaireUnEmprunt.setBounds(388, 204, 261, 43);
		lblFaireUnEmprunt.setHorizontalAlignment(SwingConstants.CENTER);
		lblFaireUnEmprunt.setForeground(new Color(153, 153, 255));
		lblFaireUnEmprunt.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		calculEmprunt.add(lblFaireUnEmprunt);
		
		JLabel lblCapitalEmp = new JLabel("Capital emprunt\u00E9");
		lblCapitalEmp.setBackground(Color.WHITE);
		lblCapitalEmp.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapitalEmp.setForeground(Color.WHITE);
		lblCapitalEmp.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblCapitalEmp.setBounds(10, 39, 156, 31);
		panelEmprunt.add(lblCapitalEmp);
		
		JLabel lblTaux = new JLabel("0");
		lblTaux.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaux.setBorder(new LineBorder(Color.WHITE, 1, true));
		lblTaux.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblTaux.setForeground(Color.WHITE);
		lblTaux.setBackground(Color.WHITE);
		lblTaux.setBounds(616, 39, 54, 31);
		panelEmprunt.add(lblTaux);
		
		JComboBox comboBoxTypePret = new JComboBox();
		comboBoxTypePret.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBoxTypePret.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		comboBoxTypePret.setForeground(new Color(173, 216, 230));
		comboBoxTypePret.setModel(new DefaultComboBoxModel(new String[] {"", "pret immobilier", "credit consommation", "hypotheque", "pret etudiant"}));
		comboBoxTypePret.setBounds(176, 95, 227, 31);
		comboBoxTypePret.setBackground(Color.WHITE);
		panelEmprunt.add(comboBoxTypePret);
		
		comboBoxTypePret.addItemListener(new ItemListener(){
			
			@Override
	        public void itemStateChanged(ItemEvent e){
				
				if(e.getStateChange()==ItemEvent.SELECTED){
				
		        	if (e.getItem().equals("pret immobilier")){
		            	tauxInteret = 1.2;
		            } else if (e.getItem().equals("credit consommation")){
		            	tauxInteret = 3.2;
		            } else if (e.getItem().equals("hypotheque")){
		            	tauxInteret = 0.8;
		            } else if (e.getItem().equals("pret etudiant")){
		            	tauxInteret = 0.5;
		            }
		        	
		        	lblTaux.setText(String.valueOf(tauxInteret));
				}
			}
        	
		});
		
		
		JLabel lblDuree = new JLabel("Dur\u00E9e de remboursement");
		lblDuree.setHorizontalAlignment(SwingConstants.CENTER);
		lblDuree.setForeground(Color.WHITE);
		lblDuree.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblDuree.setBounds(10, 147, 227, 31);
		panelEmprunt.add(lblDuree);
		
		JLabel lblTauxDuPrt = new JLabel("Taux du pr\u00EAt");
		lblTauxDuPrt.setHorizontalAlignment(SwingConstants.CENTER);
		lblTauxDuPrt.setForeground(Color.WHITE);
		lblTauxDuPrt.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblTauxDuPrt.setBounds(485, 39, 124, 31);
		panelEmprunt.add(lblTauxDuPrt);
		
		JLabel lblTauxDuPrt_1 = new JLabel("%");
		lblTauxDuPrt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTauxDuPrt_1.setForeground(Color.WHITE);
		lblTauxDuPrt_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblTauxDuPrt_1.setBounds(674, 39, 28, 31);
		panelEmprunt.add(lblTauxDuPrt_1);
		
		JLabel lblMois = new JLabel("mois");
		lblMois.setHorizontalAlignment(SwingConstants.CENTER);
		lblMois.setForeground(Color.WHITE);
		lblMois.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblMois.setBounds(345, 147, 48, 31);
		panelEmprunt.add(lblMois);
		
		JLabel lblTypePret = new JLabel("Type de pr\u00EAt");
		lblTypePret.setHorizontalAlignment(SwingConstants.CENTER);
		lblTypePret.setForeground(Color.WHITE);
		lblTypePret.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblTypePret.setBounds(10, 91, 156, 31);
		panelEmprunt.add(lblTypePret);
		
		textFieldCapEmprunte = new JTextField();
		textFieldCapEmprunte.setForeground(new Color(173, 216, 230));
		textFieldCapEmprunte.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		textFieldCapEmprunte.setColumns(10);
		textFieldCapEmprunte.setBounds(176, 39, 203, 31);
		panelEmprunt.add(textFieldCapEmprunte);
		
		textFieldDuree = new JTextField();
		textFieldDuree.setForeground(new Color(173, 216, 230));
		textFieldDuree.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		textFieldDuree.setColumns(10);
		textFieldDuree.setBounds(247, 147, 85, 31);
		panelEmprunt.add(textFieldDuree);
		
		
		
		
		/*
		 * Panel mesClients :
		 */
		
		JPanel mesClients = new JPanel();
		mesClients.setBackground(Color.WHITE);
		mesClients.setBounds(283, 0, 1007, 718);
		frame.getContentPane().add(mesClients);
		mesClients.setLayout(null);
		
		JLabel lblTransactions = new JLabel("Transactions effectu\u00E9es");
		lblTransactions.setBounds(45, 349, 312, 43);
		lblTransactions.setHorizontalAlignment(SwingConstants.LEFT);
		lblTransactions.setForeground(new Color(153, 153, 255));
		lblTransactions.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		mesClients.add(lblTransactions);
		
		table = new JTable();
		table.setBounds(45, 403, 495, 158);
		table.setBackground(new Color(173, 216, 230));
		mesClients.add(table);
		
		JLabel lblChercherUnClient = new JLabel("Chercher un client");
		lblChercherUnClient.setBounds(656, 107, 256, 43);
		lblChercherUnClient.setHorizontalAlignment(SwingConstants.LEFT);
		lblChercherUnClient.setForeground(new Color(153, 153, 255));
		lblChercherUnClient.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		mesClients.add(lblChercherUnClient);
		
		nbcompte = new JTextField();
		nbcompte.setForeground(new Color(173, 216, 230));
		nbcompte.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		nbcompte.setColumns(10);
		nbcompte.setBounds(769, 161, 166, 31);
		mesClients.add(nbcompte);
		//nbcompte.addActionListener(new RechercheClient());
		
		JLabel lblMontant_1_1 = new JLabel("N\u00B0 de compte");
		lblMontant_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMontant_1_1.setForeground(new Color(173, 216, 230));
		lblMontant_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblMontant_1_1.setBounds(619, 161, 140, 31);
		mesClients.add(lblMontant_1_1);
		
		JPanel profil = new JPanel();
		profil.setLayout(null);
		profil.setBackground(new Color(173, 216, 230));
		profil.setBounds(574, 215, 397, 330);
		mesClients.add(profil);
		
		JLabel lblRaliserUneTransaction = new JLabel("R\u00E9aliser une transaction");
		lblRaliserUneTransaction.setHorizontalAlignment(SwingConstants.LEFT);
		lblRaliserUneTransaction.setForeground(new Color(153, 153, 255));
		lblRaliserUneTransaction.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblRaliserUneTransaction.setBounds(45, 107, 312, 43);
		mesClients.add(lblRaliserUneTransaction);
		
		JPanel realiserTransaction = new JPanel();
		realiserTransaction.setBackground(new Color(173, 216, 230));
		realiserTransaction.setBounds(45, 161, 495, 177);
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
		
		JButton btnNewButton = new JButton("Sauvegarder");
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(336, 135, 140, 31);
		realiserTransaction.add(btnNewButton);
		
		JLabel lblProfil = new JLabel("Profil");
		lblProfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfil.setForeground(Color.WHITE);
		lblProfil.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblProfil.setBounds(74, 11, 256, 43);
		profil.add(lblProfil);
		
		JLabel lblMontantSurLe = new JLabel("Montant sur le compte");
		lblMontantSurLe.setForeground(Color.WHITE);
		lblMontantSurLe.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblMontantSurLe.setBounds(10, 96, 236, 43);
		profil.add(lblMontantSurLe);
		
		JLabel lblDernireConnexion = new JLabel("Derni\u00E8re connexion");
		lblDernireConnexion.setForeground(Color.WHITE);
		lblDernireConnexion.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblDernireConnexion.setBounds(10, 166, 236, 43);
		profil.add(lblDernireConnexion);
		
		JLabel lblEmpruntEnCours = new JLabel("Emprunt en cours ?");
		lblEmpruntEnCours.setForeground(Color.WHITE);
		lblEmpruntEnCours.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblEmpruntEnCours.setBounds(10, 246, 236, 43);
		profil.add(lblEmpruntEnCours);
		
		JLabel lblMontantSurLe_1 = new JLabel("0");
		lblMontantSurLe_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMontantSurLe_1.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		lblMontantSurLe_1.setBackground(Color.WHITE);
		lblMontantSurLe_1.setForeground(Color.WHITE);
		lblMontantSurLe_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblMontantSurLe_1.setBounds(256, 96, 116, 43);
		profil.add(lblMontantSurLe_1);
		
		JLabel lblDernireConnexion_1 = new JLabel("0");
		lblDernireConnexion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDernireConnexion_1.setForeground(Color.WHITE);
		lblDernireConnexion_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblDernireConnexion_1.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		lblDernireConnexion_1.setBackground(Color.WHITE);
		lblDernireConnexion_1.setBounds(225, 166, 116, 43);
		profil.add(lblDernireConnexion_1);
		
		JLabel lblEmpruntEnCours_1 = new JLabel("Non");
		lblEmpruntEnCours_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpruntEnCours_1.setForeground(Color.WHITE);
		lblEmpruntEnCours_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblEmpruntEnCours_1.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		lblEmpruntEnCours_1.setBackground(Color.WHITE);
		lblEmpruntEnCours_1.setBounds(237, 246, 116, 43);
		profil.add(lblEmpruntEnCours_1);
		
		
		
		
		/*
		 * Panel Accueil :
		 */
		
		JPanel accueil = new JPanel();
		accueil.setBounds(283, 0, 1022, 710);
		frame.getContentPane().add(accueil);
		accueil.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		accueil.setBackground(Color.WHITE);
		accueil.setLayout(null);
		
		JPanel tdb1 = new JPanel();
		tdb1.setBounds(45, 147, 435, 223);
		tdb1.setFocusCycleRoot(true);
		tdb1.setBorder(null);
		tdb1.setBackground(new Color(102, 204, 153));
		accueil.add(tdb1);
		tdb1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 71, 61, 69);
		tdb1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kater\\OneDrive\\Documents\\L3-SNGI\\S5\\Conception et programmation orient\u00E9s objet\\Fichiers Java\\Bankit\\Img\\Membres.jpg.png"));
		
		JLabel lblTdB_1 = new JLabel("Nombre d'adh\u00E9rents");
		lblTdB_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTdB_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 38));
		lblTdB_1.setForeground(new Color(255, 255, 255));
		lblTdB_1.setBounds(10, 11, 415, 38);
		tdb1.add(lblTdB_1);
		
		JLabel lblTdB_1_1 = new JLabel("200");
		lblTdB_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTdB_1_1.setForeground(Color.WHITE);
		lblTdB_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 98));
		lblTdB_1_1.setBounds(166, 71, 214, 105);
		tdb1.add(lblTdB_1_1);
		
		JLabel lblTableauDeBord = new JLabel("Tableau de bord");
		lblTableauDeBord.setBounds(45, 81, 450, 43);
		lblTableauDeBord.setHorizontalAlignment(SwingConstants.LEFT);
		lblTableauDeBord.setForeground(new Color(153, 153, 255));
		lblTableauDeBord.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 48));
		accueil.add(lblTableauDeBord);
		
		JPanel tdb2 = new JPanel();
		tdb2.setBounds(490, 147, 480, 223);
		tdb2.setLayout(null);
		tdb2.setBorder(null);
		tdb2.setBackground(new Color(102, 204, 153));
		accueil.add(tdb2);
		
		JLabel lblTdB_2 = new JLabel("Taux de satisfaction");
		lblTdB_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTdB_2.setForeground(Color.WHITE);
		lblTdB_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 38));
		lblTdB_2.setBounds(10, 11, 460, 39);
		tdb2.add(lblTdB_2);
		
		JLabel lblTdB_2_1 = new JLabel("200");
		lblTdB_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTdB_2_1.setForeground(Color.WHITE);
		lblTdB_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 98));
		lblTdB_2_1.setBounds(220, 74, 214, 105);
		tdb2.add(lblTdB_2_1);
		
		JPanel tdb3 = new JPanel();
		tdb3.setBounds(45, 381, 435, 223);
		tdb3.setLayout(null);
		tdb3.setBorder(null);
		tdb3.setBackground(new Color(102, 204, 153));
		accueil.add(tdb3);
		
		JLabel lblTdB_3 = new JLabel("Total des transactions");
		lblTdB_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTdB_3.setForeground(Color.WHITE);
		lblTdB_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 38));
		lblTdB_3.setBounds(10, 11, 415, 36);
		tdb3.add(lblTdB_3);
		
		JLabel lblTdB_3_1 = new JLabel("200");
		lblTdB_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTdB_3_1.setForeground(Color.WHITE);
		lblTdB_3_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 98));
		lblTdB_3_1.setBounds(176, 73, 214, 105);
		tdb3.add(lblTdB_3_1);
		
		JPanel tdb4 = new JPanel();
		tdb4.setBounds(490, 381, 480, 223);
		tdb4.setLayout(null);
		tdb4.setBorder(null);
		tdb4.setBackground(new Color(102, 204, 153));
		accueil.add(tdb4);
		
		JLabel lblTdB_4 = new JLabel("Montant par client");
		lblTdB_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTdB_4.setForeground(Color.WHITE);
		lblTdB_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 38));
		lblTdB_4.setBounds(10, 11, 460, 44);
		tdb4.add(lblTdB_4);
		
		JLabel lblTdB_4_1 = new JLabel("200");
		lblTdB_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTdB_4_1.setForeground(Color.WHITE);
		lblTdB_4_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 98));
		lblTdB_4_1.setBounds(225, 76, 214, 105);
		tdb4.add(lblTdB_4_1);
		
		
		
		
		
		/*
		 * Panel ajout Agent :
		 */
		
		JPanel ajoutAgent = new JPanel();
		ajoutAgent.setBackground(Color.WHITE);
		ajoutAgent.setBounds(283, 0, 1007, 711);
		frame.getContentPane().add(ajoutAgent);
		ajoutAgent.setLayout(null);
		
		JPanel panelAjout = new JPanel();
		panelAjout.setBackground(new Color(173, 216, 230));
		panelAjout.setBounds(446, 416, 525, 247);
		ajoutAgent.add(panelAjout);
		panelAjout.setLayout(null);
		logo.setLayout(null);
		
		JButton btnChanger = new JButton("Changer");
		btnChanger.setBackground(new Color(102, 153, 255));
		btnChanger.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnChanger.setForeground(Color.WHITE);
		btnChanger.setBounds(392, 205, 108, 31);
		panelAjout.add(btnChanger);
		
		JLabel lblAjouterAgent = new JLabel("Ajouter un agent");
		lblAjouterAgent.setBounds(56, 44, 261, 43);
		lblAjouterAgent.setForeground(new Color(153, 153, 255));
		lblAjouterAgent.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		ajoutAgent.add(lblAjouterAgent);
		
		textFieldCapitalEmp = new JTextField();
		textFieldCapitalEmp.setForeground(new Color(173, 216, 230));
		textFieldCapitalEmp.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		textFieldCapitalEmp.setBounds(112, 157, 166, 31);
		panelAjout.add(textFieldCapitalEmp);
		textFieldCapitalEmp.setColumns(10);

		
		JLabel lblMdPactuel;
		lblMdPactuel = new JLabel("Mot de passe actuel");
		lblMdPactuel.setHorizontalAlignment(SwingConstants.LEFT);
		lblMdPactuel.setForeground(Color.WHITE);
		lblMdPactuel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblMdPactuel.setBounds(35, 39, 210, 31);
		panelAjout.add(lblMdPactuel);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblLogin.setBounds(35, 157, 88, 31);
		panelAjout.add(lblLogin);
		
		JLabel lblNouvelMdP = new JLabel("Nouvel mot de passe");
		lblNouvelMdP.setHorizontalAlignment(SwingConstants.LEFT);
		lblNouvelMdP.setForeground(Color.WHITE);
		lblNouvelMdP.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblNouvelMdP.setBounds(35, 94, 188, 31);
		panelAjout.add(lblNouvelMdP);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(173, 216, 230));
		passwordField.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		passwordField.setBounds(255, 94, 166, 31);
		panelAjout.add(passwordField);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setForeground(new Color(173, 216, 230));
		passwordField_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		passwordField_2.setBounds(255, 39, 166, 31);
		panelAjout.add(passwordField_2);
		
		JPanel panelAjout_1 = new JPanel();
		panelAjout_1.setLayout(null);
		panelAjout_1.setBackground(new Color(173, 216, 230));
		panelAjout_1.setBounds(46, 103, 525, 247);
		ajoutAgent.add(panelAjout_1);
		
		JButton btnAjoutAgent = new JButton("Ajouter");
		btnAjoutAgent.setBackground(new Color(102, 153, 255));
		btnAjoutAgent.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnAjoutAgent.setForeground(Color.WHITE);
		btnAjoutAgent.setBounds(398, 191, 117, 31);
		panelAjout_1.add(btnAjoutAgent);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(173, 216, 230));
		textField_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(128, 39, 166, 31);
		panelAjout_1.add(textField_2);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setHorizontalAlignment(SwingConstants.LEFT);
		lblNom.setForeground(Color.WHITE);
		lblNom.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblNom.setBounds(35, 39, 97, 31);
		panelAjout_1.add(lblNom);
		
		JLabel lblLogin_1 = new JLabel("Login");
		lblLogin_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin_1.setForeground(Color.WHITE);
		lblLogin_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblLogin_1.setBounds(35, 94, 97, 31);
		panelAjout_1.add(lblLogin_1);
		
		JLabel lblMdP = new JLabel("Mot de passe");
		lblMdP.setHorizontalAlignment(SwingConstants.LEFT);
		lblMdP.setForeground(Color.WHITE);
		lblMdP.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblMdP.setBounds(35, 153, 141, 31);
		panelAjout_1.add(lblMdP);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(173, 216, 230));
		textField_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(128, 94, 166, 31);
		panelAjout_1.add(textField_3);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setForeground(new Color(173, 216, 230));
		passwordField_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		passwordField_1.setBounds(176, 157, 166, 31);
		panelAjout_1.add(passwordField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Admin");
		chckbxNewCheckBox.setBackground(new Color(173, 216, 230));
		chckbxNewCheckBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(394, 59, 99, 23);
		panelAjout_1.add(chckbxNewCheckBox);
		
		JLabel lblChangerMotDe = new JLabel("Changer mot de passe");
		lblChangerMotDe.setHorizontalAlignment(SwingConstants.TRAILING);
		lblChangerMotDe.setForeground(new Color(153, 153, 255));
		lblChangerMotDe.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblChangerMotDe.setBounds(611, 362, 349, 43);
		ajoutAgent.add(lblChangerMotDe);

		
		/*
		 * Buttons :
		 */
		
		JButton btnAjouterAgent = new JButton("Configuration");
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
		btnAjouterAgent.setBounds(10, 340, 274, 25);
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
		btncalculerEmprunt.setBounds(10, 310, 274, 23);
		menu.add(btncalculerEmprunt);
		
		JButton btnRaportJournalier = new JButton("Faire un rapport ");
		btnRaportJournalier.setBounds(360, 574, 180, 32);
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
		btnCalculEmprunt.setBounds(605, 205, 113, 32);
		panelEmprunt.add(btnCalculEmprunt);
		btnCalculEmprunt.setForeground(Color.WHITE);
		btnCalculEmprunt.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnCalculEmprunt.setFocusPainted(false);
		btnCalculEmprunt.setBorderPainted(false);
		btnCalculEmprunt.setBackground(new Color(102, 153, 255));
		
		btnCalculEmprunt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String sc = textFieldDuree.getText();
				String sd = textFieldCapEmprunte.getText();
				
				try {
					double capitalEmprunte = Double.parseDouble(sc);
					double dureeRembourse = Double.parseDouble(sd);
					double total;
					double capitalE;
					
					tauxInteret = tauxInteret * 0.01;   //Mettre de taux d'interet en pourcentage 3,2 => 0.032 = 3,2%.
					capitalE = 1000*(capitalEmprunte + (capitalEmprunte*tauxInteret));
		        	total = 1000*(capitalE/dureeRembourse);
		        	JOptionPane.showMessageDialog(frame, "Resultat = "+total,"Montant a payer par mois",JOptionPane.PLAIN_MESSAGE);
		        	
				}catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage(),"Erreur de format", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
	
	}
}
