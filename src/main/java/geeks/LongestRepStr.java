package geeks;

import java.util.ArrayList;
import java.util.List;


public class LongestRepStr
{
	public static void main(String[] args)
	{
		String input = "smksmkkirankiransmk";
		List<String> result = getLongestString(input);
		// for(String str : result)
		System.out.println(result);
	}

	private static List<String> getLongestString(String input)
	{
		ArrayList<String> result = new ArrayList<String>();

		for (int i = input.length() - 1; i > 0; i--)
		{
			String tempStr = null;
			for (int j = 0; j <= input.length() - i; j++)
			{
				System.out.printf("i :%d, j is %d\n", i,j);
				// System.out.println("i+j:"+(i+j));
				String temp = input.substring(j, i + j);
				

				tempStr = input.substring(0, i + j - 1);
				System.out.printf("temp is %s\ntempStr is %s\n" ,temp, tempStr);
				System.out.println("result-->" +(tempStr.indexOf(temp) > -1));
				if (tempStr.indexOf(temp) > -1){
					System.out.println("###################");

					System.out.printf("Added result i :%d, j is %d\n", i,j);

					result.add(temp);
					System.out.println("###################");

				}
					
			}

			System.out.printf("Finally i :%d\n",i);

			if (result.size() > 0)
				return result;
			System.out.println("**************");
		}

		return result;
	}
}
