package cs520.hw2.pt2;

public class Course {
	
	//variables related to Course object defined
	private String courseName;
	private int costPerCredit;
	private int numberOfCredits;
	
	//Constructor
	public Course(String courseName, int costPerCredit, int numberOfCredits){
		this.courseName = courseName;
		this.costPerCredit = costPerCredit;
		this.numberOfCredits = numberOfCredits;
		
		//Print values to console and total tuition
		System.out.print("CourseName = " + this.getCourseName());
		System.out.print(", CostPerCredit = " + getCostPerCredit());
		System.out.print(", NumberOfCredits = " + getNumberOfCredits());
		
	}
	
	//set or mutation methods
	public void setCourseName(String name){
		courseName = name;
	}
	
	public void setCostPerCredit(int creditCost){
		costPerCredit = creditCost;
	}
	
	public void setNumberOfCredits(int numCredits){
		numberOfCredits = numCredits;
	}
	
	//get or fetching methods
	public String getCourseName(){
		return courseName;
	}
	
	public int getCostPerCredit(){
		return costPerCredit;
	}
	
	public int getNumberOfCredits(){
		return numberOfCredits;
	}
	
	//method to return total tuition cost
	public int getTotalTuition(){
		return getCostPerCredit() * getNumberOfCredits();
	}
	
	//return a reprinted representation of the Course object
	public String toString(){
		return "Course: " + courseName + " @ $" + getTotalTuition();
	}

}
