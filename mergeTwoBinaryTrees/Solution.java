package mergeTwoBinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import javax.xml.transform.Templates;

public class Solution {
public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null)return null;
        int newval=(t1==null?0:t1.val)+(t2==null?0:t2.val);
        TreeNode newtr=new TreeNode(newval);
        newtr.left=mergeTrees(t1==null?null:t1.left,t2==null?null:t2.left);
        newtr.right=mergeTrees(t1==null?null:t1.right,t2==null?null:t2.right);
        return newtr;
    }
public static void main(String[] args) {
	TreeNode[] tr1=new TreeNode[7];
	 tr1[0]=new TreeNode(1);
	 tr1[1]=new TreeNode(2);
	 tr1[2]=new TreeNode(3);
	 tr1[3]=new TreeNode(4);
	 tr1[4]=new TreeNode(5);
	 tr1[5]=new TreeNode(6);
	 tr1[6]=new TreeNode(7);
	 tr1[0].right=tr1[1];
	 tr1[1].right=tr1[2];
	 tr1[3].left=tr1[4];
	 tr1[3].right=tr1[5];
	 tr1[4].left=tr1[6];
	 Solution s=new Solution();
	 TreeNode treeNode=s.mergeTrees(tr1[0],tr1[3]);
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
