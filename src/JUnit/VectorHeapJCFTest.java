package JUnit;

import Model.ProcessL;
import Model.VectorHeapJCF;

import static org.junit.Assert.assertEquals;

class VectorHeapJCFTest {

    /**
     * Add.
     */
    @org.junit.jupiter.api.Test
    void add() {
        VectorHeapJCF vectorHeapJCF = new VectorHeapJCF<>();
        ProcessL process1 = new ProcessL("ls", "xavier", "19");
        vectorHeapJCF.add(process1);
        ProcessL expectedResult = process1;
        assertEquals(expectedResult, vectorHeapJCF.getFirst());
    }

    /**
     * Remove.
     */
    @org.junit.jupiter.api.Test
    void remove() {
        VectorHeapJCF vectorHeapJCF = new VectorHeapJCF<>();
        ProcessL process1 = new ProcessL("ls", "xavier", "19");
        ProcessL process2 = new ProcessL("cd", "nahomy", "-20");
        vectorHeapJCF.add(process1);
        vectorHeapJCF.add(process2);
        ProcessL expectedResult = process2;
        assertEquals(expectedResult, vectorHeapJCF.remove());
    }

    /**
     * Gets first.
     */
    @org.junit.jupiter.api.Test
    void getFirst() {
        VectorHeapJCF vectorHeapJCF = new VectorHeapJCF<>();
        ProcessL process1 = new ProcessL("ls", "xavier", "19");
        vectorHeapJCF.add(process1);
        ProcessL expectedResult = process1;
        assertEquals(expectedResult, vectorHeapJCF.getFirst());
    }

    /**
     * Is empty.
     */
    @org.junit.jupiter.api.Test
    void isEmpty() {
        VectorHeapJCF vectorHeapJCF = new VectorHeapJCF<>();
        boolean expectedResult = true;
        assertEquals(expectedResult, vectorHeapJCF.isEmpty());
    }

    /**
     * Size.
     */
    @org.junit.jupiter.api.Test
    void size() {
        VectorHeapJCF vectorHeapJCF = new VectorHeapJCF<>();
        int expectedResult = 0;
        assertEquals(expectedResult, vectorHeapJCF.size());

    }
}