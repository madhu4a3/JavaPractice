package geeks;
public class StringSearch
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str = "today id famly days", str1 = "amly";
		System.out.println("Index of search string in original string:" + getIndex(str, str1));
		
	}

	public static int getIndex(String or, String sr)
	{
		if (sr.length() > or.length())
		{
			System.out.println("search string can't be found in original string");
		}
		int j = 0;
		for (int i = 0; i < or.length(); i++)
		{
			if (sr.charAt(j) == or.charAt(i))
			{
				j++;

				if (j == sr.length())
				{
				//	System.out.format("i is: %d,j is: %d is:", i, j);
					return i - j + 1;
				}
			}
			else
			{
				j = 0;
			}

		}
		return -1;
	}
}
