class Node2 {
    int key;
    Node2 left;
    Node2 right;

    Node2(int x) {
        key = x;
        left=right=null;
    }
}

public class InorderTraversal {
    public static void main(String[] args) {
        Node2 root = new Node2(1);
        root.left = null;
        root.right = new Node2(2);
        root.right.left = new Node2(3);
        inOrder(root);
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(h)
    public static void inOrder(Node2 root) {
        if (root!=null) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }
}
