package middleOfTheLinkedList;

public class Solution {
	public ListNode middleNode(ListNode head) {
		ListNode fast=head,slow=head;
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
    }
	public static void main(String[] args){
		ListNode p = new ListNode(9999);
		ListNode[] ln=new ListNode[7];
		ln[0]=new ListNode(0);
		ln[1]=new ListNode(1);
		ln[2]=new ListNode(2);
		//ln[3]=new ListNode(3);
		p.next=ln[0];
		ln[0].next=ln[1];
		ln[1].next=ln[2];
		ln[2].next=ln[3];
		System.out.println((new Solution()).middleNode(p).val);
	}
}
