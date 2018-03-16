package averageofLevelsinBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
public List<Double> averageOfLevels(TreeNode root) {
	Queue<TreeNode> q=new LinkedList<TreeNode>();
	List<Double> result=new ArrayList<Double>();
	if(root==null)return result;
	q.offer(root);
	while(!q.isEmpty()){
		int n=q.size();
		double sum=0;
		for(int i=0;i<n;i++){
			TreeNode treeNode=q.poll();
			sum+=treeNode.val;
			if(treeNode.left!=null)q.offer(treeNode.left);
			if(treeNode.right!=null)q.offer(treeNode.right);			
		}
		result.add((sum/n));
	}
	return result;        
    }
public static void main(String[] args) {
	TreeNode[] tr1=new TreeNode[5];
	 tr1[0]=new TreeNode(3);
	 tr1[1]=new TreeNode(9);
	 tr1[2]=new TreeNode(20);
	 tr1[3]=new TreeNode(15);
	 tr1[4]=new TreeNode(7);
	 tr1[0].left=tr1[1];
	 tr1[0].right=tr1[2];
	 tr1[2].left=tr1[3];
	 tr1[2].right=tr1[4];
	 Solution s=new Solution();
	 List<Double> list=new ArrayList<Double>();
	 list=s.averageOfLevels(tr1[0]);
	 for(double x:list)
		 System.out.println(x);
}
}
