class Node {
    int key;
    Node left;
    Node right;

    Node(int x) {
        key = x;
        left = right = null;
    }
}

public class SearchOperation {
    public static void main(String[] args) {
        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);
        if (search(root, 3)) {
            System.out.print("Found!");
        }
        else {
            System.out.print("It's not here.");
        }
    }

    public static boolean search(Node root, int x) {
        if (root==null) {
            return false;
        }
        if (root.key==x) {
            return true;
        }
        if (root.key>x) {
            return search(root.left, x);
        }
        else {
            return search(root.right, x);
        }
    }
}
