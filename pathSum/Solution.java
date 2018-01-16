package pathSum;

public class Solution {
	 public boolean hasPathSum(TreeNode root, int sum) {
	        if(root==null)
	        	return false;
	        sum-=root.val;
	        if(root.left==null&&root.right==null&&sum==0)
	        	return true;
	        return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
	    }
    
	 public static void main(String[] args){
		 TreeNode[] tr1=new TreeNode[7];
    	 tr1[0]=new TreeNode(5);
    	 tr1[1]=new TreeNode(4);
    	 tr1[2]=new TreeNode(8);
    	 tr1[3]=new TreeNode(11);
    	 tr1[4]=new TreeNode(13);
    	 tr1[5]=new TreeNode(4);
    	 tr1[6]=new TreeNode(7);
    	 tr1[0].left=tr1[1];
    	 tr1[0].right=tr1[2];
    	 tr1[1].left=tr1[3];
    	 tr1[1].right=tr1[4];
    	 tr1[2].left=tr1[5];
    	 tr1[2].right=tr1[6];
    	 Solution s=new Solution();
    	 System.out.println(s.hasPathSum(tr1[0], 13));	 
	 }
}
