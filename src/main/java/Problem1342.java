/**
 * 1342. Number of Steps to Reduce a Number to Zero
 * <p>
 * Given an integer num, return the number of steps to reduce it to zero.
 * In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 * <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/">...</a>
 */
public class Problem1342 {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }
}
