import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class RepeatedString {
	  static long repeatedString(String s, long n) {
		  
		  final long quotient = n/s.length();
		    final long remainder = n%s.length();
		    long aCount = 0;

		    if((s.length() == 1) && (s.charAt(0) == 'a')){
		        return n;
		    }
		    for(int i=0; i<s.length(); i++){
		        if(s.charAt(i) == 'a'){
		            aCount++;
		        }
		    }
		    aCount = aCount * quotient;
		    for(int i=0; i<remainder; i++){
		        if(s.charAt(i) == 'a'){
		            aCount++;
		        }
		    }
		    return aCount;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        String s = scanner.nextLine();

	        long n = scanner.nextLong();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        long result = repeatedString(s, n);

	        System.out.println(result);

	        scanner.close();
	    }

}
