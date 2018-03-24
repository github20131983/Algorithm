package longestUnivaluePath;

public class Solution {
	int max=0;
public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return max;
    }
public int helper(TreeNode root){
	if(root==null)return 0;
	int left=helper(root.left);
	int right=helper(root.right);
	int leftCount=0,rightCount=0;
	if(root.left!=null&&root.left.val==root.val)
		leftCount=left+1;
	if(root.right!=null&&root.right.val==root.val)
		rightCount=right+1;
	max=Math.max(max, leftCount+rightCount);
	return Math.max(leftCount, rightCount);
}
public static void main(String[] args){
	TreeNode[] tr1=new TreeNode[6];
	 tr1[0]=new TreeNode(5);
	 tr1[1]=new TreeNode(4);
	 tr1[2]=new TreeNode(5);
	 tr1[3]=new TreeNode(1);
	 tr1[4]=new TreeNode(1);
	 tr1[5]=new TreeNode(5);
	 tr1[0].left=tr1[1];
	 tr1[0].right=tr1[2];
	 tr1[1].left=tr1[3];
	 tr1[1].right=tr1[4];
	 tr1[2].right=tr1[5];
	 Solution s=new Solution();
	 System.out.println(s.longestUnivaluePath(tr1[0]));
}
}
