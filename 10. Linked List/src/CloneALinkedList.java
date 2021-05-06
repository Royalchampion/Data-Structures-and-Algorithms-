class Node30 {
    int data;
    Node30 next;
    Node30 random;

    Node30(int x) {
        data = x;
        next = null;
        random = null;
    }
}

public class CloneALinkedList {
    public static void main(String[] args) {

    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(1)
    public static Node30 cloneLL(Node30 head) {
        Node30 curr = head;
        Node30 temp = null;

        //  Clone every nodes
        while (curr!=null) {
            temp = curr.next;
            curr.next = new Node30(curr.data);
            curr.next.next = temp;
            curr = temp;
        }

        //  Adjust the random pointers of the newly added node
        for (curr=head; curr!=null; curr=curr.next.next) {
            curr.next.random = (curr.random!=null) ? curr.random.next : null;
        }

        Node30 original = head;
        Node30 copy = head.next;
        temp = copy;

        //  Separate original and copied nodes
        while (original!=null && temp!=null) {
            original.next = (original.next!=null) ? original.next.next : original.next;
            copy.next = (copy.next!=null) ? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
        }
        return temp;
    }

    public static void printLL(Node30 head) {
        Node30 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
