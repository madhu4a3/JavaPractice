package geeks;
public class ReverseWords
{

	static char[] w;

	/**
	 * @param args
	 */
	public static void reverse(String wrd)
	{
		w = wrd.toCharArray();
		rev(w, 0, w.length - 1);
		wrd = new String(w);
		System.out.println(wrd);
		/*
		 * StringBuilder sb = new StringBuilder(); for (int i = w.length - 1; i
		 * >= 0; i--) { sb.append(w[i]); }
		 */
		//w = wrd.toCharArray();
		int start = 0;
		for (int j = 1; j < w.length; j++)
		{
			if (w[j] == ' ')
			{
				// System.out.println("found space at index j: " + j +
				// " calling function reverse with start as: " + start);
				rev(w, start, j - 1);
				start = j + 1;
				// System.out.println("new start: " + start);
			}

		}
		// System.out.println("start outside for loop: " + start);
		rev(w, start, w.length - 1);
		System.out.println(new String(w));
	}

	public static void rev(char[] temp, int start, int end)
	{
		for (int x = start, y = end; x <= y /*start + (end - start) / 2*/; x++, y--)
		{

			char tp = temp[y];
			temp[y] = temp[x];
			temp[x] = tp;
		}
		// System.out.println("rev function:" + Arrays.toString(temp));
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		reverse("sanka madhu kiran");

	}

}
