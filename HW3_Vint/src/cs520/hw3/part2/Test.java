package cs520.hw3.part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test {
	
	public static void main(String[] args){
		
		
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
			line = reader.readLine();
			
			while (line != null){
				
				//System.out.println(line);
				processInputData(line);
				line = reader.readLine();
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	
	//method to process the data for each line and define the students
	public static void processInputData(String data){
		
		StringTokenizer tokenizer = new StringTokenizer(data, ",");
		String name = tokenizer.nextToken();
		int homework1 = Integer.parseInt(tokenizer.nextToken());
		int homework2 = Integer.parseInt(tokenizer.nextToken());
		int homework3 = Integer.parseInt(tokenizer.nextToken());
		int homework4 = Integer.parseInt(tokenizer.nextToken());
		int homework5 = Integer.parseInt(tokenizer.nextToken());
		int homework6 = Integer.parseInt(tokenizer.nextToken().trim());
		
		Student currentStudent = new Student(name);
		currentStudent.setHomework1(homework1);
		currentStudent.setHomework2(homework2);
		currentStudent.setHomework3(homework3);
		currentStudent.setHomework4(homework4);
		currentStudent.setHomework5(homework5);
		currentStudent.setHomework6(homework6);
		
		System.out.println(currentStudent.toString());
	}

}
