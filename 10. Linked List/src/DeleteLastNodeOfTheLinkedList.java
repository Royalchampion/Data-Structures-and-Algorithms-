class Node12 {
    int data;
    Node12 next;
    Node12 prev;

    Node12(int x) {
        data = x;
        next = null;
        prev = null;
    }
}

public class DeleteLastNodeOfTheLinkedList {
    public static void main(String[] args) {
        Node10 head = new Node10(10);
        Node10 temp1 = new Node10(20);
        Node10 temp2 = new Node10(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        print(head);
        head = deleteLast(head);
        print(head);
    }

    //  Time Complexity : O(1)
    //  Auxiliary Space : O(1)
    public static Node10 deleteLast(Node10 head) {
        if (head==null) {
            return null;
        }
        if (head.next==null) {
            return null;
        }
        Node10 curr = head;
        while (curr.next!=null) {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }

    public static void print(Node10 head) {
        Node10 temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

