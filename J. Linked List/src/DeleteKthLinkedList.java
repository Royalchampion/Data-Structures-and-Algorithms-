class Node18 {
    int data;
    Node18 next;

    Node18(int x) {
        data = x;
        next = null;
    }
}

public class DeleteKthLinkedList {
    public static void main(String[] args) {

    }

    //  Time Complexity : O(n)
    public static Node18 deleteKth(Node18 head, int pos) {
        if (head==null) {
            return null;
        }
        if (pos==1) {
            return deleteHead(head, 1);
        }
        Node18 curr = head;
        for (int i=0; i<pos-2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static Node18 deleteHead(Node18 head, int x) {
        if (head==null) {
            return null;
        }
        if (head.next==null) {
            return null;
        }
        Node18 curr = new Node18(x);
        while(curr.next!=head) {
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }
}
