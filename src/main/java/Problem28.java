/**
 * 28. Find the Index of the First Occurrence in a String
 * <p>
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/">...</a>
 */
public class Problem28 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null
                || haystack.length() == 0 || needle.length() == 0
                || haystack.length() < needle.length()){
            return -1;
        }
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    // i = i + j;
                    break;
                }
                if (j == needle.length() - 1){
                    return i;
                }
            }
        }
        return -1;
    }
}
