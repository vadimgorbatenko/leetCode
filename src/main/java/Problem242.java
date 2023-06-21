import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 * <p>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * <a href="https://leetcode.com/problems/valid-anagram/">...</a>
 */
public class Problem242 {

    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length()){
            return false;
        }
        int[] letters = new int[26];
        for(int i = 0; i<s.length(); i++){
            char cs = s.charAt(i);
            letters[(int)cs - 97]++;

            char ct = t.charAt(i);
            letters[(int)ct - 97]--;
        }

        for(int i : letters){
            if(i != 0){
                return false;
            }
        }
        return true;
    }


    // slow solution
//    public boolean isAnagram(String s, String t) {
//        if(s == null || t == null || s.length() != t.length()){
//            return false;
//        }
//        Map<Character, Integer> map = new HashMap<>();
//        for(int i = 0; i<s.length(); i++){
//            Character cs = s.charAt(i);
//            int counterS = map.getOrDefault(cs, 0);
//            map.put(cs, ++counterS);
//
//            Character ct = t.charAt(i);
//            int counterT = map.getOrDefault(ct, 0);
//            map.put(ct, --counterT);
//        }
//
//        for(Map.Entry<Character, Integer> entry : map.entrySet()){
//            if(entry.getValue() != 0){
//                return false;
//            }
//        }
//        return true;
//    }
}
