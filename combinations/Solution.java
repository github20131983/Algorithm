package combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
        backtrack(list, new ArrayList<>(), n, 1, k);
        return list;
    }
	public void backtrack(List<List<Integer>> res,List<Integer> temp,int n,int start,int k){
		if(k==0)
			res.add(new ArrayList<Integer>(temp));
		for(int i=start;i<=n;i++){
			temp.add(i);
			backtrack(res, temp, n, i+1, k-1);
			temp.remove(temp.size()-1);
		}
	}
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.print(s.combine(4, 2));
	}
}
