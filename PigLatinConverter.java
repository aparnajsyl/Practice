import java.util.Scanner;

public class PigLatinConverter {
	public static void main(String args[]) {
		System.out.println("Please enter your input string");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String convertedLine = pigIt(line);
		System.out.println("converted line is: "+convertedLine);
	}
	
	public static String pigIt(String line) {
		String[] words = line.replaceAll("'", "").split(" ");
		String b,c = "";
		for(String word: words) {
			if(word.matches("\\p{Punct}")) {
				c += word;
			}else {
				b = word.substring(1);
				c += b + word.charAt(0) + "ay" + " ";
			}
		}
		return c.trim();
	}
}
