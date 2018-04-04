package letterCasePermutation;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<String> letterCasePermutation(String S) {
    	List<String> res=new LinkedList<String>();
    	if(S==null)return res;
        Queue<String> queue=new LinkedList<String>();
        queue.offer(S);
        for(int i=0;i<S.length();i++){
        	if(Character.isDigit(S.charAt(i)))continue;
        	int size=queue.size();
        	for(int j=0;j<size;j++){
        		char[] temp=queue.poll().toCharArray();
        		temp[i]=Character.toLowerCase(temp[i]);
        		queue.offer(String.valueOf(temp));
        		temp[i]=Character.toUpperCase(temp[i]);
        		queue.offer(String.valueOf(temp));
        	}
        }
        while(!queue.isEmpty())
        	res.add(queue.poll());
        return res;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		String str="1a";		
		List<String> l=s.letterCasePermutation(str);
		for(String a:l)
			System.out.println(a);
	}

}
