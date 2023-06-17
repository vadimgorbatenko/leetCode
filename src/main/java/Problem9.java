/**
 * 9. Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is a palindrome while 123 is not.
 * <p>
 * <a href="https://leetcode.com/problems/palindrome-number/">...</a>
 */
public class Problem9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        int length = 0;
        long max_val = 1;
        while (max_val <= x) {
            max_val *= 10;
            length++;
        }

        int[] values = new int[length];
        for (int i = 0; i < length; i++) {
            values[i] = (x % 10);
            x = x / 10;
        }

        for (int i = 0; i < length / 2; i++) {
            if (values[i] != values[length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
