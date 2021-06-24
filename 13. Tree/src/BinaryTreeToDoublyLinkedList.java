class Node15 {
    int key;
    Node15 left;
    Node15 right;

    Node15(int x) {
        key = x;
        left = right = null;
    }
}

public class BinaryTreeToDoublyLinkedList {
    public static void main(String[] args) {
        Node15 root = new Node15(10);
        root.left = new Node15(20);
        root.right = new Node15(30);
        root.right.left = new Node15(25);
        root.right.right = new Node15(35);

    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(h)
    static Node15 prev = null;
    public static Node15 BinaryTreeToDoublyLinkedList(Node15 root) {
        if (root==null) {
            return root;
        }
        Node15 head = BinaryTreeToDoublyLinkedList(root.left);
        if (prev==null) {
            head = root;
        }
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BinaryTreeToDoublyLinkedList(root.right);
        return head;
    }
}
