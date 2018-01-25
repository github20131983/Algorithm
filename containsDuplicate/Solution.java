package containsDuplicate;

import java.util.HashMap;

public class Solution {
public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	if(mp.containsKey(nums[i]))
        		mp.put(nums[i], mp.get(nums[i])+1);
        	else
        		mp.put(nums[i], 1);
        	if(mp.get(nums[i])>1)
        		return true;
	}
        return false;
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] nums={};
	System.out.println(s.containsDuplicate(nums));
}
}
