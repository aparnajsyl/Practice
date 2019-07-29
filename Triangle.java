import java.util.Scanner;

public class Triangle {
	public static void main(String args[]) {
		System.out.println("Please enter 3 numbers as 3 sides of the triangle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st side: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd side: ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd side: ");
		int c = sc.nextInt();
		boolean value = constructTriangle(a,b,c);	
		System.out.print(value);
	}
	
	public static boolean constructTriangle(int a, int b, int c) {
		boolean value = false;
		if(a != 0 && b != 0 && c != 0) {
			if(a+b > c && b+c > a && c+a > b) {
				value = true;
			}
		}
		return value;
	}
}
