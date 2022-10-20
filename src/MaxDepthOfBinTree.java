public class MaxDepthOfBinTree {
    // using recursion to do DFS
    public static int maxDepth (TreeNode root){
        if (root == null) return 0;
        int leftDepth = 0;
        int rightDepth = 0;

        // the following if statements not necessary as the base case will take care of the null cases
//        if (root.left == null && root.right == null) return 1;
//        if (root.left != null){
        leftDepth = maxDepth(root.left);
//        }
//        if (root.right != null){
        rightDepth = maxDepth(root.right);
//        }
        return Math.max(leftDepth, rightDepth)+1;
    }       // T: O(n) S: O(d) d is the max depth of the tree and n is the total number of nodes
}
