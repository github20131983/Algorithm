package partitionList;

public class Solution {
	public ListNode partition(ListNode head, int x) {
        ListNode fakeNode1=new ListNode(-1);
        ListNode fakeNode2=new ListNode(-1);
        ListNode cur1=fakeNode1,cur2=fakeNode2;
        while(head!=null){
        	if(head.val<x){
        		cur1.next=head;
        		cur1=head;
        	}else{
        		cur2.next=head;
        		cur2=head;
        	}
        	head=head.next;
        }
        cur1.next=fakeNode2.next;
        cur2.next=null;
        return fakeNode1.next;
    }
	public static void main(String[] args){
		ListNode[] ln=new ListNode[6];
		ln[0]=new ListNode(1);
		ln[1]=new ListNode(4);
		ln[2]=new ListNode(3);
		ln[3]=new ListNode(2);
		ln[4]=new ListNode(5);
		ln[5]=new ListNode(2);
		ln[0].next=ln[1];
		ln[1].next=ln[2];
		ln[2].next=ln[3];
		ln[3].next=ln[4];
		ln[4].next=ln[5];
		Solution s=new Solution();
		ListNode l=s.partition(ln[0],3);
		while (l!=null) {
			System.out.println(l.val);
			l=l.next;
		}	
	}
}
