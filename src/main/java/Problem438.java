import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 438. Find All Anagrams in a String
 * <p>
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/">...</a>
 */
public class Problem438 {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return List.of();
        }
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();
        for (int j = 0; j < p.length(); j++) {
            int val = map.getOrDefault(p.charAt(j), 0) + 1;
            map.put(p.charAt(j), val);
            int wVal = windowMap.getOrDefault(s.charAt(j), 0) + 1;
            windowMap.put(s.charAt(j), wVal);
        }
        List<Integer> result = new ArrayList<>();
        if (isAnagram(map, windowMap)) {
            result.add(0);
        }
        for (int i = 1; i <= s.length() - p.length(); i++) {

            int prevVal = windowMap.get(s.charAt(i-1));
            windowMap.put(s.charAt(i-1), prevVal - 1);

            char substrEnd = s.charAt(i + p.length() - 1);
            int cur = windowMap.getOrDefault(substrEnd, 0);
            windowMap.put(substrEnd, cur + 1);

            if (isAnagram(map, windowMap)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isAnagram(Map<Character, Integer> map, Map<Character, Integer> window) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (!entry.getValue().equals(window.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
