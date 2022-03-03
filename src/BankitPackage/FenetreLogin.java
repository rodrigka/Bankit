package BankitPackage;

import java.sql.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreLogin {

	private JFrame frame;
	private JPasswordField txtPassword;
	private JLabel logoNama;
	private JLabel slogan;
	private JLabel logo;
	private JLabel lbl1;
	private JTextField txtLogin;
	private JLabel lbl3;
	private JLabel lbl4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreLogin window = new FenetreLogin();
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
	public FenetreLogin() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(102, 153, 255));
		panel.setBackground(new Color(102, 153, 255));
		panel.setBounds(0, 0, 316, 513);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		logoNama = new JLabel("Bankit");
		logoNama.setBounds(83, 66, 149, 71);
		logoNama.setHorizontalAlignment(SwingConstants.CENTER);
		logoNama.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 52));
		logoNama.setForeground(new Color(255, 255, 255));
		panel.add(logoNama);
		
		slogan = new JLabel("Application de gestion bancaire");
		slogan.setBounds(21, 151, 274, 30);
		slogan.setHorizontalAlignment(SwingConstants.CENTER);
		slogan.setForeground(new Color(255, 255, 255));
		slogan.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		panel.add(slogan);
		
		logo = new JLabel("");
		logo.setBounds(71, 212, 173, 173);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon("C:\\Users\\kater\\OneDrive\\Documents\\L3-SNGI\\S5\\Conception et programmation orient\u00E9s objet\\Fichiers Java\\Bankit\\Img\\LogoWhite.png"));
		panel.add(logo);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(102, 153, 255));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(305, 0, 481, 513);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl2 = new JLabel("Mot de passe : ");
		lbl2.setBounds(72, 272, 127, 25);
		lbl2.setForeground(new Color(102, 153, 255));
		lbl2.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		panel_1.add(lbl2);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(209, 270, 231, 30);
		txtPassword.setForeground(new Color(102, 153, 255));
		txtPassword.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		txtPassword.setColumns(15);
		panel_1.add(txtPassword);
		
		lbl1 = new JLabel("Login : ");
		lbl1.setBounds(72, 223, 127, 25);
		lbl1.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl1.setForeground(new Color(102, 153, 255));
		lbl1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		panel_1.add(lbl1);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(208, 223, 232, 30);
		txtLogin.setForeground(new Color(102, 153, 255));
		txtLogin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		panel_1.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel TitreConnection = new JLabel("Connexion");
		TitreConnection.setBounds(181, 131, 127, 25);
		TitreConnection.setHorizontalAlignment(SwingConstants.CENTER);
		TitreConnection.setForeground(new Color(102, 153, 255));
		TitreConnection.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		panel_1.add(TitreConnection);

		JButton btnEntrer = new JButton("Entrer");
		btnEntrer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrer.setBounds(333, 333, 107, 30);
		panel_1.add(btnEntrer);
		btnEntrer.setBackground(new Color(102, 153, 255));
		btnEntrer.setForeground(new Color(255, 255, 255));
		btnEntrer.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16)); 
		btnEntrer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ConnectionSQL c = new ConnectionSQL();
				try {
					String login, password;
					login = txtLogin.getText();
					password = txtPassword.getText();
					c.connexion();
					
					String check = "SELECT * FROM LoginInfo "
									+ "WHERE login='" +login+ "' AND password='"+password+"'";
					c.result = c.statement.executeQuery(check);
					
					if(c.result.next()) {
						frame.setVisible(false);
						TableauDeBord tdb = new TableauDeBord();
						tdb.getFrame().setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null,"Login ou mot de passe invalides", "Oh oh !", JOptionPane.INFORMATION_MESSAGE);
					}
					
				}catch (SQLException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(),"Erreur de connexion", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		
		lbl3 = new JLabel("Vous n'avez pas encore les codes d'acces ?");
		lbl3.setBounds(72, 420, 368, 30);
		lbl3.setForeground(new Color(102, 153, 255));
		lbl3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		panel_1.add(lbl3);
		
		lbl4 = new JLabel("Demandez a votre responsable d'agence !");
		lbl4.setBounds(72, 442, 368, 20);
		lbl4.setForeground(new Color(102, 153, 255));
		lbl4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		panel_1.add(lbl4);
	}
}
