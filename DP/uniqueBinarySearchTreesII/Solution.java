package uniqueBinarySearchTreesII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<TreeNode> generateTrees(int n) {
		return generateTreesHelper(1,n);
    }
	private List<TreeNode> generateTreesHelper(int start, int end) {
		List<TreeNode> res=new ArrayList<TreeNode>();
		if(start>end){
			res.add(null);
			return res;
		}
		for(int i=start;i<=end;i++){
			List<TreeNode> left=generateTreesHelper(start,i-1);
			List<TreeNode> right=generateTreesHelper(i+1, end);
			for(TreeNode leftNode:left)
				for(TreeNode rightNode:right){
					TreeNode root=new TreeNode(i);
					root.left=leftNode;
					root.right=rightNode;
					res.add(root);										
				}		
		}			
		return res;
	}
	public static void main(String[] args){
		Solution s=new Solution();
		List<TreeNode> aList=s.generateTrees(3);
		for(TreeNode tn:aList){
			Queue<TreeNode> queue=new LinkedList<TreeNode>();
			 queue.offer(tn);
			 while (!queue.isEmpty()) {
					TreeNode tempNode=queue.poll();
					System.out.print(tempNode.val+" ");
					if(tempNode.left!=null)queue.offer(tempNode.left);
					if(tempNode.right!=null)queue.offer(tempNode.right);			
			}
			 System.out.println();
		}
		   
	}
}
