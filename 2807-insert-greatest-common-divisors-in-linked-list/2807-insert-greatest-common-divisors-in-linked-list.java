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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null){
            for(int i=Math.min(temp.val,temp.next.val);i>=1;i--){
                if(temp.val%i==0 && temp.next.val%i==0){
                    ListNode n=new ListNode(i, temp.next);
                    temp.next=n;
                    break;
                }
            }
            temp=temp.next.next;        
        }
        return head;
        
    }
}