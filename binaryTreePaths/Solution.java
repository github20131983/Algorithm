package binaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<String> binaryTreePaths(TreeNode root) {
	    List<String> result = new ArrayList<String>();
        if(root!=null)searchBT(root,"",result);
        return result;
   }
  public void searchBT(TreeNode root,String path,List<String>result){
	  if(root.left==null&&root.right==null)result.add(path+root.val);
	  if(root.left!=null)searchBT(root.left,path+root.val+"->",result);
	  if(root.right!=null)searchBT(root.right,path+root.val+"->",result);
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
	     List<String> l = s.binaryTreePaths(tr1[0]);
	     for(String a:l)
	    	 System.out.println(a);
  }
}
