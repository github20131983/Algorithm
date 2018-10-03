package removeNthNodeFromEndAfList;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start=new ListNode(-1);
        start.next=head;
        ListNode slow=start,fast=start;
		for(int i=1;i<=n;i++)
			fast=fast.next;
		while(fast.next!=null){
			fast=fast.next;
			slow=slow.next;
		}
		slow.next=slow.next.next;
		return start.next;
    }
	public static void main(String[] args){
		ListNode[] ln=new ListNode[5];
		ln[0]=new ListNode(1);
		ln[1]=new ListNode(2);
		ln[2]=new ListNode(3);
		ln[3]=new ListNode(4);
		ln[4]=new ListNode(5);
		ln[0].next=ln[1];
		ln[1].next=ln[2];
		ln[2].next=ln[3];
		ln[3].next=ln[4];
		Solution s=new Solution();
		ListNode h=s.removeNthFromEnd(ln[0], 2);
		while(h!=null){
			System.out.print(h.val+" ");
			h=h.next;
		}
	}
}
