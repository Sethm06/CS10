import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;

public class Credit4GUI {

	private JFrame frame;
	private JTextField fn;
	private JTextField ln;
	
	ImageIcon img1 = new ImageIcon("C:\\Users\\16076006\\git\\CS10\\Credit4\\src\\Java.jpg");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit4GUI window = new Credit4GUI();
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
	public Credit4GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 733, 470);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel fnl = new JLabel("First Name");
		fnl.setBounds(24, 28, 65, 33);
		panel.add(fnl);
		
		fn = new JTextField();
		fn.setBounds(84, 28, 190, 33);
		panel.add(fn);
		fn.setColumns(10);
		
		JLabel lnl = new JLabel("Last Name");
		lnl.setBounds(24, 72, 65, 33);
		panel.add(lnl);
		
		ln = new JTextField();
		ln.setColumns(10);
		ln.setBounds(84, 72, 190, 33);
		panel.add(ln);
		
		JLabel dis = new JLabel("");
		dis.setBounds(284, 179, 397, 199);
		panel.add(dis);
		
		JLabel agl = new JLabel("Grade");
		agl.setBounds(24, 116, 65, 33);
		panel.add(agl);
		
		JComboBox g2 = new JComboBox();
		g2.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		g2.setBounds(84, 116, 190, 33);
		panel.add(g2);
		
		JLabel pic = new JLabel("");
		pic.setBounds(24, 179, 250, 199);
		panel.add(pic);
		
		JButton sb = new JButton("Submit");
		sb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fn.getText();
				String LN = ln.getText();
				int grade;
				
				if(g2.getSelectedItem().equals("10"))
				{
					grade = 10;
					pic.setIcon(img1);
				}
				else if(g2.getSelectedItem().equals("11"))
				{
					grade = 11;
					GUI3 k = new GUI3();
				}
				else
				{
					grade = 12;
				}
				
					
				
				dis.setText("First name: " + FN + ". Last name: " + LN + ". grade: " + grade);
				
			}
		});
		sb.setBounds(284, 28, 190, 33);
		panel.add(sb);
		
		JButton rs = new JButton("Reset");
		rs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				fn.setText(" ");
				ln.setText(" ");
				
				dis.setText(" ");


			}
		});
		rs.setBounds(284, 72, 190, 33);
		panel.add(rs);
		
		
		
	}
}
