class NewNode {
    int data;
    NewNode next;

    NewNode(int x) {
        data = x;
        next = null;
    }
}

public class TraverseALinkedList {
    public static void main(String[] args) {
        NewNode head = new NewNode(10);
        head.next = new NewNode(20);
        head.next.next = new NewNode(30);
        head.next.next.next = new NewNode(40);
        print(head);
    }

    public static void print(NewNode head) {
        NewNode curr = head;
        while (curr!=null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
