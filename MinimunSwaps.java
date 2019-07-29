import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MinimunSwaps {
	 // Complete the minimumSwaps function below.
    static int minimumNoOfSwaps(int[] arr) {
    	
    	 int n = arr.length - 1;
         int minSwaps = 0;
         for (int i = 0; i < n; i++) {
             if (i < arr[i] - 1) {
                 swap(arr, i, Math.min(n, arr[i] - 1));
                 minSwaps++;
                 i--;
             }
         }
         return minSwaps;
     }

      private static void swap(int[] array, int i, int j) {
         int temp = array[i];
         array[i] = array[j];
         array[j] = temp;
     }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumNoOfSwaps(arr);

        System.out.println(res);

        scanner.close();
    }

}
