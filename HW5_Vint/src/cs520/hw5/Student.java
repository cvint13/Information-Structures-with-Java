package cs520.hw5;

import java.util.ArrayList;

public class Student {
	
	//instance variables for Student object
	private String name;
	private ArrayList<Integer> homeworks;
	
	//constructor class with name for arg
	public Student(String name){
		
		this.name = name;
		
		//define homeworks queue
		homeworks = new ArrayList<Integer>();
		
	}
	
	//mutator method for instance variable
	public void setName(String newName){
		name = newName;
	}
	
	//get method for instance variable
	public String getName(){
		return name;
	}
	
	//add hw grade to list with this method
	public void addHomeworkGrade(int homeworkGrade){
		homeworks.add(homeworkGrade);
	}
	
	//compute average with this method 
	public double computeAverage(){
		
		double sum = 0;
		
		for (int i : homeworks){
			sum += i;
		}
		
		return sum / homeworks.size();
	}
	
	//override toString method
	public String toString(){
		return name + "'s average grade is " + computeAverage(); 
	}

}
