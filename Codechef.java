/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.concurrent.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] faces = new int[6];
        int num = 0;
        
        while (num < 1000) {
            faces = dice(faces);
            num += 1;
        }
		System.out.println(Arrays.toString(faces));
	}
	
	public static int[] dice (int[] array) {
	    
    	int randomInt = ThreadLocalRandom.current().nextInt(1, 36 + 1);

	    if (randomInt < 7) array[0] += 1;
		else if (randomInt >= 7  && randomInt < 13) array[1] += 1;
		else if (randomInt >= 13 && randomInt < 18) array[2] += 1;
		else if (randomInt >= 19 && randomInt < 24) array[3] += 1;
		else if (randomInt >= 25 && randomInt < 30) array[4] += 1;
		else array[5] += 1;
		
		return array;
	}
}
