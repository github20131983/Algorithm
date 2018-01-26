package implementQueueusingStacks;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);       
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	while(s1.size()>1)
    		s2.push(s1.pop());
    	int result=s1.pop();
    	while(s2.size()>0)
    		s1.push(s2.pop());
        return result;
    }
    
    /** Get the front element. */
    public int peek() {
    	while(s1.size()>1)
    		s2.push(s1.pop());
    	int result=s1.peek();
    	while(s2.size()>0)
    		s1.push(s2.pop());
        return result;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(s1.size()>0)
        	return false;
        return true;
    }
    public static void main(String[] args){
    	MyQueue mq=new MyQueue();
    	mq.push(1);
    	mq.push(2);
    	mq.push(3);
    	System.out.println(mq.empty());
    	System.out.println(mq.peek());
    	System.out.println(mq.pop());
    	System.out.println(mq.pop());
    	System.out.println(mq.pop());
     	System.out.println(mq.empty());
    
    }
}
