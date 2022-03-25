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
    public ListNode deleteDuplicates(ListNode head) {
   
        ListNode prev = new ListNode();
        ListNode point = prev;
        ListNode initialPoint = point;
        ListNode curr = head;
        if (head == null){
            return head;
        }
        prev.val = head.val;
        while(prev != null){
            if(prev.next == null && curr == null){
                break;
            }
            else if((prev.val != curr.val)) {
                ListNode insert = new ListNode();
                insert.val = curr.val;
                point.next = insert;
                point = insert;
                
            }
            prev = curr;
            curr = curr.next;
            
        }
        return initialPoint;
    }
}