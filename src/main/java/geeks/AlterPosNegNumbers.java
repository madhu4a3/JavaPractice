package geeks;
import java.util.Arrays;

public class AlterPosNegNumbers {

    static int arr[] = {2, 3, -4, -1, 6, -9};

	public static void main(String[] args){
	    rearrange(arr,arr.length);
	    for(int a:arr){
	    	System.out.print(a+" ");
	    }

	}
	
	static void rearrange(int arr[], int n)
	{
	    int i = 0; 
	    int j = n-1;
    	System.out.print("init ");

	 
	    // shift all negative values to the end
	    while (i < j)
	    {
	        while (arr[i] > 0 && i < j){
	        	i++;
	        }
	        while (arr[j] < 0 && i < j){
	        	j--;
	        }
	    	System.out.format("i is: %d ,j is: %d\n",i,j);

	        if (i < j){
	            swap(arr, i,j);        	
	            i++;
	            j--;
	        }
	    	System.out.println("After swap:" +Arrays.toString(arr));

	    }
	    System.out.printf("i is %d, j is %d", i ,j);
    	System.out.println("list: " +Arrays.toString(arr));

	    // i has index of leftmost negative element
	    if (i == 0 || i == n)
	        return;
	 
	    // start with first positive element at index 0
	 
	    // Rearrange array in alternating positive &
	    // negative items
	    int k = 1;
	    while (k < n && i < n)
	    {
	        // swap next positive element at even position
	        // from next negative element.
	        swap(arr,i,k);
	        i = i + 1;
	        k = k + 2;
	    }
	}
	
	static void swap(int[] arr, int a, int b){
		int temp = arr[b];
		arr[b] = arr[a];
		arr[a] =temp;
	}
}
