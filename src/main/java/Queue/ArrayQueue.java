package Queue;

public class ArrayQueue implements Queue {
    private Object[] queue;
    private int front, rear;

    public ArrayQueue(int length) {
        queue = new Object[10];
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }
}
