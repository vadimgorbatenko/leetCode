
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 22. Generate Parentheses
 * <p>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * <a href="https://leetcode.com/problems/generate-parentheses/">...</a>
 */
public class Problem22 {

    public List<String> generateParenthesis(int n) {
        List<String> strings = new ArrayList<>();
        addParenthesis(n, n, n, strings, "");
        return strings;
    }

    private void addParenthesis(int max, int l, int r, List<String> strings, String str) {
        if (l > 0) {
            addParenthesis(max, l-1, r, strings, str + "(");
        }
        if (r > 0 && r > l) {
            addParenthesis(max, l, r-1, strings, str + ")");
        }

        if(str.length() == max*2){
            strings.add(str);
        }
    }
}
