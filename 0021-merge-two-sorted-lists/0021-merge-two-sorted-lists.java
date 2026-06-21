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