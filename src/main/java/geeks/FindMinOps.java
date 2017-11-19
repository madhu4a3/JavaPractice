package geeks;

import java.util.Arrays;

public class FindMinOps {
	
	
	 
	// Returns minimum number of count operations
	// required to make arr[] palindrome
	static int findMinOps(int arr[], int n)
	{
	    int ans = 0; // Initialize result
	 
	    // Start from two corners
	    for (int i=0,j=n-1; i<=j;)
	    {
	        // If corner elements are same,
	        // problem reduces arr[i+1..j-1]
	        if (arr[i] == arr[j])
	        {
	            i++;
	            j--;
	        }
	 
	        // If left element is greater, then
	        // we merge right two elements
	        else if (arr[i] > arr[j])
	        {
	            // need to merge from tail.
	            j--;
	            arr[j] += arr[j+1] ;
	            ans++;
	        }
	 
	        // Else we merge left two elements
	        else
	        {
	            i++;
	            arr[i] += arr[i-1];
	            ans++;
	        }
	    }
	 
	    return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int arr[] = {1, 9,2, 3,1, 4, 5, 1};
	    
	    int ans = findMinOps(arr, arr.length);
	    System.out.println(ans);
	    System.out.println(Arrays.toString(arr));
	   
	}

}
