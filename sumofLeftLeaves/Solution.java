package sumofLeftLeaves;

public class Solution {
public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null)return sum;
        if(root.left!=null){
        	if(root.left.left==null&&root.left.right==null)
        		sum+=root.left.val;
        	else
        		sum+=sumOfLeftLeaves(root.left);
        }
        sum+=sumOfLeftLeaves(root.right);
        return sum;
    }
public static void main(String[] args){
	Solution s=new Solution();
	TreeNode[] tr1=new TreeNode[7];
	 tr1[0]=new TreeNode(1);
	 tr1[1]=new TreeNode(2);
	 tr1[2]=new TreeNode(2);
	 tr1[3]=new TreeNode(3);
	 tr1[4]=new TreeNode(4);
	 tr1[5]=new TreeNode(4);
	 tr1[6]=new TreeNode(3);
	 tr1[0].left=null;
	 tr1[0].right=tr1[2];
	 tr1[1].left=tr1[3];
	 tr1[1].right=tr1[4];
	 tr1[2].left=null;
	 tr1[2].right=null;
	 System.out.println(s.sumOfLeftLeaves(tr1[0]));
}
}
