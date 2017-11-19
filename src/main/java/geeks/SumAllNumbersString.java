package geeks;

import java.util.Arrays;

public class SumAllNumbersString {

	public void findSum(String s){
		int sum=0;
		String temp="0";
		for(int i =0;i<s.length();i++){
			char c = s.charAt(i);
			if(Character.isDigit(c)){
				temp = temp + c;
			}
			else{
				sum = sum +Integer.parseInt(temp);
				temp = "0";
			}
		}		
			sum = sum +Integer.parseInt(temp);
		
		/*String[] arr = s.split("[^0-9]+");
		System.out.println(Arrays.toString(arr));
		for(String ar:arr){
			if(ar!=null && !ar.trim().isEmpty())
			sum+= Integer.parseInt(ar);
		}*/
		
		System.out.println("sum is:"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "12abc20yz68xyux";
		  SumAllNumbersString obj = new SumAllNumbersString();
		  obj.findSum(str);
		   
		 
		   
	}

}
