import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 763. Partition Labels
 * <p>
 * You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
 * Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
 * Return a list of integers representing the size of these parts.
 * <p>
 * <a href="https://leetcode.com/problems/partition-labels/">...</a>
 */
public class Problem763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> parts = new ArrayList<>();
        Map<Character, Integer> firstOccurrences = new HashMap<>();
        Map<Character, Integer> lastOccurrences = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!firstOccurrences.containsKey(c)) {
                firstOccurrences.put(c, i);
            }
            lastOccurrences.put(c, i);
        }

        int i = 0;
        int partStart = 0;
        int partEnd = 0;
        while (partEnd < s.length() - 1) {
            partStart = i;
            partEnd = lastOccurrences.get(s.charAt(i));
            while (i < partEnd) {
                char c = s.charAt(i);
                if (lastOccurrences.get(c) > partEnd) {
                    partEnd = lastOccurrences.get(c);
                }
                i++;
            }
            parts.add(partEnd - partStart + 1);
            i++;
        }

        return parts;
    }
}
