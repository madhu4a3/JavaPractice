package geeks.StackQueue;

public class StackTest {
    private int top;
    private int[] storage;

    StackTest(int capacity) {
          if (capacity <= 0)
                throw new IllegalArgumentException(
                           "StackTest's capacity must be positive");
          storage = new int[capacity];
          top = -1;
    }

    void push(int value) {
          if (top == storage.length-1)
                throw new StackException("StackTest's underlying storage is overflow");
          top++;
          System.out.println("top is: "+top);
          storage[top] = value;
    }

    int peek() {
          if (top == -1)
                throw new StackException("StackTest is empty");
          return storage[top];
    }

    void pop() {
          if (top == -1)
                throw new StackException("StackTest is empty");
          top--;
    }

    boolean isEmpty() {
          return (top == -1);
    }

    
    public static void main(String[] args){
    	StackTest s = new StackTest(4);
    	s.push(3);
    	s.push(9);
    	s.push(7);
    	s.push(5);
    	s.pop();
    	System.out.println(s.peek());
    	s.pop();
    	System.out.println(s.peek());
    }
     class StackException extends RuntimeException {
          public StackException(String message) {
                super(message);
          }
    }
}