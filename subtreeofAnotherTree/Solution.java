package subtreeofAnotherTree;

public class Solution {
public boolean isSubtree(TreeNode s, TreeNode t) {
	    if(s==null)return false;
	    if(isSame(s,t))return true;
	    return isSubtree(s.left,t)||isSubtree(s.right,t);
    }
public boolean isSame(TreeNode s, TreeNode t){
	if(s==null&&t==null)return true;
    if(s==null||t==null)return false;
    if(s.val!=t.val)return false;
    return isSame(s.left, t.left)&&isSame(s.right, t.right);
}
public static void main(String[] args){
	TreeNode[] tr1=new TreeNode[9];
	 tr1[0]=new TreeNode(3);
	 tr1[1]=new TreeNode(4);
	 tr1[2]=new TreeNode(5);
	 tr1[3]=new TreeNode(1);
	 tr1[4]=new TreeNode(2);
	 tr1[8]=new TreeNode(0);
	 tr1[0].left=tr1[1];
	 tr1[0].right=tr1[2];
	 tr1[1].left=tr1[3];
	 tr1[1].right=tr1[4];
	 tr1[4].left=tr1[8];
	 
	 tr1[5]=new TreeNode(4);
	 tr1[6]=new TreeNode(1);
	 tr1[7]=new TreeNode(2);
	 tr1[5].left=tr1[6];
	 tr1[5].right=tr1[7];
	 
	 Solution s=new Solution();
	 System.out.println(s.isSubtree(tr1[0], tr1[5]));
}
}
