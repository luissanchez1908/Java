import java.util.*;



public class Stack{

	 
    public static void main(String[] args) { 
    	Stack<String> stack = new Stack<String>();
    	System.out.println("Initial stack is empty");
    	printStack(stack);
    	
    	System.out.println("Pushing values into the stack");
    	stack.push("Bottom");
    	printStack(stack);
    	stack.push("second");
    	printStack(stack);
    	stack.push("third");
    	printStack(stack);
  
    	System.out.println();
    	System.out.println("Taking values out of the stack");
    	stack.pop();
    	printStack(stack);
    	stack.pop();
    	printStack(stack);
    	stack.pop();
    	printStack(stack);
    } 
    
    private static void printStack(Stack<String> s) {
    	
    	if(s.isEmpty()) {
    		System.out.println("Stack is empty!!");
    	}
    
    else 
    	System.out.printf("%s Top \n", s);
}
	
}
    
	
	 

