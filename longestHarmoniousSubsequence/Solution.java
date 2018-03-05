package longestHarmoniousSubsequence;

import java.util.HashMap;
import java.util.Map;

public class Solution {
public int findLHS(int[] nums) {
	Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
	int result=0;
	for(int num:nums)
		mp.put(num, mp.getOrDefault(num,0)+1);
	for(int key:mp.keySet())
		if(mp.containsKey(key+1))
			result=Math.max(result, mp.get(key)+mp.get(key+1));
	return result;       
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={1,3,2,2,5,2,3,7};
	System.out.println(s.findLHS(a));
}
}
