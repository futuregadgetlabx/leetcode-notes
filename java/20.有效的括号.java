import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 * 
 * √ Accepted
 * √ 76/76 cases passed (9 ms)
 * √ Your runtime beats 49.99 % of java submissions
 * √ Your memory usage beats 90.35 % of java submissions (33.9 MB)
 */
class Solution {
    public boolean isValid(String s) {
        if (!"".equals(s) && s.length() % 2 != 0) {
            return false;
        }
        if ("".equals(s) || s == null) {
            return true;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                char topElement = stack.empty() ? ' ' : stack.pop();
                if (topElement != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}

