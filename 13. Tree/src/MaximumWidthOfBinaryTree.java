import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

class Node14 {
    int key;
    Node14 left;
    Node14 right;

    Node14 (int x) {
        key = x;
        left = right = null;
    }
}

public class MaximumWidthOfBinaryTree {
    public static void main(String[] args) {
        Node14 root = new Node14(10);
        root.left = new Node14(20);
        root.right = new Node14(30);
        root.right.left = new Node14(25);
        root.right.right = new Node14(35);
        System.out.println(widthOfBinaryTree(root));
    }

    //  Time Complexity : O(n)
    //  Auxiliary Space : O(w)
    public static int widthOfBinaryTree(Node14 root) {
        if(root==null) {
            return 0;
        }
        int res = 0;
        Queue<Node14> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int count = queue.size();
            for(int i=0; i<count; i++) {
                Node14 curr = queue.poll();
                if(curr.left!=null) {
                    queue.add(curr.left);
                }
                if(curr.right!=null) {
                    queue.add(curr.right);
                }
            }
            res = Math.max(res, count);
        }
        return res;
    }
}
