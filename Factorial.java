import java.math.BigInteger;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(factTail(5,1));
	}
	
	/**
	 * Factorial function to calculate factorial of n using recursion
	 * @param n
	 * @return BigInteger is used to handle outOfRange Values
	 */
	public static BigInteger fact(int n) {
		try {
			if (n > 1)  {
				return BigInteger.valueOf(n).multiply((fact(n-1)));
		    } else {
		        return BigInteger.valueOf(1);
	        }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return BigInteger.valueOf(1);
		}
	}
	
	 public static long factTail(long n, long val) {
	        if (n == 1) return val;
	        return factTail(n - 1, n * val);
	 } 
}
