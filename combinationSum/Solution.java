package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, remain-nums[i], i);
				tempList.remove(tempList.size()-1);			
			}
		}
	}
	public static void main(String[] args){
		Solution s=new Solution();
		int[] test={2,3,6,7};
		List<List<Integer>> l=s.combinationSum(test,7);
		System.out.print(l);
	}
}
