package minimumAbsoluteDifferenceinBST;

public class Solution {
	int min=Integer.MAX_VALUE;
	Integer prev=null; 
public int getMinimumDifference(TreeNode root) {	
        if(root==null)return min;
        getMinimumDifference(root.left);
        if(prev!=null)
        	min=Math.min(min, root.val-prev);
        prev=root.val;
        getMinimumDifference(root.right);
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
	 System.out.println(s.getMinimumDifference(tr1[0]));
}
}
