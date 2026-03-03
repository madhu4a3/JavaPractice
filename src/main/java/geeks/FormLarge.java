package geeks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

public class FormLarge {

	int[] vs = {549, 546, 548,60};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormLarge fl = new FormLarge();
		System.out.println(fl.printLargest(fl.vs));
		
		
	}

	public String printLargest(int[] nums) {
	    String[] strs = new String[nums.length];
	    for(int i=0; i<nums.length; i++){
	        strs[i] = String.valueOf(nums[i]);
	    }
	 
	    Arrays.sort(strs, new Comparator<String>(){
	        public int compare(String s1, String s2){
	            String leftRight = s1+s2;
	            String rightLeft = s2+s1;
	            return -leftRight.compareTo(rightLeft);
	 
	        }
	    });
	 
	    StringBuilder sb = new StringBuilder();
	    for(String s: strs){
	        sb.append(s);
	    }
	 
	    while(sb.charAt(0)=='0' && sb.length()>1){
	        sb.deleteCharAt(0);
	    }
	 
	    return sb.toString();
	}
}
