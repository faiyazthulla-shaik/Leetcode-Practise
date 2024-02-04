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
    int preOrderIndex = 0;
    HashMap<Integer, Integer> inOrderHashMap = new HashMap<>(); 
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i<inorder.length; i++){
            inOrderHashMap.put(inorder[i], i);
        }
        return arrayToTree(preorder, 0, inorder.length-1);
    }

    public TreeNode arrayToTree(int[] preorder, int left, int right){
        if(left>right) return null;
        int rootValue = preorder[preOrderIndex++];

        TreeNode root = new TreeNode(rootValue);
        root.left = arrayToTree(preorder, left, inOrderHashMap.get(rootValue)-1);
        root.right = arrayToTree(preorder, inOrderHashMap.get(rootValue)+1, right);
        return root;
    }
}

//Time complexity: O(N)
//Space complexity: O(N)