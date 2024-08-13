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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int sizeOfQueue = queue.size();
            List<Integer> current_level = new ArrayList();
            for(int i=0; i<sizeOfQueue; i++){
                TreeNode current_node = queue.remove();
                current_level.add(current_node.val);
                if(current_node.left != null){
                    queue.add(current_node.left);
                }
                if(current_node.right != null){
                    queue.add(current_node.right);
                }
            }
            result.add(current_level);
        }
        return result;
    }
}

//Time complexity: O(n)
//Space complexity: O(n)
