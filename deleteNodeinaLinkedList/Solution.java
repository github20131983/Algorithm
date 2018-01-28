package deleteNodeinaLinkedList;

public class Solution {
public void deleteNode(ListNode node) {
        ListNode p=node;
        node=node.next;
        p.val=node.val;
        p.next=node.next;
    }
public static void main(String[] args){
	ListNode[] ln=new ListNode[7];
	ln[0]=new ListNode(1);
	ln[1]=new ListNode(2);
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
	s.deleteNode(ln[2]);
	ListNode p=ln[0];
	while(p!=null){
		System.out.println(p.val);
		p=p.next;
	}
}
}
