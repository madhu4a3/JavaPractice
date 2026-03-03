package geeks;

public class Print1s2s {

	
	char flip(char c){
		return (c=='0')?'1':'0';
	}
	
	void print1s2s(String bin){
		int n = bin.length();
	    int i;
	 
	    String ones, twos;
	    
	    StringBuilder sb = new StringBuilder();
	    ones = twos = "";
	 
	    //  for ones complement flip every bit
	    for (i = 0; i < n; i++)
	        ones += flip(bin.charAt(i));
	 
	    //  for two's complement go from right to left in
	    //  ones complement and if we get 1 make, we make
	    //  them 0 and keep going left when we get first
	    //  0, make that 1 and go out of loop
	    //twos = ones;
	    for (i = n - 1; i >= 0; i--)
	    {
	        if (ones.charAt(i) == '1')
	           
	        	sb.append('0');
	        else
	        {
	            sb.append('1');
	            break;
	        }
	    }
	 
	
	  // System.out.println(sb.toString());
	    
	    twos = sb.reverse().toString();
	    // If No break : all are 1  as in 111  or  11111;
	    // in such case, add extra 1 at beginning
	    if (i == -1)
	        twos = '1' + twos;
	    else if(i==n-1){
	 	    	twos = ones.substring(0, n-1) + twos;
	 	    }
	    else{
	    	
	    		 for(;i>0;i--){
	    			 System.out.println("processing else block");
	    			 twos = '0' + twos; 
	    		 }
	 	 	    		 
	   	 }	    		    
	    
	 
	   
	   
		System.out.println("ones complement: "+ones);
		System.out.println("twos complement: "+twos);
	}
	public static void main(String[] args){
		
		Print1s2s obj = new Print1s2s();
		obj.print1s2s("1110");
		
	}
}
