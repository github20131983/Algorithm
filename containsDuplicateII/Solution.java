package containsDuplicateII;

import java.util.HashSet;

public class Solution {
public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
        	if(i>k)hs.remove(nums[i-k-1]);
        	if(!hs.add(nums[i]))return true;
        }
       return false; 	
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={1,2,3,4,5,6,7,4};
	System.out.println(s.containsNearbyDuplicate(a, 3));
}
}
