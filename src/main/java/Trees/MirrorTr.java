package Trees;

class Node{
	int data;
	Node left, right;
	public Node(int d){
		data = d;
		left=right=null;
	}
	public Node(){
		data=0;
		left=right=null;

	}
}
public class MirrorTr {	

	public static void main(String[] a){
		MirrorTr m = new MirrorTr();
		Node f = new Node(1);
		Node s = new Node(1);
		f.left = new Node(2);
		f.right = new Node(3);
		  f.left.left  =new Node(4);
		    f.left.right = new Node(5);
		 
		    s.left = new Node(3);
		    s.right = new Node(2);
		    s.right.left = new Node(5);
		    s.right.right = new Node(4);
		    
		System.out.println(m.areMirror(f,s));
		
	}

	boolean areMirror(Node f, Node s){
		
		if(f==null && s==null)
			return true;
		if(f==null || s==null)
			return false;
		return (f.data==s.data) && (areMirror(f.left, s.right)) && (areMirror(f.right,s.left));
	
	}
}
