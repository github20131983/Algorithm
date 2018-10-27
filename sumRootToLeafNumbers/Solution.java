package sumRootToLeafNumbers;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int sumNumbers(TreeNode root) {
		if(root==null)return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int sum=0;
        while(!queue.isEmpty()){
        	int size=queue.size();       	
        	for(int i=0;i<size;i++){
        		TreeNode temp=queue.poll();
        		if(temp.left==null&&temp.right==null)
        			sum+=temp.val;
        		else{
	        		if(temp.left!=null){
	        			temp.left.val=10*temp.val+temp.left.val;
	        			queue.offer(temp.left);
	        		}
	        		if(temp.right!=null){
	        			temp.right.val=10*temp.val+temp.right.val;
	        			queue.offer(temp.right);
	        		}
        		}
        	}
        }
        return sum;
    }
	public static void main(String[] args){
		TreeNode[] tr1=new TreeNode[5];
		 tr1[0]=new TreeNode(4);
		 tr1[1]=new TreeNode(9);
		 tr1[2]=new TreeNode(0);
		 tr1[3]=new TreeNode(5);
		 tr1[4]=new TreeNode(1);
	
		 tr1[0].left=tr1[1];
		 tr1[0].right=tr1[2];
		 tr1[1].left=tr1[3];
		 tr1[1].right=tr1[4];
		 Solution s=new Solution();
		 System.out.println(s.sumNumbers(tr1[0]));
	}
}
