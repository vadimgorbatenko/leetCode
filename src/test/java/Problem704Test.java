import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem704Test {
    private final Problem704 solver = new Problem704();

    @Test
    void test1(){
        assertEquals(4, solver.search(new int[]{-1,0,3,5,9,12},9));
    }
}