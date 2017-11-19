package geeks;
public class LPS
{

	// program for printing longest palindromic subsequence
	public static void lps(String s)
	{
		int n = s.length();
		boolean table[][] = new boolean[n][n];
		int maxLength = 1;

		for (int i = 0; i < n; i++)
		{
			table[i][i] = true;
		}

		int start = 0;
		for (int i = 0; i < n - 1; i++)
		{

			if (s.charAt(i) == s.charAt(i + 1))
			{
				table[i][i + 1] = true;
				start = i;
				maxLength = 2;
			}
		}

		for (int k = 3; k <= n; k++)
		{
			for (int i = 0; i < n - k + 1; i++)
			{

				int j = i + k - 1;

				if (table[i + 1][j - 1] && s.charAt(i) == s.charAt(j))
				{
					table[i][j] = true;

					if (k > maxLength)
					{
						start = i;
						maxLength = k;
					}
				}
			}
		}

		System.out.printf("max lenght: %d, sequence: %s", maxLength, s.substring(start, start + maxLength));
	}

	public static void main(String[] a)
	{
		String str = "forgeeksskeegfor";

		lps(str);
	}

}