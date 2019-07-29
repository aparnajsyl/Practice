import java.io.*;
import java.util.*;

public class CountingValleys {
	// Complete the countingValleys function below.
    static int countingNoOfValleys(int n, String s) {
    	int level =0, valleys = 0;
    	boolean belowSeaLevel = false;
    	for(int i=0; i<n; i++) {
    		char slope = s.charAt(i);
    		if(slope == 'U') {
    			level ++;
    		}else {
    			level--;
    		}
    		if(!belowSeaLevel && level < 0) {
    			valleys++;
    			belowSeaLevel = true;
    		}
    		if(level >=0) {
    			belowSeaLevel = false;
    		}
    	}

    	return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingNoOfValleys(n, s);

       System.out.println(result);
        scanner.close();
    }

}
