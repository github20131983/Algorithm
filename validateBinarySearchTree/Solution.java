package validateBinarySearchTree;

public class Solution {
	public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
	public boolean isValidBST(TreeNode root,long minVal,long maxVal){
		if(root==null)return true;
		if(root.val>=maxVal||root.val<=minVal)return false;
		return isValidBST(root.left, minVal, root.val)&&isValidBST(root.right,root.val,maxVal);
	}
	public static void main(String[] args){
		TreeNode[] tr1=new TreeNode[3];
		 tr1[0]=new TreeNode(1);
		 tr1[1]=new TreeNode(2);
		 tr1[2]=new TreeNode(3);
		 tr1[1].left=tr1[0];
		 tr1[1].right=tr1[2];
		 Solution s=new Solution();
		 System.out.print(s.isValidBST(tr1[1]));
	}
}
