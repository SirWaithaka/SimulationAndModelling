
import java.util.*;
import java.io.*;
import java.lang.Math;

// use MonteCarlo integration to find an esstimate to the function
// sin2(x) + cos2(x)
class MonteCarlo
{
   // this function uses the equation a + u(a - b)
   // to generate a uniform X value for a function parameter
   public static double generateUniformValue(double a, double b)
   {
      Random random = new Random();
      double randomValue = a + random.nextDouble() * (a - b);
      return randomValue;
   }
   public static void main(String[] args)
   {
      int i = 0;
      int n = 1000; // number of iterations to the function
      double pi = Math.PI;
      double sum = 0;

      while (i < n) {
         double randomValueOfX = generateUniformValue(0.0, pi);
         double sampleY = Math.pow(Math.sin(randomValueOfX), 2) + Math.pow(Math.cos(randomValueOfX),2);
         sum += sampleY;
         i ++;
      }

      System.out.println((pi - 0.0) * (sum/n));
   }
}