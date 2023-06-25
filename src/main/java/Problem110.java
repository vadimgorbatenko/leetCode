/**
 * 110. Balanced Binary Tree
 * <p>
 * Given a binary tree, determine if it is height-balanced (A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.)
 * <p>
 * <a href="https://leetcode.com/problems/balanced-binary-tree/description/">...</a>
 */
public class Problem110 {
    boolean isBalanced=true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        depth(root);
        return isBalanced;
    }

    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if(Math.abs(left-right) > 1){
            isBalanced = false;
        }
        return Math.max(left, right) + 1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
