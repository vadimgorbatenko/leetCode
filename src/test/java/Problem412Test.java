import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem412Test {
    private final Problem412 solver = new Problem412();

    @Test
    public void test3() {
        assertEquals(List.of("1", "2", "Fizz"), solver.fizzBuzz(3));
    }

    @Test
    public void test5() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), solver.fizzBuzz(5));
    }

    @Test
    public void test15() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
                "13", "14", "FizzBuzz"), solver.fizzBuzz(15));
    }

}