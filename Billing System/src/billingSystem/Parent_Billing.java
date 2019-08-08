package billingSystem;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Parent_Billing {

	public double Labour;
	public double Travel;
	public double Plastic;
	public double Cooper;
	public double Chrome;
	public double Tax;
	public double VAT;
	public double MaterialCost;

	public double pLabour = 43;
	public double pTravel = 6.5;
	public double pPlastic = 4.75;
	public double pCooper = 9.8;
	public double pChrome = 7.5;
	public double pTax = 0.90;
	public double pVAT = 0.90;

	//---------------------Cost-------------------------------
	public double GetAmount() {
		MaterialCost = Labour + Travel + Plastic + Cooper + Chrome;
		return MaterialCost;
	}
	//---------------------Tax-------------------------------
	public Double cFindTax(double cAmount) {
		double FindTax = cAmount-(cAmount*pTax);
		return FindTax;
	}
	//---------------------VAT-------------------------------
	public Double cVATTax(double cAmount) {
		double FindTax = cAmount-(cAmount*pVAT);
		return FindTax;
	}
	//---------------------Exit-------------------------------
	public JFrame frame;
	public void iExitSystem() {
		frame=new JFrame();
		if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit",
				"Billing system", JOptionPane.YES_NO_OPTION)
				==JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}
	}

	//---------------------NumbersOnly-------------------------------

	public void NumbersOnly(java.awt.event.KeyEvent evt) {
		char iNumber = evt.getKeyChar();
		if (!(Character.isDigit(iNumber))
				||(iNumber==KeyEvent.VK_BACK_SPACE)
				||(iNumber==KeyEvent.VK_DELETE)){
			evt.consume();
		}

	}

}
