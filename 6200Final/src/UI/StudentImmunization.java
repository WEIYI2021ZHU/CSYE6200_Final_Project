package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class StudentImmunization extends JFrame {

	private JPanel contentPane;
	private JTextField txtVaccineName;
	private JTextField txtDose;
	private JTextField txtDate;
	private JLabel Vaccine2;
	private JTextField txtVaccineName_1;
	private JTextField txtDose_1;
	private JTextField txtDate_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentImmunization frame = new StudentImmunization();
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
	public StudentImmunization() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel Vaccine1 = new JLabel("Vaccine 1");
		panel.add(Vaccine1);
		
		txtVaccineName = new JTextField();
		txtVaccineName.setHorizontalAlignment(SwingConstants.LEFT);
		txtVaccineName.setText("Vaccine Name");
		panel.add(txtVaccineName);
		txtVaccineName.setColumns(20);
		
		txtDose = new JTextField();
		txtDose.setText("Dose");
		panel.add(txtDose);
		txtDose.setColumns(15);
		
		txtDate = new JTextField();
		txtDate.setText("Date");
		panel.add(txtDate);
		txtDate.setColumns(15);
		
		Vaccine2 = new JLabel("Vaccine 2");
		panel.add(Vaccine2);
		
		txtVaccineName_1 = new JTextField();
		txtVaccineName_1.setText("Vaccine Name");
		panel.add(txtVaccineName_1);
		txtVaccineName_1.setColumns(20);
		
		txtDose_1 = new JTextField();
		txtDose_1.setText("Dose");
		panel.add(txtDose_1);
		txtDose_1.setColumns(15);
		
		txtDate_1 = new JTextField();
		txtDate_1.setText("Date");
		panel.add(txtDate_1);
		txtDate_1.setColumns(15);
	}

}
