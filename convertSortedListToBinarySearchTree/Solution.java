package convertSortedListToBinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		if(head==null)return null;
        return creatBST(head, null);
    }
	public TreeNode creatBST(ListNode head,ListNode tail){
		ListNode slow=head;
		ListNode fast=head;
		if(head==tail)return null;
		while(fast!=tail&&fast.next!=tail){
			slow=slow.next;
			fast=fast.next.next;
		}
		TreeNode root=new TreeNode(slow.val);
		root.left=creatBST(head, slow);
		root.right=creatBST(slow.next, tail);
		return root;
	}
	public static void main(String[] args){
		ListNode[] ln=new ListNode[5];
		ln[0]=new ListNode(-10);
		ln[1]=new ListNode(-3);
		ln[2]=new ListNode(0);
		ln[3]=new ListNode(5);
		ln[4]=new ListNode(9);

		ln[0].next=ln[1];
		ln[1].next=ln[2];
		ln[2].next=ln[3];
		ln[3].next=ln[4];
		
		Solution s=new Solution();
		TreeNode root=s.sortedListToBST(ln[0]);
		
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		 queue.offer(root);
		 while (!queue.isEmpty()) {
				TreeNode tempNode=queue.poll();
				System.out.print(tempNode.val+" ");
				if(tempNode.left!=null)queue.offer(tempNode.left);
				if(tempNode.right!=null)queue.offer(tempNode.right);			
		}
	}
}
