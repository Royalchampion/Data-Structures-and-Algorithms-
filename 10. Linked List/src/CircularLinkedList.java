class Node11 {
    int data;
    Node11 next;
    Node11(int d){
        data=d;
        next=null;
    }
}

public class CircularLinkedList {
    public static void main(String args[]) {
        Node head=new Node(10);
        head.next=new Node(5);
        head.next.next=new Node(20);
        head.next.next.next=new Node(15);
        head.next.next.next.next=head;

    }
}
