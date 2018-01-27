package palindromeLinkedList;

public class Solution {
public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
        ListNode p=head;
        ListNode fakeNode = new ListNode(-1);
        fakeNode.next=head;
        int length=0;
        while(p!=null){
        	length++;
        	p=p.next;
        }
        int n;
        if(length%2==0)
        	n=length/2-1;
        else
            n=length/2;
        p=head.next;
        for(int i=1;i<=n;i++){       		
        		head.next=p.next;
        		p.next=fakeNode.next;
        		fakeNode.next=p;        	
	        	p=head.next;       
        }
        head=fakeNode.next;
        boolean flag=true;
        if(length%2==1)head=head.next;
        if(length==2)p=head.next;  
        while(p!=null){
        	if(head.val==p.val){
        		head=head.next;
                p=p.next;      
        	}
        	else{
        		flag=false;
        		break;
        	}
        }
       if(flag)return true;
       return false;
    }
public static void main(String[] args){
	ListNode[] ln=new ListNode[7];
	ln[0]=new ListNode(1);
	ln[1]=new ListNode(2);
	ln[2]=new ListNode(2);
	ln[3]=new ListNode(1);
	ln[4]=new ListNode(3);
	ln[5]=new ListNode(2);
	ln[6]=new ListNode(1);
	ln[0].next=ln[1];
	ln[1].next=ln[2];
	ln[2].next=ln[3];
	ln[3].next=null;
	ln[4].next=ln[5];
	ln[5].next=ln[6];
	ln[6].next=null;
	Solution s=new Solution();
	System.out.println(s.isPalindrome(ln[0]));
}
}
