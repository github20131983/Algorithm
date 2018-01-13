package convertSortedArraytoBinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

import convertSortedArraytoBinarySearchTree.TreeNode;
public class Solution {
	 public TreeNode sortedArrayToBST(int[] nums) {
		 if (nums.length == 0) {
		        return null;
		    }
		 TreeNode head = helper(nums, 0, nums.length - 1);
		    return head;
	    }
	 public TreeNode helper(int[] nums,int low,int high){
		 if(low>high)
			 return null;
		 int middle=low+(high-low+1)/2;
		 System.out.println(middle);
		 TreeNode node=new TreeNode(nums[middle]);
		 node.left=helper(nums,low,middle-1);
		 node.right=helper(nums, middle + 1, high);
		 return node;
	 }
	 public static void main(String[] args){
		 int[] a={-10,-3,0,5,9};
    	 Solution s=new Solution();
    	 TreeNode root=s.sortedArrayToBST(a);
    	 Queue<TreeNode> queue=new LinkedList<TreeNode>();
    	 queue.add(root);
    	 while(queue.size()>0){
	        	int size=queue.size();
	        	for(int i=0;i<size;i++){	        		
	        		TreeNode node=queue.poll();
                    System.out.print(node.val+" ");
	        		if(node.left!=null)queue.add(node.left);
	        		if(node.right!=null)queue.add(node.right);
	        	}
	 }
	 }
}
