
import java.util.ArrayList;
import java.util.List;


/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * <p>
 * <a href="https://leetcode.com/problems/fizz-buzz/">...</a>
 */
public class Problem412 {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";

    public List<String> fizzBuzz(int n) {
        List<String> fbList = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            fbList.add(getFizzbuzz(i));
        }
        return fbList;
    }

    private String getFizzbuzz(int i) {
        if (i % 15 == 0) {
            return FIZZBUZZ;
        }
        if (i % 5 == 0) {
            return BUZZ;
        }
        if (i % 3 == 0) {
            return FIZZ;
        }
        return String.valueOf(i);
    }
}
