package JUnit;

import Model.ProcessL;
import Model.VectorHeap;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Vector heap test.
 */
class VectorHeapTest {

    /**
     * Add.
     */
    @org.junit.jupiter.api.Test
    void add() {
        VectorHeap vectorHeap = new VectorHeap();
        ProcessL process1 = new ProcessL("ls", "xavier", "19");
        vectorHeap.add(process1);
        ProcessL expectedResult = process1;
        assertEquals(expectedResult, vectorHeap.getFirst());
    }

    /**
     * Remove.
     */
    @org.junit.jupiter.api.Test
    void remove() {
        VectorHeap vectorHeap = new VectorHeap();
        ProcessL process1 = new ProcessL("ls", "xavier", "19");
        ProcessL process2 = new ProcessL("cd", "nahomy", "-20");
        vectorHeap.add(process1);
        vectorHeap.add(process2);
        ProcessL expectedResult = process2;
        assertEquals(expectedResult, vectorHeap.remove());
    }

    /**
     * Gets first.
     */
    @org.junit.jupiter.api.Test
    void getFirst() {
        VectorHeap vectorHeap = new VectorHeap();
        ProcessL process1 = new ProcessL("ls", "xavier", "19");
        vectorHeap.add(process1);
        ProcessL expectedResult = process1;
        assertEquals(expectedResult, vectorHeap.getFirst());
    }

    /**
     * Is empty.
     */
    @org.junit.jupiter.api.Test
    void isEmpty() {
        VectorHeap vectorHeap = new VectorHeap<>();
        boolean expectedResult = true;
        assertEquals(expectedResult, vectorHeap.isEmpty());
    }

    /**
     * Size.
     */
    @org.junit.jupiter.api.Test
    void size() {
        VectorHeap vectorHeap = new VectorHeap();
        int expectedResult = 0;
        assertEquals(expectedResult, vectorHeap.size());

    }
}