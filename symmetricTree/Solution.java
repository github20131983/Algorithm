package symmetricTree;

public class Solution {
	 public boolean isSymmetric(TreeNode root) {
	        return root==null||isSubSymmetric(root.left,root.right);
	    }
	 public boolean isSubSymmetric(TreeNode left,TreeNode right) {
	        if(left==null||right==null)
	        	return left==right;
	        if(left.val!=right.val)
	        	return false;
	       return isSubSymmetric(left.left,right.right)&&
	    		   isSubSymmetric(left.right,right.left);
	        	
	    }
	 public static void main(String[] args){
		 TreeNode[] tr1=new TreeNode[7];
    	 tr1[0]=new TreeNode(1);
    	 tr1[1]=new TreeNode(2);
    	 tr1[2]=new TreeNode(2);
    	 tr1[3]=new TreeNode(3);
    	 tr1[4]=new TreeNode(4);
    	 tr1[5]=new TreeNode(4);
    	 tr1[6]=new TreeNode(3);
    	 tr1[0].left=tr1[1];
    	 tr1[0].right=tr1[2];
    	 tr1[1].left=tr1[3];
    	 tr1[1].right=tr1[4];
    	 tr1[2].left=tr1[6];
    	 tr1[2].right=tr1[5];
    	 Solution s=new Solution();
    	 System.out.println(s.isSymmetric(tr1[0]));
	 }
}
