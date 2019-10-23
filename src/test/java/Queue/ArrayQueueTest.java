package Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {

    ArrayQueue queue;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        queue = new ArrayQueue(2);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void ThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayQueue queue = new ArrayQueue(5);
        })
    }
}