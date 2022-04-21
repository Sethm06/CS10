import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI2 {

	private JFrame frame;
	private JTextField twoD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 window = new GUI2();
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
	public GUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 492, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 476, 364);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel dis = new JLabel("");
		dis.setBounds(21, 144, 83, 14);
		panel.add(dis);
		
		twoD = new JTextField();
		twoD.setBounds(31, 55, 33, 20);
		panel.add(twoD);
		twoD.setColumns(10);
		
		JButton cb = new JButton("Clear");
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cb.setBounds(114, 106, 89, 52);
		panel.add(cb);
		
		JLabel lblNewLabel_1 = new JLabel("Enter 2 digits:");
		lblNewLabel_1.setBounds(21, 30, 83, 14);
		panel.add(lblNewLabel_1);
		
		JButton eb_1 = new JButton("Enter");
		eb_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String twoDigit = twoD.getText();
				int twoD = Integer.parseInt(twoDigit);
				
				int firstD = twoD / 10;
				
				//int sum =
				
				dis.setText(""+firstD);
				
			}
		});
		eb_1.setBounds(114, 39, 89, 52);
		panel.add(eb_1);
	}
}
