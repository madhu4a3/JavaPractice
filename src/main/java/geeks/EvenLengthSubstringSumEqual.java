package geeks;

public class EvenLengthSubstringSumEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123123";
		EvenLengthSubstringSumEqual el = new EvenLengthSubstringSumEqual();
		System.out.println("Length of the substring is: "+ el.findLength(str, str.length()));
	}


//A O(n^2) time and O(1) extra space solution


int findLength(String str, int n)
{
 int ans = 0; // Initialize result

 // Consider all possible midpoints one by one
 for (int i = 0; i <= n-2; i++)
 {
     /* For current midpoint 'i', keep expanding substring on
        both sides, if sum of both sides becomes equal update
        ans */
     int l = i, r = i + 1;

     /* initialize left and right sum */
     int lsum = 0, rsum = 0;

     /* move on both sides till indexes go out of bounds */
     while (r < n && l >= 0)
     {
         lsum += str.charAt(l) - '0';
         rsum += str.charAt(r) - '0';
         if (lsum == rsum)
             ans = Math.max(ans, r-l+1);
         l--;
         r++;
     }
 }
 return ans;
}
}
