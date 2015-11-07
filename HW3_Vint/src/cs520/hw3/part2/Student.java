package cs520.hw3.part2;

public class Student {
	
	//Declare private instance variables for Student object
	private String name;
	private int homework1, homework2, homework3, homework4, homework5, homework6;
	
	//Constructor with name parameter
	public Student(String name){
		this.name = name;
	}
	
	//Set or mutation methods for the homework grades
	public void setHomework1(int homework1){
		this.homework1 = homework1;
	}
	
	public void setHomework2(int homework2){
		this.homework2 = homework2;
	}
	
	public void setHomework3(int homework3){
		this.homework3 = homework3;
	}
	
	public void setHomework4(int homework4){
		this.homework4 = homework4;
	}
	
	public void setHomework5(int homework5){
		this.homework5 = homework5;
	}
	
	public void setHomework6(int homework6){
		this.homework6 = homework6;
	}
	
	//get methods just for good programming style but not used in this assignment
	public int getHomework1(){
		return homework1;
	}
	
	public int getHomework2(){
		return homework2;
	}
	
	public int getHomework3(){
		return homework3;
	}
	
	public int getHomework4(){
		return homework4;
	}
	
	public int getHomework5(){
		return homework5;
	}
	
	public int getHomework6(){
		return homework6;
	}
	
	//method to compute the grade average
	public double computeAverage(){
		
		double sum = homework1 + homework2 + homework3 + homework4 + homework5 + homework6;
		double average = sum / 6.0;
		
		return average;
	}
	
	//override toString method to print it according to assignment procedures
	public String toString(){
		
		return name + "'s average grade is " + computeAverage() + ".";
	}

}
