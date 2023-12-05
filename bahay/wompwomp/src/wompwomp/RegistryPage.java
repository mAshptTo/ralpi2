package wompwomp;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JButton;




public class RegistryPage extends JFrame {
	
	
	
	private JPanel contentPane;
	private JTextField tfUsername;
	private JTextField tfPassword;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField tfFullName;
	private JTextField tfNumber;
	private JLayeredPane lpGradeLevel;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox chckbxNewCheckBox_5;
	private JCheckBox chckboxAnimation;
	private JCheckBox chckboxCookery;
	private JCheckBox chcknonFiction;
	private JCheckBox chckboxPolitics;
	private JCheckBox chckboxKorean;
	private JCheckBox chckboxBio1;
	private JCheckBox chckboxBio2;
	private JCheckBox chckboxDrafting;
	private JCheckBox chckboxGeneral;
	private String gender;	
	private String gradeLevel;
	private String Strand;

	
	private static Connection conn;
	
	
	
	PreparedStatement pst;
	ResultSet rs;
	
	
	public void Connect() {
			try {
				Class.forName("org.sqlite.JDBC");
				conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\PC\\\\Desktop\\newcodepatapos\\bahay\\wompwomp\\studentsRegistered.db");
				conn.setAutoCommit(false);
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		

		}

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistryPage frame = new RegistryPage();
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
	public RegistryPage() {
		Connect();
		
		
		setBackground(new Color(164, 186, 213));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 534);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(190, 205, 224));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(296, 11, 179, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login Details");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(32, 100, 167, 21);
		contentPane.add(lblNewLabel_1);
		
		tfUsername = new JTextField();
		tfUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (tfUsername.getText().equals("Username")) {
					tfUsername.setText("Username");
				}else {
					tfUsername.selectAll();
				}	
			}
		});
		tfUsername.setText("Input Username");
		tfUsername.setBounds(28, 128, 171, 21);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);
		
		
		tfPassword = new JTextField();
		tfPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (tfPassword.getText().equals("Password")) {
					tfPassword.setText("Password");
				}else {
					tfPassword.selectAll();
				}	
			}
		});
		tfPassword.setText("Choose Your Password");
		tfPassword.setColumns(10);
		tfPassword.setBounds(28, 160, 171, 21);
		contentPane.add(tfPassword);
		
		lblNewLabel_2 = new JLabel("Personal Information");
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(528, 100, 167, 21);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Enrollment");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(32, 192, 167, 21);
		contentPane.add(lblNewLabel_3);
		
		tfFullName = new JTextField();
		tfFullName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (tfFullName.getText().equals("FullName")) {
					tfFullName.setText("FullName");
				}else {
					tfFullName.selectAll();
				}	
			}
		});	
		tfFullName.setText("Full Name");
		tfFullName.setBounds(453, 141, 309, 21);
		contentPane.add(tfFullName);
		tfFullName.setColumns(10);
		
		tfNumber = new JTextField();
		tfNumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (tfNumber.getText().equals("Number")) {
					tfNumber.setText("Number");
				}else {
					tfNumber.selectAll();
				}	
			}
		});
		tfNumber.setText("Phone Number");
		tfNumber.setColumns(10);
		tfNumber.setBounds(453, 173, 224, 21);
		contentPane.add(tfNumber);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "are you sure you want to quit?", "confirmation", JOptionPane.YES_NO_CANCEL_OPTION ) == 0) {
				RegistryPage.this.dispose();
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
		lblX.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(782, 0, 39, 30);
		contentPane.add(lblX);
		
		lpGradeLevel = new JLayeredPane();
		lpGradeLevel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lpGradeLevel.setBackground(new Color(157, 230, 201));
		lpGradeLevel.setOpaque(true);
		lpGradeLevel.setBounds(32, 224, 167, 117);
		contentPane.add(lpGradeLevel);
		
		JLabel lblNewLabel_5_1 = new JLabel("Grade Level");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel_5_1.setBounds(6, 11, 97, 14);
		lpGradeLevel.add(lblNewLabel_5_1);
		
		JRadioButton rdbtn11 = new JRadioButton("Grade 11");
		rdbtn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gradeLevel = "Grade11";
			}
		});
		rdbtn11.setBounds(6, 32, 109, 23);
		lpGradeLevel.add(rdbtn11);
		
		JRadioButton rdbtn12 = new JRadioButton("Grade 12");
		rdbtn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gradeLevel = "grade12";
			}
		});
		rdbtn12.setBounds(6, 65, 109, 23);
		lpGradeLevel.add(rdbtn12);
		
		JLayeredPane lpStrand = new JLayeredPane();
		lpStrand.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lpStrand.setOpaque(true);
		lpStrand.setBackground(new Color(154, 252, 203));
		lpStrand.setBounds(32, 372, 730, 117);
		contentPane.add(lpStrand);
		
		lblNewLabel_6 = new JLabel("ABM");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(0, 0, 137, 14);
		lpStrand.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("TVL-ICT");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(147, 0, 140, 14);
		lpStrand.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("HUMSS");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(323, 0, 114, 14);
		lpStrand.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("STEM");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(470, 0, 115, 14);
		lpStrand.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("GAS");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(606, 0, 78, 14);
		lpStrand.add(lblNewLabel_10);
		
		JCheckBox chckboxBusiness = new JCheckBox("Business Finance");
		chckboxBusiness.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "ABM-Finance";
			}
		});
		chckboxBusiness.setBounds(10, 21, 127, 14);
		lpStrand.add(chckboxBusiness);
		
		chckbxNewCheckBox_2 = new JCheckBox("Accounting Fundamentals");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "ABM-Accounting";
			}
		});
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		chckbxNewCheckBox_2.setBounds(10, 48, 137, 14);
		lpStrand.add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("Business & Management");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "ABM-Business&Management";
			}
		});
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxNewCheckBox_3.setBounds(10, 71, 137, 14);
		lpStrand.add(chckbxNewCheckBox_3);
		
		chckbxNewCheckBox_4 = new JCheckBox("Elective Bookkeeping");
		chckbxNewCheckBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "ABM-Bookkeeping";
			}
		});
		chckbxNewCheckBox_4.setBounds(10, 96, 127, 14);
		lpStrand.add(chckbxNewCheckBox_4);
		
		chckbxNewCheckBox_5 = new JCheckBox("Programming - Java");
		chckbxNewCheckBox_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxNewCheckBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "Tvl-Ict-Animation";
			}
		});
		chckbxNewCheckBox_5.setBounds(157, 21, 130, 14);
		lpStrand.add(chckbxNewCheckBox_5);
		
		chckboxAnimation = new JCheckBox("Animation");
		chckboxAnimation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "Tvl-Ict-Cookery";
			}
		});
		chckboxAnimation.setBounds(157, 48, 130, 14);
		lpStrand.add(chckboxAnimation);
		
		chckboxCookery = new JCheckBox("Cookery");
		chckboxCookery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "Tvl-He-Cookery";
			}
		});
		chckboxCookery.setBounds(157, 71, 130, 14);
		lpStrand.add(chckboxCookery);
		
		chcknonFiction = new JCheckBox("Creative non-Fiction");
		chcknonFiction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "HUMSS-NonFiction";
			}
		});
		chcknonFiction.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chcknonFiction.setBounds(333, 21, 117, 14);
		lpStrand.add(chcknonFiction);
		
		chckboxPolitics = new JCheckBox("Philippine Politics and Government");
		chckboxPolitics.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckboxPolitics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "HUMSS-PhilPolitics&Gov";
			}
		});
		chckboxPolitics.setBounds(333, 48, 117, 14);
		lpStrand.add(chckboxPolitics);
		
		chckboxKorean = new JCheckBox("Elective Korean");
		chckboxKorean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "HUMSS-Korean";
			}
		});
		chckboxKorean.setBounds(333, 71, 104, 14);
		lpStrand.add(chckboxKorean);
		
		chckboxBio1 = new JCheckBox("Gen Biology 1");
		chckboxBio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "STEM-Biology1";
			}
		});
		chckboxBio1.setBounds(480, 21, 105, 14);
		lpStrand.add(chckboxBio1);
		
		chckboxBio2 = new JCheckBox("Gen Biology 2");
		chckboxBio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "STEM-Biology2";
			}
		});
		chckboxBio2.setBounds(480, 48, 105, 14);
		lpStrand.add(chckboxBio2);
		
		chckboxDrafting = new JCheckBox("Drafting");
		chckboxDrafting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "STEM-Drafting";
			}
		});
		chckboxDrafting.setBounds(480, 71, 105, 14);
		lpStrand.add(chckboxDrafting);
		
		chckboxGeneral = new JCheckBox("General");
		chckboxGeneral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strand = "GAS-General";
			}
		});
		chckboxGeneral.setBounds(616, 21, 78, 14);
		lpStrand.add(chckboxGeneral);
		
		lblNewLabel_5 = new JLabel("Strand");
		lblNewLabel_5.setBounds(32, 342, 78, 14);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender = "male";
				
			}
		});
		rdbtnNewRadioButton.setBounds(453, 201, 84, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender = "female";
			}
		});
		rdbtnFemale.setBounds(593, 201, 84, 23);
		contentPane.add(rdbtnFemale);
		
		JButton cmdRegister = new JButton("Register");
		cmdRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Username = tfUsername.getText();
				String Password = tfPassword.getText();
				String Fullname = tfFullName.getText();
				String Phone = tfNumber.getText();
				
				
			
				
				
				try {
				
					String sql = ("INSERT INTO Registered(Username,Password,Fullname,Phone,Level,Gender,Strand) VALUES (?,?,?,?,?,?,?)");
					PreparedStatement preparedstatement = conn.prepareStatement(sql);
					preparedstatement.setString(1, Username);
					preparedstatement.setString(2, Password);
					preparedstatement.setString(3, Fullname);
					preparedstatement.setString(4, Phone);
					preparedstatement.setString(5, gradeLevel);
					preparedstatement.setString(6, gender);
					preparedstatement.setString(7, Strand);
					
					preparedstatement.executeUpdate();
					
					conn.commit();
					
					JOptionPane.showMessageDialog(null, "You are successfully Enrolled","Enrolled Succesfully",JOptionPane.INFORMATION_MESSAGE);
					RegistryPage.this.dispose();
					
					tfUsername.setText(""); 
					tfPassword.setText(""); 
					tfFullName.setText(""); 
					tfNumber.setText("");
					tfNumber.setText("");
					/*	pnumber.setText("");
					gender.setSelectedIndex(0);
					strand.setSelectedIndex(0);
					bdate.setDate(null);	*/
					
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				
			}
			
		
		});
				
				
				
				
		cmdRegister.setBounds(649, 500, 113, 23);
		contentPane.add(cmdRegister);
		
		
		JLabel lblNewLabel_4 = new JLabel("Birthday");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(453, 241, 46, 14);
		contentPane.add(lblNewLabel_4);
	}
}





