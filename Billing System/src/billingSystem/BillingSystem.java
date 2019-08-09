package billingSystem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
import java.util.*;
import java.text.*;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BillingSystem {

	private JFrame frmBillingSystem;
	private JTextField textFieldLabour;
	private JTextField textFieldTravel;
	private JTextField textFieldPlastic;
	private JTextField textFieldCopper;
	private JTextField textFieldChrome;
	private JTextField textFieldCostOfMaterial;
	private JTextField textFieldCostOfLabor;
	private JTextField textFieldTaxable;
	private JTextField textFieldVAT;
	private JTextField textFieldMileage;
	private JTextField textFieldTax;
	private JTextField textFieldSubtotal;
	private JTextField textFieldTotal;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillingSystem window = new BillingSystem();
					window.frmBillingSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BillingSystem() {
		initialize();
		frmBillingSystem.setLocationRelativeTo(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBillingSystem = new JFrame();
		frmBillingSystem.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				textFieldLabour.setEnabled(false);
				textFieldLabour.setText("0");

				textFieldTravel.setEnabled(false);
				textFieldTravel.setText("0");

				textFieldPlastic.setEnabled(false);
				textFieldPlastic.setText("0");

				textFieldCopper.setEnabled(false);
				textFieldCopper.setText("0");

				textFieldChrome.setEnabled(false);
				textFieldChrome.setText("0");

				textFieldCostOfMaterial.setEnabled(false);
				textFieldCostOfMaterial.setText("0");

				textFieldCostOfLabor.setEnabled(false);
				textFieldCostOfLabor.setText("0");

				textFieldTaxable.setEnabled(false);
				textFieldTaxable.setText("0");

				textFieldVAT.setEnabled(false);
				textFieldVAT.setText("0");

				textFieldMileage.setEnabled(false);
				textFieldMileage.setText("0");

				textFieldTax.setEnabled(false);
				textFieldTax.setText("0");

				textFieldSubtotal.setEnabled(false);
				textFieldSubtotal.setText("0");

				textFieldTotal.setEnabled(false);
				textFieldTotal.setText("0");

			}
		});
		frmBillingSystem.getContentPane().setBackground(new Color(153, 204, 51));
		frmBillingSystem.setTitle("Billing System");
		frmBillingSystem.setBounds(0, 0, 1280, 720);
		frmBillingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBillingSystem.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(10, 11, 1244, 76);
		frmBillingSystem.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblBillingSystem = new JLabel("Billing System");
		lblBillingSystem.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblBillingSystem.setBounds(390, 0, 358, 61);
		panel.add(lblBillingSystem);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dan\\Desktop\\Icons\\Logo0.png"));
		lblNewLabel_1.setBounds(10, 11, 64, 53);
		panel.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBounds(896, 98, 358, 492);
		frmBillingSystem.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JTextArea textReceipt = new JTextArea();
		textReceipt.setBounds(10, 11, 338, 470);
		panel_1.add(textReceipt);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_2.setBounds(10, 98, 876, 492);
		frmBillingSystem.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JCheckBox cbxLabour = new JCheckBox("Labour");
		cbxLabour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(cbxLabour.isSelected()) {
					textFieldLabour.setEnabled(true);
					textFieldLabour.setText(null);
					textFieldLabour.requestFocus();

				}else {
					textFieldLabour.setEnabled(false);
					textFieldLabour.setText("0");
				}
			}
		});
		cbxLabour.setFont(new Font("Tahoma", Font.BOLD, 30));
		cbxLabour.setBounds(23, 43, 131, 45);
		panel_2.add(cbxLabour);

		textFieldLabour = new JTextField();
		textFieldLabour.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				Child_Billing OnlyNumbers = new Child_Billing();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Billing System");
				}
			}
		});
		textFieldLabour.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldLabour.setBounds(184, 59, 161, 20);
		panel_2.add(textFieldLabour);
		textFieldLabour.setColumns(10);

		textFieldTravel = new JTextField();
		textFieldTravel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Billing OnlyNumbers = new Child_Billing();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Billing System");
				}
			}
		});
		textFieldTravel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldTravel.setColumns(10);
		textFieldTravel.setBounds(184, 107, 161, 20);
		panel_2.add(textFieldTravel);

		textFieldPlastic = new JTextField();
		textFieldPlastic.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Billing OnlyNumbers = new Child_Billing();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Billing System");
				}
			}
		});
		textFieldPlastic.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPlastic.setColumns(10);
		textFieldPlastic.setBounds(184, 154, 161, 20);
		panel_2.add(textFieldPlastic);

		textFieldCopper = new JTextField();
		textFieldCopper.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Billing OnlyNumbers = new Child_Billing();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Billing System");
				}
			}
		});
		textFieldCopper.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldCopper.setColumns(10);
		textFieldCopper.setBounds(184, 198, 161, 20);
		panel_2.add(textFieldCopper);

		textFieldChrome = new JTextField();
		textFieldChrome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				Child_Billing OnlyNumbers = new Child_Billing();
				try {
					OnlyNumbers.NumbersOnly(e);
				} catch (NumberFormatException ex) {
					JOptionPane.showConfirmDialog(null, "Billing System");
				}
			}
		});
		textFieldChrome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldChrome.setColumns(10);
		textFieldChrome.setBounds(184, 239, 161, 20);
		panel_2.add(textFieldChrome);

		JLabel lblNewLabel = new JLabel("Cost of Material");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(409, 47, 238, 37);
		panel_2.add(lblNewLabel);

		JLabel lblCostOf = new JLabel("Cost of Labor");
		lblCostOf.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCostOf.setBounds(409, 99, 217, 37);
		panel_2.add(lblCostOf);

		JLabel lblTaxable = new JLabel("Taxable");
		lblTaxable.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTaxable.setBounds(409, 227, 118, 37);
		panel_2.add(lblTaxable);

		JLabel lblVat = new JLabel("VAT");
		lblVat.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblVat.setBounds(409, 190, 59, 37);
		panel_2.add(lblVat);

		JLabel lblMileage = new JLabel("Mileage");
		lblMileage.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblMileage.setBounds(409, 142, 118, 37);
		panel_2.add(lblMileage);

		textFieldCostOfMaterial = new JTextField();
		textFieldCostOfMaterial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldCostOfMaterial.setColumns(10);
		textFieldCostOfMaterial.setBounds(670, 59, 178, 20);
		panel_2.add(textFieldCostOfMaterial);

		textFieldCostOfLabor = new JTextField();
		textFieldCostOfLabor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldCostOfLabor.setColumns(10);
		textFieldCostOfLabor.setBounds(670, 107, 178, 20);
		panel_2.add(textFieldCostOfLabor);

		textFieldTaxable = new JTextField();
		textFieldTaxable.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldTaxable.setColumns(10);
		textFieldTaxable.setBounds(670, 239, 178, 20);
		panel_2.add(textFieldTaxable);

		textFieldVAT = new JTextField();
		textFieldVAT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldVAT.setColumns(10);
		textFieldVAT.setBounds(670, 198, 178, 20);
		panel_2.add(textFieldVAT);

		textFieldMileage = new JTextField();
		textFieldMileage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldMileage.setColumns(10);
		textFieldMileage.setBounds(670, 154, 178, 20);
		panel_2.add(textFieldMileage);

		textFieldTax = new JTextField();
		textFieldTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldTax.setColumns(10);
		textFieldTax.setBounds(670, 365, 178, 20);
		panel_2.add(textFieldTax);

		textFieldSubtotal = new JTextField();
		textFieldSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldSubtotal.setColumns(10);
		textFieldSubtotal.setBounds(670, 410, 178, 20);
		panel_2.add(textFieldSubtotal);

		textFieldTotal = new JTextField();
		textFieldTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(670, 452, 178, 20);
		panel_2.add(textFieldTotal);

		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTax.setBounds(409, 357, 54, 37);
		panel_2.add(lblTax);

		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSubtotal.setBounds(409, 402, 127, 37);
		panel_2.add(lblSubtotal);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTotal.setBounds(409, 444, 76, 37);
		panel_2.add(lblTotal);

		JCheckBox cbxTravel = new JCheckBox("Travel");
		cbxTravel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbxTravel.isSelected()) {
					textFieldTravel.setEnabled(true);
					textFieldTravel.setText(null);
					textFieldTravel.requestFocus();

				}else {
					textFieldTravel.setEnabled(false);
					textFieldTravel.setText("0");
				}
			}
		});
		cbxTravel.setFont(new Font("Tahoma", Font.BOLD, 30));
		cbxTravel.setBounds(23, 91, 119, 45);
		panel_2.add(cbxTravel);

		JCheckBox cbxPlastic = new JCheckBox("Plastic");
		cbxPlastic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbxPlastic.isSelected()) {
					textFieldPlastic.setEnabled(true);
					textFieldPlastic.setText(null);
					textFieldPlastic.requestFocus();

				}else {
					textFieldPlastic.setEnabled(false);
					textFieldPlastic.setText("0");
				}
			}
		});
		cbxPlastic.setFont(new Font("Tahoma", Font.BOLD, 30));
		cbxPlastic.setBounds(23, 137, 125, 45);
		panel_2.add(cbxPlastic);

		JCheckBox cbxCopper = new JCheckBox("Copper");
		cbxCopper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbxCopper.isSelected()) {
					textFieldCopper.setEnabled(true);
					textFieldCopper.setText(null);
					textFieldCopper.requestFocus();

				}else {
					textFieldCopper.setEnabled(false);
					textFieldCopper.setText("0");
				}
			}
		});
		cbxCopper.setFont(new Font("Tahoma", Font.BOLD, 30));
		cbxCopper.setBounds(23, 180, 133, 45);
		panel_2.add(cbxCopper);

		JCheckBox cbxChrome = new JCheckBox("Chrome");
		cbxChrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbxChrome.isSelected()) {
					textFieldChrome.setEnabled(true);
					textFieldChrome.setText(null);
					textFieldChrome.requestFocus();

				}else {
					textFieldChrome.setEnabled(false);
					textFieldChrome.setText("0");
				}
			}
		});
		cbxChrome.setFont(new Font("Tahoma", Font.BOLD, 30));
		cbxChrome.setBounds(22, 223, 143, 45);
		panel_2.add(cbxChrome);

		JCheckBox chk0 = new JCheckBox("0%");
		chk0.setSelected(true);
		buttonGroup.add(chk0);
		chk0.setFont(new Font("Tahoma", Font.BOLD, 25));
		chk0.setBounds(24, 358, 71, 39);
		panel_2.add(chk0);

		JCheckBox chk5 = new JCheckBox("5%");
		buttonGroup.add(chk5);
		chk5.setFont(new Font("Tahoma", Font.BOLD, 25));
		chk5.setBounds(24, 400, 71, 39);
		panel_2.add(chk5);

		JCheckBox chk10 = new JCheckBox("10%");
		buttonGroup.add(chk10);
		chk10.setFont(new Font("Tahoma", Font.BOLD, 25));
		chk10.setBounds(23, 442, 87, 39);
		panel_2.add(chk10);

		JCheckBox chk15 = new JCheckBox("15%");
		buttonGroup.add(chk15);
		chk15.setFont(new Font("Tahoma", Font.BOLD, 25));
		chk15.setBounds(245, 360, 87, 39);
		panel_2.add(chk15);

		JCheckBox chk20 = new JCheckBox("20%");
		buttonGroup.add(chk20);
		chk20.setFont(new Font("Tahoma", Font.BOLD, 25));
		chk20.setBounds(245, 402, 87, 39);
		panel_2.add(chk20);

		JCheckBox chk25 = new JCheckBox("25%");
		buttonGroup.add(chk25);
		chk25.setFont(new Font("Tahoma", Font.BOLD, 25));
		chk25.setBounds(245, 446, 87, 39);
		panel_2.add(chk25);

		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblDiscount.setBounds(111, 320, 110, 31);
		panel_2.add(lblDiscount);

		JSeparator separator = new JSeparator();
		separator.setBounds(23, 307, 825, 2);
		panel_2.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(373, 307, 1, 174);
		panel_2.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(373, 48, 1, 433);
		panel_2.add(separator_2);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4.setBounds(10, 605, 1244, 66);
		frmBillingSystem.getContentPane().add(panel_4);
		panel_4.setLayout(null);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Child_Billing iExit = new Child_Billing();
				try {
					iExit.iExitSystem();
				} catch (NumberFormatException e) {
					JOptionPane.showConfirmDialog(null	, "Billing system error");
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnExit.setBounds(1010, 8, 147, 51);
		panel_4.add(btnExit);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JTextField clearText = null;

				for(Component c: panel_2.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						clearText = (JTextField)c;
						clearText.setText("");
						clearText.setEnabled(false);
					}
				}
				//--------------------------------------------------------------
				JCheckBox checker = null;
				textReceipt.setText(null);
				for(Component q: panel_2.getComponents()) {
					if (q.getClass().toString().contains("javax.swing.JCheckBox")) {
						checker = (JCheckBox)q;
						checker.setSelected(false);
						chk0.setSelected(true);
					}
				}
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnReset.setBounds(700, 8, 160, 51);
		panel_4.add(btnReset);

		JButton btnRecipt = new JButton("Receipt");
		btnRecipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {

				int refs = 1000 + (int)(Math.random()*9545);

				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
				tDate.format(timer.getTime());
				//----------------------------Receipt----------------------------

				textReceipt.append("\tBilling System:\n" + "Reference:\t\t\t" + refs + 
						"\n================================================\n" + 
						"Labour:\t\t\t" + textFieldLabour.getText() + "\n\n" +
						"Travel:\t\t\t" + textFieldTravel.getText() + "\n\n" +
						"Plastic:\t\t\t" + textFieldPlastic.getText() + "\n\n" +
						"Copper:\t\t\t" + textFieldCopper.getText() + "\n\n" +
						"Chrome:\t\t\t" + textFieldChrome.getText() + "\n\n" +
						"VAT:\t\t\t" + textFieldVAT.getText() + "\n\n" +
						"================================================\n"+

						"Tax:\t\t\t" + textFieldTax.getText() + "\n\n" +
						"Subtotal:\t\t\t" + textFieldSubtotal.getText() + "\n\n" +
						"Total:\t\t\t" + textFieldTotal.getText() + "\n\n" +

						"================================================\n\n"+
						tDate.format(timer.getTime()) + "\n"+
						tTime.format(timer.getTime()) + "\n"+
						"\nThank you!"
						);		
			}
		});
		btnRecipt.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnRecipt.setBounds(350, 8, 189, 51);
		panel_4.add(btnRecipt);

		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double iVAT, iTax, iSubtotal, iTotal;
				Child_Billing Cost_Of_Material = new Child_Billing();
				Cost_Of_Material.Labour = Cost_Of_Material.pLabour * Double.parseDouble(textFieldLabour.getText());
				Cost_Of_Material.Travel = Cost_Of_Material.pTravel * Double.parseDouble(textFieldTravel.getText());
				Cost_Of_Material.Plastic = Cost_Of_Material.pPlastic * Double.parseDouble(textFieldPlastic.getText());
				Cost_Of_Material.Copper = Cost_Of_Material.pCopper * Double.parseDouble(textFieldCopper.getText());
				Cost_Of_Material.Chrome = Cost_Of_Material.pChrome * Double.parseDouble(textFieldChrome.getText());

				//--------------------------------0%-----------------------------------------------------------

				if(chk0.isSelected()) {
					iSubtotal = Cost_Of_Material.GetAmount();
					iTax = Cost_Of_Material.cFindTax(iSubtotal);
					iVAT = Cost_Of_Material.cVATTax(iTax);
					iTotal = iSubtotal + iTax + iVAT;

					String subtotal = String.format("%.2f", iSubtotal);
					textFieldSubtotal.setText(subtotal);
					textFieldTaxable.setText(subtotal);

					String vat = String.format("%.2f", iVAT);
					textFieldVAT.setText(vat);

					String tax = String.format("%.2f", iTax);
					textFieldTax.setText(tax);

					String total = String.format("%.2f", iTotal);
					textFieldTotal.setText(total);


					textFieldCostOfMaterial.setText(String.format("%.2f",Cost_Of_Material.Chrome + Cost_Of_Material.Copper
							+ Cost_Of_Material.Plastic));

					textFieldCostOfLabor.setText(String.format("%.2f",Cost_Of_Material.Labour));
					textFieldMileage.setText(String.format("%.2f",Cost_Of_Material.Travel));
				}
				//--------------------------------5%-----------------------------------------------------------

				if(chk5.isSelected()) {
					iSubtotal = Cost_Of_Material.GetAmount();
					iSubtotal = iSubtotal-((iSubtotal*5)/100);
					iTax = Cost_Of_Material.cFindTax(iSubtotal);
					iVAT = Cost_Of_Material.cVATTax(iTax);
					iTotal = iSubtotal + iTax + iVAT;

					String subtotal = String.format("%.2f", iSubtotal);
					textFieldSubtotal.setText(subtotal);
					textFieldTaxable.setText(subtotal);

					String vat = String.format("%.2f", iVAT);
					textFieldVAT.setText(vat);

					String tax = String.format("%.2f", iTax);
					textFieldTax.setText(tax);

					String total = String.format("%.2f", iTotal);
					textFieldTotal.setText(total);


					textFieldCostOfMaterial.setText(String.format("%.2f",Cost_Of_Material.Chrome + Cost_Of_Material.Copper
							+ Cost_Of_Material.Plastic));

					textFieldCostOfLabor.setText(String.format("%.2f",Cost_Of_Material.Labour));
					textFieldMileage.setText(String.format("%.2f",Cost_Of_Material.Travel));
				}
				//--------------------------------10%-----------------------------------------------------------

				if(chk10.isSelected()) {
					iSubtotal = Cost_Of_Material.GetAmount();
					iSubtotal = iSubtotal-((iSubtotal*10)/100);
					iTax = Cost_Of_Material.cFindTax(iSubtotal);
					iVAT = Cost_Of_Material.cVATTax(iTax);
					iTotal = iSubtotal + iTax + iVAT;

					String subtotal = String.format("%.2f", iSubtotal);
					textFieldSubtotal.setText(subtotal);
					textFieldTaxable.setText(subtotal);

					String vat = String.format("%.2f", iVAT);
					textFieldVAT.setText(vat);

					String tax = String.format("%.2f", iTax);
					textFieldTax.setText(tax);

					String total = String.format("%.2f", iTotal);
					textFieldTotal.setText(total);


					textFieldCostOfMaterial.setText(String.format("%.2f",Cost_Of_Material.Chrome + Cost_Of_Material.Copper
							+ Cost_Of_Material.pPlastic));

					textFieldCostOfLabor.setText(String.format("%.2f",Cost_Of_Material.Labour));
					textFieldMileage.setText(String.format("%.2f",Cost_Of_Material.Travel));
				}
				//--------------------------------15%-----------------------------------------------------------

				if(chk15.isSelected()) {
					iSubtotal = Cost_Of_Material.GetAmount();
					iSubtotal = iSubtotal-((iSubtotal*15)/100);
					iTax = Cost_Of_Material.cFindTax(iSubtotal);
					iVAT = Cost_Of_Material.cVATTax(iTax);
					iTotal = iSubtotal + iTax + iVAT;

					String subtotal = String.format("%.2f", iSubtotal);
					textFieldSubtotal.setText(subtotal);
					textFieldTaxable.setText(subtotal);

					String vat = String.format("%.2f", iVAT);
					textFieldVAT.setText(vat);

					String tax = String.format("%.2f", iTax);
					textFieldTax.setText(tax);

					String total = String.format("%.2f", iTotal);
					textFieldTotal.setText(total);


					textFieldCostOfMaterial.setText(String.format("%.2f",Cost_Of_Material.Chrome + Cost_Of_Material.Copper
							+ Cost_Of_Material.Plastic));

					textFieldCostOfLabor.setText(String.format("%.2f",Cost_Of_Material.Labour));
					textFieldMileage.setText(String.format("%.2f",Cost_Of_Material.Travel));
				}
				//--------------------------------20%-----------------------------------------------------------

				if(chk20.isSelected()) {
					iSubtotal = Cost_Of_Material.GetAmount();
					iSubtotal = iSubtotal-((iSubtotal*20)/100);
					iTax = Cost_Of_Material.cFindTax(iSubtotal);
					iVAT = Cost_Of_Material.cVATTax(iTax);
					iTotal = iSubtotal + iTax + iVAT;

					String subtotal = String.format("%.2f", iSubtotal);
					textFieldSubtotal.setText(subtotal);
					textFieldTaxable.setText(subtotal);

					String vat = String.format("%.2f", iVAT);
					textFieldVAT.setText(vat);

					String tax = String.format("%.2f", iTax);
					textFieldTax.setText(tax);

					String total = String.format("%.2f", iTotal);
					textFieldTotal.setText(total);


					textFieldCostOfMaterial.setText(String.format("%.2f",Cost_Of_Material.Chrome + Cost_Of_Material.Copper
							+ Cost_Of_Material.pPlastic));

					textFieldCostOfLabor.setText(String.format("%.2f",Cost_Of_Material.Labour));
					textFieldMileage.setText(String.format("%.2f",Cost_Of_Material.Travel));
				}
				//--------------------------------25%-----------------------------------------------------------

				if(chk25.isSelected()) {
					iSubtotal = Cost_Of_Material.GetAmount();
					iSubtotal = iSubtotal-((iSubtotal*25)/100);
					iTax = Cost_Of_Material.cFindTax(iSubtotal);
					iVAT = Cost_Of_Material.cVATTax(iTax);
					iTotal = iSubtotal + iTax + iVAT;

					String subtotal = String.format("%.2f", iSubtotal);
					textFieldSubtotal.setText(subtotal);
					textFieldTaxable.setText(subtotal);

					String vat = String.format("%.2f", iVAT);
					textFieldVAT.setText(vat);

					String tax = String.format("%.2f", iTax);
					textFieldTax.setText(tax);

					String total = String.format("%.2f", iTotal);
					textFieldTotal.setText(total);


					textFieldCostOfMaterial.setText(String.format("%.2f",Cost_Of_Material.Chrome + Cost_Of_Material.Copper
							+ Cost_Of_Material.Plastic));

					textFieldCostOfLabor.setText(String.format("%.2f",Cost_Of_Material.Labour));
					textFieldMileage.setText(String.format("%.2f",Cost_Of_Material.Travel));
				}
				//--------------------------------Enable Text-----------------------------------------------------------
				JTextField clearText = null;

				for(Component c: panel_2.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						clearText = (JTextField)c;
						clearText.setEnabled(true);
					}
				}	
			}

		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnTotal.setBounds(100, 8, 133, 51);
		panel_4.add(btnTotal);
	}

}
