class Node4 {
    int key;
    Node4 left;
    Node4 right;

    Node4(int x) {
        key = x;
        left=right=null;
    }
}

public class PostOrderTraversal {
    public static void main(String[] args) {
        Node4 root = new Node4(10);
        root.left = new Node4(20);
        root.right = new Node4(30);
        root.right.left = new Node4(25);
        root.right.right = new Node4(35);
        postOrder(root);
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(h)
    public static void postOrder(Node4 root) {
        if (root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + " ");
        }
    }
}
