package subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list=new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }
	public void backtrack(List<List<Integer>> res,List<Integer> temp,int nums[],int start){
		res.add(new ArrayList<Integer>(temp));
		for(int i=start;i<nums.length;i++){
			temp.add(nums[i]);
			backtrack(res, temp, nums, i+1);
			temp.remove(temp.size()-1);
		}
	}
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.print(s.subsets(new int[]{1,6,4}));
	}
}
