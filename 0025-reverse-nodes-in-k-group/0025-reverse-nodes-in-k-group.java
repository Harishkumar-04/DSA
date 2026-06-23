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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp=head;
        ListNode kth=head;
        ListNode prevTail=null;
        int s=0;
        while(kth!=null){
            s++;
            
            if(s%k==0){
                ListNode nextGroup=kth.next;
                kth.next=null;
                ListNode newHead=reverse(temp);
                if(temp==head){
                    head=newHead;
                }else{
                    prevTail.next=newHead;
                }
                temp.next=nextGroup;
                prevTail=temp;
                temp=nextGroup;
                kth=nextGroup;    
            }
            else{
                kth=kth.next;
            }
        }
        return head;
    }
        
    ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}