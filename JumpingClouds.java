import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingClouds {
	 static int jumpingOnClouds(int[] c) {
		 
		int noOfJumps = 0, i=0;
		int n = c.length;
		while(true) {
			if(i+2<n && c[i+2] == 0) {
				i+=2;
			}else if(i+1 < n) {
				i+=1;
			}else {
				break;
			}
			noOfJumps++;
		}
		 return noOfJumps;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	       
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] c = new int[n];

	        String[] cItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int cItem = Integer.parseInt(cItems[i]);
	            c[i] = cItem;
	        }

	        int result = jumpingOnClouds(c);
	        System.out.println(result);

	        scanner.close();
	    }

}
