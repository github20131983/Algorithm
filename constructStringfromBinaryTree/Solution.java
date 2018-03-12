package constructStringfromBinaryTree;

import java.util.Stack;

public class Solution {
public String tree2str(TreeNode t) {
	    if(t==null)return "";
        String result=Integer.toString(t.val);
        String leftval=tree2str(t.left);
        String rightval=tree2str(t.right);
        if(leftval==""&&rightval=="")return result;
        else if(leftval=="")return result+"()("+rightval+")";
        else if(rightval=="")return result+"("+leftval+")";
        return result+="("+leftval+")("+rightval+")";
    }
public static void main(String[] args){
	TreeNode[] tr1=new TreeNode[7];
	 tr1[0]=new TreeNode(1);
	 tr1[1]=new TreeNode(2);
	 tr1[2]=new TreeNode(3);
	 tr1[3]=new TreeNode(4);
	 tr1[0].left=tr1[1];
	 tr1[0].right=tr1[2];
	 tr1[1].left=null;
	 tr1[1].right=tr1[3];
	 tr1[2].left=null;
	 tr1[2].right=null;
	 Solution s=new Solution();
	 System.out.println(s.tree2str(tr1[0]));
}
}
