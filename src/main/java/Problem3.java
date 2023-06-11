/**
 * 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int maxLength = 1;
        int curStart = 0;
        char[] chars = s.toCharArray();
        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count[chars[i]]++;
            if (count[chars[i]] > 1) {
                while (curStart < i && count[chars[i]] > 1) {
                    count[chars[curStart++]]--;
                }
            }
            if (maxLength < i - curStart + 1) {
                maxLength = i - curStart + 1;
            }
        }

        return maxLength;
    }
}
