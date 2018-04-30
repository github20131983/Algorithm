package threeSumCloset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Solution {
public int threeSumClosest(int[] nums, int target) {
	int res=nums[0]+nums[1]+nums[nums.length-1];
	Arrays.sort(nums);	
	for(int i=0;i<nums.length-2;i++){
		int left=i+1,right=nums.length-1;
		while(left<right){
			int sum=nums[i]+nums[left]+nums[right];
			if(sum>target)
				right--;
			else 
				left++;
			if(Math.abs(sum-target)<Math.abs(res-target))
				res=sum;
		}
	}
	return res;        
    }
	
/*public List<List<Integer>> threeSum(int[] nums) {
	List<List<Integer>> res=new ArrayList<List<Integer>>();
	Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++){
    	if(nums[i]>0)break;
    	if(i==0||(i>0&&nums[i]!=nums[i-1])){
    		int left=i+1,right=nums.length-1,sum=-nums[i];
    		while(left<right){
        		if(nums[left]+nums[right]==sum){
        			res.add(Arrays.asList(nums[i],nums[left],nums[right]));
        			while(left<right&&nums[left]==nums[left+1])left++;
        			while(left<right&&nums[right]==nums[right-1])right--;
        			left++;
        			right--;
        		}
        		else if(nums[left]+nums[right]>sum)right--;
        		else left++;
    		}
    	}
    }
    return res;
}*/
public static void main(String[] args) {
	Solution s=new Solution();
	int[] nums={1,1,-1,-1,3};
	System.out.println(s.threeSumClosest(nums, -1));
	
}

}
