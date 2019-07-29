import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {
	static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         Date date = new Date();
       SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
       try{
           date = parseFormat.parse(s);
       }
       catch(Exception e){

       }
       return displayFormat.format(date);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

        String result = timeConversion(s);

       System.out.println(result);
    }

}
