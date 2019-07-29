import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShortestString {
	public static void main(String args[]) {
		System.out.println("Please enter your input string");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int shortestLength = findShortest(line);
		System.out.println("shortest word length is: "+shortestLength);
	}
	
	public static int findShortest(String line) {
		String[] words = line.split(" ");
		List<Integer> lengths = new ArrayList<>();
		for(String word: words) {
			lengths.add(word.length());
		}
		return Collections.min(lengths);
		
		  /*int min = Integer.MAX_VALUE;
	        for(String each : s.split(" "))
	        {
	        if(each.length() < min)
	        min = each.length();
	        }
	         return min;*/
	}

}
