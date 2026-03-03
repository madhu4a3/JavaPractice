package geeks;

public class RemoveDups {

	String s = "hello Kamal";
	public static void main(String[] args){
		RemoveDups rd = new RemoveDups();
		rd.removeDups(rd.s.toCharArray());
	}
	
	public void removeDups(char[] h){
		
		
		if(h.length < 2)System.out.println("Minimum length required 2 to compare.");
		int n  = h.length;
		int tail = 1;
		int j,i;
		for( i=1;i<n;i++){
			for( j=0;j < tail; j++){
				if (h[i] == h[j]){
					break;
				}
				
			}
			if(j == tail){
			h[tail] = h[i];
			tail++;
				
			}
		}
		
		while(tail < n){
			h[tail] = 0;
			tail++;
		}
		
		System.out.println("Resultant string: "+new String(h));
	}
}
