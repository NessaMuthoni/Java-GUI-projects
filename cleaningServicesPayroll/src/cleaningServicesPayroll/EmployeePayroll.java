package cleaningServicesPayroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeePayroll {

	private JFrame frmGeorgetownCleaningServices;
	private JTextField textField_employee;
	private JTextField textField_HourlySalary;
	private JTextField textFieldMon1;
	private JTextField textField_Tue1;
	private JTextField textField_Thur1;
	private JTextField textField_Thur2;
	private JTextField textField_Mon2;
	private JTextField textField_Tue2;
	private JTextField textField_Wen1;
	private JTextField textField_Wen2;
	private JTextField textField_Fri1;
	private JTextField textField_Fri2;
	private JTextField textField_Sat1;
	private JTextField textField_Sat2;
	private JTextField textField_Sun1;
	private JTextField textField_Sun2;
	private JTextField textFieldHour_R;
	private JTextField textField_HourO;
	private JTextField textField_AmountR;
	private JTextField textField_AmoutO;
	private JTextField textField_NetPay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeePayroll window = new EmployeePayroll();
					window.frmGeorgetownCleaningServices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeePayroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetownCleaningServices = new JFrame();
		frmGeorgetownCleaningServices.getContentPane().setBackground(new Color(238, 232, 170));
		frmGeorgetownCleaningServices.setBackground(new Color(0, 0, 139));
		frmGeorgetownCleaningServices.setTitle("GeorgeTown Cleaning Services - Employee Payroll");
		frmGeorgetownCleaningServices.setBounds(100, 100, 795, 493);
		frmGeorgetownCleaningServices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorgetownCleaningServices.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 204));
		panel_2.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(24, 35, 731, 90);
		frmGeorgetownCleaningServices.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel employeeName = new JLabel("Employee Name:");
		employeeName.setBounds(10, 31, 123, 29);
		panel_2.add(employeeName);
		
		textField_employee = new JTextField();
		textField_employee.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_employee.setBounds(118, 35, 214, 20);
		panel_2.add(textField_employee);
		textField_employee.setColumns(10);
		
		JLabel HourlySalary = new JLabel(" Hourly Salary:");
		HourlySalary.setBounds(372, 31, 116, 29);
		panel_2.add(HourlySalary);
		
		textField_HourlySalary = new JTextField();
		textField_HourlySalary.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_HourlySalary.setBounds(507, 35, 94, 20);
		panel_2.add(textField_HourlySalary);
		textField_HourlySalary.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 204));
		panel.setBorder(new TitledBorder(null, "Timesheet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(24, 136, 731, 152);
		frmGeorgetownCleaningServices.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbFirstWeek = new JLabel("First Week:");
		lbFirstWeek.setBounds(33, 36, 72, 27);
		panel.add(lbFirstWeek);
		
		JLabel lbSecondWeek = new JLabel("Second Week:");
		lbSecondWeek.setBounds(23, 74, 82, 27);
		panel.add(lbSecondWeek);
		
		JLabel lbMonday = new JLabel("Monday");
		lbMonday.setBounds(120, 11, 49, 25);
		panel.add(lbMonday);
		
		JLabel lbTuesday = new JLabel("Tuesday");
		lbTuesday.setBounds(198, 11, 55, 25);
		panel.add(lbTuesday);
		
		JLabel lbWednesday = new JLabel("Wednesday");
		lbWednesday.setBounds(263, 11, 67, 25);
		panel.add(lbWednesday);
		
		JLabel lbThursday = new JLabel("Thursday");
		lbThursday.setBounds(340, 11, 55, 25);
		panel.add(lbThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setBounds(424, 11, 55, 25);
		panel.add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setBounds(489, 11, 55, 25);
		panel.add(lblSaturday);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setBounds(573, 11, 55, 25);
		panel.add(lblSunday);
		
		textFieldMon1 = new JTextField();
		textFieldMon1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textFieldMon1.setBounds(115, 39, 67, 20);
		panel.add(textFieldMon1);
		textFieldMon1.setColumns(10);
		
		textField_Tue1 = new JTextField();
		textField_Tue1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Tue1.setColumns(10);
		textField_Tue1.setBounds(186, 39, 67, 20);
		panel.add(textField_Tue1);
		
		textField_Thur1 = new JTextField();
		textField_Thur1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Thur1.setColumns(10);
		textField_Thur1.setBounds(340, 39, 67, 20);
		panel.add(textField_Thur1);
		
		textField_Thur2 = new JTextField();
		textField_Thur2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Thur2.setColumns(10);
		textField_Thur2.setBounds(340, 77, 67, 20);
		panel.add(textField_Thur2);
		
		textField_Mon2 = new JTextField();
		textField_Mon2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Mon2.setColumns(10);
		textField_Mon2.setBounds(115, 77, 67, 20);
		panel.add(textField_Mon2);
		
		textField_Tue2 = new JTextField();
		textField_Tue2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Tue2.setColumns(10);
		textField_Tue2.setBounds(186, 77, 67, 20);
		panel.add(textField_Tue2);
		
		textField_Wen1 = new JTextField();
		textField_Wen1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Wen1.setColumns(10);
		textField_Wen1.setBounds(263, 39, 67, 20);
		panel.add(textField_Wen1);
		
		textField_Wen2 = new JTextField();
		textField_Wen2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Wen2.setColumns(10);
		textField_Wen2.setBounds(263, 77, 67, 20);
		panel.add(textField_Wen2);
		
		textField_Fri1 = new JTextField();
		textField_Fri1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Fri1.setColumns(10);
		textField_Fri1.setBounds(412, 39, 67, 20);
		panel.add(textField_Fri1);
		
		textField_Fri2 = new JTextField();
		textField_Fri2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Fri2.setColumns(10);
		textField_Fri2.setBounds(412, 77, 67, 20);
		panel.add(textField_Fri2);
		
		textField_Sat1 = new JTextField();
		textField_Sat1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Sat1.setColumns(10);
		textField_Sat1.setBounds(489, 39, 67, 20);
		panel.add(textField_Sat1);
		
		textField_Sat2 = new JTextField();
		textField_Sat2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Sat2.setColumns(10);
		textField_Sat2.setBounds(489, 77, 67, 20);
		panel.add(textField_Sat2);
		
		textField_Sun1 = new JTextField();
		textField_Sun1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Sun1.setColumns(10);
		textField_Sun1.setBounds(561, 39, 67, 20);
		panel.add(textField_Sun1);
		
		textField_Sun2 = new JTextField();
		textField_Sun2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Sun2.setColumns(10);
		textField_Sun2.setBounds(561, 77, 67, 20);
		panel.add(textField_Sun2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 204));
		panel_1.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(24, 299, 731, 131);
		frmGeorgetownCleaningServices.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnProcessIt = new JButton("Process It");
		btnProcessIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double hourlyRate = Double.parseDouble(textField_HourlySalary.getText());

			        double hoursWorked1 = Double.parseDouble(textFieldMon1.getText()) + Double.parseDouble(textField_Tue1.getText()) +
			                Double.parseDouble(textField_Wen1.getText()) + Double.parseDouble(textField_Thur1.getText()) +
			                Double.parseDouble(textField_Fri1.getText()) + Double.parseDouble(textField_Sat1.getText()) +
			                Double.parseDouble(textField_Sun1.getText());

			        double hoursWorked2 = Double.parseDouble(textField_Mon2.getText()) + Double.parseDouble(textField_Tue2.getText()) +
			                Double.parseDouble(textField_Wen2.getText()) + Double.parseDouble(textField_Thur2.getText()) +
			                Double.parseDouble(textField_Fri2.getText()) + Double.parseDouble(textField_Sat2.getText()) +
			                Double.parseDouble(textField_Sun2.getText());

			        double totalRegularHours = Math.min(hoursWorked1, 40) + Math.min(hoursWorked2, 40);
			        double totalOvertimeHours = Math.max(0, hoursWorked1 - 40) + Math.max(0, hoursWorked2 - 40);

			        double regularPay = totalRegularHours * hourlyRate;
			        double overtimePay = totalOvertimeHours * (hourlyRate * 1.5);

			        double netPay = regularPay + overtimePay;

			        textFieldHour_R.setText(String.format("%.2f", totalRegularHours));
			        textField_HourO.setText(String.format("%.2f", totalOvertimeHours));
			        textField_AmountR.setText(String.format("%.2f", regularPay));
			        textField_AmoutO.setText(String.format("%.2f", overtimePay));
			        textField_NetPay.setText(String.format("%.2f", netPay));
			        
			}
		});
		btnProcessIt.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnProcessIt.setBackground(new Color(238, 232, 170));
		btnProcessIt.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProcessIt.setBounds(10, 31, 89, 73);
		panel_1.add(btnProcessIt);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		btnClose.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClose.setBackground(new Color(238, 232, 170));
		btnClose.setBounds(615, 31, 89, 73);
		panel_1.add(btnClose);
		
		JLabel lbRegular = new JLabel("Regular:");
		lbRegular.setBounds(109, 51, 63, 23);
		panel_1.add(lbRegular);
		
		JLabel lbOvertime = new JLabel("Overtime");
		lbOvertime.setBounds(109, 81, 63, 23);
		panel_1.add(lbOvertime);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setBounds(179, 31, 63, 23);
		panel_1.add(lblHours);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(252, 31, 63, 23);
		panel_1.add(lblAmount);
		
		textFieldHour_R = new JTextField();
		textFieldHour_R.setEditable(false);
		textFieldHour_R.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textFieldHour_R.setBounds(170, 57, 72, 20);
		panel_1.add(textFieldHour_R);
		textFieldHour_R.setColumns(10);
		
		textField_HourO = new JTextField();
		textField_HourO.setEditable(false);
		textField_HourO.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_HourO.setColumns(10);
		textField_HourO.setBounds(170, 85, 72, 20);
		panel_1.add(textField_HourO);
		
		textField_AmountR = new JTextField();
		textField_AmountR.setEditable(false);
		textField_AmountR.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_AmountR.setColumns(10);
		textField_AmountR.setBounds(252, 57, 72, 20);
		panel_1.add(textField_AmountR);
		
		textField_AmoutO = new JTextField();
		textField_AmoutO.setEditable(false);
		textField_AmoutO.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_AmoutO.setColumns(10);
		textField_AmoutO.setBounds(252, 84, 72, 20);
		panel_1.add(textField_AmoutO);
		
		JLabel lbNetPay = new JLabel("Net Pay:");
		lbNetPay.setBounds(391, 53, 72, 29);
		panel_1.add(lbNetPay);
		
		textField_NetPay = new JTextField();
		textField_NetPay.setEditable(false);
		textField_NetPay.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_NetPay.setBounds(484, 57, 86, 20);
		panel_1.add(textField_NetPay);
		textField_NetPay.setColumns(10);
	}
}

	

	


