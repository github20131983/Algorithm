package trimaBinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null)return null;
        if(root.val<L)return trimBST(root.right, L, R);
        if(root.val>R)return trimBST(root.left, L, R);
        root.left=trimBST(root.left, L, R);
        root.right=trimBST(root.right, L, R);
        return root;
    }
	public static void main(String[] args) {
		TreeNode[] tr1=new TreeNode[5];
		 tr1[0]=new TreeNode(3);
		 tr1[1]=new TreeNode(0);
		 tr1[2]=new TreeNode(4);
		 tr1[3]=new TreeNode(2);
		 tr1[4]=new TreeNode(1);
		 tr1[0].left=tr1[1];
		 tr1[0].right=tr1[2];
		 tr1[1].right=tr1[3];
		 tr1[3].left=tr1[4];
		 Solution s=new Solution();
		 TreeNode treeNode=s.trimBST(tr1[0], 1, 3);
		 Queue<TreeNode> queue=new LinkedList<TreeNode>();
		 queue.offer(treeNode);
		 while (!queue.isEmpty()) {
				TreeNode tempNode=queue.poll();
				System.out.print(tempNode.val+" ");
				if(tempNode.left!=null)queue.offer(tempNode.left);
				if(tempNode.right!=null)queue.offer(tempNode.right);			
		}
	}

}
