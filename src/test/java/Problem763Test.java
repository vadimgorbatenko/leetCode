import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem763Test {
    private final Problem763 solver = new Problem763();

    @Test
    public void test1() {
        // The partition is "ababcbaca", "defegde", "hijhklij".
        assertEquals(List.of(9, 7, 8), solver.partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    public void test2() {
        // "eccbbbbdec"
        assertEquals(List.of(10), solver.partitionLabels("eccbbbbdec"));
    }
}