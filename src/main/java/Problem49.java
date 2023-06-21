import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * 49. Group Anagrams
 * <p>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * <a href="https://leetcode.com/problems/group-anagrams/">...</a>
 */
public class Problem49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String lettersStr = new String(letters);
            List<String> list;
            if (!map.containsKey(lettersStr)){
                list = new ArrayList<>();
                map.put(lettersStr, list);
            } else {
                list = map.get(lettersStr);
            }
            list.add(strs[i]);
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}
