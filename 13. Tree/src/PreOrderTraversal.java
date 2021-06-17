class Node3 {
    int key;
    Node3 left;
    Node3 right;

    Node3(int x) {
        key = x;
        left=right=null;
    }
}

public class PreOrderTraversal {
    public static void main(String[] args) {
        Node2 root = new Node2(10);
        root.left = new Node2(20);
        root.right = new Node2(30);
        root.right.left = new Node2(25);
        root.right.right = new Node2(35);
        preOrder(root);
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(h)
    public static void preOrder(Node2 root) {
        if (root!=null) {
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
