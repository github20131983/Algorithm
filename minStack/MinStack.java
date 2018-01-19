package minStack;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack=new Stack<Integer>();
	Stack<Integer> minStack=new Stack<Integer>();
public MinStack() {
        
    }
    
    public void push(int x) {
        stack.push(x);
        if(minStack.empty()||x<=minStack.peek())
        	minStack.push(x);
    }
    
    public void pop(){
        if(minStack.peek().equals(stack.peek()))
        {
        	stack.pop();
        	minStack.pop();
        }
        else
        	stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
	    
public static void main(String[] args){
    	MinStack ms=new MinStack();
    	ms.push(512);
    	ms.push(-1024);
    	ms.push(-1024);
    	ms.push(512);
    	ms.pop();
    	System.out.println(ms.getMin());
    	ms.pop();
    	System.out.println(ms.getMin());
    	ms.pop();
    	System.out.println(ms.getMin());
    }
}
