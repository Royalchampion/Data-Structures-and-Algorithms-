class Node12 {
    int key;
    Node12 left;
    Node12 right;

    Node12 (int x) {
        key = x;
        left = right = null;
    }
}

public class ChildrenSum {
    public static void main(String[] args) {
        Node11 root = new Node11(10);
        root.left = new Node11(20);
        root.right = new Node11(30);
        root.right.left = new Node11(25);
        root.right.right = new Node11(35);
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(h)
    public static boolean check(Node12 root) {
        if (root==null) {
            return true;
        }
        if (root.left==root.right) {
            return true;
        }
        int sum = 0;
        if (root.left!=null) {
            sum += root.left.key;
        }
        if (root.right!=null) {
            sum += root.right.key;
        }
        return (sum==root.key && check(root.left) && check(root.right));
    }
}
