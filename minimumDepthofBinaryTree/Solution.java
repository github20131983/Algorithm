package minimumDepthofBinaryTree;

public class Solution {
public int minDepth(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null)
        	return minDepth(root.right)+1;
        if(root.right==null)
        	return minDepth(root.left)+1;
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
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
	 System.out.println(s.minDepth(tr1[0]));
}
}
