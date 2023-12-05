package wompwomp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;

public class TableEdit extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableEdit frame = new TableEdit();
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
	public TableEdit() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 402);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(202, 226, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "are you sure you want to quit?", "confirmation", JOptionPane.YES_NO_CANCEL_OPTION ) == 0) {
				TableEdit.this.dispose();
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
		lblX.setBounds(510, 0, 39, 30);
		contentPane.add(lblX);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		layeredPane.setBackground(new Color(184, 217, 254));
		layeredPane.setOpaque(true);
		layeredPane.setBounds(10, 22, 490, 369);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		
	}
}
