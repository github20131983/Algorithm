package fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		if (nums == null || nums.length < 4) {
            return res;
        }
		Arrays.sort(nums);
		for(int i=0;i<nums.length-3;i++){
			if(i>0&&nums[i]==nums[i-1])continue;
			int sum3=target-nums[i];
			for(int j=i+1;j<nums.length-2;j++){
				if(j>i+1&&nums[j]==nums[j-1])continue;
				int sum2=sum3-nums[j];
				int left=j+1,right=nums.length-1;
				while(left<right){
					if(nums[left]+nums[right]==sum2){
						res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
					while(left<right&&nums[left++]==nums[left]);
					while(left<right&&nums[right--]==nums[right]);
					}
					else if(nums[left]+nums[right]<sum2)left++;
					else right--;
				}
			}
		}
    	return res;     
    }
    public static void main(String[] args){
    	Solution s=new Solution();
    	int[] nums={-3,-1,0,2,4,5};
    	List<List<Integer>> test=s.fourSum(nums,0);
    	for(List l:test){
    		for (int i = 0; i < l.size(); i++)   
    			System.out.print(l.get(i)+"  ");
    	    System.out.println();
    	}
    }
}
