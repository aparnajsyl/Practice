import java.util.*;
public class PrintNumberPatterns {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		printPattern(t);
		
		
	}
	public static void printPattern(int n) {
		StringBuilder sb = new StringBuilder();
        for(int i=n;i>=1;i--){
            for(int j=n;j>=1;j--){
                int k=i;
                while(k>=1){
                    sb.append(j+" ");
                    k--;
                }
            }
            sb.append("$");
        }
        System.out.print(sb.toString());
	}
		
}
