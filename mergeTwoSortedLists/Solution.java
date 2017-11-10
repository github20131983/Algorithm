package mergeTwoSortedLists;

public class Solution {
public ListNode mergeTwoSorterLists(ListNode l1,ListNode l2){
	if(l1==null)
		return l2;
	if(l2==null)
		return l1;
    if(l1.val>l2.val){
    	ListNode tmp=l2;
    	tmp.next=mergeTwoSorterLists(l1,l2.next);
    	return tmp;
    }
    else{
    	ListNode tmp=l1;
    	tmp.next=mergeTwoSorterLists(l1.next,l2);
    	return tmp;
    }
}
  public static void main(String[] args){
	  ListNode l1[] = new ListNode[3];
	  ListNode l2[] = new ListNode[3];
	  l1[0]=new ListNode(2);
	  l1[1]=new ListNode(4);
	  l1[2]=new ListNode(6);
	  
	  l1[0].next=l1[1];
	  l1[1].next=l1[2];
	  l1[2].next=null;
	  
	  l2[0]=new ListNode(1);
	  l2[1]=new ListNode(3);
	  l2[2]=new ListNode(5);
	  l2[0].next=l2[1];
	  l2[1].next=l2[2];
	  l2[2].next=null;
	  Solution s=new Solution();
	  ListNode ls=s.mergeTwoSorterLists(l1[0], l2[0]);
	  while(ls!=null){
		  System.out.println(ls.val);
		  ls=ls.next;
	  }
  }
}
