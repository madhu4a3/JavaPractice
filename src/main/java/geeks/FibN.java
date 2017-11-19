package geeks;
public class FibN
{

	public static void main(String[] h)
	{
		System.out.println("Desired fibonaci sequence Number: " + fibN(5));
	}

	static int fibN(int n)
	{
		int a = 0, b = 1, c, i;
		  if( n == 0)
		    return a;
		  for (i = 2; i <= n; i++)
		  {
		     c = a + b;
		     a = b;
		     b = c;
		  }
		  return b;
	}
}
