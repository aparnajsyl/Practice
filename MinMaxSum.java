import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {
	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long min = arr[0];
        long max = 0, sum = 0;
        long sumOfMin = 0, sumOfMax = 0;
        for(int i=0; i<arr.length; i++){    
            if(arr[i]<min){
                 min= arr[i];
            }
            if(arr[i] > max){
                max= arr[i];
            }
            sum = sum + arr[i];
        }
        sumOfMax = sum - min;
        sumOfMin = sum - max;
        System.out.println(sumOfMin + " "+sumOfMax);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
