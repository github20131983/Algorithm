package convertBSTtoGreaterTree;

public class Solution {
	int sum=0;
public TreeNode convertBST(TreeNode root) {
       convert(root);  
       return root;
    }
public void convert(TreeNode current){
	if(current==null)return;
	convert(current.right);
	current.val+=sum;
	sum=current.val;
	convert(current.left);
}
public static void main(String[] args){
	Solution s=new Solution();
	TreeNode[] tr1=new TreeNode[3];
	 tr1[0]=new TreeNode(5);
	 tr1[1]=new TreeNode(2);
	 tr1[2]=new TreeNode(13);
	 tr1[0].left=tr1[1];
	 tr1[0].right=tr1[2];
	 s.convertBST(tr1[0]);
	 System.out.println(tr1[0].val+" "+tr1[1].val+" "+tr1[2].val);
}
}
