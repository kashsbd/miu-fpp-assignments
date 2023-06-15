public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        if (rear == arr.length - 1) {
            resize();
        }
        arr[rear++] = obj;

        if (front == -1) {
            front = 0;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int item = arr[front++];
        return item;
    }

    public boolean isEmpty() {
        return rear == 0 || front == rear;
    }

    public int size() {
        return (front == -1 && rear == 0) ? 0 : rear - front;
    }

    private void resize() {
        int newLen = arr.length * 2;
        int[] temp = new int[newLen];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    public String toString() {
        String strToPrint = "";
        for (int i = front; i < rear; i++) {
            strToPrint += arr[i] + " ";
        }
        return strToPrint;
    }

    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        q.enqueue(11);

        System.out.println(q);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        System.out.println(q);

        System.out.println("Peek: " + q.peek());

        System.out.println(q);
        System.out.println("Size: " + q.size());
    }
}
