import javax.swing.tree.TreeNode;

class Node6 {
    int val;
    Node6 left;
    Node6 right;

    Node6(int x) {
        val = x;
        left = right = null;
    }
}

public class CheckForBST {
    Node6 prev = null;
    public boolean isValidBST(Node6 root) {
        if(root==null) {
            return true;
        }
        if(isValidBST(root.left) && (prev==null || root.val > prev.val)) {
            prev = root;
            return isValidBST(root.right);
        }
        return false;
    }
}
