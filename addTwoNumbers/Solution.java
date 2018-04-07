package addTwoNumbers;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head=new ListNode(-1);
		ListNode sum=new ListNode(-1);
		head=sum;
		int sigleSum=0;
        while(l1!=null||l2!=null){
        	sigleSum/=10;
        	if(l1!=null){
        		sigleSum+=l1.val;
        		l1=l1.next;
        	}
        	if(l2!=null){
        		sigleSum+=l2.val;
        		l2=l2.next;
        	}
        	sum.next=new ListNode(sigleSum%10);
        	sum=sum.next;
        }
        if(sigleSum>=10)sum.next=new ListNode(1);
        return head.next;
    }
	
	public static void main(String[] args) {
		ListNode[] ln=new ListNode[7];
		ln[0]=new ListNode(2);
		ln[1]=new ListNode(4);
		ln[2]=new ListNode(3);
		ln[3]=new ListNode(5);
		ln[4]=new ListNode(6);
		ln[5]=new ListNode(4);
		ln[0].next=ln[1];
		ln[1].next=ln[2];
		
		ln[3].next=ln[4];
		ln[4].next=ln[5];
		
		Solution s=new Solution();
		ListNode l=s.addTwoNumbers(ln[0], ln[3]);
		while(l!=null){
			System.out.println(l.val);
		    l=l.next;
		}
	}
}
