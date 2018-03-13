package binaryTreeTilt;

public class Solution {
	int result=0;
public int findTilt(TreeNode root) {
        helper(root);
        return result;
    }
public int helper(TreeNode root) {
    if(root==null)return 0;
    int leftval=helper(root.left);
    int rightval=helper(root.right);
    result+=Math.abs(leftval-rightval);
    return leftval+rightval+root.val;
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
	 System.out.println(s.findTilt(tr1[0]));
}
}
