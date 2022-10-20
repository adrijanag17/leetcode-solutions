import java.util.Stack;

public class SameTree {

    // using recursion
    public static boolean isSameTree(TreeNode p, TreeNode q){

        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }

        if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }       // T: O(n) S: O(n)

    // iterative method
    public static boolean isSameTree2(TreeNode p, TreeNode q){

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;   // this will not accidentally return false in case both are null because that is taken care of in the previous if statement

        if (p.val != q.val) return false;
        Stack<TreeNode> pNodes = new Stack<>();
        Stack<TreeNode> qNodes = new Stack<>();
        pNodes.push(p);
        qNodes.push(q);

        while(!pNodes.isEmpty() && !qNodes.isEmpty()){
            TreeNode tmp1 = pNodes.pop();
            TreeNode tmp2 = qNodes.pop();
            if (tmp1.left != null && tmp2.left != null){
                pNodes.push(tmp1.left);
                qNodes.push(tmp2.left);
            } else if (tmp1.left != null || tmp2.left != null){
                return false;
            }
            if (tmp1.right != null && tmp2.right != null){
                pNodes.push(tmp1.right);
                qNodes.push(tmp2.right);
            } else if (tmp1.right != null || tmp2.right != null){
                return false;
            }
        }
        if (!pNodes.isEmpty() || !qNodes.isEmpty()) return false;
        return true;
    }       // T:O(n) S: O(n)
}
