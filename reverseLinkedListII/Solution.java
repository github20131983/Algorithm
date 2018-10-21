package reverseLinkedListII;

public class Solution {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode fakeNode=new ListNode(-1);
        fakeNode.next=head;
        ListNode pre=new ListNode(-1);
        pre=fakeNode;
        for(int i=1;i<=m-1;i++)
        	pre=pre.next;
        ListNode start=pre.next;
        ListNode then=start.next;
        for(int i=1;i<=n-m;i++){
        	start.next=then.next;
        	then.next=pre.next;
        	pre.next=then;
        	then=start.next;
        }
        return fakeNode.next;
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
		ListNode l=s.reverseBetween(ln[0], 2, 4);
		while (l!=null) {
			System.out.print(l.val+" ");
			l=l.next;
		}
	}
}
