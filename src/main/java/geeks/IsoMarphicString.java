package geeks;
import java.util.Arrays;


public class IsoMarphicString
{

	 int[] map = new int[256];
	boolean marked[] = new boolean[256];

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//System.out.println(Arrays.toString(map));
		System.out.println(new IsoMarphicString().testIsoMarphic("aar", "hhp"));
	}

	public boolean testIsoMarphic(String x, String y)
	{

		Arrays.fill(map, -1);
		if (x.length() != y.length())
			return false;

		for (int i = 0; i < x.length(); i++)
		{
			
			
			if (map[x.charAt(i)] == -1)
			{
				if (marked[y.charAt(i)] == true)
				{
					 System.out.println("Return false as already one occurence is found.");
					return false;
				}

				marked[y.charAt(i)] = true;
				map[x.charAt(i)] = y.charAt(i);
			}
			
			//to handle duplicate initializations
			else if (map[x.charAt(i)] != y.charAt(i))
			{

				// System.out.println("Mapping is not correct in map:"+map[x.charAt(i)]+" in y: "+y.charAt(i));
				return false;
			}

		}
		return true;
	}
}
