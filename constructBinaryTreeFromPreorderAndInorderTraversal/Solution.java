package constructBinaryTreeFromPreorderAndInorderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(0,0,inorder.length-1, preorder, inorder);
    }
	public TreeNode buildTreeHelper(int preStart,int inStart,int inEnd,int[] preorder, int[] inorder){
		if(preStart>preorder.length-1||inStart>inEnd)
			return null;
		TreeNode root=new TreeNode(preorder[preStart]);
		int inIndex=0;
		for(int i=0;i<inorder.length;i++){
			if(root.val==inorder[i])
				inIndex=i;
		}
		root.left=buildTreeHelper(preStart+1, inStart, inIndex-1, preorder, inorder);
		root.right=buildTreeHelper(preStart+inIndex-inStart+1, inIndex+1, inEnd, preorder, inorder);
		return root;
	}
	public static void main(String[] args){
		int[] pre={3,9,20,15,7};
		int[] in={9,3,15,20,7};
		Solution s=new Solution();
		TreeNode root=s.buildTree(pre,in);
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
