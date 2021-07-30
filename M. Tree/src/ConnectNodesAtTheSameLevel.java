import java.util.LinkedList;
import java.util.Queue;

class Node24 {
    int key;
    Node24 left;
    Node24 right;
    Node24 next;

    Node24(int val) {
        key = val;
        left = right =  next = null;
    }
}

public class ConnectNodesAtTheSameLevel {
    //  Time Complexity : O(n)
    //  Auxiliary Space : O(w)
    public Node24 connect(Node24 root) {
        if(root==null) return null;
        Queue<Node24> queue = new LinkedList<>();
        queue.add(root);
        Node24 curr = null;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                Node24 prev = curr;
                curr = queue.poll();
                if(i>0) {
                    prev.next = curr;
                }
                if(curr.left!=null) {
                    queue.add(curr.left);
                }
                if(curr.right!=null) {
                    queue.add(curr.right);
                }
            }
            curr.next = null;
        }
        return root;
    }
}
