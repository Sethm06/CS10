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

public class Credit4GUI {

	private JFrame frame;
	private JTextField fn;
	private JTextField ln;
	private JTextField ag;

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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 487, 476);
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
		dis.setBounds(24, 255, 450, 115);
		panel.add(dis);
		
		JLabel agl = new JLabel("Age");
		agl.setBounds(24, 116, 65, 33);
		panel.add(agl);
		
		ag = new JTextField();
		ag.setColumns(10);
		ag.setBounds(84, 116, 190, 33);
		panel.add(ag);
		
		JButton sb = new JButton("Submit");
		sb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fn.getText();
				String LN = ln.getText();
				String AG = ag.getText();
				
				dis.setText("First name: " + FN + ". Last name: " + LN + ". Age: " + AG);
				
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
				ag.setText(" ");
				
				dis.setText(" ");


			}
		});
		rs.setBounds(284, 72, 190, 33);
		panel.add(rs);
	}
}
