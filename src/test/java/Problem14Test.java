import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem14Test {
    private final Problem14 problem14 = new Problem14();

    @Test
    public void test1() {
        String[] strs = {"", ""};
        assertEquals("", problem14.longestCommonPrefix(strs));
    }

    @Test
    public void test2() {
        String[] strs = {"a", "b"};
        assertEquals("", problem14.longestCommonPrefix(strs));
    }

    @Test
    public void test3() {
        String[] strs = {"aa", "ab"};
        assertEquals("a", problem14.longestCommonPrefix(strs));
    }

    @Test
    public void test4() {
        String[] strs = {"flower","flow","flight"};
        assertEquals("fl", problem14.longestCommonPrefix(strs));
    }

    @Test
    public void test5() {
        String[] strs = {"ab", "a"};
        assertEquals("a", problem14.longestCommonPrefix(strs));
    }

    @Test
    public void test6() {
        String[] strs = {"aaa", "aa", "aaa"};
        assertEquals("aa", problem14.longestCommonPrefix(strs));
    }

    @Test
    public void test7() {
        String[] strs = {"abab","aba",""};
        assertEquals("", problem14.longestCommonPrefix(strs));
    }
}