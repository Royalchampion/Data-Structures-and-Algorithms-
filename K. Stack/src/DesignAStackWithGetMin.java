import java.util.Stack;

//  Time Complexity : O(1)
//  Auxiliary Space : O(1)
class MyStack {
    Stack<Integer> stack;
    int min;

    MyStack() {
        stack = new Stack<>();
    }

    void push(int x) {
        if (stack.isEmpty()) {
            min = x;
            stack.add(x);
        }
        else if (x<=min) {
            stack.add(2*x-min);
            min = x;
        }
        else {
            stack.add(x);
        }
    }

    int pop() {
       int t = stack.peek();
       stack.pop();
       if (t<=min) {
           int res = min;
           min = 2*min-t;
           return res;
       }
       else {
           return t;
       }
    }

    int peek() {
        int t = stack.peek();
        return ((t<=min)?min:t);
    }

    int getMin() {
        return min;
    }
}

public class DesignAStackWithGetMin {
    public static void main(String[] args) {
        MyStack stack=new MyStack();;
        stack.push(4);
        stack.push(5);
        stack.push(8);
        stack.push(1);
        stack.pop();
        System.out.print(" Minimum Element from Stack: " + stack.getMin() );
    }
}
