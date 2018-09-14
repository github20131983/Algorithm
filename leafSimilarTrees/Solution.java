package leafSimilarTrees;

import java.util.ArrayList;

public class Solution {
public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arrayList1=new ArrayList<Integer>();
        ArrayList<Integer> arrayList2=new ArrayList<Integer>();
        dfs(root1, arrayList1);
        dfs(root2, arrayList2);
        return arrayList1.equals(arrayList2);
    }
public void dfs(TreeNode node,ArrayList<Integer> al){
	if(node!=null){
	if(node.left==null&&node.right==null)
		al.add(node.val);
	dfs(node.left,al);
	dfs(node.right,al);
	}
}
public static void main(String[] args){
	TreeNode[] tr1=new TreeNode[3];
	 tr1[0]=new TreeNode(1);
	 tr1[1]=new TreeNode(2);
	 tr1[2]=new TreeNode(3);
	 tr1[0].left=tr1[1];
	 tr1[0].right=tr1[2];
	 TreeNode[] tr2=new TreeNode[3];
	 tr2[0]=new TreeNode(2);
	 tr2[1]=new TreeNode(2);
	 tr2[2]=new TreeNode(3);
	 tr2[0].left=tr2[1];
	 tr2[0].right=tr2[2];
	 System.out.print((new Solution()).leafSimilar(tr1[0], tr2[0]));
}
}
