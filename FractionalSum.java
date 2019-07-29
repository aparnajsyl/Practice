import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class FractionalSum {
	// Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	 int n = arr.length;
         double zeroCounter = 0;
         double positiveCounter = 0;
         double negativeCounter = 0;
         double value1, value2, value3;
         for (int i=0; i< n; i++){
             if(arr[i] == 0){
                 zeroCounter++;
             } else if(arr[i] > 0){
                 positiveCounter++;
             } else{
                 negativeCounter++;
             }
         }
         value1 = zeroCounter/n;
         value2 = positiveCounter/n;
         value3 = negativeCounter/n;
         System.out.println((double)Math.round(value2 * 1000000d) / 1000000d);
         System.out.println((double)Math.round(value3 * 1000000d) / 1000000d);
         System.out.println((double)Math.round(value1 * 1000000d) / 1000000d);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }

}
