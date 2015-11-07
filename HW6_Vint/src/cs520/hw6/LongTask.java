package cs520.hw6;

import java.util.Random;

public class LongTask extends Thread {
	
	//instance variables
	private SharedResults sharedData;
	private int start, end;
	
	//constructor defines name of thread and instance variables
	public LongTask(SharedResults sharedData, int start, int end){
		
		super("Thread_" + start + "_" + end);
		this.sharedData = sharedData;
		this.start = start;
		this.end = end;
		
	}
	
	//run method 
	public void run(){
		
		//sum stores added up numbers from loop
		int sum = 0;
		
		//random generator for random long to be used by sleep method
		Random gen = new Random();
		
		//for loop to add up consecutive numbers
		for (int a = start; a <= end; a++){
			
			sum += a;
			
			//generate random time to sleep
			long sleepTime = gen.nextInt(10);
			
			//handling exceptions to carry out sleep method properly
			try {
				sleep(sleepTime);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		//add the sum to the shared data
		sharedData.addToResult(sum);
		
	}

}
