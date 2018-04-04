package minimumDistanceBetweenBSTNodes;

public class Solution {
	int min=Integer.MAX_VALUE;
	Integer prev=null;
	public int minDiffInBST(TreeNode root) {
        if(root==null)return min;
        minDiffInBST(root.left);
        if(prev!=null)
        	min=Math.min(min, root.val-prev);
        prev=root.val;
        minDiffInBST(root.right);
        return min;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		TreeNode[] tr1=new TreeNode[3];
		 tr1[0]=new TreeNode(1);
		 tr1[1]=new TreeNode(3);
		 tr1[2]=new TreeNode(2);
		 tr1[0].right=tr1[1];
		 tr1[1].left=tr1[2];
	System.out.println(s.minDiffInBST(tr1[0]));
	}

}
