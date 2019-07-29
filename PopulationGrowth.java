import java.util.Scanner;

public class PopulationGrowth {
	public static void main(String args[]) {
		System.out.println("Please enter values to calculate population growth");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial population number: ");
		int p0 = sc.nextInt();
		System.out.println("Enter percentage growth rate per year: ");
		float percent = sc.nextFloat();
		System.out.println("Enter no of ppl coming to live each year: ");
		int aug = sc.nextInt();
		System.out.println("Enter population value to surpass: ");
		int p = sc.nextInt();
		int noOfYears = nb_year(p0,percent,aug,p);
		System.out.println(noOfYears);
	}
	
	public static int nb_year(int p0, float percent, int aug, int p) {
		percent = percent/100;
		int counter = 1;
		int initialValue = (int) (p0+p0*percent+aug);
		while(initialValue < p) {
			p0 = initialValue;
			counter++;
			initialValue = (int) (p0+p0*percent+aug);
		}
		return counter;
		
		 /*int years = 0;
	        while (p0 < p) {
	            p0 += p0 * percent / 100 + aug;
	            years++;
	        }
	        return years;*/
	}
}
