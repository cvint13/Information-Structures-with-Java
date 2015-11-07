package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class Course {
	
	//Create three component variables of the Course object
	private String courseName;
	private int costPerCredit;
	private int numberOfCredits;
	
	//Method that sets course name
	public void setName(String newName){
		courseName = newName;
	}
	
	//Method that sets cost per credit
	public void setCreditCost(int newCreditCost){
		costPerCredit = newCreditCost;
	}
	
	//Method that sets number of credits
	public void setNumCredits(int newNumCredits){
		numberOfCredits = newNumCredits;
	}
	
	//Method that returns course name
	public String getName(){
		return courseName;
	}
	
	//Method that returns cost per credit
	public int getCreditCost(){
		return costPerCredit;
	}
	
	//Method that returns number of credits
	public int getNumCredits(){
		return numberOfCredits;
	}
	
	//Method that calculates and returns total tuition cost
	public int getTotalTuition(){
		return numberOfCredits * costPerCredit;
	}
	
	//Method that creates dialog box with course name and total tuition
	public void printTuitionDetails(){
		JOptionPane.showMessageDialog(null, "Name of Course: " + courseName 
				+ "\nCourse tuition: " + getTotalTuition());
	}

}
