/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<Integer> inOrderList = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, inOrderList);
        return inOrderList.get(k-1);
    }

    public void inOrder(TreeNode root, List<Integer> inOrderList){
        if(root == null) return ;
        inOrder(root.left, inOrderList);
        inOrderList.add(root.val);
        inOrder(root.right, inOrderList);
    }
}
//Time complexity: O(n)
//Space complexity: O(n)
