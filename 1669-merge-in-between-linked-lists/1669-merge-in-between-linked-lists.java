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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;
        ListNode beforeA=null;
        ListNode afterB=null;
        int cnt=0;

        while(temp1!=null){

            if(cnt==a-1){
                beforeA=temp1;
            }

            if(cnt==b){
                afterA=temp1.next;
                break;
            }
            
            temp1=temp1.next;
            cnt++;
        }
        beforeA.next=list2;
        ListNode temp2=list2;

        while(temp2.next!=null){
            temp2=temp2.next;
        }

        temp2.next=afterB;

        return list1;
    }
}

*/

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode left=list1;
        ListNode right=list1;
        
        for(int i=1;i<a;i++){
            left=left.next;
        }
        for(int i=1;i<=b;i++){
            right=right.next;
        }

        left.next=list2;
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=right.next;

        return list1;
    }
}