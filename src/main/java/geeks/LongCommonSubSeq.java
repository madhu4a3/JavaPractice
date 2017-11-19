package geeks;
public class LongCommonSubSeq
{

	public static void main(String[] args)
	{
		String s1 = "madhus";
		String s2 = "kiranmadhu";
		System.out.println("Longest sub seq length: " + new LongCommonSubSeq().findLcs(s1, s2, s1.length(), s2.length()));
	}

	public int findLcs(String a, String b, int aLen, int bLen)
	{

		int[][] res = new int[aLen + 1][bLen + 1];
		for (int i = 0; i <= aLen; i++)
		{
			for (int j = 0; j <= bLen; j++)
			{
				if (i == 0 || j == 0)
				{
					res[i][j] = 0;
				}

				else if (a.charAt(i - 1) == b.charAt(j - 1))
				{

					res[i][j] = res[i - 1][j - 1] + 1;
				}
				else
				{
					res[i][j] = Math.max(res[i - 1][j], res[i][j - 1]);

				}

			}
		}
		int index = res[aLen][bLen];
		char[] s = new char[index];
		int i = aLen, j = bLen;
		while (i > 0 && j > 0)
		{
			if (a.charAt(i - 1) == b.charAt(j - 1))
			{
				s[index - 1] = a.charAt(i - 1);
				i--;
				j--;
				index--;
			}
			else if (res[i - 1][j] > res[i][j - 1])
				i--;
			else
				j--;
		}

		System.out.println("Common sub sequence is: " + new String(s));
		// System.out.println(Arrays.toString(res));
		return res[aLen][bLen];
	}
}
