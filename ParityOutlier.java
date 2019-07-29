import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ParityOutlier {
	public static void main(String args[]) {
		System.out.println("Please enter a set of  atleast 3 comma seperated numbers");
		Scanner sc = new Scanner(System.in);
		String numberLine = sc.nextLine();
		int[] numbers = Arrays.stream(numberLine.split(",")).mapToInt(Integer::parseInt).toArray();
		int oddManOut = getParityOutlier(numbers);
		System.out.println(oddManOut);
	}
	
	public static int getParityOutlier(int numbers[]) {
		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();
		int parity;
		for(int n : numbers) {
			if(n%2 == 0) {
				evenNumbers.add(n);
			}else {
				oddNumbers.add(n);
			}
		}
		if(evenNumbers.size() == 1) {
			parity = evenNumbers.get(0);
		}else {
			parity = oddNumbers.get(0);
		}
		return parity;
		
	}

}
