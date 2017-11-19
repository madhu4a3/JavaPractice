package geeks;
public class DivideBy7
{

	// 371: 37 – (2×1) = 37 – 2 = 35; 3 – (2 × 5) = 3 – 10 = -7; thus, since -7
	// is divisible by 7, 371 is divisible by 7.
	// logic a-2b is divisble by 7
	static boolean isDivisibleBy7(int num)
	{
		// If number is negative, make it positive
		if (num < 0)
			return isDivisibleBy7(-num);

		// Base cases
		if (num == 0 || num == 7)
			return true;
		if (num < 10)
			return false;

		// Recur for ( num / 10 - 2 * num % 10 )
		//System.out.println("Secon exp: "+2 * (num % 10));
		return isDivisibleBy7(num / 10 - 2 * (num % 10));
	}

	public static void main(String a[])
	{
		boolean result = isDivisibleBy7(1729);
		if (result)
			System.out.println("Divisible by 7");
		else
			System.out.println("Not Divisible by 7");
	}
}
