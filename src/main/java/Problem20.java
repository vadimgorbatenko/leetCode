import java.util.Set;
import java.util.Stack;

/**
 * 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * <a href="https://leetcode.com/problems/valid-parentheses/">...</a>
 */
public class Problem20 {
    Set<Character> opening = Set.of('(', '{', '[');
    Set<Character> closing = Set.of(')', '}', ']');

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (opening.contains(c)) {
                stack.add(c);
            } else if (closing.contains(c)) {
                if (stack.isEmpty()) {
                    return false;
                } else if (isCorrectClosing(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isCorrectClosing(Character prev, Character cur) {
        return prev == '{' && cur == '}'
                || prev == '(' && cur == ')'
                || prev == '[' && cur == ']';
    }
}
