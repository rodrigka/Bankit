package BankitPackage;


import java.awt.event.*; 
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.lang.Math;

public class FenetreApplication implements Requete,CalculEmprunt {

	private double tauxInteret = 0;
	private JFrame frame;
	private JTable table;
	private JTextField textFieldMontant;
	private JTextField textFieldNCompte;
	private JTextField textFieldDate;
	private JTextField loginConfirm;
	private JTextField textFieldDuree;
	private JTextField nbcompte;
	private JPasswordField passwordField;
	private JTextField textloginajout;
	private JPasswordField passwordajout;
	private JPasswordField passwordactuel;
	private JTextField textFieldCapEmprunte;
	private JRadioButton rdbtnDepot;
	private JRadioButton rdbtnRetrait;
	private JLabel lblMontantSurLe_1;
	private JLabel lblDernireConnexion_1;
	private JLabel lblEmpruntEnCours_1;
	private JLabel lblTaux;
	private JCheckBox checkBoxAdmin;
	private JLabel lblChangerMotDe;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreApplication window = new FenetreApplication();
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
	
	
	public FenetreApplication() {
		initialize();
		table();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 1400, 720);
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
		menu.setBounds(0, 0, 284, 693);
		frame.getContentPane().add(menu);
		menu.setLayout(null);
		
		JLabel NbAgent = new JLabel("N\u00B0 Agent : 12345");
		NbAgent.setForeground(Color.WHITE);
		NbAgent.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		NbAgent.setBounds(10, 179, 171, 25);
		menu.add(NbAgent);
		
		JLabel Profile = new JLabel("New label");
		Profile.setBorder(null);
		Profile.setBounds(0, 0, 284, 208);
		menu.add(Profile);
		Profile.setIcon(new ImageIcon("Img\\FondProfil.jpg"));
		
		JLabel droitsAuteur = new JLabel("2022 - Bankit by Katerine Rodriguez");
		droitsAuteur.setForeground(new Color(255, 255, 255));
		droitsAuteur.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		droitsAuteur.setBounds(10, 629, 264, 25);
		menu.add(droitsAuteur);
		
		JLabel version = new JLabel("Version : 1.0.0");
		version.setBounds(10, 650, 264, 14);
		menu.add(version);
		version.setForeground(Color.WHITE);
		version.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));

		
		
		
		/**
		 * Panel mesClients :
		 */
		
		JPanel mesClients = new JPanel();
		mesClients.setBackground(Color.WHITE);
		mesClients.setBounds(283, 0, 1007, 720);
		frame.getContentPane().add(mesClients);
		mesClients.setLayout(null);
		
		JLabel lblTransactions = new JLabel("Transactions effectu\u00E9es");
		lblTransactions.setBounds(45, 349, 312, 43);
		lblTransactions.setHorizontalAlignment(SwingConstants.LEFT);
		lblTransactions.setForeground(new Color(153, 153, 255));
		lblTransactions.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		mesClients.add(lblTransactions);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(new Color(102, 153, 255));
		scrollPane.setBounds(45, 403, 495, 158);
		mesClients.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(new Color(173, 216, 230));
		
		JLabel lblChercherUnClient = new JLabel("Chercher un client");
		lblChercherUnClient.setBounds(656, 107, 256, 43);
		lblChercherUnClient.setHorizontalAlignment(SwingConstants.LEFT);
		lblChercherUnClient.setForeground(new Color(153, 153, 255));
		lblChercherUnClient.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		mesClients.add(lblChercherUnClient);
		
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
		
		rdbtnRetrait = new JRadioButton("Retrait");
		rdbtnRetrait.setBounds(389, 60, 87, 23);
		realiserTransaction.add(rdbtnRetrait);
		rdbtnRetrait.setForeground(Color.WHITE);
		rdbtnRetrait.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		rdbtnRetrait.setBackground(new Color(173, 216, 230));
		
		rdbtnDepot = new JRadioButton("Depot");
		rdbtnDepot.setBounds(389, 86, 87, 23);
		realiserTransaction.add(rdbtnDepot);
		rdbtnDepot.setBackground(new Color(173, 216, 230));
		rdbtnDepot.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		rdbtnDepot.setForeground(Color.WHITE);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnRetrait);
		bg.add(rdbtnDepot);
		
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
		
		lblMontantSurLe_1 = new JLabel("0");
		lblMontantSurLe_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMontantSurLe_1.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		lblMontantSurLe_1.setBackground(Color.WHITE);
		lblMontantSurLe_1.setForeground(Color.WHITE);
		lblMontantSurLe_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblMontantSurLe_1.setBounds(256, 96, 116, 43);
		profil.add(lblMontantSurLe_1);
		
		lblDernireConnexion_1 = new JLabel("0");
		lblDernireConnexion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDernireConnexion_1.setForeground(Color.WHITE);
		lblDernireConnexion_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblDernireConnexion_1.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		lblDernireConnexion_1.setBackground(Color.WHITE);
		lblDernireConnexion_1.setBounds(225, 166, 116, 43);
		profil.add(lblDernireConnexion_1);
		
		lblEmpruntEnCours_1 = new JLabel("Non");
		lblEmpruntEnCours_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpruntEnCours_1.setForeground(Color.WHITE);
		lblEmpruntEnCours_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblEmpruntEnCours_1.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		lblEmpruntEnCours_1.setBackground(Color.WHITE);
		lblEmpruntEnCours_1.setBounds(237, 246, 116, 43);
		profil.add(lblEmpruntEnCours_1);

		JButton btnSauverTransac = new JButton("Sauvegarder");
		btnSauverTransac.setBackground(new Color(102, 153, 255));
		btnSauverTransac.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnSauverTransac.setForeground(Color.WHITE);
		btnSauverTransac.setBounds(336, 135, 140, 31);
		realiserTransaction.add(btnSauverTransac);
		btnSauverTransac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				sauverTransac(event);
				rechercheInfosCompte(event);
			}
		});
		
		nbcompte = new JTextField();
		nbcompte.setForeground(new Color(173, 216, 230));
		nbcompte.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		nbcompte.setColumns(10);
		nbcompte.setBounds(769, 161, 166, 31);
		mesClients.add(nbcompte);
		nbcompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				rechercheInfosCompte(event);
			}
		});
		
		

		
		
		/**
		 *  Panel calculer emprunt :
		 */
		
		JPanel calculEmprunt = new JPanel();
		calculEmprunt.setBackground(Color.WHITE);
		calculEmprunt.setBounds(283, 0, 1007, 720);
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
		
		lblTaux = new JLabel("0");
		lblTaux.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaux.setBorder(new LineBorder(Color.WHITE, 1, true));
		lblTaux.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblTaux.setForeground(Color.WHITE);
		lblTaux.setBackground(Color.WHITE);
		lblTaux.setBounds(616, 39, 54, 31);
		panelEmprunt.add(lblTaux);

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
		
		JComboBox<String> comboBoxTypePret = new JComboBox<String>();
		comboBoxTypePret.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBoxTypePret.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		comboBoxTypePret.setForeground(new Color(173, 216, 230));
		comboBoxTypePret.setModel(new DefaultComboBoxModel<String>(new String[] {"", "pret immobilier", "credit consommation", "hypotheque", "pret etudiant"}));
		comboBoxTypePret.setBounds(176, 95, 227, 31);
		comboBoxTypePret.setBackground(Color.WHITE);
		panelEmprunt.add(comboBoxTypePret);
		comboBoxTypePret.addItemListener(new ItemListener(){
			@Override
	        public void itemStateChanged(ItemEvent e){
				choixTypePret(e);
			}
        	
		});
		
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
				calculEmprunt(e);
			}
		});
		
		
		/**
		 * Panel ajout Agent :
		 */
		
		JPanel ajoutAgent = new JPanel();
		ajoutAgent.setBackground(Color.WHITE);
		ajoutAgent.setBounds(283, 0, 1007, 720);
		frame.getContentPane().add(ajoutAgent);
		ajoutAgent.setLayout(null);
		
		JPanel panelAjout = new JPanel();
		panelAjout.setBackground(new Color(173, 216, 230));
		panelAjout.setBounds(446, 416, 525, 247);
		ajoutAgent.add(panelAjout);
		panelAjout.setLayout(null);
		logo.setLayout(null);
		
		JLabel lblAjouterAgent = new JLabel("Ajouter un agent");
		lblAjouterAgent.setBounds(56, 44, 261, 43);
		lblAjouterAgent.setForeground(new Color(153, 153, 255));
		lblAjouterAgent.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		ajoutAgent.add(lblAjouterAgent);
		
		loginConfirm = new JTextField();
		loginConfirm.setForeground(new Color(173, 216, 230));
		loginConfirm.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		loginConfirm.setBounds(112, 157, 166, 31);
		panelAjout.add(loginConfirm);
		loginConfirm.setColumns(10);

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
		
		passwordactuel = new JPasswordField();
		passwordactuel.setForeground(new Color(173, 216, 230));
		passwordactuel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		passwordactuel.setBounds(255, 39, 166, 31);
		panelAjout.add(passwordactuel);
		
		JPanel panelAjout_1 = new JPanel();
		panelAjout_1.setLayout(null);
		panelAjout_1.setBackground(new Color(173, 216, 230));
		panelAjout_1.setBounds(46, 103, 525, 247);
		ajoutAgent.add(panelAjout_1);
		
		JLabel lblLogin_1 = new JLabel("Login");
		lblLogin_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin_1.setForeground(Color.WHITE);
		lblLogin_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblLogin_1.setBounds(28, 59, 97, 31);
		panelAjout_1.add(lblLogin_1);
		
		JLabel lblMdP = new JLabel("Mot de passe");
		lblMdP.setHorizontalAlignment(SwingConstants.LEFT);
		lblMdP.setForeground(Color.WHITE);
		lblMdP.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblMdP.setBounds(28, 118, 141, 31);
		panelAjout_1.add(lblMdP);
		
		textloginajout = new JTextField();
		textloginajout.setForeground(new Color(173, 216, 230));
		textloginajout.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		textloginajout.setColumns(10);
		textloginajout.setBounds(121, 59, 166, 31);
		panelAjout_1.add(textloginajout);
		
		passwordajout = new JPasswordField();
		passwordajout.setForeground(new Color(173, 216, 230));
		passwordajout.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		passwordajout.setBounds(169, 122, 166, 31);
		panelAjout_1.add(passwordajout);
		
		checkBoxAdmin = new JCheckBox("Admin");
		checkBoxAdmin.setBackground(new Color(173, 216, 230));
		checkBoxAdmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		checkBoxAdmin.setForeground(Color.WHITE);
		checkBoxAdmin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		checkBoxAdmin.setBounds(394, 59, 99, 23);
		panelAjout_1.add(checkBoxAdmin);
		
		lblChangerMotDe = new JLabel("Changer mot de passe");
		lblChangerMotDe.setHorizontalAlignment(SwingConstants.TRAILING);
		lblChangerMotDe.setForeground(new Color(153, 153, 255));
		lblChangerMotDe.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblChangerMotDe.setBounds(611, 362, 349, 43);
		ajoutAgent.add(lblChangerMotDe);

		JButton btnAjoutAgent = new JButton("Ajouter");
		btnAjoutAgent.setBackground(new Color(102, 153, 255));
		btnAjoutAgent.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnAjoutAgent.setForeground(Color.WHITE);
		btnAjoutAgent.setBounds(364, 191, 117, 31);
		panelAjout_1.add(btnAjoutAgent);
		btnAjoutAgent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ajoutAgent(e);
			}
		});

		JButton btnChanger = new JButton("Changer");
		btnChanger.setBackground(new Color(102, 153, 255));
		btnChanger.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnChanger.setForeground(Color.WHITE);
		btnChanger.setBounds(392, 205, 108, 31);
		panelAjout.add(btnChanger);
		btnChanger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changerPassword(e);
			}
		});
		
		
		
		
		/**
		 * Buttons d'affichage JPanels :
		 */
		
		JButton configuration = new JButton("Configuration");
		configuration.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		configuration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mesClients.setVisible(false);
				ajoutAgent.setVisible(true);
				calculEmprunt.setVisible(false);
			}
		});
		configuration.setHorizontalAlignment(SwingConstants.LEADING);
		configuration.setForeground(Color.WHITE);
		configuration.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		configuration.setFocusPainted(false);
		configuration.setBorderPainted(false);
		configuration.setBackground(new Color(102, 153, 255));
		configuration.setBounds(10, 306, 274, 25);
		menu.add(configuration);

		
		JButton btnMesClients = new JButton("Mes clients");
		btnMesClients.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMesClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnMesClients.setBounds(10, 252, 274, 23);
		menu.add(btnMesClients);
		
		
		JButton btncalculerEmprunt = new JButton("Calculer emprunt");
		btncalculerEmprunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btncalculerEmprunt.setBounds(10, 279, 274, 23);
		menu.add(btncalculerEmprunt);
		
		
		JButton btnActualiser = new JButton("Actualiser");
		btnActualiser.setBounds(406, 574, 134, 32);
		mesClients.add(btnActualiser);
		btnActualiser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActualiser.setForeground(new Color(255, 255, 255));
		btnActualiser.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnActualiser.setFocusPainted(false);
		btnActualiser.setBorderPainted(false);
		btnActualiser.setBackground(new Color(102, 153, 255));
		btnActualiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table();
			}
		});
		
	}
	
	
	
	
		
	
	/**
	 * Methodes de l'interface Requete
	 */
	
	// Methode pour recuperer les données de la table transactions
	public void table() {
		ConnectionSQL c = new ConnectionSQL();
		try {
			String [] entete = {"N° de compte","Montant Transféré", "Date Transfert"};
			String [] ligne = new String[4];
			
			DefaultTableModel modele = new DefaultTableModel(null, entete);
			String requete = "SELECT * FROM Transactions";
			c.connexion();
			c.result = c.statement.executeQuery(requete);
			
			while(c.result.next()) {
				ligne [0] = c.result.getString("numCompte");
				ligne [1] = c.result.getString("montantTransfert");
				ligne [2] = c.result.getString("dateTransfert");
				modele.addRow(ligne);
			}
			
			table.setModel(modele);
			c.deconnexion();
		}catch(Exception e) {
			
		}
	}
	
	
	public void sauverTransac(ActionEvent event) {
		ConnectionSQL c = new ConnectionSQL();
		try {
			String numCompte, date;
			int montant;
			numCompte = textFieldNCompte.getText();
			date = textFieldDate.getText();
			montant = Integer.parseInt(textFieldMontant.getText());
			boolean depot = rdbtnDepot.isSelected();
			boolean retrait = rdbtnRetrait.isSelected();
			c.connexion();
			
			if(depot == true){
				c.statement.executeUpdate("UPDATE Clients SET montantCompte = montantCompte+"+montant
						+ " WHERE numCompte='"+numCompte+"'");
				
				c.statement.executeUpdate("INSERT INTO Transactions(numCompte,montantTransfert,dateTransfert)"
						+ "VALUES ('"+numCompte+"',"+montant+",'"+date+"')");
				JOptionPane.showMessageDialog(null,"Votre transaction a été validée", "Validé !", JOptionPane.INFORMATION_MESSAGE);
				
			}else {
				if (retrait == true){
					montant = -1 * montant;   // Faire que la valeur soit négative.
					c.statement.executeUpdate("UPDATE Clients SET montantCompte = montantCompte"+montant
							+ " WHERE numCompte='"+numCompte+"'");
					c.statement.executeUpdate("INSERT INTO Transactions(numCompte,montantTransfert,dateTransfert)"
							+ "VALUES ('"+numCompte+"',"+montant+",'"+date+"')");
					JOptionPane.showMessageDialog(null,"Votre transaction a été validée", "Validé !", JOptionPane.INFORMATION_MESSAGE);
					
				}else {
					JOptionPane.showMessageDialog(null,"Veuillez indiquer de quel type de transaction il s'agit", "Oh oh !", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			table();
			c.deconnexion();
			
		}catch (SQLException exe) {
			JOptionPane.showMessageDialog(null, exe.getMessage(),"Erreur de connexion", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public void rechercheInfosCompte(ActionEvent event) {
		ConnectionSQL c = new ConnectionSQL();
		try {
			String numcompte = nbcompte.getText();
			c.connexion();
			
			String check ="SELECT * FROM Clients "
						+ "WHERE numCompte='"+numcompte+"'";
			c.result = c.statement.executeQuery(check);
			
			
			if(c.result.next()) {
				int montant = c.result.getInt("montantCompte");
				lblMontantSurLe_1.setText(String.valueOf(montant));
				String datedrconn = c.result.getString("dateDerniereConn");
				lblDernireConnexion_1.setText(datedrconn);
				int valemprunt = c.result.getInt("emprunt");
				
				if (valemprunt == 0) {
					lblEmpruntEnCours_1.setText("Non");
				}else {
					lblEmpruntEnCours_1.setText("Oui");
				}

			}else {
				JOptionPane.showMessageDialog(null,"Ce numéro de compte n'existe pas", "Oh oh !", JOptionPane.INFORMATION_MESSAGE);
			}
			
			c.deconnexion();
		}catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(),"Erreur de connexion", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	@SuppressWarnings("deprecation")
	public void ajoutAgent(MouseEvent e) {
		ConnectionSQL c = new ConnectionSQL();
		try {
			String login, password;
			boolean admin = checkBoxAdmin.isSelected();
			login = textloginajout.getText();
			password = passwordajout.getText();
			String role;
			
			c.connexion();
			if(admin) {
				role = "Admin";
				c.statement.executeUpdate("INSERT INTO LoginInfo(login,password,role)"
											+ "VALUES ('"+login+"','"+password+"','"+role+"')");
				JOptionPane.showMessageDialog(frame, "Ajout du nouvel agent validé","Validé !",JOptionPane.PLAIN_MESSAGE);
			}else {
				role = "notAdmin";
				c.statement.executeUpdate("INSERT INTO LoginInfo(login,password,role)"
											+ "VALUES ('"+login+"','"+password+"','"+role+"')");
				JOptionPane.showMessageDialog(frame, "Ajout du nouvel agent validé","Validé !",JOptionPane.PLAIN_MESSAGE);
			}
			c.deconnexion();
		}catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(),"Erreur de connexion", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	@SuppressWarnings("deprecation")
	public void changerPassword(ActionEvent e) {
		ConnectionSQL c = new ConnectionSQL();
		try {
			String login, password, newpassword;
			login = loginConfirm.getText();
			password = passwordactuel.getText();
			newpassword = passwordField.getText();
			c.connexion();
			
			String check = "SELECT * FROM LoginInfo "
					+ "WHERE login='" +login+ "' AND password='"+password+"'";
			c.result = c.statement.executeQuery(check);
			
			if(c.result.next()) {
				c.statement.executeUpdate("UPDATE LoginInfo SET password = '"+newpassword+"'"
											+ "WHERE login='"+login+"'");
				JOptionPane.showMessageDialog(frame, "Changement du mot de passe effectué","Validé !",JOptionPane.PLAIN_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(frame, "Login ou mot de passe actuel invalides","Erreur",JOptionPane.PLAIN_MESSAGE);
			}
			c.deconnexion();
		}catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(),"Erreur de connexion", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
	/**
	 * Methodes de l'interface CalculEmprunt
	 */
	
	
	public void choixTypePret(ItemEvent e) {
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
	
	
	public void calculEmprunt(MouseEvent e) {
		String sc = textFieldDuree.getText();
		String sd = textFieldCapEmprunte.getText();
		
		try {
			double capitalEmprunte = Double.parseDouble(sd);
			double dureeRembourse = Double.parseDouble(sc);
			double total;
			
			tauxInteret = tauxInteret * 0.01;   //Mettre de taux d'interet en pourcentage 3,2 => 0.032 = 3,2%.
        	total = ((capitalEmprunte * (tauxInteret/12) * Math.pow(1+(tauxInteret/12),dureeRembourse)) / (Math.pow(1+(tauxInteret/12),dureeRembourse)-1));
        	
        	JOptionPane.showMessageDialog(frame, "Resultat = "+total+" euros","Montant a payer par mois",JOptionPane.PLAIN_MESSAGE);
        	
		}catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage(),"Erreur de format", JOptionPane.ERROR_MESSAGE);
		}
	}

	
}
