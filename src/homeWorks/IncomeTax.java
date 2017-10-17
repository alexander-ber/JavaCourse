package homeWorks;

import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		String name = "";
		String out_message = "";
		double amountForTax = 0;
		double[] stepArray = { 23000.0, 23000.0, 74000.00, 100000.00, 8 };
		double[] taxArray = { 10.0, 20.0, 30.0, 40.0, 50.0 };
		int i = 0;

		double step = 0;
		double step_amount = 0;
		double tax_step = 0;
		double tax_final = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("***** Income Tax Calculator *****");
		System.out.print("Enter your name:");
		name = in.nextLine();
		System.out.print("Enter amount for tax:");
		amountForTax = in.nextDouble();
		step_amount = step = amountForTax;
		in.close();

		out_message = "\nHello " + name + ", wellcome to Income Tax Calculator.";
		out_message += "\nYou entered: " + amountForTax + ":\n";

		if (amountForTax > 0) {
			for (i = 0; i < taxArray.length; i++) {
				if ( step < stepArray[i] || i==(taxArray.length-1) )
					step_amount = step;
				else
					step_amount = stepArray[i];
				tax_step = step_amount * taxArray[i] / 100;
				tax_final += tax_step;
				out_message += "STEP " + stepArray[i] + " Tax: " + taxArray[i] + "%: tax amount: " + step + ", step amount:" + step_amount + ", Step IncomeTax:" + tax_step + ". Final IncomeTax:" + tax_final + ".\n";
				if ( step < stepArray[i] && i!=(taxArray.length-1) ) { break; }
				step -= stepArray[i];
			}
			out_message += "\nSo " + name + ", finaly, for amount: " + amountForTax + " you need to pay Income Tax: " + tax_final + ".";
		} else {
			out_message += "You Don't need to pay Income Tax!!";
		}
		out_message += "\n*********************************";
		System.out.print(out_message);
	}
}
