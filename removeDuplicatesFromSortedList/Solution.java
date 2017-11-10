package removeDuplicatesFromSortedList;

public class Solution {
public ListNode deleteDuplicates(ListNode head) {
	ListNode list=head;
	while(list!=null){
		if(list.next==null)
			break;
		else if(list.val==list.next.val)
			list.next=list.next.next;
		else
			list=list.next;
	}
	return head;        
    }
	 public static void main(String[] args){
		 Solution s=new Solution();
		 ListNode l1[] = new ListNode[6];
		  l1[0]=new ListNode(1);
		  l1[1]=new ListNode(1);
		  l1[2]=new ListNode(1);
		  l1[3]=new ListNode(1);
		  l1[4]=new ListNode(1);
		  l1[5]=new ListNode(1);
		  
		  l1[0].next=l1[1];
		  l1[1].next=l1[2];
		  l1[2].next=l1[3];
		  l1[3].next=l1[4];
		  l1[4].next=l1[5];
		  l1[5].next=null;
		  ListNode ls=s.deleteDuplicates(l1[0]);
		  while(ls!=null){ 
			 System.out.println(ls.val); 
			 ls=ls.next; 
		} 
		 System.out.println();
	 }
}
