package permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res=new ArrayList<>();
		backtrack(res, new ArrayList<>(), nums);
        return res;
    }
	public void backtrack(List<List<Integer>> list,List<Integer> tempList,int[] nums){
		if(tempList.size()==nums.length)
			list.add(new ArrayList<Integer>(tempList));
		else{
			for(int i=0;i<nums.length;i++){
				if(tempList.contains(nums[i]))continue;
				tempList.add(nums[i]);
				backtrack(list, tempList, nums);
				tempList.remove(tempList.size()-1);
			}
		}
	}
	public static void main(String[] args){
		Solution s=new Solution();
		int[] test={1,2,3};
		System.out.print(s.permute(test));
	}
}
