package balancedBinaryTree;

public class Solution {
    public boolean isBalanced(TreeNode root) {
    	if(root==null)
    		return true;
    	int nleft=treeDepth(root.left);
    	int nright=treeDepth(root.right);
    	if(nleft-nright>1||nleft-nright<-1)
    		return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
	public int treeDepth(TreeNode root){
			if(root==null)
				return 0;
			int leftDepth=treeDepth(root.left);
			int rjghtDepth=treeDepth(root.right);
			return leftDepth>rjghtDepth?leftDepth+1:rjghtDepth+1;
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
    	 //tr1[0].right=tr1[2];
    	 tr1[1].left=tr1[3];
    	 tr1[1].right=tr1[4];
    	// tr1[2].left=tr1[6];
    	 //tr1[2].right=tr1[5];
    	 Solution s=new Solution();
    	 System.out.println(s.isBalanced(tr1[0]));	 
	 }
}
