package baseballGame;

import java.util.LinkedList;
import java.util.Stack;

public class Solution {
public int calPoints(String[] ops) {
        Stack<Integer> s=new Stack<Integer>(); 
        int sum=0;
        for(String op:ops){
        	if(op.equals("C")){
        		int temp=s.pop();
        		sum-=temp;
        	}
        	else if(op.equals("D")){
        		sum+=s.peek()*2;
        		s.push(s.peek()*2);      		
        	}
        	else if(op.equals("+")){
        		int temp=s.pop();
        		int plus=temp+s.peek();
        		sum+=plus;
        		s.push(temp);
        		s.push(plus);
        	}
        	else {
        		s.push(Integer.parseInt(op));
        		sum+=Integer.parseInt(op);
        	}
        }
        return sum;
    }
public static void main(String[] args){
	Solution s=new Solution();
	String[] str={"5","-2","4","C","D","9","+","+"};
	System.out.println(s.calPoints(str));
}
}
