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
  public void reorderList(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    ListNode head_s = slow;
    ListNode prev = null;
    while(head_s!=null){
      ListNode temp = head_s.next;
      head_s.next = prev;
      prev = head_s;
      head_s = temp;
    }
    ListNode first = head;
    ListNode second = prev;
    ListNode someTemp;
    while(second.next!=null){
      someTemp = first.next;
      first.next = second;
      first = someTemp;

      someTemp = second.next;
      second.next = first;
      second = someTemp;
    }
  }
}
