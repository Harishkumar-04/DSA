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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;
        ListNode ath=null;
        ListNode bth=null;
        int cnt=0;

        while(temp1!=null){

            if(cnt==a-1){
                ath=temp1;
            }

            if(cnt==b){
                bth=temp1.next;
                break;
            }
            
            temp1=temp1.next;
            cnt++;
        }
        ath.next=list2;
        ListNode temp2=list2;

        while(temp2.next!=null){
            temp2=temp2.next;
        }

        temp2.next=bth;

        return list1;
    }
}
