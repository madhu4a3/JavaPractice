package LinkedList;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class StackLinkedList {

	Node top;
	int size;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);   
        /* Creating object of class linkedStack */   
		StackLinkedList ls = new StackLinkedList();          
        /* Perform Stack Operations */  
        System.out.println("Linked Stack Test\n");  
        char ch;     
        do 
        {
            System.out.println("\nLinked Stack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");            
            int choice = scan.nextInt();
            switch (choice) 
            {
            case 1 :
                System.out.println("Enter integer element to push");
                ls.push( scan.nextInt() ); 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = "+ ls.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ ls.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = "+ ls.isEmpty());
                break;                
            case 5 : 
                System.out.println("Size = "+ ls.getSize()); 
                break;                
            case 6 : 
                System.out.println("Stack = "); 
                ls.display();
                break;                        
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }           
            /* display stack */    
            ls.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);       
 
        } while (ch == 'Y'|| ch == 'y');
		
	}
	
	
	public void push(int d){
		Node newNode = new Node(d);
		newNode.next = top;
		top = newNode;
		size++;
	}
	
	public int pop(){
		int dt=0;
		if(size == 0){
			System.out.println("Nothing to pop");
		}
		else{
			Node temp = top.next;
			 dt= top.data;
			top = temp;
			size--;
		}
		return dt;
	}
	
	  public boolean isEmpty()
	    {
	        return top == null;
	    }    
	    /*  Function to get the size of the stack */
	    public int getSize()
	    {
	        return size;
	    }   
	    
	    public int peek()
	    {
	        if (isEmpty() )
	            throw new NoSuchElementException("Underflow Exception") ;
	        return top.data;
	    } 
	    public void display()
	    {
	        System.out.print("\nStack = ");
	        if (size == 0) 
	        {
	            System.out.print("Empty\n");
	            return ;
	        }
	        Node ptr = top;
	        while (ptr != null)
	        {
	            System.out.print(ptr.data+" ");
	            ptr = ptr.next;
	        }
	        System.out.println();        
	    }
	class Node{
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
		}
	}
}
