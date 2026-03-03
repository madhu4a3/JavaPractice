package geeks;
import java.util.Arrays;


public class NbitsStrings
{
	int[] arrA;

	public NbitsStrings(int n)
	{
		arrA = new int[n];
	}

	public void nBits(int n)
	{
		if (n <= 0)
		{
			System.out.println(Arrays.toString(arrA));
		}
		else
		{
			//System.out.println("now n-1 is: "+(n-1));
			arrA[n - 1] = 0;
			nBits(n - 1);
			//System.out.print("n-1 is --> "+ (n-1));
		//System.out.println("first print: "+ Arrays.toString(arrA));
			
			arrA[n - 1] = 1;
			nBits(n - 1);
			//System.out.println("second print:" + Arrays.toString(arrA));
		}
	}

	public static void main(String[] args) throws java.lang.Exception
	{
		int n = 3;
		NbitsStrings i = new NbitsStrings(3);
		i.nBits(3);
	}
}
