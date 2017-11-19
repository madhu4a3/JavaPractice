package geeks;

public class MaxMin {

	
	static int[] a = {1,2,3,4,5,6,7};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int e:a){
		    	System.out.print(e+" ");
		    }
		 System.out.println();
	    rearrange(a, a.length);
	    for(int e:a){
	    	System.out.print(e+" ");
	    }
	
	}
	
	static void rearrange(int a[], int n)
	{
	    
		// Traverse through all numbers
	    for (int i=0; i<n;)
	    {
	    	rightRotate(a,i,n-1);
	    	i=i+2;
	    }
	}
	
	static void rightRotate(int[] a, int i, int j){
		int temp = a[j];
		for(int k=j;k>i;k--){
			a[k]=a[k-1];
		}
		a[i]=temp;
		for(int x=0;x<=j;x++)
			System.out.print(a[x]+ " ");
		System.out.println();
	}
	
	
	 

}
