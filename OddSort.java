import java.util.Arrays;
import java.util.Scanner;

public class OddSort {
	public static void main(String args[]) {
		System.out.println("Please enter a set of comma seperated numbers");
		Scanner sc = new Scanner(System.in);
		String numberLine = sc.nextLine();
		int[] numbers = Arrays.stream(numberLine.split(",")).mapToInt(Integer::parseInt).toArray();
		int[] sortedNumbers = oddSort(numbers);
		for(int n: sortedNumbers) {
			System.out.println(n);
		}
	}
	
	public static int[] oddSort(int numbers[] ) {
		int arrLength = numbers.length;
		for (int i = 0; i < arrLength - 1; i++) {
			if (numbers[i] % 2 != 0) {
				for (int j = i; j < arrLength; j++) {
					if (numbers[j] % 2 != 0) {
						if (numbers[i] > numbers[j]) {
							int min = numbers[j];
							numbers[j] = numbers[i];
							numbers[i] = min;
						}
					}
				}
			}
		}
		return numbers;
	}
}
