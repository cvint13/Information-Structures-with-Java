package cs520.hw3.part1;

import javax.swing.JOptionPane;

public class StringTest {
	
	public static void main(String[] args){
		
		String courseId, courseName, tuition;
		
		try {
		
			//Prompt user to enter course info with JOptionPane
			String courseInfoInput = JOptionPane.showInputDialog("Enter Course ID, Course Name, and Tuition"
				+ " in the format 'CourseId,CourseName,Tuition").trim();
		
			//Prints user input to console
			System.out.println(courseInfoInput);
		
			//get index of first comma in user input
			int firstCommaIndex = courseInfoInput.indexOf(",");
		
			//declare variable for course id taken from user input
			courseId = courseInfoInput.substring(0, firstCommaIndex);
		
			//print position of first comma, course id, and length of course id to console
			System.out.println("Position of the first comma: " + firstCommaIndex);
			System.out.println("Course ID: " + courseId);
			System.out.println("Length of Course ID: " + courseId.length());
		
			//declare variable containing index of second comma
			int secondCommaIndex = courseInfoInput.indexOf(",", firstCommaIndex + 1);
		
			//use position of second comma to find the course name
			courseName = courseInfoInput.substring(firstCommaIndex + 1, secondCommaIndex);
		
			//print course name, comma position and length of course name to console
			System.out.println("Position of the second comma: " + secondCommaIndex);
			System.out.println("Course name: " + courseName);
			System.out.println("Length of Course Name: " + courseName.length());
		
			//get tuition from user input and  change from String to Integer
			tuition = courseInfoInput.substring(secondCommaIndex + 1, courseInfoInput.length());
			int tuitionInt = Integer.parseInt(tuition);
		
			//solve for tuition with 25% discount
			int tuitionDiscount = tuitionInt * 3 / 4;
		
			//Print tuition with and without discount to console
			System.out.println("Course Tuition: $" + tuitionInt);
			System.out.println("Course tuition at 25% discount: $" + tuitionDiscount);
		
		}
		
		//handle exception when numbers not entered properly
		catch (NumberFormatException e){
			System.out.println(e);
		}
		
		//handle exception when not all the course info is entered
		catch (StringIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("Sorry, we cannot provide you with all the information"
					+ "based on the format of your entry.");
		}
		
		//handle exception when cancel button is clicked
		catch (NullPointerException e){
			System.out.println(e);
			System.out.println("You clicked 'cancel' and the program did not complete.");
		}
	}

}
