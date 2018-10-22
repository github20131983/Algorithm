package binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        TreeNode cur=root;
        Stack<TreeNode> s=new Stack<TreeNode>();
        while (!s.isEmpty()||cur!=null) {
			while(cur!=null){
				s.push(cur);
				cur=cur.left;
			}
			cur=s.pop();
			res.add(cur.val);
			cur=cur.right;
		}
        return res;
    }
	public static void main(String[] args){
		 Solution s=new Solution();
		 TreeNode[] tr1=new TreeNode[3];
		 tr1[0]=new TreeNode(1);
		 tr1[1]=new TreeNode(2);
		 tr1[2]=new TreeNode(3);		
		 tr1[0].right=tr1[1];		
		 tr1[1].left=tr1[2];
		 List<Integer> l=s.inorderTraversal(tr1[0]);
		 System.out.print(l);
	}
}
