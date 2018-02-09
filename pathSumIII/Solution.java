package pathSumIII;

public class Solution {
public int pathSum(TreeNode root, int sum) {
        if(root==null)return 0;
        return dfs(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
public int dfs(TreeNode root,int sum){
	if(root==null)return 0;
	int count=0;
	if(root.val==sum)
		count++;
	return count+dfs(root.left,sum-root.val)+dfs(root.right,sum-root.val);
}
public static void main(String[] args){
	TreeNode[] tr1=new TreeNode[9];
	 tr1[0]=new TreeNode(10);
	 tr1[1]=new TreeNode(5);
	 tr1[2]=new TreeNode(-3);
	 tr1[3]=new TreeNode(3);
	 tr1[4]=new TreeNode(2);
	 tr1[5]=new TreeNode(11);
	 tr1[6]=new TreeNode(3);
	 tr1[7]=new TreeNode(-2);
	 tr1[8]=new TreeNode(1);
	 tr1[0].left=tr1[1];
	 tr1[0].right=tr1[2];
	 tr1[1].left=tr1[3];
	 tr1[1].right=tr1[4];
	 tr1[2].left=null;
	 tr1[2].right=tr1[5];
	 tr1[3].left=tr1[6];
	 tr1[3].right=tr1[7];
	 tr1[4].left=null;
	 tr1[4].right=tr1[8];
	 Solution s=new Solution();
	 System.out.println(s.pathSum(tr1[0], 8));
}
}
