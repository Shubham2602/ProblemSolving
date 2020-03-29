package DataStructures;

/*
 * Stack is a linear data structure which follows a particular order in which operations are performed. Order may be
 * LIFO or FILO
 * 
 * Basic operations are : Push , Pop , Peek or Top , isEmpty.
 * Overflow condition : when stack is full and more elements are attempted to be pushed to the stack.
 * Underflow condition : when stack is empty and more elements are attempted to be popped from the stack.
 * 
 * 
 * Time complexities of Stack operations : O(n)
 * */
public class StackImplementation {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty() {
		return (top < 0);
	}

	StackImplementation() 
    { 
        top = -1; 
    }
	
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
  
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
}

