package simplifyPath;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
	public String simplifyPath(String path) {
        Deque<String> deque=new LinkedList<String>();
        for(String str:path.split("/")){
        	if(str.equals(".."))
        		deque.pollFirst();
        	else if(!str.equals("")&&!str.equals("."))
        		deque.addFirst(str);
        }
        StringBuilder res=new StringBuilder();
        if(deque.size()==0)return "/";
        while(deque.size()!=0)res.append("/").append(deque.pollLast());
        return res.toString();
    }
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.print(s.simplifyPath("/a//b////c/d//././/.."));
	}
}
