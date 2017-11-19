package geeks;
import java.util.Arrays;

public class StringPermuations
{
	private char[] arrA;

	public void permutation(char[] arrA, int left, int size)
	{
		int x;
		if (left == size)
		{
			for (int i = 0; i < arrA.length; i++)
			{
				System.out.print(arrA[i]);
			}
			System.out.print(" ");
		}
		else
		{
			for (x = left; x < size; x++)
			{
				
				swap(arrA, left, x);
				permutation(arrA, left + 1, size);
				//System.out.printf("left %d, x %d\n", left, x);
				swap(arrA, left, x);
			}
		}
	}

	public void swap(char[] arrA, int i, int j)
	{
		char temp = arrA[i];
		arrA[i] = arrA[j];
		arrA[j] = temp;
		System.out.println(Arrays.toString(arrA));
	}

	public static void main(String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s = "abc";
		char[] arrCh = s.toCharArray();
		StringPermuations i = new StringPermuations();
		i.permutation(arrCh, 0, arrCh.length);
	}
}
