package binaryTreeLevelOrderTraversalII;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import binaryTreeLevelOrderTraversalII.TreeNode;

public class Solution {
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        List<List<Integer>> result=new LinkedList<List<Integer>>();
	        if(root==null)return result;
	        Queue<TreeNode> queue=new LinkedList<TreeNode>();
	        queue.add(root);
	        while(queue.size()>0){
	        	List<Integer> list=new LinkedList<Integer>();
	        	int size=queue.size();
	        	for(int i=0;i<size;i++){	        		
	        		TreeNode node=queue.poll();
	        		list.add(node.val);
	        		if(node.left!=null)queue.add(node.left);
	        		if(node.right!=null)queue.add(node.right);
	        	}
	        	result.add(0,list);
	        }
			return result;
	 }
	 public static void main(String[] args){
		 TreeNode[] tr1=new TreeNode[7];
    	 tr1[0]=new TreeNode(1);
    	 tr1[1]=new TreeNode(2);
    	 tr1[2]=new TreeNode(2);
    	 tr1[3]=new TreeNode(3);
    	 tr1[4]=new TreeNode(4);
    	 tr1[5]=new TreeNode(4);
    	 tr1[6]=new TreeNode(3);
    	 tr1[0].left=tr1[1];
    	 tr1[0].right=tr1[2];
    	 tr1[1].left=tr1[3];
    	 tr1[1].right=tr1[4];
    	 tr1[2].left=tr1[6];
    	 tr1[2].right=tr1[5];
    	 Solution s=new Solution();
    	 List<List<Integer>> r=s.levelOrderBottom(tr1[0]);
         for(int i=0;i<r.size();i++){
        	 for(int j=0;j<r.get(i).size();j++)
        		 System.out.print(r.get(i).get(j));
        	     System.out.println();
        	 }

	 }
}
