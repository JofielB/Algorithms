public class CircularQueue {
    int[] queue;
    int front;
    int rear;
    int size;
    boolean first = true;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public CircularQueue(int k) {
        queue = new int[k];
        front = 0;
        rear = 0;
        size = k;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (size <= 0) return false;
        if(first){
            queue[front] = value;
            first = false;
            return true;
        }else {
            int nextRear = rear + 1 >= size ? 0 : rear + 1;
            System.out.println(nextRear);
            if (nextRear == front) {
                return false;
            } else {
                queue[nextRear] = value;
                rear = nextRear;
                return true;

            }
        }
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (size <= 0) return false;
        if (front == rear && !first){
            queue[front] = -1;
            first = true;
            return true;
        }
        if (front == rear ) return false;
        queue[front] = -1;
        front = front + 1 >= size ? 0 : front + 1;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        return queue[front];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        return queue[rear];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return queue[front] == -1;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        int nextRear = rear + 1 >= size - 1 ? 0 : rear + 1;
        return nextRear == front;
    }

    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue(5);
        boolean param_1 = obj.enQueue(1);
        boolean param_2 = obj.deQueue();
        int param_3 = obj.Front();
        int param_4 = obj.Rear();
        boolean param_5 = obj.isEmpty();
        boolean param_6 = obj.isFull();
    }
    /**
     * Your MyCircularQueue object will be instantiated and called as such:
     * MyCircularQueue obj = new MyCircularQueue(k);
     * boolean param_1 = obj.enQueue(value);
     * boolean param_2 = obj.deQueue();
     * int param_3 = obj.Front();
     * int param_4 = obj.Rear();
     * boolean param_5 = obj.isEmpty();
     * boolean param_6 = obj.isFull();
     */
}
