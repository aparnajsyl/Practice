import java.util.Scanner;

public class CalculateYears {
	public static void main(String args[]) {
		System.out.println("Please enter values to calculate no of years to deposit sum");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount: ");
		double principal = sc.nextDouble();
		System.out.println("Enter interest amount: ");
		double interest = sc.nextDouble();
		System.out.println("Enter tax amount: ");
		double tax = sc.nextDouble();
		System.out.println("Enter desired amount: ");
		double desired = sc.nextDouble();
		int noOfYears = calculateYears(principal,interest,tax,desired);
		System.out.println(noOfYears);
	}
	
	public static int calculateYears(double principal, double interest, double tax, double desired) {
		int years = 0;
		if(principal >= desired) {
			return 0;
		} else {
			while(principal < desired) {
				years++;
				 // calculate the interest for this year
			     double currentYearInterest = interest * principal;
			     
			     // calculate the tax on the interest for this year
			     double currentYearTax = currentYearInterest * tax;
			     
			     // adjust the principal to add the interest and minus the tax
			     principal =  principal + currentYearInterest - currentYearTax;
					}
		}
		return years;
		
		/* int years = 0;
		    while (principal < desired) {
		      principal += principal * interest * (1 - tax);
		      years++;
		    }
		    return years;*/
	}

}
