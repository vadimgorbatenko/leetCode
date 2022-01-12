/**
 * 14. Longest Common Prefix
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class Problem14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int prefix = strs[0].length();
        for (String str : strs) {
            int cur = 0;
            for (int j = 0; j < str.length(); j++) {
                if (j >= strs[0].length() || strs[0].charAt(j) != str.charAt(j)) {
                    cur = j;
                    break;
                }
                cur = j + 1;
            }
            if(cur < prefix){
                prefix = cur;
            }
        }
        if (prefix == 0) {
            return "";
        }

        return strs[0].substring(0, prefix);
    }
}
