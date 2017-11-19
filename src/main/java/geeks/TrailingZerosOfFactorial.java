package geeks;

public class TrailingZerosOfFactorial {

	public static void main(String[] args){
		  int n = 100;
		    System.out.printf("Count of trailing 0s in %d! is %d", 100, new TrailingZerosOfFactorial().findTrailingZeros(n));
		   
	}
	int findTrailingZeros(int  n)
	{
	    // Initialize result
	    int count = 0;
	 
	    // Keep dividing n by powers of 5 and update count
	    for (int i=5; n/i>=1; i *= 5)
	          count += n/i;
	 
	    return count;
	}
}
