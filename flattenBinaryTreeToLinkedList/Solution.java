package flattenBinaryTreeToLinkedList;

public class Solution {
	public void flatten(TreeNode root) {
        while(root!=null){       
        	if(root.left!=null){
        		TreeNode cur=root.left;
        		while(cur.right!=null)
        			cur=cur.right;
        		cur.right=root.right;
        		root.right=root.left;
        		root.left=null;
        	}
        	root=root.right;
        }
    }
	public static void main(String[] args){
		TreeNode[] tr1=new TreeNode[6];
		 tr1[0]=new TreeNode(1);
		 tr1[1]=new TreeNode(2);
		 tr1[2]=new TreeNode(5);
		 tr1[3]=new TreeNode(3);
		 tr1[4]=new TreeNode(4);
		 tr1[5]=new TreeNode(6);

		 tr1[0].left=tr1[1];
		 tr1[0].right=tr1[2];
		 tr1[1].left=tr1[3];
		 tr1[1].right=tr1[4];
		 tr1[2].right=tr1[5];
		 Solution s=new Solution();
		 s.flatten(tr1[0]);
		 TreeNode p=tr1[0];
		 while(p!=null){
			 System.out.print(p.val+" ");
			 p=p.right;
		 }
	}
}
