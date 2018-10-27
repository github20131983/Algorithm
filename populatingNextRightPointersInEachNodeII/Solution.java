package populatingNextRightPointersInEachNodeII;

public class Solution {
	public void connect(TreeLinkNode root) {
        if(root==null)return;
        TreeLinkNode cur=root;
        TreeLinkNode head=null;
        TreeLinkNode prev=null;
        while(cur!=null){
        	while(cur!=null){
        		if(cur.left!=null){
        			if(prev==null)
        				head=cur.left;
        			else 
        				prev.next=cur.left;
        			prev=cur.left;
        		}
        		if(cur.right!=null){
        			if(prev==null)
        				head=cur.right;
        			else 
        				prev.next=cur.right;
        			prev=cur.right;
        		}
        		cur=cur.next;
        	}
        	cur=head;
        	head=null;
        	prev=null;
        }
    }
	public static void main(String[] args){
		TreeLinkNode[] tr1=new TreeLinkNode[7];
		 tr1[0]=new TreeLinkNode(1);
		 tr1[1]=new TreeLinkNode(2);
		 tr1[2]=new TreeLinkNode(3);
		 tr1[3]=new TreeLinkNode(4);
		 tr1[4]=new TreeLinkNode(5);
		 tr1[5]=new TreeLinkNode(7);
		 tr1[0].left=tr1[1];
		 tr1[0].right=tr1[2];
		 tr1[1].left=tr1[3];
		 tr1[1].right=tr1[4];
		 tr1[2].right=tr1[5];
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
