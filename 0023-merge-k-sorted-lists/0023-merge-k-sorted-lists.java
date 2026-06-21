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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> ans=new ArrayList<>();

        for(ListNode list:lists){
            while(list!=null){
                ans.add(list.val);
                list=list.next;
            }
        }

        Collections.sort(ans);

        if (ans.size()==0) return null;

        ListNode head=new ListNode(ans.get(0));
        ListNode temp=head;
        for(int i=1;i<ans.size();i++){
            temp.next=new ListNode(ans.get(i));
            temp=temp.next;
        }
        return head;
    }
}