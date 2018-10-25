package pathSumII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		backtrack(root, sum, new ArrayList<>(), result);
		return result;
    }	
	public void backtrack(TreeNode start,int sum,List<Integer> tempList,List<List<Integer>> res){
		if(start==null)return;
		tempList.add(start.val);
		if(start.left==null&&start.right==null&&sum==start.val)
			res.add(new ArrayList<>(tempList));
		backtrack(start.left, sum-start.val, tempList, res);
		backtrack(start.right, sum-start.val, tempList, res);
		tempList.remove(tempList.size()-1);
	}
	public static void main(String[] args){ 
		TreeNode[] tr1=new TreeNode[6];
		 tr1[0]=new TreeNode(1);
		 tr1[1]=new TreeNode(2);
		 tr1[2]=new TreeNode(3);
		 tr1[3]=new TreeNode(3);
		 tr1[4]=new TreeNode(5);
		 tr1[5]=new TreeNode(2);
		 tr1[0].left=tr1[1];
		 tr1[0].right=tr1[2];
		 tr1[1].left=tr1[3];
		 tr1[1].right=tr1[4];
		 tr1[2].left=tr1[5];
		 Solution s=new Solution();
		 System.out.print(s.pathSum(tr1[0], 6));
	}
}
