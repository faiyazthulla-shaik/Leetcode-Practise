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
    public List<Integer> inOrderList = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        inOrder(root, inOrderList);

        int prev = inOrderList.get(0);
        for(int i=1; i<inOrderList.size(); i++){
            if(prev >= inOrderList.get(i)){
                return false;
            }
            prev = inOrderList.get(i);
        }
        return true;
    }

    public void inOrder(TreeNode root, List<Integer> inOrderList){
        if(root==null) return ;
        inOrder(root.left, inOrderList);
        inOrderList.add(root.val);
        inOrder(root.right, inOrderList);
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
