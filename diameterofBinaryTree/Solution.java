package diameterofBinaryTree;

public class Solution {
	int max=0;
public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return max;
    }
public int helper (TreeNode root) {
	if (root==null)return 0;
	int left=helper(root.left);
	int right=helper(root.right);
	max=Math.max(max, right+left);
	return Math.max(left, right)+1;
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
	/* tr1[2].left=tr1[5];
	 tr1[2].right=tr1[6];*/
	 Solution s=new Solution();
	 System.out.println(s.diameterOfBinaryTree(tr1[0]));
}
}
