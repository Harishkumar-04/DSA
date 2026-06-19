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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }

        temp=head;
        while(temp!=null){
            if(st.peek()!=temp.val) return false;
            temp=temp.next;
            st.pop();
        }
        return true;
    }
}

*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;        
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
}