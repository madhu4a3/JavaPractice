package LinkedList;

import LinkedList.DeleteNode.Node;

public class LinkedLs
{

	/**
	 * @param args
	 */
	 Node head;

	public  void printLiss()
	{
		Node tnode = head;
		while(tnode!= null)
		{
			System.out.print(tnode.val + "->");
			
			tnode = tnode.next;
		}
		System.out.print("NULL");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedLs ll = new LinkedLs();
		ll.push(4);
		ll.push(5);
		ll.push(6);
		ll.push(7);
		ll.push(8);	
		ll.printLiss();
	}

	  public void push(int new_data)
	     {
	       /* 1. alloc the Node and put the data */
	        Node new_Node = new Node(new_data);
	 
	        /* 2. Make next of new Node as head */
	        new_Node.next = head;
	 
	        /* 3. Move the head to point to new Node */
	        head = new_Node;
	     }
	 class Node
	{
		Node next;
		int val;

		Node(int value)
		{
			val = value;
			next = null;
		}

		
	}

	public void createLinkedList()
	{		
			
	}

}
