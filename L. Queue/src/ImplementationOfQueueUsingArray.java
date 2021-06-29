//  All these operations happen in O(1) time.
class Queue {
    int front;
    int rear;
    int capacity;
    int size;
    int[] array;

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull() {
        return (size==capacity);
    }

    boolean isEmpty() {
        return (size==0);
    }

    int getFront() {
        if (isEmpty()) {
            return -1;
        }
        else {
            return front;
        }
    }

    int getRear() {
        if (isEmpty()) {
            return -1;
        }
        else {
            return (front+size-1)%capacity;
        }
    }

    void enqueue(int item) {
        if (isFull()) {
            return;
        }
        rear = getRear();
        rear = (rear + 1)%capacity;
        array[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue.");
    }

    void deque() {
        if (isEmpty()) {
            return;
        }
        front = (front + 1)%capacity;
        size--;
    }
}

public class ImplementationOfQueueUsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
        queue.deque();
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
    }
}
