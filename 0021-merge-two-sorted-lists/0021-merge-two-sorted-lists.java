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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list=new ArrayList<>();

        ListNode temp=list1;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        temp=list2;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        if (list.size()==0) return null;

        Collections.sort(list);
        ListNode head=new ListNode(list.get(0));
        temp=head;
        for(int i=1;i<list.size();i++){
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
        }
        return head;
    }
}
*/

 class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
            }else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1==null){
            temp.next=list2;
        }else{
            temp.next=list1;
        }
        return dummy.next;
    }
}