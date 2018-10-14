package rotateList;

public class Solution {
	public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy,slow=dummy;
        int length;
        for(length=0;fast.next!=null;length++)
        	fast=fast.next;
        for(int i=length-k%length;i>0;i--)
        	slow=slow.next;
        fast.next=dummy.next;
        dummy.next=slow.next;
        slow.next=null;
        return dummy.next;
	}
	public static void main(String[] args){
		Solution s=new Solution();
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
		ListNode h=s.rotateRight(ln[0], 2);
		while (h!=null) {
			System.out.println(h.val);
			h=h.next;
		}
	}
}
