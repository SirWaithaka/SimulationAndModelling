/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DieSimulation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// faces array to hold frequencies of the 6 faces
		double[] faces = new double[6];
        int num = 0;
        
        while (num < 1000) {
            faces = dice(faces);
            num += 1;
        }
		System.out.println(Arrays.toString(faces));
	}
	
	// Die function that will simulate a single toss of a die
	public static double[] dice (double[] array) {
	    
    	double randomDouble = Math.random();

	    if 		(randomDouble <= (1.0/6.0)) array[0] += 1;
		else if (randomDouble > (1.0/6.0)  && randomDouble <= (2.0/6.0)) array[1] += 1;
		else if (randomDouble > (2.0/6.0) && randomDouble <= (3.0/6.0)) array[2] += 1;
		else if (randomDouble > (3.0/6.0) && randomDouble <= (4.0/6.0)) array[3] += 1;
		else if (randomDouble > (4.0/6.0) && randomDouble <= (5.0/6.0)) array[4] += 1;
		else array[5] += 1;
		
		return array;
	}
}
