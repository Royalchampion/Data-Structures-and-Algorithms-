class Node29 {
    int data;
    Node29 next;

    Node29(int x) {
        data = x;
        next = null;
    }
}

public class SwapNodesInLinkedList {
    public static void main(String[] args) {
        Node29 head = new Node29(10);
        head.next = new Node29(20);
        head.next.next = new Node29(30);
        head.next.next.next = new Node29(40);
        head.next.next.next.next = new Node29(50);
        printlist(head);
        head = swap(head);
        printlist(head);
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(1)
    public static Node29 swap(Node29 head) {
        if (head==null || head.next==null) {
            return head;
        }
        Node29 curr = head.next.next;
        Node29 prev = head;
        head = head.next;
        head.next = prev;
        while (curr!=null && curr.next!=null) {
            prev.next = curr.next;
            prev = curr;
            Node29 next = curr.next.next;
            curr.next.next = curr;
            curr = next;
        }
        prev.next = curr;
        return head;
    }

    public static void printlist(Node29 head){
        Node29 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
