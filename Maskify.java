import java.util.Scanner;

public class Maskify {
	public static void main(String args[]) {
		System.out.println("Please enter your input string");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String maskedLine = maskify(line);
		System.out.println("Sorted String is: "+maskedLine);
	}
	
	public static String maskify(String line) {
		String maskedLine = "";
		int lineLength = line.length();
		if(lineLength > 4) {
			String modifiedString = line.substring(0, lineLength-4);
			String restString = line.substring(lineLength-4);
			maskedLine = modifiedString.replaceAll("(?s).", "#");
			maskedLine = maskedLine + restString;
		}else if(lineLength <=4) {
			maskedLine = line;
		}
		return maskedLine;
	}
}
