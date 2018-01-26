package implementStackusingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	Queue<Integer> q1=new LinkedList<Integer>();
	Queue<Integer> q2=new LinkedList<Integer>();
public MyStack() {       
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	q1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size()>1)
        	q2.add(q1.poll());
        Queue<Integer> tmp=q1;
        q1=q2;
        q2=tmp;
        return q2.poll();
    }
    
    /** Get the top element. */
    public int top() {
        while(q1.size()>1)
        	q2.add(q1.poll());
        int result=q1.peek();
        q2.add(q1.poll());
        Queue<Integer> tmp=q1;
        q1=q2;
        q2=tmp;
        return result;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(q1.size()==0)
        	return true;
        return false;
    }
    public static void main(String[] args){
    	MyStack ms=new MyStack();
    	ms.push(1);
    	ms.push(2);
    	ms.push(3);
    	ms.push(4);
    	System.out.println(ms.top());
    	System.out.println(ms.pop());
    	System.out.println(ms.top());
    	System.out.println(ms.pop());
    	System.out.println(ms.pop());
    	System.out.println(ms.empty());
    	System.out.println(ms.pop());
    	System.out.println(ms.empty());
    }
}
