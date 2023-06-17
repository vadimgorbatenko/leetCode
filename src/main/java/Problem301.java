import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 301. Remove Invalid Parentheses
 * <p>
 * Given a string s that contains parentheses and letters, remove the minimum number of invalid parentheses to make the input string valid.
 * <p>
 * Return a list of unique strings that are valid with the minimum number of removals. You may return the answer in any order.
 * <p>
 * <a href="https://leetcode.com/problems/remove-invalid-parentheses/">...</a>
 */
public class Problem301 {
    public List<String> removeInvalidParentheses(String s) {
        Set<String> strings = new HashSet<>();
        strings.add(s);
        return goDeeper(strings);
    }

    private List<String> goDeeper(Set<String> strings) {
        List<String> validStrings = new ArrayList<>();
        for (String s : strings) {
            if (isValid(s)) {
                validStrings.add(s);
            }
        }

        if (validStrings.size() > 0 || strings.stream().findFirst().get().length() == 0) {
            return validStrings;
        }
        Set<String> nextLvl = new HashSet<>();
        for (String s : strings) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                    nextLvl.add(new StringBuilder(s).deleteCharAt(i).toString());
                }
            }
        }
        return goDeeper(nextLvl);
    }

    private boolean isValid(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] == '(') {
                counter++;
            } else if (s.toCharArray()[i] == ')') {
                counter--;
            }
            if (counter < 0) {
                return false;
            }
        }
        return counter == 0;
    }
}
