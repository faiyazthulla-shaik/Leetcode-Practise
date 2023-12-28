/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>root.val&&q.val>root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        if(p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}

//Time complexity: O(N)
//Space complexity: O(N)

/*
Algorithm:
1. Start traversing from the root node. 
2. If both the nodes p and q are on the right side of the subtree, then continue the search with right substree starting step 1. 
3. If both the nodes p and q are on the left side of the subtree, then continue the search with left subtree starting step 1.
4. If the both step 2 and step 3 are not true, this means we have found the node which is common to node p's and q's.
and hence we return this common node as LCA. 
*/