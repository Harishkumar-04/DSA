/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 /*
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> map=new HashMap<>();

        ListNode temp=headA;
        while(temp!=null){
            map.put(temp,1);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(map.containsKey(temp)) break;
            temp=temp.next;
        }
        return temp;
    }
}
*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA==null || headB==null) return null;

        ListNode tempA=headA, tempB=headB;

        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;

            if(tempA==tempB) return tempA;

            if(tempA==null) tempA=headB;
            if(tempB==null) tempB=headA;
        }
        return  tempA;
    }
}
