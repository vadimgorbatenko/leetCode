import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem3Test {
    private final Problem3 substringFinder = new Problem3();

    @Test
    public void test1(){
        assertEquals(3, substringFinder.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2(){
        assertEquals(1, substringFinder.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3(){
        assertEquals(3, substringFinder.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test4(){
        assertEquals(0, substringFinder.lengthOfLongestSubstring(""));
    }

    @Test
    public void test5(){
        assertEquals(2, substringFinder.lengthOfLongestSubstring("ab"));
    }

    @Test
    public void test6(){
        assertEquals(4, substringFinder.lengthOfLongestSubstring("abc abc ac"));
    }
}