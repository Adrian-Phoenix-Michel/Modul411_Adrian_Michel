package Queue;

public class ArrayQueue implements Queue {
    private Object[] queue;
    private int front, rear;

    public ArrayQueue() {
        this(10);
    }

    public ArrayQueue(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException
                    ("Capacity must be >= 1");
        }
        queue = new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }
}
