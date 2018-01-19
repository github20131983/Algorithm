package linkedListCycle;

public class Solution {
public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        ListNode walker=head;
        ListNode runner=head;
        while(runner!=null&&runner.next!=null){
        	walker=walker.next;
        	runner=runner.next.next;
        	if(walker==runner)return true;
        }
        return false;
    }
public static void main(String[] args){
	ListNode[] ln=new ListNode[7];
	ln[0]=new ListNode(1);
	ln[1]=null;
	ln[2]=new ListNode(3);
	ln[3]=new ListNode(4);
	ln[4]=new ListNode(5);
	ln[5]=new ListNode(6);
	ln[6]=new ListNode(7);
	/*ln[0].next=ln[1];
	ln[1].next=ln[2];
	ln[2].next=ln[3];
	ln[3].next=ln[4];
	ln[4].next=ln[5];
	ln[5].next=ln[6];
	ln[6].next=null;*/
	Solution s=new Solution();
	System.out.println(s.hasCycle(ln[0]));
}
}

