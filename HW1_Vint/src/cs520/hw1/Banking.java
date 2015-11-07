package cs520.hw1;
/*
 * Application computes the smallest amount of bills
 * that add up to the dollar amount in the bank account.
 */


import javax.swing.JOptionPane;

public class Banking {
	
	public static void main(String[] args){
		
		String input; 		  //dollar amount entered by user
		int amount;   		  //input converted from String to Integer
		int remainingAmount;  //holds amount left after each bill calculation
		int hundreds; 		  //amt of hundred dollar bills
		int fifties;		  //amt of fifty dollar bills
		int twenties;		  //amt of twenty dollar bills
		int tens;			  //amt of ten dollar bills
		int fives;			  //amt of five dollar bills
		int twos;			  //amt of two dollar bills
		int ones;			  //amt of one dollar bills
		
		//Prompt user to input dollar amount
		input = JOptionPane.showInputDialog("Enter dollar amount: ");
		
		//Assume input makes a valid int when parsed, and 
		//convert (String) input to (int) amount
		amount = Integer.parseInt(input);
		
		//Print converted int to console
		System.out.println("Requested amount: " + amount);
		
		//computes and prints hundreds and remaining amt
		hundreds = amount / 100;
		remainingAmount = amount % 100;
		System.out.println("Hundreds = " + hundreds + ", Remaining amount = " + remainingAmount);
		
		//compute and print fifties and remaining amt
		fifties = remainingAmount / 50;
		remainingAmount %= 50;
		System.out.println("Fifties = " + fifties + ", Remaining amount = " + remainingAmount);
		
		//compute and print twenties and remaining amt
		twenties = remainingAmount / 20;
		remainingAmount %= 20;
		System.out.println("Twenties = " + twenties + ", Remaining amount = " + remainingAmount);
		
		//compute and print tens and remaining amt
		tens = remainingAmount / 10;
		remainingAmount %= 10;
		System.out.println("Tens = " + tens + ", Remaining amount = " + remainingAmount);
		
		//compute and print fives and remaining amt
		fives = remainingAmount / 5;
		remainingAmount %= 5;
		System.out.println("Fives = " + fives + ", Remaining amount = " + remainingAmount);
		
		//compute and print twos and remaining amt
		twos = remainingAmount / 2;
		remainingAmount %= 2;
		System.out.println("Twos = " + twos + ", Remaining amount = " + remainingAmount);
		
		//compute and print ones and remaining amt
		ones = remainingAmount;
		System.out.println("Ones = " + ones );
		
		//Prints results in message dialog
		JOptionPane.showMessageDialog(null, "Requested amount (" + amount + ") "
				+ "\nHundreds (" + hundreds + ")"
					+ "\nFifties ("+ fifties +")"
						+ "\nTwenties ("+ twenties +")"
							+ "\nTens ("+ tens +")"
								+ "\nFives ("+ fives +")"
									+ "\nTwos ("+ twos +")"
										+ "\nOnes ("+ ones +")");
		
		
	}

}
