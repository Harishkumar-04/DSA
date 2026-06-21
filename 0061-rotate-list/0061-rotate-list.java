/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(k==0) return head;
        ListNode tail=head;
        int n=1;
        while(tail.next!=null){
            n++;
            tail=tail.next;
        }
        k=k%n;
        if(k==0) return head;
        int l=n-k;
        ListNode temp=head;
        while(temp!=null){
            l--;
            if(l==0){
                tail.next=head;
                head=temp.next;
                temp.next=null;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}