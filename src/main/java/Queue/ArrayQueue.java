package Queue;

import java.awt.geom.Area;

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
        return front == rear && (queue[front] == null);
    }

    public Object getFrontElement() {
        return queue[front];
    }

    public Object getRearElement() {
        return queue[rear - 1];
    }

    public void put(Object payload) {
        if (queue[rear] == null) {
            queue[rear] = payload;
            rear += 1;
            rear = rear % queue.length;
        }
        else {
            throw new IllegalArgumentException("Queue full!");
        }
    }

    public Object remove() {
        if (isEmpty()) {
            return null;
        }
        else {
            Object reObject = queue[front];
            queue[front] = null;

            return reObject;
        }
    }
}
