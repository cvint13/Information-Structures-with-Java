package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class TuitionObjectStyle {
	
	public static void main(String[] args){
		
		//Create the two course objects
		Course course1 = new Course();
		Course course2 = new Course();
		
		//Create the variables for which the user will set their values
		String courseName1, courseName2;
		int numCredits1, numCredits2;
		int costPerCredit1, costPerCredit2;
		
		//Prompt user to enter values for Course components
		courseName1 = JOptionPane.showInputDialog("Enter the name of the first course: ");
		course1.setName(courseName1);
		
		numCredits1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of credits"
				+ " for the first course: "));
		course1.setNumCredits(numCredits1);
		
		costPerCredit1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the cost"
				+ " per credit for the first course: "));
		course1.setCreditCost(costPerCredit1);
		
		//Print course details after necessary calculations
		course1.printTuitionDetails();
		
		//Prompt user to enter values for Course components
		courseName2 = JOptionPane.showInputDialog("Enter the name of the second course: ");
		course2.setName(courseName2);
				
		numCredits2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of credits"
				+ " for the second course: "));
		course2.setNumCredits(numCredits2);
				
		costPerCredit2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the cost"
				+ " per credit for the second course: "));
		course2.setCreditCost(costPerCredit2);
		
		//Print course details after necessary calculations
		course2.printTuitionDetails();
		
		//if-else statements to compare tuition for the two courses
		if (course1.getTotalTuition() > course2.getTotalTuition()){
			JOptionPane.showMessageDialog(null, courseName1 + " costs more than " + courseName2);
		}
		else if (course1.getTotalTuition() < course2.getTotalTuition()){
			JOptionPane.showMessageDialog(null, courseName2 + " costs more than " + courseName1);
		}
		else JOptionPane.showMessageDialog(null, "These two courses have the same cost.");
		
	}

}
