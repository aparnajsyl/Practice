import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingProblem {
	 static int[] gradingStudents(int[] grades) {
	        /*
	         * Write your code here.
	         */
	         int[] finalGrades = new int[grades.length];
	         for(int i=0;i<grades.length;i++){
	             if(grades[i] < 38){
	                 finalGrades[i] = grades[i];
	             } else{
	                 if(grades[i]%5 == 3){
	                     finalGrades[i] = grades[i]+2;
	                 }else if(grades[i]%5 == 4) {
	                	 finalGrades[i] = grades[i]+1;
	                 }else{
	                     finalGrades[i] = grades[i];
	                 }
	             }
	         }
	        
	        return finalGrades;
	    }

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        int n = Integer.parseInt(scan.nextLine().trim());

	        int[] grades = new int[n];

	        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
	            int gradesItem = Integer.parseInt(scan.nextLine().trim());
	            grades[gradesItr] = gradesItem;
	        }

	        int[] result = gradingStudents(grades);

	        for (int resultItr = 0; resultItr < result.length; resultItr++) {
	            System.out.println(result[resultItr]);

	            if (resultItr != result.length - 1) {
	            	 System.out.println("\n");
	            }
	        }

	    }
}
