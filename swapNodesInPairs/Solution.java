package swapNodesInPairs;

public class Solution {
	public ListNode swapPairs(ListNode head) {
		if(head==null)return head;
		ListNode p=head,q=head.next,r=null;
		ListNode start=new ListNode(-1);
		start.next=head;
		r=start;
		while(p!=null&&p.next!=null){
			p.next=q.next;
			q.next=p;
			r.next=q;
			r=p;
			p=p.next;
			if(p!=null)
				q=p.next;
		}
		return start.next;     
    }
	public static void main(String[] args){
		ListNode[] ln=new ListNode[4];
		ln[0]=new ListNode(1);
		ln[1]=new ListNode(2);
		ln[2]=new ListNode(3);
		ln[3]=new ListNode(4);		
		ln[0].next=ln[1];
		ln[1].next=ln[2];
		ln[2].next=ln[3];
		Solution s=new Solution();
		ListNode head=s.swapPairs(ln[0]);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}
}
