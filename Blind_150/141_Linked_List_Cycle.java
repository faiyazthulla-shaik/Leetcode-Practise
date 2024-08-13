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
        HashSet<ListNode> hashMap = new HashSet();
        while(head != null){
            if(!hashMap.contains(head)){
                hashMap.add(head);
                head = head.next;
            } else{
                return true;
            }
        }
        return false;
    }
}

//Time complexity: O(n)
//Time complexity: O(n) -- The space depends on the number of elements added to the hash table, which contains at most n elements.
