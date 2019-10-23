package Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {

    ArrayQueue queue;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        queue = new ArrayQueue(10);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void ThrowException(){
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayQueue queueWe = new ArrayQueue(0);
        });
    }

    @Test
    void getFrontElement() {
        queue.put("Haus");
        queue.put(4);
        queue.put("Cat");
    }

    @Test
    void getRearElement() {
        queue.put("Haus");
        queue.put(4);
        queue.put("Cat");
    }

    @Test
    void put() {
        queue.put(1);
        assertEquals(1, queue.getRearElement());
    }

    @Test
    void remove() {
        queue.put(1);
        queue.remove();
        queue.isEmpty();
    }

    @Test
    void full() {
        queue.put(1);
        queue.put(2);
        queue.put(3);
        queue.put(4);
        queue.put(5);
        queue.put(6);
        queue.put(7);
        queue.put(8);
        queue.put(9);
        queue.put(10);
        queue.put(11);
        assertEquals(10, queue.getRearElement());
    }
}