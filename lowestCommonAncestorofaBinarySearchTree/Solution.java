package lowestCommonAncestorofaBinarySearchTree;

public class Solution {
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>p.val&&root.val>q.val)
        	return lowestCommonAncestor(root.left,p,q);
        else if(root.val<p.val&&root.val<q.val)
        	return lowestCommonAncestor(root.right,p,q);
        else
        	return root;
    }
public static void main(String[] args){
	TreeNode[] tr1=new TreeNode[7];
	 tr1[0]=new TreeNode(6);
	 tr1[1]=new TreeNode(2);
	 tr1[2]=new TreeNode(8);
	 tr1[3]=new TreeNode(0);
	 tr1[4]=new TreeNode(4);
	 tr1[5]=new TreeNode(7);
	 tr1[6]=new TreeNode(9);
	 tr1[0].left=tr1[1];
	 tr1[0].right=tr1[2];
	 tr1[1].left=tr1[3];
	 tr1[1].right=tr1[4];
	 tr1[2].left=tr1[6];
	 tr1[2].right=tr1[5];
	 Solution s=new Solution();
	 System.out.println(s.lowestCommonAncestor(tr1[0], tr1[1], tr1[4]).val);
}
}
