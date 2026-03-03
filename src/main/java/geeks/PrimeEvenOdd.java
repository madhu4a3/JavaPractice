package geeks;

import java.util.Arrays;

public class PrimeEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1,2,3,4,5,6,7,8,9,10,11,21,23,25};
		    int l = arr.length-1;
		    int i = 0;
		 System.out.println("before segregation: ");
		 for (i = 0; i <= l; i++)
		        System.out.printf("%d ", arr[i]);
		    primeEvenOdd(arr, l);
		 
		    System.out.printf("Array after segregation \n");
		    for (i = 0; i <= l; i++)
		        System.out.printf("%d ", arr[i]);
		 
	}
	
	public static void primeEvenOdd(int[] s, int len){
		
		int st = 0;
		while(st < len){
			while(isPrime(s[st]))
				st++;
			while(!isPrime(s[len]))
				len--;
			if(st < len){
				System.out.printf("\nswapping index %d, with index %d\n",st, len);
				int temp = s[len];
				s[len] = s[st];
				s[st] = temp;
				st++;
				len--;
			}
		}
		   System.out.printf("Array prime segregation \n");
		    for (int i = 0; i <= s.length-1; i++)
		        System.out.printf("%d ", s[i]);
		
		len = s.length-1;
		while(st < len){
			while(s[st]%2 == 0 && st < len)
				st++;
			while(s[len]%2 == 1 && st < len)
				len--;
			if(st < len){
				int temp = s[len];
				s[len] = s[st];
				s[st] = temp;
				st++;
				len--;
			}
		}
	}
	
	public static boolean isPrime(int p){
		boolean flag = true;
		if(p<=1)
			flag = false;
		for(int i = 2; i <= p/2 ;i++){
			if(p % i == 0){
				flag = false;
				break;
			}
				
		}
			return flag;
			
	}
}
