import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DiagonalDifference {

    // Complete the diagonalDifference function below.
	 // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
         // Initialize sums of diagonals 
        int d1 = 0, d2 = 0; 
        int n = arr.length;
       
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                // finding sum of primary diagonal 
                if (i == j) 
                    d1 += arr[i][j]; 
       
                // finding sum of secondary diagonal 
                if (i == n - j - 1) 
                    d2 += arr[i][j]; 
            } 
        } 
       
        // Absolute difference of the sums 
        // across the diagonals 
        return Math.abs(d1 - d2); 
    }

    public static void main(String[] args)  
    { 
    int n = 3; 
    
    int arr[][] = 
    { 
        {11, 2, 4}, 
        {4 , 5, 6}, 
        {10, 8, -12} 
    }; 
   
    System.out.print(diagonalDifference(arr)); 
     
    }
}