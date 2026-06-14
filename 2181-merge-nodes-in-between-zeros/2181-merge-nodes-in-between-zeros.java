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

 /*
class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode temp = head.next;
        ListNode prev = null;
        ListNode newHead = null;
        int sum = 0;
        while (temp != null) {
            if (temp.val != 0) {
                sum += temp.val;
            } else {
                ListNode n = new ListNode(sum);
                if (newHead == null) {
                    newHead = n;
                    prev = newHead;
                } else {
                    prev.next = n;
                    prev = n;
                }
                sum = 0;
            }
            temp = temp.next;
        }
        return newHead;
    }
}
*/

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode modify=head.next;
        ListNode temp=modify;

        while(temp!=null){
            int sum=0;
            while(temp.val!=0){
                sum+=temp.val;
                temp=temp.next;
            }
            modify.val=sum;
            temp=temp.next;
            modify.next=temp;
            modify=modify.next;   
        }
        return head.next;
    }
}
