package populatingNextRightPointersInEachNode;

public class Solution {
	public void connect(TreeLinkNode root) {
        if(root==null)return;
        root.next=null;
        TreeLinkNode pre=root;
        TreeLinkNode cur=null;
        while(pre.left!=null){
        	cur=pre;
        	while(cur!=null){
        		cur.left.next=cur.right;
        		if(cur.next!=null)cur.right.next=cur.next.left;
        		cur=cur.next;
        	}
        	pre=pre.left;
        }
    }
	public static void main(String[] args){
		TreeLinkNode[] tr1=new TreeLinkNode[7];
		 tr1[0]=new TreeLinkNode(1);
		 tr1[1]=new TreeLinkNode(2);
		 tr1[2]=new TreeLinkNode(3);
		 tr1[3]=new TreeLinkNode(4);
		 tr1[4]=new TreeLinkNode(5);
		 tr1[5]=new TreeLinkNode(6);
		 tr1[6]=new TreeLinkNode(7);
		 tr1[0].left=tr1[1];
		 tr1[0].right=tr1[2];
		 tr1[1].left=tr1[3];
		 tr1[1].right=tr1[4];
		 tr1[2].left=tr1[5];
		 tr1[2].right=tr1[6];
		 Solution s=new Solution();
		 s.connect(tr1[0]);
		 TreeLinkNode p=tr1[0];
		 while(p!=null){
			 TreeLinkNode q=p;
			 while(q!=null){
				 System.out.print(q.val+" ");
				 q=q.next;
			 }
			 System.out.println();
			 p=p.left;
		 }
	}
}
