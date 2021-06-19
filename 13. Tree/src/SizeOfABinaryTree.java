class Node9 {
    int key;
    Node9 left;
    Node9 right;

    Node9 (int x) {
        key = x;
        left=right=null;
    }
}

public class SizeOfABinaryTree {
    public static void main(String[] args) {
        Node9 root = new Node9(10);
        root.left = new Node9(20);
        root.right = new Node9(30);
        root.right.left = new Node9(25);
        root.right.right = new Node9(35);
        System.out.println(height(root));
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(h)
    public static int height(Node9 root) {
        if (root==null) {
            return 0;
        }
        else {
            return (height(root.left)+height(root.right)+1);
        }

    }
}
