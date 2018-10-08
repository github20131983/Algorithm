package combinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		backtrack(list,  new ArrayList<>(), candidates, target,0);
		return list;  
    }
	public void backtrack(List<List<Integer>> list,List<Integer> tempList,int[] nums,int remain,int start){
		if(remain<0)return;
		else if(remain==0)list.add(new ArrayList<>(tempList));
		else{
			for(int i=start;i<nums.length;i++){
				if(i > start && nums[i] == nums[i-1]) continue;
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, remain-nums[i], i+1);
				tempList.remove(tempList.size()-1);			
			}
		}
	}
	public static void main(String[] args){
		Solution s=new Solution();
		int[] test={10,1,2,7,6,1,5};
		List<List<Integer>> l=s.combinationSum2(test,8);
		System.out.print(l);
	}
}
