import javax.swing.tree.TreeNode;

class Node13 {
    int key;
    Node13 left;
    Node13 right;

    Node13 (int x) {
        key = x;
        left = right = null;
    }
}

public class CheckForBalancedTree {
    public static void main(String[] args) {
        Node13 root = new Node13(10);
        root.left = new Node13(20);
        root.right = new Node13(30);
        root.right.left = new Node13(25);
        root.right.right = new Node13(35);
        System.out.println(isBalanced(root));
    }

    //  Time Complexity : O(n*n)
    //  Auxiliary Space : O(h)
    public static boolean isBalanced(Node13 root) {
        if(root==null) {
            return true;
        }
        return ((Math.abs(height(root.left)-height(root.right))<=1) && isBalanced(root.left) &&                 isBalanced(root.right));
    }

    public static int height(Node13 root) {
        if (root==null) {
            return 0;
        }
        else {
            return Math.max(height(root.left), height(root.right))+1;
        }
    }
}
