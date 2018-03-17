package twoSumIVInputisaBST;

import java.util.HashSet;
import java.util.Set;

public class Solution {
public boolean findTarget(TreeNode root, int k) {
        Set<Integer> s=new HashSet<Integer>(); 
        return dfs(root, s, k);
    }
public boolean dfs(TreeNode root,Set<Integer> s,int k){
	if(root==null)return false;
	if (s.contains(k-root.val)) return true;
	s.add(root.val);
	return dfs(root.left, s, k)||dfs(root.right, s, k);
}
	public static void main(String[] args) {
		TreeNode[] tr1=new TreeNode[6];
		 tr1[0]=new TreeNode(5);
		 tr1[1]=new TreeNode(3);
		 tr1[2]=new TreeNode(6);
		 tr1[3]=new TreeNode(2);
		 tr1[4]=new TreeNode(4);
		 tr1[5]=new TreeNode(7);
		 tr1[0].left=tr1[1];
		 tr1[0].right=tr1[2];
		 tr1[1].left=tr1[3];
		 tr1[1].right=tr1[4];
		 tr1[2].right=tr1[5];
		 Solution s=new Solution();
		 System.out.println(s.findTarget(tr1[0],14));
	}

}
