package increasingOrderSearchTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
public TreeNode increasingBST(TreeNode root) {
        List<Integer> val=new ArrayList<Integer>();
        inorder(root,val);
        TreeNode newRoot=new TreeNode(0),curNode=newRoot;
        for(int v:val){
        	curNode.right=new TreeNode(v);
        	curNode=curNode.right;
        }
        return newRoot.right;
    }
public void inorder(TreeNode root,List<Integer> l){
	if(root==null)return;
	inorder(root.left,l);
	l.add(root.val);
	inorder(root.right, l);
}
public static void main(String[] args){	
}
}
