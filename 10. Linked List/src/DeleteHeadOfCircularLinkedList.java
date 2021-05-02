class Node17 {
    int data;
    Node17 next;

    Node17(int x) {
        data = x;
        next = null;
    }
}

public class DeleteHeadOfCircularLinkedList {
    public static void main(String[] args) {

    }

    public static Node17 deleteLL(Node17 head, int x) {
        if (head==null) {
            return null;
        }
        if (head.next==null) {
            return null;
        }
        Node17 curr = new Node17(x);
        while(curr.next!=head) {
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }
}
