package recursion;
import java.util.Scanner;
public class RecursivePower {
	
		public static void main(String[] args) {		
		int base = 2;
		float result;				
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the power(Range is 0-23) : ");
		int n = scanner.nextInt();
		if (n>23 || n<0) 	// When result is too large to commpute or invalid	
		{
			System.err.println("Invalid range. The number cannot be greater than 23 or less than 0.");
			return;
		}
		result = recPow(base,n);		
		System.out.println("2 ^ "+ n + " = " + result);	
	}
		/**
		 * Function to calculate power with base n
		 * @param base
		 * @param n
		 * @return
		 */
		public static float recPow (int base, int n) {			
			if(n > 0) {		// when power is positive{
				return (base*recPow(base,n -1));
			}
			else if (n<0) { 	// when power is negative	
				return 1/ (base *recPow(base,-n-1));
			} else			// when power is zero
				return 1;
		}
}
