package geeks;

public class SegEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {12, 34, 45, 9, 8, 90, 3};
		    int l = arr.length-1;
		    int i = 0;
		 
		    segregateEvenOdd(arr, l);
		 
		    System.out.printf("Array after segregation \n");
		    for (i = 0; i < l; i++)
		        System.out.printf("%d ", arr[i]);
		 
		   
	}
	
	public static void segregateEvenOdd(int[] s, int end){
	
		int st = 0;
		while(st < end){
			while(s[st]%2 == 0 && st < end)
				st++;
			while(s[end]%2 == 1 && st < end)
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
