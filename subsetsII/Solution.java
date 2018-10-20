package subsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(nums, res, new ArrayList<Integer>(), 0);
		return res;
    }
	public void backtrack(int[] nums,List<List<Integer>> res,List<Integer> tempList,int start){
		res.add(new ArrayList<>(tempList));
		for(int i=start;i<nums.length;i++){
			if(i>start&&nums[i]==nums[i-1])continue;
			tempList.add(nums[i]);
			backtrack(nums, res, tempList, i+1);
			tempList.remove(tempList.size()-1);
		}
	}
	public static void main(String[] args){
		Solution s=new Solution();
		int[] test={1,2,3};
		System.out.print(s.subsetsWithDup(test));
	}
}
