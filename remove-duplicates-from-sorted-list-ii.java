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

// Running time: O(n)
// Additional space: O(1)
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode prev = new ListNode();
        ListNode dummyHead = prev;
        
        while (head != null && head.next != null) {
            // Duplicate found
            if (head.val == head.next.val) {
                int dupeVal = head.val;
                while (head.next != null && head.val == dupeVal) {
                    head = head.next;
                }
                // End of list and no distinct val found
                if (head.val == dupeVal) {
                    prev.next = null;
                    return dummyHead.next;
                }
                // Found distinct val
                prev.next = head;
            }
            // No duplicate found
            else {
                prev.next = head;
                prev = prev.next;
                if (head.next != null) {
                    head = head.next;
                }
            }
        }
        return dummyHead.next;
    }
}
