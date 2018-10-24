package constructBinaryTreeFromInorderAndPostorderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(postorder.length-1, 0, inorder.length-1, inorder, postorder);
    }
	public TreeNode buildTreeHelper(int postEnd,int inStart,int inEnd,int[] inorder, int[] postorder) {
        if(postEnd<0||inStart>inEnd)
        	return null;
        TreeNode root=new TreeNode(postorder[postEnd]);
        int inIndex=0;
        for (int i = 0; i < inorder.length; i++)
			if(root.val==inorder[i])
				inIndex=i;
		root.left=buildTreeHelper(postEnd-(inEnd-inIndex)-1, inStart, inIndex-1, inorder, postorder);
		root.right=buildTreeHelper(postEnd-1, inIndex+1, inEnd, inorder, postorder);
		return root;
    }
	public static void main(String[] args){
		Solution s=new Solution();
		int[] in={9,3,15,20,7};
		int[] post={9,15,7,20,3};
		TreeNode root=s.buildTree(in, post);
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			System.out.print(queue.peek().val+" ");
			TreeNode tempNode=queue.poll();			
			if(tempNode.left!=null)queue.offer(tempNode.left);
			if(tempNode.right!=null)queue.offer(tempNode.right);			
		}
	}
}
