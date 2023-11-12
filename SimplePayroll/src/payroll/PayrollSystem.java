package payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PayrollSystem {

	private JFrame frame;
	private JTextField textfield_employee;
	private JTextField textField_RPH;
	private JTextField textField_HPD;
	private JTextField textField_NODW;
	private JTextField textFieldGross_salary;
	private JTextField textField_TAX;
	private JTextField textField_Phillhealth;
	private JTextField textField_SSS;
	private JTextField textField_TD;
	private JTextField textField_GrossSalary;
	private JTextField textField_deduction;
	private JTextField textField_NetSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayrollSystem window = new PayrollSystem();
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
	public PayrollSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setForeground(new Color(0, 0, 102));
		frame.setBounds(100, 100, 906, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Simple Payroll System");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 23));
		lblNewLabel.setBounds(235, 47, 309, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel EmployeeName_Label = new JLabel("EmployeeName:");
		EmployeeName_Label.setBounds(39, 111, 91, 32);
		frame.getContentPane().add(EmployeeName_Label);
		
		JLabel RatePerHour_label = new JLabel("Rate Per Hour:");
		RatePerHour_label.setBounds(51, 141, 95, 32);
		frame.getContentPane().add(RatePerHour_label);
		
		JLabel HoursPerDay_Label = new JLabel("Hour Per Day:");
		HoursPerDay_Label.setBounds(51, 173, 79, 32);
		frame.getContentPane().add(HoursPerDay_Label);
		
		JLabel NoOfDaysWorked_label = new JLabel("Number of days worked:\r\n");
		NoOfDaysWorked_label.setBounds(10, 207, 173, 25);
		frame.getContentPane().add(NoOfDaysWorked_label);
		
		JLabel lblNewLabel_2 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(311, 110, 185, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		textfield_employee = new JTextField();
		textfield_employee.setBounds(147, 117, 120, 20);
		frame.getContentPane().add(textfield_employee);
		textfield_employee.setColumns(10);
		
		textField_RPH = new JTextField();
		textField_RPH.setColumns(10);
		textField_RPH.setBounds(147, 147, 111, 20);
		frame.getContentPane().add(textField_RPH);
		
		textField_HPD = new JTextField();
		textField_HPD.setColumns(10);
		textField_HPD.setBounds(147, 179, 111, 20);
		frame.getContentPane().add(textField_HPD);
		
		textField_NODW = new JTextField();
		textField_NODW.setColumns(10);
		textField_NODW.setBounds(157, 209, 100, 20);
		frame.getContentPane().add(textField_NODW);
		
		JLabel label_Tax = new JLabel("TAX 15% of Monthly Wage:\r\n");
		label_Tax.setBounds(292, 150, 142, 25);
		frame.getContentPane().add(label_Tax);
		
		JLabel label_philhealth = new JLabel("Philhealth 5%\r\n");
		label_philhealth.setBounds(340, 177, 94, 25);
		frame.getContentPane().add(label_philhealth);
		
		JLabel label_sss = new JLabel("SSS 2%\r\n");
		label_sss.setBounds(371, 207, 63, 25);
		frame.getContentPane().add(label_sss);
		
		JLabel GrossSalary_Label = new JLabel("GROSS SALARY:\r\n");
		GrossSalary_Label.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		GrossSalary_Label.setBounds(10, 267, 120, 32);
		frame.getContentPane().add(GrossSalary_Label);
		
		textFieldGross_salary = new JTextField();
		textFieldGross_salary.setEditable(false);
		textFieldGross_salary.setColumns(10);
		textFieldGross_salary.setBounds(137, 273, 93, 20);
		frame.getContentPane().add(textFieldGross_salary);
		
		textField_TAX = new JTextField();
		textField_TAX.setEditable(false);
		textField_TAX.setColumns(10);
		textField_TAX.setBounds(442, 153, 93, 20);
		frame.getContentPane().add(textField_TAX);
		
		textField_Phillhealth = new JTextField();
		textField_Phillhealth.setEditable(false);
		textField_Phillhealth.setColumns(10);
		textField_Phillhealth.setBounds(442, 179, 93, 20);
		frame.getContentPane().add(textField_Phillhealth);
		
		textField_SSS = new JTextField();
		textField_SSS.setEditable(false);
		textField_SSS.setColumns(10);
		textField_SSS.setBounds(442, 209, 91, 20);
		frame.getContentPane().add(textField_SSS);
		
		JLabel label_TD = new JLabel("TOTAL DEDUCTION:");
		label_TD.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		label_TD.setBounds(287, 266, 147, 32);
		frame.getContentPane().add(label_TD);
		
		JLabel label_grossSalary = new JLabel("GROSS SALARY:\r\n");
		label_grossSalary.setBounds(604, 141, 93, 32);
		frame.getContentPane().add(label_grossSalary);
		
		JLabel label_deduction = new JLabel("Deduction:\r\n");
		label_deduction.setBounds(604, 173, 79, 32);
		frame.getContentPane().add(label_deduction);
		
		textField_TD = new JTextField();
		textField_TD.setEditable(false);
		textField_TD.setColumns(10);
		textField_TD.setBounds(442, 273, 93, 20);
		frame.getContentPane().add(textField_TD);
		
		textField_GrossSalary = new JTextField();
		textField_GrossSalary.setEditable(false);
		textField_GrossSalary.setColumns(10);
		textField_GrossSalary.setBounds(718, 147, 93, 20);
		frame.getContentPane().add(textField_GrossSalary);
		
		textField_deduction = new JTextField();
		textField_deduction.setEditable(false);
		textField_deduction.setColumns(10);
		textField_deduction.setBounds(718, 179, 93, 20);
		frame.getContentPane().add(textField_deduction);
		
		JLabel label_NetSalary = new JLabel("NET SALARY:");
		label_NetSalary.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		label_NetSalary.setBounds(616, 267, 103, 25);
		frame.getContentPane().add(label_NetSalary);
		
		textField_NetSalary = new JTextField();
		textField_NetSalary.setEditable(false);
		textField_NetSalary.setColumns(10);
		textField_NetSalary.setBounds(718, 267, 93, 20);
		frame.getContentPane().add(textField_NetSalary);
		
		JButton computebtn = new JButton("Compute");
		computebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int grossSalary,RPH,HPD,NODW;
				textfield_employee.getText();
				HPD=Integer.valueOf(textField_HPD.getText());
				RPH=Integer.valueOf(textField_RPH.getText());
				NODW=Integer.valueOf(textField_NODW.getText());
				grossSalary=HPD*NODW*RPH;
				textFieldGross_salary.setText(String.valueOf(grossSalary));
				double tax=0.15*grossSalary;
				textField_TAX.setText(String.valueOf(tax));
				double Phealth=0.05*grossSalary;
				textField_Phillhealth.setText(String.valueOf(Phealth));
				double SSS= 0.02*grossSalary;
				textField_SSS.setText(String.format("%.2f",SSS));
				double deduction=tax+Phealth+SSS;
				textField_TD.setText(String.valueOf(deduction));
				textField_deduction.setText(String.valueOf(deduction));
				textField_GrossSalary.setText(String.valueOf(grossSalary));
				double netSalary= grossSalary-deduction;
				textField_NetSalary.setText(String.valueOf(netSalary));
			}
		});
		computebtn.setBounds(new Rectangle(5, 5, 5, 5));
		computebtn.setForeground(new Color(255, 255, 255));
		computebtn.setBackground(new Color(0, 0, 51));
		computebtn.setActionCommand("Compute");
		computebtn.setBounds(327, 321, 147, 43);
		frame.getContentPane().add(computebtn);
	}
}
