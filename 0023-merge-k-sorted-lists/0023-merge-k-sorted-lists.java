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
*/

/*
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length==0) return null;
        
        ListNode head=lists[0];
        
        for(int i=1;i<lists.length;i++){
            head=merge(head,lists[i]);
        }
        return head;
    }


    ListNode merge(ListNode list1, ListNode list2){
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                res.next=list1;
                list1=list1.next;
            }else{
                res.next=list2;
                list2=list2.next;
            }
            res=res.next;
        }
        if(list1==null) res.next=list2;
        else res.next=list1;

        return dummy.next;
    }
}
*/

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b) -> a.val-b.val);

        for(ListNode head:lists){
            if(head!=null){
                pq.add(head);
            }
        }

        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            temp.next=node;
            temp=temp.next;

            if(node.next!=null){
                pq.add(node.next);
            }
        }
        return dummy.next;
    }
}