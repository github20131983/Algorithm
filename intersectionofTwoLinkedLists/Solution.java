package intersectionofTwoLinkedLists;

public class Solution {
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 if(headA==null||headB==null)return null;	 
		 ListNode a=headA;
		 ListNode b=headB;
		 while(a!=b){
			a=a==null?headB:a.next;
			b=b==null?headA:b.next;
		 }		
		 return a;
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
			ln[1].next=ln[5];
			ln[5].next=ln[6];
			ln[2].next=ln[3];
			ln[3].next=ln[4];
			ln[4].next=ln[5];
			ln[5].next=ln[6];
			ln[6].next=null;
			Solution s=new Solution();
			System.out.println(s.getIntersectionNode(ln[0],ln[2]).val);
	 }
}
