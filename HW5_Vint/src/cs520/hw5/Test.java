package cs520.hw5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Test {
	
	public static void main(String[] args){
		
		//Declare queue of students
		LinkedList<Student> studentQueue = new LinkedList<Student>();
		
		//declare Student map
		HashMap<String, Student> studentMap = new HashMap<String, Student>();
		
				//declare file name to find data.txt when program runs and file reader
				String inputFileName = "data.txt";
				FileReader fileReader = null;
				
				
				//try block attempts to define the file reader
				try {
					fileReader = new FileReader(inputFileName);	
				}
				
				//catch block in the event that the file is not found
				catch (FileNotFoundException e){
					e.printStackTrace();
				}
				
				//buffered reader to work with strings from file
				BufferedReader reader = new BufferedReader(fileReader);
				String line;
				
				//try block goes line by line, one student at a time until it reaches null aka last line
				try {
					line = reader.readLine().trim();
					
					//process the data from file
					System.out.println("Input file processing...");
					while (line != null){
						
						//call static method to process the line of data
						Student nextStudent = processInputData(line);
						
						//add newly processed student to queue
						studentQueue.add(nextStudent);
						
						//add newly processed student to map
						studentMap.put(nextStudent.getName(), nextStudent);
						
						//move on to the next line
						line = reader.readLine();
					}
					
					//create iterator to go thru students
					Iterator<Student> queueIterator = studentQueue.iterator();
					
					//Iterate over the queue of students
					System.out.println("\nIterating over student list...");
					while (queueIterator.hasNext()){
						System.out.println(queueIterator.next().toString());
					}
					
					System.out.println("\nIterating over student map...");
					
					//create iterator to go thru keys
					Iterator<String> keyIterator = studentMap.keySet().iterator();
					
					//iterate thru keys to retrieve corresponding students
					while (keyIterator.hasNext()){
						String nextStudentKey = keyIterator.next();
						System.out.println(studentMap.get(nextStudentKey).toString());
						
					}
					
				}
				catch (IOException e){
					e.printStackTrace();
				}
				
				
		
	}
	
	//method to process data from the file
	private static Student processInputData(String s){
		
		//create the tokenizer to go thru line
		StringTokenizer tokenizer = new StringTokenizer(s, ",");
		
		//because we know the first token is the name we will assign 
		//the name as the first token
		Student currentStudent = new Student(tokenizer.nextToken());
		
		//after the name we can assume all other tokens are grades
		while (tokenizer.hasMoreTokens()){
			currentStudent.addHomeworkGrade(Integer.parseInt(tokenizer.nextToken().trim()));
		}
		
		//print out the student that has just been processed
		System.out.println(currentStudent.toString());
		
		return currentStudent;
	}

}
