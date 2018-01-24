package removeLinkedListElements;

public class Solution {
public ListNode removeElements(ListNode head, int val) {
	ListNode fakehead=new ListNode(-1);
	fakehead.next=head;
	ListNode curr=head;
	ListNode prev=fakehead;
	while(curr!=null){
		if(curr.val==val)
			prev.next=curr.next;
		else
			prev=prev.next;
		curr=curr.next;
	}
	return fakehead.next;      
    }
public static void main(String[] args){
	ListNode[] ln=new ListNode[7];
	ln[0]=new ListNode(1);
	ln[1]=new ListNode(6);
	ln[2]=new ListNode(3);
	ln[3]=new ListNode(4);
	ln[4]=new ListNode(5);
	ln[5]=new ListNode(6);
	ln[6]=new ListNode(7);
	ln[0].next=ln[1];
	ln[1].next=ln[2];
	ln[2].next=ln[3];
	ln[3].next=ln[4];
	ln[4].next=ln[5];
	ln[5].next=ln[6];
	ln[6].next=null;
	Solution s=new Solution();
	ListNode ls=s.removeElements(ln[0],6);
	while(ls!=null){
		System.out.println(ls.val);		
		ls=ls.next;
	}
}
}
