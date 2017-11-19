package geeks;

public class FirstSetBit {

	static int getFirstSetBitPos(int n)
	{
	   if( n==0)
	    return 0;
	   int count=1;
	   while( (n&1) == 0)
	   {
	       n=n>>1;
	       count++;
	   }
	   return count;
	}
	 
	public static void main(String[] args)
	{
	    int n = 13;
	    System.out.printf("%d", getFirstSetBitPos(n));
	   
	}
}
