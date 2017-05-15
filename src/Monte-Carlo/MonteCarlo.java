
import java.util.*;
import java.io.*;
import java.lang.Math;

/*
 * Monte Carlo Integration
 * Find the integal of squared(sinx) + squared(cosx)
 * from 0 to PI
 */
class MonteCarlo
{
   // this function uses the equation a + u(a - b)
   // to generate a uniform X value for a function parameter
   public static double generateUniformValue(double a, double b)
   {
      double randomValue = a + Math.random() * (b - a);
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