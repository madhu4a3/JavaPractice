package geeks;
public class Possiblesubsets
{

	public static void print(int n, String x)
	{
		if (n <= 0)
		{
			System.out.println(x);
			
		}
		else
		{
			for (int i = 1; i <= n; i++)
			{
				x = x + i;
				print(n - i, x);
				x = x.substring(0, x.length() - 1);
				//System.out.println("value of x:" + x);
			}
		}
	}

	public static void main(String[] args)
	{
		int n = 3;
		print(n, "");

	}

}
