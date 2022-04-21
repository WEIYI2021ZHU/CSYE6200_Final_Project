package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class StudentPortal extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField age;
	private JTextField number;
	private JTextField address;
	private JTextField id;
	private JTextField parentsName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentPortal frame = new StudentPortal();
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
	public StudentPortal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Student Portal");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		name = new JTextField();
		name.setText("Student's Name");
		panel_1.add(name);
		name.setColumns(15);
		
		age = new JTextField();
		age.setText("Student's Age");
		panel_1.add(age);
		age.setColumns(15);
		
		parentsName = new JTextField();
		parentsName.setText("Parents' Name");
		panel_1.add(parentsName);
		parentsName.setColumns(15);
		
		id = new JTextField();
		id.setText("Student's Id");
		panel_1.add(id);
		id.setColumns(15);
		
		number = new JTextField();
		number.setText("Phone Number");
		panel_1.add(number);
		number.setColumns(15);
		
		address = new JTextField();
		address.setText("Address");
		panel_1.add(address);
		address.setColumns(15);
		
		JButton continueButton = new JButton("Continue");
		panel_1.add(continueButton);
	}

}
