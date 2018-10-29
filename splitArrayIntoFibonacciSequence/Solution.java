package splitArrayIntoFibonacciSequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> splitIntoFibonacci(String S) {
		List<Integer> ans = new ArrayList<>();
	    backtrack(S, ans, 0);
	    return ans;
    }
	public boolean backtrack(String s, List<Integer> ans, int idx){
		if (idx == s.length() && ans.size() >= 3) {
	        return true;
	    }
	    for (int i=idx; i<s.length(); i++) {
	        if (s.charAt(idx) == '0' && i > idx) {
	            break;
	        }
	        long num = Long.parseLong(s.substring(idx, i+1));
	        if (num > Integer.MAX_VALUE) {
	            break;
	        }
	        int size = ans.size();
	        // early termination
	        if (size >= 2 && num > ans.get(size-1)+ans.get(size-2)) {
	            break;
	        }
	        if (size <= 1 || num == ans.get(size-1)+ans.get(size-2)) {
	            ans.add((int)num);
	            // branch pruning. if one branch has found fib seq, return true to upper call
	            if (backtrack(s, ans, i+1)) {
	                return true;
	            }
	            ans.remove(ans.size()-1);
	        }
	    }
	    return false;
	}
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.print(s.splitIntoFibonacci("123456579"));
	}
}
