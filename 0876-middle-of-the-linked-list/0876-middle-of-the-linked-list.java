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
    public ListNode middleNode(ListNode head) {
        
        
        int counter = 0;
        
        for(ListNode x = head; x != null; x = x.next){
           counter++; 
        }
        
        ListNode current = head;
        
        for(int i = 0; i < counter/2; i++){
            current = current.next;
        }
       return current; 
    }
}