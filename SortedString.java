import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedString {
	public static void main(String args[]) {
		System.out.println("Please enter your input string");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String sortedLine = sortString(line);
		System.out.println("Sorted String is: "+sortedLine);
	}
	
	private static String sortString(String line) {
		String sortedHereLine = "";
		if(line == null || line.isEmpty()) {
			sortedHereLine =  line;
		}else {
			String[] words = line.split(" ");
			SortedMap<Character, String> sortedString = new TreeMap<Character, String>();
			for(String word : words) {
				for(char c : word.toCharArray()) {
					if(Character.isDigit(c)) {
						sortedString.put(c,word);
						break;
					}
				}
			}
			for(String value : sortedString.values()) {
				sortedHereLine += value + " ";
			}
		}
		return sortedHereLine.trim();
	}

}
