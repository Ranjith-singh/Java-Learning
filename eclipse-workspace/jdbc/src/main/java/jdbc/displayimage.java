package jdbc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class displayimage extends JFrame {

	private JPanel contentPane;
	private JTextField field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displayimage frame = new displayimage();
					frame.setLocationRelativeTo(null);
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
	public displayimage() {
		setTitle("my frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		field = new JTextField();
		field.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		field.setHorizontalAlignment(SwingConstants.CENTER);
		field.setBounds(98, 30, 128, 51);
		contentPane.add(field);
		field.setColumns(10);
		
		JButton button = new JButton("show image");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		button.setBounds(263, 29, 116, 52);
		contentPane.add(button);
		
		JLabel imageLable = new JLabel("");
		imageLable.setBounds(105, 124, 276, 154);
		contentPane.add(imageLable);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=field.getText();
				int id=Integer.parseInt(str);
				ImageIcon icon=helper.getImageIconByID(id,connectionprovider.getConnection());
				if(icon==null)
				{
					JOptionPane.showMessageDialog(null,"no image found for id "+id);
				}
				else
				{
				imageLable.setIcon(icon);
				}
			}
		});
	}
}
