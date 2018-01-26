package invertBinaryTree;

import java.util.Stack;

public class Solution {
public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        TreeNode left=root.left;
        TreeNode right=root.right;
        root.right=invertTree(left);
        root.left=invertTree(right);
        return root;
    }
public TreeNode invertTree2(TreeNode root) {
	if(root==null)return null;
	Stack<TreeNode> s=new Stack<TreeNode>();
	s.push(root);
	while(s.size()>0){
		TreeNode node=s.pop();
		TreeNode temp=node.left;
		node.left=node.right;
		node.right=temp;		
		if(node.right!=null)
			s.push(node.right);	
		if(node.left!=null)
			s.push(node.left);
	}
	return root;
}
public void levelTraversal(TreeNode root){
	if(root==null)System.out.println("¿ÕÊ÷");
	else{
	Stack<TreeNode> s=new Stack<TreeNode>();
	s.push(root);
	System.out.print(root.val+" ");
	while(s.size()>0){
		TreeNode temp=s.pop();
		if(temp.right!=null)
			s.push(temp.right);
		if(temp.left!=null)
			s.push(temp.left);
		if(temp.left!=null)
		  System.out.print(temp.left.val+" ");
		if(temp.right!=null)
		  System.out.print(temp.right.val+" ");
	}
	}
}
public static void main(String[] args){
	TreeNode[] tr1=new TreeNode[7];
	 tr1[0]=new TreeNode(1);
	 tr1[1]=new TreeNode(2);
	 tr1[2]=new TreeNode(3);
	 tr1[3]=new TreeNode(4);
	 tr1[4]=new TreeNode(5);
	 tr1[5]=new TreeNode(6);
	 tr1[6]=new TreeNode(7);
	 tr1[0].left=tr1[1];
	 tr1[0].right=tr1[2];
	 tr1[1].left=tr1[3];
	 tr1[1].right=tr1[4];
	 tr1[2].left=tr1[5];
	 tr1[2].right=tr1[6];
	 Solution s=new Solution();
	 s.levelTraversal(tr1[0]);
	 System.out.println();
	 s.invertTree(tr1[0]);
	 s.levelTraversal(tr1[0]);
	 System.out.println();
	 s.invertTree2(tr1[0]);
	 s.levelTraversal(tr1[0]);
}
}
