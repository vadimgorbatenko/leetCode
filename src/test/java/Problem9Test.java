import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem9Test {
    private final Problem9 palindromeChecker = new Problem9();

    @Test
    public void test() {
        assertTrue(palindromeChecker.isPalindrome(1410110141));
        assertTrue(palindromeChecker.isPalindrome(1));
        assertTrue(palindromeChecker.isPalindrome(0));
        assertTrue(palindromeChecker.isPalindrome(121));
        assertFalse(palindromeChecker.isPalindrome(123));
        assertFalse(palindromeChecker.isPalindrome(-121));
        assertFalse(palindromeChecker.isPalindrome(10));
        assertTrue(palindromeChecker.isPalindrome(1001));
        assertTrue(palindromeChecker.isPalindrome(1111111));
        assertTrue(palindromeChecker.isPalindrome(111111));
        assertFalse(palindromeChecker.isPalindrome(111211));
        assertTrue(palindromeChecker.isPalindrome(1112111));
        assertTrue(palindromeChecker.isPalindrome(17371));
    }
}
