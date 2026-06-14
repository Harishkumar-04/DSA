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
    public ListNode mergeNodes(ListNode head) {

        ListNode temp=head;
        ListNode prev=null;
        ListNode newHead=null;
        int sum=0;
        while(temp.next!=null){
            sum+=temp.val;
            if(temp.next.val==0){
                ListNode n=new ListNode(sum);
                if(newHead==null){
                    newHead=n;
                    prev=newHead;
                    sum=0;
                }
                else{
                    prev.next=n;
                    prev=n;
                } 
                sum=0;    
            }
            temp=temp.next;             
        }
        return newHead;
    }
}