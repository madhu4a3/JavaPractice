package geeks;

public class Separate0and1Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1,0,1,0,0,1,1};
		    int l = arr.length-1;
		    int i = 0;
		 
		    segregate0s1s(arr, l);
		 
		    System.out.printf("Array after segregation \n");
		    for (i = 0; i <= l; i++)
		        System.out.printf("%d ", arr[i]);
		 
		   
	}
	
	public static void segregate0s1s(int[] s, int end){
	
		int st = 0;
		while(st < end){
			while(s[st] == 0 && st < end)
				st++;
			while(s[end] == 1 && st < end)
				end--;
			if(st < end){
				int temp = s[end];
				s[end] = s[st];
				s[st] = temp;
				st++;
				end--;
			}
		}
	}
}
