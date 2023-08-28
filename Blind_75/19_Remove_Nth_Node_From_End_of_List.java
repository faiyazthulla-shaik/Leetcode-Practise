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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummy = new ListNode(-1);
      dummy.next = head;

      ListNode curr = head;
      int count = 0;
      
      while(curr!=null){
         count++;
         curr = curr.next;
      }

      count = count-n;
      curr = dummy;
      for(int i=0; i<count; i++){
         curr = curr.next;
      }

      curr.next = curr.next.next;

      return dummy.next;
   }
}

//Time complexity: O(L) -- The algorithm makes two traversal of the list, first to calculate list length L and second to find the (L−n)th node. There are 2L−n operations and time complexity is O(L).

//Space complexity: O(1)
