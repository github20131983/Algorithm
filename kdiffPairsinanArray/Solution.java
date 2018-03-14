package kdiffPairsinanArray;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Solution {
public int findPairs(int[] nums, int k) {
	if (nums == null || nums.length == 0 || k < 0)   return 0;
	int count=0;
	Map<Integer, Integer> mp=new HashMap<Integer, Integer>();
	for(int num:nums)
		mp.put(num,mp.getOrDefault(num,0)+1);
	for(Map.Entry<Integer, Integer> entry:mp.entrySet()){
		if(k==0){
			if(entry.getValue()>=2)
				count++;
		}
		else{
			if(mp.containsKey(entry.getKey()+k))
				count++;
		}
	}
	return count;        
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={3, 1, 4, 1, 5};
	System.out.println(s.findPairs(a, 2));
}
}
