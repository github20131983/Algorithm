package sameTree;

public class Solution {
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)return true;
        if(p==null||q==null)return false;
        if(p.val==q.val)
        	return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        return false;
    }
     public static void main(String[] args){
    	 TreeNode[] tr1=new TreeNode[3];
    	 tr1[0]=new TreeNode(1);
    	 tr1[1]=new TreeNode(2);
    	 tr1[2]=new TreeNode(1);
    	 tr1[0].left=tr1[1];
    	 tr1[0].right=tr1[2];
    	 
    	 TreeNode[] tr2=new TreeNode[3];
    	 tr2[0]=new TreeNode(1);
    	 tr2[1]=new TreeNode(1);
    	 tr2[2]=new TreeNode(2);
    	 tr2[0].left=tr2[1];
    	 tr2[0].right=tr2[2];
   	 
    	 Solution s=new Solution();
    	 System.out.println(s.isSameTree(tr1[0], tr2[0]));
     }
}
