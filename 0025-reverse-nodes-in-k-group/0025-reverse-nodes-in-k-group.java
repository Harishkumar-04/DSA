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

        ListNode groupStart=head;
        ListNode curr=head;
        ListNode prevTail=null;
        int cnt=0;
        while(curr!=null){
            cnt++;
            
            if(cnt%k==0){
                ListNode nextGroup=curr.next;
                curr.next=null;
                ListNode newHead=reverse(groupStart);
                if(groupStart==head){
                    head=newHead;
                }else{
                    prevTail.next=newHead;
                }
                groupStart.next=nextGroup;
                prevTail=groupStart;
                groupStart=nextGroup;
                curr=nextGroup;    
            }
            else{
                curr=curr.next;
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