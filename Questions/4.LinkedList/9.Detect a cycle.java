/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
    
      
      if (head == null || head.next == null){
        return false ; 
      }
      
      
      ListNode slow = head ; 
      ListNode fast = head  ;
 
      
      if (head.next.next == null ){
        return false ; 
      }
      
      int count = 0 ; 
      
      while((slow != fast && fast.next != null && fast.next.next != null) || (count == 0)){
        slow = slow.next ; 
        fast = fast.next.next ;
        count++ ;   
        
     
        
      }
      
      if(slow == fast){
        return true ; 
      }
      
      return false  ; 
      
      
    }
  

}