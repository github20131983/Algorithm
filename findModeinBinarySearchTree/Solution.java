package findModeinBinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	TreeNode prev;
	int count=0;
	int maxCount=-1;	
public int[] findMode(TreeNode root) {	 
	    List<Integer> modes=new ArrayList<Integer>();
	    prev=root;
        inorder(root, modes);
        int[] ret=new int[modes.size()];
        for (int i = 0; i < modes.size(); i++)
			ret[i] = modes.get(i);
        return ret;
    }
public void inorder(TreeNode root,List<Integer> modes) {	
	if (root==null)return; 
	inorder(root.left, modes);
	count=prev.val==root.val?count+1:1;
	if(count==maxCount)
		modes.add(root.val);
	else if(count>maxCount){
		modes.clear();
		modes.add(root.val);
		maxCount=count;
	}
	prev=root;
	inorder(root.right, modes);	
}  
 public static void main(String[] args){
	 TreeNode[] tr1=new TreeNode[7];
	 tr1[0]=new TreeNode(5);
	 tr1[1]=new TreeNode(4);
	 tr1[2]=new TreeNode(6);
	 tr1[3]=new TreeNode(2);
	 tr1[4]=new TreeNode(4);
	 tr1[5]=new TreeNode(6);
	 tr1[6]=new TreeNode(7);
	 tr1[0].left=tr1[1];
	 tr1[0].right=tr1[2];
	 tr1[1].left=tr1[3];
	 tr1[1].right=tr1[4];
	 tr1[2].left=tr1[5];
	 tr1[2].right=tr1[6];
	 Solution s=new Solution();
	 int[] a=s.findMode(tr1[0]);
	 for(int aa:a)
		 System.out.println(aa);
 }
}
