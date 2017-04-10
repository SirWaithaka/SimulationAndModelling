/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;

/* Name of the class has to be "Main" only if the class is public. */
class DieSimulation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// frequency array to hold frequencies of the 6 frequency
		double[] frequency = new double[6];
        int num = 0;
        
        while (num < 1000) {
            frequency = dice(frequency);
            num += 1;
        }
		double sumFrequency = DoubleStream.of(frequency).sum();
		double[] percentageFrequency = new double[6];

		for (int a = 0; a < 6; a ++) {
			percentageFrequency[a] = (frequency[a] / sumFrequency) * 100;
		}

		System.out.printf("Face \t Frequenncy \t Percentage\n");
		for (int a = 0; a < 6; a ++) {
			System.out.printf("%d \t %.0f \t\t %.2f\n", (a+1), frequency[a], percentageFrequency[a]);
		}

		//System.out.println(sumFrequency);
		//System.out.println(Arrays.toString(frequency));
		//System.out.println(Arrays.toString(percentageFrequency));
	}
	
	// Die function that will simulate a single toss of a die
	public static double[] dice (double[] array) {
	    
    	double randomDouble = Math.random();

	   if (randomDouble < (1.0/6.0))
			array[0] += 1;
		else if (randomDouble < (2.0/6.0))
			array[1] += 1;
		else if (randomDouble < (3.0/6.0))
			array[2] += 1;
		else if (randomDouble < (4.0/6.0))
			array[3] += 1;
		else if (randomDouble < (5.0/6.0))
			array[4] += 1;
		else if (randomDouble < (6.0/6.0)) 
			array[5] += 1;
		
		return array;
	}
}
