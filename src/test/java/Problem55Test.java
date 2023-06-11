import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Problem55Test {
    private final Problem55 solver = new Problem55();

    @Test
    public void test1() {
        int[] way = {2, 3, 1, 1, 4};
        assertTrue(solver.canJump(way));
    }

    @Test
    public void test2() {
        int[] way = {3, 2, 1, 0, 4};
        assertFalse(solver.canJump(way));
    }

    @Test
    public void test3() {
        int[] way = {0};
        assertTrue(solver.canJump(way));
    }

    @Test
    public void test4() {
        int[] way = {2, 0};
        assertTrue(solver.canJump(way));
    }

    @Test
    public void test5() {
        int[] way = {2, 0, 0};
        assertTrue(solver.canJump(way));
    }

    @Test
    public void test6() {
        int[] way = new int[10000];
        way[0] = 9997;
        for (int i = 1; i < 10000; i++) {
            way[i] = 9998 - i;
        }
        way[9999] = 0;
        System.out.println(Instant.now());
        assertFalse(solver.canJump(way));
        System.out.println(Instant.now());
    }

    @Test
    public void test7() {
        int[] way = {1, 0, 4, 1, 4, 3, 0, 4};
        assertFalse(solver.canJump(way));
    }
}