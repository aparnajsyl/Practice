import java.io.IOException;
import java.util.Scanner;

public class FatToFit {
	
	public static String orderWeight(String strng) {
		return strng;
		
	} 
	
	private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {


	        String s = scanner.nextLine();

	        String res = orderWeight(s);

	        System.out.println(res);

	        scanner.close();
	    }

}
