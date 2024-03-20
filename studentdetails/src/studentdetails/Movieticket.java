package studentdetails;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class Movieticket {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Movieticket window = new Movieticket();
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
	public Movieticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 16));
		frame.setBounds(100, 100, 500, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movie Ticket Booking");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(105, 11, 199, 23);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setForeground(new Color(0, 0, 0));
		tb1.setBounds(152, 61, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setForeground(new Color(0, 0, 0));
		tb2.setBounds(152, 137, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox<Object> cb1 = new JComboBox<Object>();
		cb1.setModel(new DefaultComboBoxModel<Object>(new String[] {"RRR", "KGF", "SALAAR"}));
		cb1.setForeground(new Color(0, 0, 0));
		cb1.setBounds(152, 98, 86, 22);
		frame.getContentPane().add(cb1);
		
		JLabel N = new JLabel("Name");
		N.setForeground(new Color(255, 255, 255));
		N.setFont(new Font("Dialog", Font.BOLD, 14));
		N.setBounds(50, 62, 55, 14);
		frame.getContentPane().add(N);
		
		JLabel S = new JLabel("Movie");
		S.setForeground(new Color(255, 255, 255));
		S.setFont(new Font("Dialog", Font.BOLD, 14));
		S.setBounds(50, 100, 59, 14);
		frame.getContentPane().add(S);
		
		JLabel lblNewLabel_3 = new JLabel("No.of tickets");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3.setBounds(20, 140, 100, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(new Color(0, 128, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=tb2.getText();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("RRR"))
				{
					bill=bill+150*nt;
				}
				if(movie.equals("KGF"))
				{
					bill=bill+200*nt;
				}
				if(movie.equals("SALAAR"))
				{
					bill=bill+250*nt;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "Name "+name+ " \n Movie"+movie+ "\n No.of Tickets"+tickets+ "\n Amount"+bill);
				if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Booking Confirmed");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Booking Cancelled");
				}

			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(167, 190, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\wallpapersden.com_small-memory_wxl.jpg"));
		lblNewLabel_1.setBounds(0, 0, 484, 263);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}
}
