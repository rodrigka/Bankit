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

public class TableauDeBord {

	private JFrame frame;
	private JTable table;

	
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 153, 255));
		panel_1.setBounds(0, 0, 284, 92);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel LogoNom = new JLabel("Bankit");
		LogoNom.setHorizontalAlignment(SwingConstants.CENTER);
		LogoNom.setForeground(Color.WHITE);
		LogoNom.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 52));
		LogoNom.setBounds(67, 11, 149, 71);
		panel_1.add(LogoNom);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 255));
		panel.setBounds(0, 0, 284, 744);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel PrenomNom = new JLabel("Prenom Nom");
		PrenomNom.setBounds(10, 161, 112, 19);
		PrenomNom.setForeground(new Color(255, 255, 255));
		PrenomNom.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		panel.add(PrenomNom);
		
		JLabel NbAgent = new JLabel("N\u00B0 Agent : 12345");
		NbAgent.setForeground(Color.WHITE);
		NbAgent.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		NbAgent.setBounds(10, 179, 171, 25);
		panel.add(NbAgent);
		
		JLabel Profile = new JLabel("New label");
		Profile.setBorder(null);
		Profile.setBounds(0, 0, 284, 208);
		panel.add(Profile);
		Profile.setIcon(new ImageIcon("C:\\Users\\kater\\OneDrive\\Documents\\L3-SNGI\\S5\\Conception et programmation orient\u00E9s objet\\Fichiers Java\\Bankit\\Img\\FondProfil.jpg"));
		
		JButton btnFaireUnEmprunt = new JButton("Ajouter un agent");
		btnFaireUnEmprunt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFaireUnEmprunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFaireUnEmprunt.setHorizontalAlignment(SwingConstants.LEADING);
		btnFaireUnEmprunt.setForeground(Color.WHITE);
		btnFaireUnEmprunt.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnFaireUnEmprunt.setFocusPainted(false);
		btnFaireUnEmprunt.setBorderPainted(false);
		btnFaireUnEmprunt.setBackground(new Color(102, 153, 255));
		btnFaireUnEmprunt.setBounds(10, 242, 221, 23);
		panel.add(btnFaireUnEmprunt);
		
		JLabel DroitsAuteur = new JLabel("2022 - Bankit by Katerine Rodriguez");
		DroitsAuteur.setForeground(new Color(255, 255, 255));
		DroitsAuteur.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		DroitsAuteur.setBounds(10, 659, 264, 25);
		panel.add(DroitsAuteur);
		
		JLabel Version = new JLabel("Version : 1.0.0");
		Version.setBounds(10, 679, 264, 14);
		panel.add(Version);
		Version.setForeground(Color.WHITE);
		Version.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		
		JButton btnFaireUnEmprunt_1 = new JButton("Mes clients");
		btnFaireUnEmprunt_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnFaireUnEmprunt_1.setForeground(Color.WHITE);
		btnFaireUnEmprunt_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnFaireUnEmprunt_1.setFocusPainted(false);
		btnFaireUnEmprunt_1.setBorderPainted(false);
		btnFaireUnEmprunt_1.setBackground(new Color(102, 153, 255));
		btnFaireUnEmprunt_1.setBounds(10, 276, 221, 23);
		panel.add(btnFaireUnEmprunt_1);
		
		JButton btnFaireUnEmprunt_1_1 = new JButton("Gerer fond d'investissement");
		btnFaireUnEmprunt_1_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnFaireUnEmprunt_1_1.setForeground(Color.WHITE);
		btnFaireUnEmprunt_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnFaireUnEmprunt_1_1.setFocusPainted(false);
		btnFaireUnEmprunt_1_1.setBorderPainted(false);
		btnFaireUnEmprunt_1_1.setBackground(new Color(102, 153, 255));
		btnFaireUnEmprunt_1_1.setBounds(10, 310, 262, 23);
		panel.add(btnFaireUnEmprunt_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(283, 0, 1007, 759);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel tdb1 = new JPanel();
		tdb1.setFocusCycleRoot(true);
		tdb1.setBorder(null);
		tdb1.setBounds(45, 65, 220, 71);
		tdb1.setBackground(new Color(102, 204, 153));
		panel_2.add(tdb1);
		tdb1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 0, 61, 69);
		tdb1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kater\\OneDrive\\Documents\\L3-SNGI\\S5\\Conception et programmation orient\u00E9s objet\\Fichiers Java\\Bankit\\Img\\Membres.jpg.png"));
		
		JLabel lblTableauDeBord = new JLabel("Tableau de bord");
		lblTableauDeBord.setHorizontalAlignment(SwingConstants.LEFT);
		lblTableauDeBord.setForeground(new Color(153, 153, 255));
		lblTableauDeBord.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblTableauDeBord.setBounds(45, 11, 256, 43);
		panel_2.add(lblTableauDeBord);
		
		JLabel lblTransactions = new JLabel("Transactions");
		lblTransactions.setBounds(45, 253, 180, 43);
		panel_2.add(lblTransactions);
		lblTransactions.setHorizontalAlignment(SwingConstants.LEFT);
		lblTransactions.setForeground(new Color(153, 153, 255));
		lblTransactions.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		
		table = new JTable();
		table.setBackground(new Color(173, 216, 230));
		table.setBounds(45, 307, 936, 158);
		panel_2.add(table);
		
		JButton btnRaportJournalier = new JButton("Faire un rapport ");
		btnRaportJournalier.setBounds(801, 476, 180, 32);
		panel_2.add(btnRaportJournalier);
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
		
		JLabel lblChercherUnClient = new JLabel("Chercher un client");
		lblChercherUnClient.setHorizontalAlignment(SwingConstants.LEFT);
		lblChercherUnClient.setForeground(new Color(153, 153, 255));
		lblChercherUnClient.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblChercherUnClient.setBounds(656, 11, 256, 43);
		panel_2.add(lblChercherUnClient);
		
		JPanel tdb2 = new JPanel();
		tdb2.setLayout(null);
		tdb2.setBorder(null);
		tdb2.setBackground(new Color(102, 204, 153));
		tdb2.setBounds(292, 65, 220, 71);
		panel_2.add(tdb2);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBackground(new Color(102, 204, 204));
		panel_4_1_1.setBounds(45, 523, 728, 168);
		panel_2.add(panel_4_1_1);
		
		JButton btnRaportJournalier_1 = new JButton("Calculer");
		btnRaportJournalier_1.setBounds(605, 125, 113, 32);
		panel_4_1_1.add(btnRaportJournalier_1);
		btnRaportJournalier_1.setForeground(Color.WHITE);
		btnRaportJournalier_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnRaportJournalier_1.setFocusPainted(false);
		btnRaportJournalier_1.setBorderPainted(false);
		btnRaportJournalier_1.setBackground(new Color(102, 153, 255));
		
		JLabel lblFaireUnEmprunt = new JLabel("Calculer un emprunt");
		lblFaireUnEmprunt.setHorizontalAlignment(SwingConstants.LEFT);
		lblFaireUnEmprunt.setForeground(new Color(153, 153, 255));
		lblFaireUnEmprunt.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		lblFaireUnEmprunt.setBounds(45, 476, 280, 43);
		panel_2.add(lblFaireUnEmprunt);
		
		JPanel tdb3 = new JPanel();
		tdb3.setLayout(null);
		tdb3.setBorder(null);
		tdb3.setBackground(new Color(102, 204, 153));
		tdb3.setBounds(45, 158, 220, 71);
		panel_2.add(tdb3);
		
		JPanel tdb4 = new JPanel();
		tdb4.setLayout(null);
		tdb4.setBorder(null);
		tdb4.setBackground(new Color(102, 204, 153));
		tdb4.setBounds(292, 158, 220, 71);
		panel_2.add(tdb4);

	}
}
