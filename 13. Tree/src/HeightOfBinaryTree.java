import javax.swing.tree.TreeNode;

public class HeightOfBinaryTree {
    //  Time Complexity : O(n)
    //  Auxiliary Space : O(h)
    public int maxDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        else {
            return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
        }
    }
}
