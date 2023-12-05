package wompwomp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class SchoolLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private Button button_1;
	private JLabel lblNewLabel;
	private JPasswordField pfPassword;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchoolLogin frame = new SchoolLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SchoolLogin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 364);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 186, 213));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtUsername.getText().equals("Username")) {
					txtUsername.setText("Username");
				}else {
					txtUsername.selectAll();
				}	
			}
		});
		txtUsername.setText("Username");
		txtUsername.setBounds(111, 103, 331, 39);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		Button button = new Button("Register");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegistryPage Register = new RegistryPage();
				Register.setVisible(true);
				setVisible(false);
				
				
				
				
				
				
			}
		});
		button.setBackground(new Color(165, 235, 200));
		button.setBounds(72, 262, 140, 47);
		contentPane.add(button);
		
		button_1 = new Button("Login");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		button_1.setBackground(new Color(165, 235, 200));
		button_1.setBounds(326, 262, 140, 47);
		contentPane.add(button_1);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(251, 43, 46, 14);
		contentPane.add(lblNewLabel);
		
		pfPassword = new JPasswordField();
		pfPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pfPassword.getText().equals("Password")) {
					pfPassword.setEchoChar('*');
					pfPassword.setText("");
				} else {
					pfPassword.selectAll();
					
				}
				
				
			}
		});
		pfPassword.setText("Password");
		pfPassword.setBounds(111, 184, 331, 39);
		contentPane.add(pfPassword);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "are you sure you want to quit?", "confirmation", JOptionPane.YES_NO_CANCEL_OPTION ) == 0) {
				SchoolLogin.this.dispose();
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.red);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.black);
			}
		});
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		lblX.setBounds(498, 0, 39, 30);
		contentPane.add(lblX);
	}
}
