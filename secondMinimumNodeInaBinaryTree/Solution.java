package secondMinimumNodeInaBinaryTree;

public class Solution {
public int findSecondMinimumValue(TreeNode root) {
        if (root==null) return -1;
        return findHelper(root, root.val);
    }
public int findHelper(TreeNode root,int min){
	if(root==null)return -1;
	if(root.val>min)return root.val;
	int left=findHelper(root.left, min);
	int right=findHelper(root.right, min);
	return (left==-1||right==-1)?Math.max(left, right):Math.min(left, right);
}
	public static void main(String[] args) {
		TreeNode[] tr1=new TreeNode[7];
		 tr1[0]=new TreeNode(2);
		 tr1[1]=new TreeNode(2);
		 tr1[2]=new TreeNode(5);
		 tr1[3]=new TreeNode(5);
		 tr1[4]=new TreeNode(7);
		 tr1[0].left=tr1[1];
		 tr1[0].right=tr1[2];
		 tr1[2].left=tr1[3];
		 tr1[2].right=tr1[4];
		 Solution s=new Solution();
		 System.out.println(s.findSecondMinimumValue(tr1[0]));
	}
}
