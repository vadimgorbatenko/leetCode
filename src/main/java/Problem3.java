/**
 * 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int maxLength = 1;
        int curLength = 0;
        char[] chars = s.toCharArray();
//chose substring
        for (int i = 0; i < s.length() - maxLength; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if(checkAllCharsUnique(s.substring(i, j).toCharArray())){
                    curLength = j-i;
                }
            }
            if(curLength > maxLength){
                maxLength = curLength;
            }
        }
        return maxLength;
    }

    private boolean checkAllCharsUnique(char[] chars) {
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
