package cs520.hw1;

/*
 * This program prints all the Pythagorean Triples 
 * in the range from 1-100.
 */

public class Triples {
	
	public static void main(String[] args){
		
		//Defining integer that will keep track of number of printed Pyth. triples
		int count = 1;
		
		//Labelling for the chart that will be printed
		System.out.println("Count\tx\ty\tz");
		
		//Nested for loops that go through possible x and y values from 1 to 100
		for (int x = 1; x <=100; x++){
			
			for (int y = 1; y <=100; y++){
			
				//Calculate sum of squares
				int sumOfSquares = (x*x) + (y*y);
				
				//Cast sum of squares to an integer
				int z = (int) Math.sqrt(sumOfSquares);
				
				//Check to see if it is a perfect square that has not already been printed
				if (((z*z) == sumOfSquares) && ((x*x) < (y*y))){

					//Print the values in the next Pythagorean triple
					System.out.println(count + ")\t" + x + "\t" + y + "\t" + z);
					count++;
				}
			
			}
		
		}
	
	}

}
